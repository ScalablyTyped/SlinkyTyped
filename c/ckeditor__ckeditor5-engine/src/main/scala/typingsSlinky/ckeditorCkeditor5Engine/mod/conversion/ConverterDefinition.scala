package typingsSlinky.ckeditorCkeditor5Engine.mod.conversion

import typingsSlinky.ckeditorCkeditor5Engine.AnonAttribute
import typingsSlinky.ckeditorCkeditor5Engine.mod.view.Element
import typingsSlinky.ckeditorCkeditor5Engine.mod.view.ElementDefinition
import typingsSlinky.ckeditorCkeditor5Engine.mod.view.MatcherPattern
import typingsSlinky.ckeditorCkeditor5Utils.mod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConverterDefinition extends js.Object {
  var converterPriority: PriorityString = js.native
  var model: js.Any = js.native
  var upcastAlso: MatcherPattern | js.Array[MatcherPattern] = js.native
  var view: ElementDefinition | js.Object = js.native
}

object ConverterDefinition {
  @scala.inline
  def apply(
    converterPriority: PriorityString,
    model: js.Any,
    upcastAlso: MatcherPattern | js.Array[MatcherPattern],
    view: ElementDefinition | js.Object
  ): ConverterDefinition = {
    val __obj = js.Dynamic.literal(converterPriority = converterPriority.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], upcastAlso = upcastAlso.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterDefinition]
  }
  @scala.inline
  implicit class ConverterDefinitionOps[Self <: ConverterDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConverterPriority(value: PriorityString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converterPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpcastAlsoFunction1(value: /* element */ Element => Null | AnonAttribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upcastAlso")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpcastAlsoRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upcastAlso")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpcastAlso(value: MatcherPattern | js.Array[MatcherPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upcastAlso")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: ElementDefinition | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

