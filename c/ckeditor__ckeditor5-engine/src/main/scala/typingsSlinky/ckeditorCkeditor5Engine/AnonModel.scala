package typingsSlinky.ckeditorCkeditor5Engine

import typingsSlinky.ckeditorCkeditor5Engine.mod.view.Element
import typingsSlinky.ckeditorCkeditor5Engine.mod.view.MatcherPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonModel extends js.Object {
  var model: String | js.Object = js.native
  var upcastAlso: js.UndefOr[MatcherPattern | js.Array[MatcherPattern]] = js.native
  var view: js.UndefOr[String | js.Object] = js.native
}

object AnonModel {
  @scala.inline
  def apply(model: String | js.Object): AnonModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonModel]
  }
  @scala.inline
  implicit class AnonModelOps[Self <: AnonModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel(value: String | js.Object): Self = {
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
    def withoutUpcastAlso: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upcastAlso")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

