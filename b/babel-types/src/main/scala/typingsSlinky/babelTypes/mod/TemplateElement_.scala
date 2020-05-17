package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.anon.Cooked
import typingsSlinky.babelTypes.babelTypesStrings.TemplateElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateElement_ extends Node {
  var tail: Boolean = js.native
  @JSName("type")
  var type_TemplateElement_ : TemplateElement = js.native
  var value: Cooked = js.native
}

object TemplateElement_ {
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    start: Double,
    tail: Boolean,
    `type`: TemplateElement,
    value: Cooked
  ): TemplateElement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tail = tail.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateElement_]
  }
  @scala.inline
  implicit class TemplateElement_Ops[Self <: TemplateElement_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TemplateElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Cooked): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

