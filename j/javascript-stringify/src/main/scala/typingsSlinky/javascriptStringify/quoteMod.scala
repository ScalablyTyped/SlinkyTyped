package typingsSlinky.javascriptStringify

import typingsSlinky.javascriptStringify.typesMod.Next
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("javascript-stringify/dist/quote", JSImport.Namespace)
@js.native
object quoteMod extends js.Object {
  
  val IS_VALID_IDENTIFIER: js.RegExp = js.native
  
  def isValidVariableName(name: PropertyKey): /* is string */ Boolean = js.native
  
  def quoteKey(key: PropertyKey, next: Next): js.UndefOr[String] = js.native
  
  def quoteString(str: String): String = js.native
  
  def stringifyPath(path: js.Array[PropertyKey], next: Next): String = js.native
}
