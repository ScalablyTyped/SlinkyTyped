package typingsSlinky.checkError.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("check-error", "compatibleMessage")
@js.native
object compatibleMessage extends js.Object {
  def apply(thrown: String, errMatcher: String): Boolean = js.native
  def apply(thrown: String, errMatcher: js.RegExp): Boolean = js.native
  def apply(thrown: js.Error, errMatcher: String): Boolean = js.native
  def apply(thrown: js.Error, errMatcher: js.RegExp): Boolean = js.native
}

