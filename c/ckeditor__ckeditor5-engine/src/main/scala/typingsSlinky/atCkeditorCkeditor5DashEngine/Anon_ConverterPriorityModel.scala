package typingsSlinky.atCkeditorCkeditor5DashEngine

import typingsSlinky.atCkeditorCkeditor5DashEngine.atCkeditorCkeditor5DashEngineMod.view.MatcherPattern
import typingsSlinky.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConverterPriorityModel extends js.Object {
  var converterPriority: js.UndefOr[PriorityString] = js.undefined
  var model: String | Anon_KeyValue
  var view: MatcherPattern
}

object Anon_ConverterPriorityModel {
  @scala.inline
  def apply(model: String | Anon_KeyValue, view: MatcherPattern, converterPriority: PriorityString = null): Anon_ConverterPriorityModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    if (converterPriority != null) __obj.updateDynamic("converterPriority")(converterPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ConverterPriorityModel]
  }
}

