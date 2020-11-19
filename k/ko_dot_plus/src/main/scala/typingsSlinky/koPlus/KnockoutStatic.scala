package typingsSlinky.koPlus

import typingsSlinky.koPlus.KoPlus.Command
import typingsSlinky.koPlus.KoPlus.CommandOptions
import typingsSlinky.koPlus.KoPlus.Editable
import typingsSlinky.koPlus.KoPlus.EditableArray
import typingsSlinky.koPlus.KoPlus.EditableArrayStatic
import typingsSlinky.koPlus.KoPlus.EditableStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Extensions to KO to provide a command, editable and sortable patterns
  * - available at http://www.nuget.org/packages/ko.plus/
  *
  * (requires TypeScript version 1.4 or higher)
  *
  * Version 1.0 - initial commit
  *
  * Version 1.1 - fixed bug - makeEditable is now a function on .editable
  *               also refactored how the Editable classes inherit to simplify
  *
  * Version 1.2 - amended callback on commmand.fail() method - accepts response,
  *               status and message values
  * 
  * Version 1.3 - added module declaration so it be used with node, requirejs etc.
  *               removed jquery reference as it is not required
  * 
  */
//
// Add methods to the 'ko' Knockout object
//
@js.native
trait KnockoutStatic extends js.Object {
  
  // create a command - two overloads
  def command(param: js.Function): Command = js.native
  def command(param: CommandOptions): Command = js.native
  
  def editable[T](): Editable[T] = js.native
  def editable[T](value: T): Editable[T] = js.native
  
  def editableArray[T](): EditableArray[T] = js.native
  def editableArray[T](value: js.Array[T]): EditableArray[T] = js.native
  @JSName("editableArray")
  var editableArray_Original: EditableArrayStatic = js.native
  
  @JSName("editable")
  var editable_Original: EditableStatic = js.native
}
