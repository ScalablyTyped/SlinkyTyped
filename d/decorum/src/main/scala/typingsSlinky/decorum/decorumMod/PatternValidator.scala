package typingsSlinky.decorum.decorumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "PatternValidator")
@js.native
class PatternValidator protected () extends BaseValidator {
  def this(pattern: js.RegExp) = this()
  def this(pattern: js.RegExp, message: String) = this()
  def this(pattern: js.RegExp, message: MessageHandler[PatternValidator]) = this()
  var pattern: js.RegExp = js.native
  def isValid(value: js.Any): Boolean = js.native
}

