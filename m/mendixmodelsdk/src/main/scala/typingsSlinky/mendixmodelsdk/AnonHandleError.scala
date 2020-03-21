package typingsSlinky.mendixmodelsdk

import typingsSlinky.mendixmodelsdk.commonMod.common.IErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHandleError extends js.Object {
  def handleError(message: String): Unit = js.native
  def handleError(message: String, errorCallback: IErrorCallback): Unit = js.native
}

