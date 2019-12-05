package typingsSlinky.javascriptDashStringify

import typingsSlinky.javascriptDashStringify.distTypesMod.Next
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-stringify/dist/quote", JSImport.Namespace)
@js.native
object distQuoteMod extends js.Object {
  val IS_VALID_IDENTIFIER: js.RegExp = js.native
  def isValidVariableName(name: PropertyKey): /* is string */ Boolean = js.native
  def quoteKey(key: PropertyKey, next: Next): js.UndefOr[String] = js.native
  def quoteString(str: String): String = js.native
  def stringifyPath(path: js.Array[PropertyKey], next: Next): String = js.native
}

