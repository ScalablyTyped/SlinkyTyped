package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
  */
@js.native
trait AzureFilePersistentVolumeSource extends js.Object {
  /**
    * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in
    * VolumeMounts.
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * the name of secret that contains Azure Storage Account Name and Key
    */
  var secretName: Input[String] = js.native
  /**
    * the namespace of the secret that contains Azure Storage Account Name and Key default is the
    * same as the Pod
    */
  var secretNamespace: js.UndefOr[Input[String]] = js.native
  /**
    * Share Name
    */
  var shareName: Input[String] = js.native
}

object AzureFilePersistentVolumeSource {
  @scala.inline
  def apply(secretName: Input[String], shareName: Input[String]): AzureFilePersistentVolumeSource = {
    val __obj = js.Dynamic.literal(secretName = secretName.asInstanceOf[js.Any], shareName = shareName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AzureFilePersistentVolumeSource]
  }
  @scala.inline
  implicit class AzureFilePersistentVolumeSourceOps[Self <: AzureFilePersistentVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSecretName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShareName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretNamespace(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretNamespace")(js.undefined)
        ret
    }
  }
  
}

