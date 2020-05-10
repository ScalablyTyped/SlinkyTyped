package typingsSlinky.mendixmodelsdk.configurationMod.configuration

import typingsSlinky.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import typingsSlinky.mendixmodelsdk.transportationMod.ITransportation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISdkConfig extends js.Object {
  var client: js.UndefOr[IModelServerClient] = js.native
  var credentials: js.UndefOr[IBackendCredentials | ISdkCredentials] = js.native
  var endPoint: js.UndefOr[String] = js.native
  var transportation: js.UndefOr[ITransportation] = js.native
}

object ISdkConfig {
  @scala.inline
  def apply(): ISdkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISdkConfig]
  }
  @scala.inline
  implicit class ISdkConfigOps[Self <: ISdkConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: IModelServerClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: IBackendCredentials | ISdkCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withEndPoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportation(value: ITransportation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportation")(js.undefined)
        ret
    }
  }
  
}

