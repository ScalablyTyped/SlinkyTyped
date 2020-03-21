package typingsSlinky.angularCore.propertyNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Type that describes a property name with an obtainable text. */
/* Inlined std.Exclude<typescript.typescript.PropertyName, typescript.typescript.ComputedPropertyName> */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCore.angularCoreStrings.isInJSDocNamespace
  - typingsSlinky.angularCore.angularCoreStrings.escapedText
  - typingsSlinky.angularCore.angularCoreStrings.text
  - typingsSlinky.angularCore.angularCoreStrings.originalKeywordKind
*/
trait PropertyNameWithText extends js.Object

object PropertyNameWithText {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def escapedText: typingsSlinky.angularCore.angularCoreStrings.escapedText = this.cast("escapedText")
  @scala.inline
  def isInJSDocNamespace: typingsSlinky.angularCore.angularCoreStrings.isInJSDocNamespace = this.cast("isInJSDocNamespace")
  @scala.inline
  def originalKeywordKind: typingsSlinky.angularCore.angularCoreStrings.originalKeywordKind = this.cast("originalKeywordKind")
  @scala.inline
  def text: typingsSlinky.angularCore.angularCoreStrings.text = this.cast("text")
}

