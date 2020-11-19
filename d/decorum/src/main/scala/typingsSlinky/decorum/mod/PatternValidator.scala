package typingsSlinky.decorum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("decorum", "PatternValidator")
@js.native
class PatternValidator protected () extends BaseValidator {
  def this(pattern: js.RegExp) = this()
  def this(pattern: js.RegExp, message: String) = this()
  def this(pattern: js.RegExp, message: MessageHandler[PatternValidator]) = this()
  
  def isValid(value: js.Any): Boolean = js.native
  
  var pattern: js.RegExp = js.native
}
