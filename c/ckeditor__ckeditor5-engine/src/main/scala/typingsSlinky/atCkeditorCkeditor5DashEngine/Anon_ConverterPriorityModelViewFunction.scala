package typingsSlinky.atCkeditorCkeditor5DashEngine

import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.MatcherPattern
import typingsSlinky.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConverterPriorityModelViewFunction extends js.Object {
  var converterPriority: js.UndefOr[PriorityString] = js.undefined
  var model: String | js.Function
  var view: MatcherPattern
}

object Anon_ConverterPriorityModelViewFunction {
  @scala.inline
  def apply(model: String | js.Function, view: MatcherPattern, converterPriority: PriorityString = null): Anon_ConverterPriorityModelViewFunction = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    if (converterPriority != null) __obj.updateDynamic("converterPriority")(converterPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConverterPriorityModelViewFunction]
  }
}

