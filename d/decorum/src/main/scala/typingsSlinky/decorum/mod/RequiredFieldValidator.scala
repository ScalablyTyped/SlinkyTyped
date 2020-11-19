package typingsSlinky.decorum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("decorum", "RequiredFieldValidator")
@js.native
class RequiredFieldValidator () extends BaseValidator {
  def this(message: String) = this()
  def this(message: MessageHandler[RequiredFieldValidator]) = this()
  
  def isValid(value: js.Any): Boolean = js.native
}
