package typingsSlinky.ckeditorCkeditor5Engine.anon

import org.scalajs.dom.raw.Element
import typingsSlinky.ckeditorCkeditor5Engine.mod.view.MatcherPattern
import typingsSlinky.ckeditorCkeditor5Utils.mod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConverterPriorityModel extends js.Object {
  var converterPriority: js.UndefOr[PriorityString] = js.undefined
  var model: String | Element | js.Function
  var view: MatcherPattern
}

object ConverterPriorityModel {
  @scala.inline
  def apply(
    model: String | Element | js.Function,
    view: MatcherPattern,
    converterPriority: PriorityString = null
  ): ConverterPriorityModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    if (converterPriority != null) __obj.updateDynamic("converterPriority")(converterPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterPriorityModel]
  }
}

