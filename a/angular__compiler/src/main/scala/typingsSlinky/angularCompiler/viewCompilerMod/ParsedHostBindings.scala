package typingsSlinky.angularCompiler.viewCompilerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.anon.ClassAttr
import typingsSlinky.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedHostBindings extends js.Object {
  var attributes: StringDictionary[Expression] = js.native
  var listeners: StringDictionary[String] = js.native
  var properties: StringDictionary[String] = js.native
  var specialAttributes: ClassAttr = js.native
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
  @scala.inline
  implicit class ParsedHostBindingsOps[Self <: ParsedHostBindings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: StringDictionary[Expression]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListeners(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecialAttributes(value: ClassAttr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specialAttributes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

