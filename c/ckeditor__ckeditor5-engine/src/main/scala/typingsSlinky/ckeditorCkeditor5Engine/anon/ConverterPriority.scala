package typingsSlinky.ckeditorCkeditor5Engine.anon

import typingsSlinky.ckeditorCkeditor5Utils.mod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConverterPriority extends js.Object {
  var converterPriority: js.UndefOr[PriorityString] = js.native
  var model: String | Value = js.native
  var view: String | Key = js.native
}

object ConverterPriority {
  @scala.inline
  def apply(model: String | Value, view: String | Key): ConverterPriority = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterPriority]
  }
  @scala.inline
  implicit class ConverterPriorityOps[Self <: ConverterPriority] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel(value: String | Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: String | Key): Self = {
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

