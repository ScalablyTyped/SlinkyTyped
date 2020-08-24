package typingsSlinky.chromecastCafSender.global.cast.framework

import typingsSlinky.chrome.chrome.cast.ErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.SessionStateEventData")
@js.native
class SessionStateEventData protected ()
  extends typingsSlinky.chromecastCafSender.cast.framework.SessionStateEventData {
  def this(
    session: typingsSlinky.chromecastCafSender.cast.framework.CastSession,
    sessionState: typingsSlinky.chromecastCafSender.cast.framework.SessionState,
    opt_errorCode: ErrorCode
  ) = this()
}

