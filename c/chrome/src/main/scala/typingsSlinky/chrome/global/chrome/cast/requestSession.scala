package typingsSlinky.chrome.global.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.cast.requestSession")
@js.native
object requestSession extends js.Object {
  
  def apply(
    successCallback: js.Function1[/* session */ typingsSlinky.chrome.chrome.cast.Session, Unit],
    errorCallback: js.Function1[/* error */ typingsSlinky.chrome.chrome.cast.Error, Unit]
  ): Unit = js.native
  def apply(
    successCallback: js.Function1[/* session */ typingsSlinky.chrome.chrome.cast.Session, Unit],
    errorCallback: js.Function1[/* error */ typingsSlinky.chrome.chrome.cast.Error, Unit],
    sessionRequest: js.UndefOr[scala.Nothing],
    label: String
  ): Unit = js.native
  def apply(
    successCallback: js.Function1[/* session */ typingsSlinky.chrome.chrome.cast.Session, Unit],
    errorCallback: js.Function1[/* error */ typingsSlinky.chrome.chrome.cast.Error, Unit],
    sessionRequest: typingsSlinky.chrome.chrome.cast.SessionRequest
  ): Unit = js.native
  def apply(
    successCallback: js.Function1[/* session */ typingsSlinky.chrome.chrome.cast.Session, Unit],
    errorCallback: js.Function1[/* error */ typingsSlinky.chrome.chrome.cast.Error, Unit],
    sessionRequest: typingsSlinky.chrome.chrome.cast.SessionRequest,
    label: String
  ): Unit = js.native
}
