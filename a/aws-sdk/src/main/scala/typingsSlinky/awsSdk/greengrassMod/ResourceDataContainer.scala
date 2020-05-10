package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataContainer extends js.Object {
  /**
    * Attributes that define the local device resource.
    */
  var LocalDeviceResourceData: js.UndefOr[typingsSlinky.awsSdk.greengrassMod.LocalDeviceResourceData] = js.native
  /**
    * Attributes that define the local volume resource.
    */
  var LocalVolumeResourceData: js.UndefOr[typingsSlinky.awsSdk.greengrassMod.LocalVolumeResourceData] = js.native
  /**
    * Attributes that define an Amazon S3 machine learning resource.
    */
  var S3MachineLearningModelResourceData: js.UndefOr[typingsSlinky.awsSdk.greengrassMod.S3MachineLearningModelResourceData] = js.native
  /**
    * Attributes that define an Amazon SageMaker machine learning resource.
    */
  var SageMakerMachineLearningModelResourceData: js.UndefOr[typingsSlinky.awsSdk.greengrassMod.SageMakerMachineLearningModelResourceData] = js.native
  /**
    * Attributes that define a secret resource, which references a secret from AWS Secrets Manager.
    */
  var SecretsManagerSecretResourceData: js.UndefOr[typingsSlinky.awsSdk.greengrassMod.SecretsManagerSecretResourceData] = js.native
}

object ResourceDataContainer {
  @scala.inline
  def apply(): ResourceDataContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceDataContainer]
  }
  @scala.inline
  implicit class ResourceDataContainerOps[Self <: ResourceDataContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocalDeviceResourceData(value: LocalDeviceResourceData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalDeviceResourceData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalDeviceResourceData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalDeviceResourceData")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalVolumeResourceData(value: LocalVolumeResourceData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalVolumeResourceData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalVolumeResourceData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalVolumeResourceData")(js.undefined)
        ret
    }
    @scala.inline
    def withS3MachineLearningModelResourceData(value: S3MachineLearningModelResourceData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3MachineLearningModelResourceData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3MachineLearningModelResourceData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3MachineLearningModelResourceData")(js.undefined)
        ret
    }
    @scala.inline
    def withSageMakerMachineLearningModelResourceData(value: SageMakerMachineLearningModelResourceData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SageMakerMachineLearningModelResourceData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSageMakerMachineLearningModelResourceData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SageMakerMachineLearningModelResourceData")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretsManagerSecretResourceData(value: SecretsManagerSecretResourceData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretsManagerSecretResourceData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretsManagerSecretResourceData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecretsManagerSecretResourceData")(js.undefined)
        ret
    }
  }
  
}

