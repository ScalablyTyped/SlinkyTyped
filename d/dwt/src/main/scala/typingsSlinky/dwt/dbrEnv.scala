package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dbrEnv extends js.Object {
  var bAutoConnectService: Boolean = js.native
  var disableAutoDownloadModule: Boolean = js.native
  var hideDWASInstallDialog: Boolean = js.native
  var logLevel: Double = js.native
  var productKey: String = js.native
  var resourcesPath: String = js.native
  def onAutoConnectServiceError(status: js.Any): Unit = js.native
  def onAutoConnectServiceSuccess(): Unit = js.native
}

object dbrEnv {
  @scala.inline
  def apply(
    bAutoConnectService: Boolean,
    disableAutoDownloadModule: Boolean,
    hideDWASInstallDialog: Boolean,
    logLevel: Double,
    onAutoConnectServiceError: js.Any => Unit,
    onAutoConnectServiceSuccess: () => Unit,
    productKey: String,
    resourcesPath: String
  ): dbrEnv = {
    val __obj = js.Dynamic.literal(bAutoConnectService = bAutoConnectService.asInstanceOf[js.Any], disableAutoDownloadModule = disableAutoDownloadModule.asInstanceOf[js.Any], hideDWASInstallDialog = hideDWASInstallDialog.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], onAutoConnectServiceError = js.Any.fromFunction1(onAutoConnectServiceError), onAutoConnectServiceSuccess = js.Any.fromFunction0(onAutoConnectServiceSuccess), productKey = productKey.asInstanceOf[js.Any], resourcesPath = resourcesPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[dbrEnv]
  }
  @scala.inline
  implicit class dbrEnvOps[Self <: dbrEnv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBAutoConnectService(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bAutoConnectService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableAutoDownloadModule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAutoDownloadModule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideDWASInstallDialog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDWASInstallDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnAutoConnectServiceError(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAutoConnectServiceError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnAutoConnectServiceSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAutoConnectServiceSuccess")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProductKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourcesPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcesPath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

