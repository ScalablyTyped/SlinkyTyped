package typingsSlinky.dwt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ssl extends js.Object {
  /*ignored
    OnCreatWS  OnDetectNext  OnWebTwainPostExecute  OnWebTwainPreExecute  StartWSByIPTimeoutId  StartWSTimeoutId
    aryReconnectSTwains  arySTwains  arySTwainsByIP  bFirst  bNeedUpgradeEvent  bNoControlEvent  bOK  bPromptJSOrServerOutdated
    cUrlIndex  dcpCallbackType  dcpStatus  detectType  getVersionArray  global_dlg  hideMask  isDWTVersionLatest  onNoControl
    onNotAllowedForChrome  ports  scriptLoaded  showMask  starting  tryTimes*/
  var ssl: Boolean = js.native
}

object Ssl {
  @scala.inline
  def apply(ssl: Boolean): Ssl = {
    val __obj = js.Dynamic.literal(ssl = ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ssl]
  }
  @scala.inline
  implicit class SslOps[Self <: Ssl] (val x: Self) extends AnyVal {
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

