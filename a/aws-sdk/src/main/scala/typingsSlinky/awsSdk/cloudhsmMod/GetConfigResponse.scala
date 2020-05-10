package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigResponse extends js.Object {
  /**
    * The certificate file containing the server.pem files of the HSMs.
    */
  var ConfigCred: js.UndefOr[String] = js.native
  /**
    * The chrystoki.conf configuration file.
    */
  var ConfigFile: js.UndefOr[String] = js.native
  /**
    * The type of credentials.
    */
  var ConfigType: js.UndefOr[String] = js.native
}

object GetConfigResponse {
  @scala.inline
  def apply(): GetConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConfigResponse]
  }
  @scala.inline
  implicit class GetConfigResponseOps[Self <: GetConfigResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigCred(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigCred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigCred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigCred")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigFile")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigType")(js.undefined)
        ret
    }
  }
  
}

