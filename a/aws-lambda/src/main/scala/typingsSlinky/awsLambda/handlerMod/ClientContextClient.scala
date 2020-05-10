package typingsSlinky.awsLambda.handlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientContextClient extends js.Object {
  var appPackageName: String = js.native
  var appTitle: String = js.native
  var appVersionCode: String = js.native
  var appVersionName: String = js.native
  var installationId: String = js.native
}

object ClientContextClient {
  @scala.inline
  def apply(
    appPackageName: String,
    appTitle: String,
    appVersionCode: String,
    appVersionName: String,
    installationId: String
  ): ClientContextClient = {
    val __obj = js.Dynamic.literal(appPackageName = appPackageName.asInstanceOf[js.Any], appTitle = appTitle.asInstanceOf[js.Any], appVersionCode = appVersionCode.asInstanceOf[js.Any], appVersionName = appVersionName.asInstanceOf[js.Any], installationId = installationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientContextClient]
  }
  @scala.inline
  implicit class ClientContextClientOps[Self <: ClientContextClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppPackageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appPackageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppVersionCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppVersionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstallationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

