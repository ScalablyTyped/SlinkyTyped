package typingsSlinky.angularCompiler.viewCompilerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.anon.ClassAttr
import typingsSlinky.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedHostBindings extends js.Object {
  var attributes: StringDictionary[Expression]
  var listeners: StringDictionary[String]
  var properties: StringDictionary[String]
  var specialAttributes: ClassAttr
}

object ParsedHostBindings {
  @scala.inline
  def apply(
    attributes: StringDictionary[Expression],
    listeners: StringDictionary[String],
    properties: StringDictionary[String],
    specialAttributes: ClassAttr
  ): ParsedHostBindings = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], specialAttributes = specialAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedHostBindings]
  }
}

