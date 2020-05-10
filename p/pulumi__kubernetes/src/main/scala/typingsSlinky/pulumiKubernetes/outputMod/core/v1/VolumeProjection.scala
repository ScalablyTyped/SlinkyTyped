package typingsSlinky.pulumiKubernetes.outputMod.core.v1

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
  val configMap: ConfigMapProjection = js.native
  /**
    * information about the downwardAPI data to project
    */
  val downwardAPI: DownwardAPIProjection = js.native
  /**
    * information about the secret data to project
    */
  val secret: SecretProjection = js.native
  /**
    * information about the serviceAccountToken data to project
    */
  val serviceAccountToken: ServiceAccountTokenProjection = js.native
}

object VolumeProjection {
  @scala.inline
  def apply(
    configMap: ConfigMapProjection,
    downwardAPI: DownwardAPIProjection,
    secret: SecretProjection,
    serviceAccountToken: ServiceAccountTokenProjection
  ): VolumeProjection = {
    val __obj = js.Dynamic.literal(configMap = configMap.asInstanceOf[js.Any], downwardAPI = downwardAPI.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], serviceAccountToken = serviceAccountToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeProjection]
  }
  @scala.inline
  implicit class VolumeProjectionOps[Self <: VolumeProjection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigMap(value: ConfigMapProjection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownwardAPI(value: DownwardAPIProjection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downwardAPI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecret(value: SecretProjection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceAccountToken(value: ServiceAccountTokenProjection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

