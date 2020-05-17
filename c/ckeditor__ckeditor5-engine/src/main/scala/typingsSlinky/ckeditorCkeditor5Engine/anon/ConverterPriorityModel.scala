package typingsSlinky.ckeditorCkeditor5Engine.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.ckeditorCkeditor5Engine.mod.view.MatcherPattern
import typingsSlinky.ckeditorCkeditor5Utils.mod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConverterPriorityModel extends js.Object {
  var converterPriority: js.UndefOr[PriorityString] = js.native
  var model: String | Element | js.Function = js.native
  var view: MatcherPattern = js.native
}

object ConverterPriorityModel {
  @scala.inline
  def apply(model: String | Element | js.Function, view: MatcherPattern): ConverterPriorityModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterPriorityModel]
  }
  @scala.inline
  implicit class ConverterPriorityModelOps[Self <: ConverterPriorityModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModelElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: String | Element | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewFunction1(value: /* element */ typingsSlinky.ckeditorCkeditor5Engine.mod.view.Element => Null | Attribute): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withViewRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: MatcherPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConverterPriority(value: PriorityString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converterPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConverterPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("converterPriority")(js.undefined)
        ret
    }
  }
  
}

