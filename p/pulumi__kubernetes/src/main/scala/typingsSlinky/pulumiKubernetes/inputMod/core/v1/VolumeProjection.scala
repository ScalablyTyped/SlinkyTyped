package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Projection that may be projected along with other supported volume types
  */
@js.native
trait VolumeProjection extends js.Object {
  /**
    * information about the configMap data to project
    */
  var configMap: js.UndefOr[Input[ConfigMapProjection]] = js.native
  /**
    * information about the downwardAPI data to project
    */
  var downwardAPI: js.UndefOr[Input[DownwardAPIProjection]] = js.native
  /**
    * information about the secret data to project
    */
  var secret: js.UndefOr[Input[SecretProjection]] = js.native
  /**
    * information about the serviceAccountToken data to project
    */
  var serviceAccountToken: js.UndefOr[Input[ServiceAccountTokenProjection]] = js.native
}

object VolumeProjection {
  @scala.inline
  def apply(): VolumeProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeProjection]
  }
  @scala.inline
  implicit class VolumeProjectionOps[Self <: VolumeProjection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigMap(value: Input[ConfigMapProjection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configMap")(js.undefined)
        ret
    }
    @scala.inline
    def withDownwardAPI(value: Input[DownwardAPIProjection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downwardAPI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownwardAPI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downwardAPI")(js.undefined)
        ret
    }
    @scala.inline
    def withSecret(value: Input[SecretProjection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccountToken(value: Input[ServiceAccountTokenProjection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountToken")(js.undefined)
        ret
    }
  }
  
}

