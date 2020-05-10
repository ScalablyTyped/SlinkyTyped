package typingsSlinky.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSsl extends js.Object {
  /*ignored
    OnCreatWS  OnDetectNext  OnWebTwainPostExecute  OnWebTwainPreExecute  StartWSByIPTimeoutId  StartWSTimeoutId
    aryReconnectSTwains  arySTwains  arySTwainsByIP  bFirst  bNeedUpgradeEvent  bNoControlEvent  bOK  bPromptJSOrServerOutdated
    cUrlIndex  dcpCallbackType  dcpStatus  detectType  getVersionArray  global_dlg  hideMask  isDWTVersionLatest  onNoControl
    onNotAllowedForChrome  ports  scriptLoaded  showMask  starting  tryTimes*/
  var ssl: Boolean = js.native
}

object AnonSsl {
  @scala.inline
  def apply(ssl: Boolean): AnonSsl = {
    val __obj = js.Dynamic.literal(ssl = ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSsl]
  }
  @scala.inline
  implicit class AnonSslOps[Self <: AnonSsl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSsl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

