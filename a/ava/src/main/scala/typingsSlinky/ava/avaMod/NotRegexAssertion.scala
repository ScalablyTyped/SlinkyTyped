package typingsSlinky.ava.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotRegexAssertion extends js.Object {
  /** Assert that `string` does not match the regular expression. */
  def apply(string: String, regex: js.RegExp): Unit = js.native
  def apply(string: String, regex: js.RegExp, message: String): Unit = js.native
  /** Skip this assertion. */
  def skip(string: String, regex: js.RegExp): Unit = js.native
  def skip(string: String, regex: js.RegExp, message: String): Unit = js.native
}

