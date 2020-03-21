package typingsSlinky.reactBigScheduler.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactBigScheduler.mod.SchedulerData
import typingsSlinky.reactBigScheduler.mod.SchedulerProps
import typingsSlinky.reactBigScheduler.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Scheduler
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactBigScheduler.mod.Scheduler] {
  @JSImport("react-big-scheduler", "Scheduler")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    nextClick: SchedulerData => Unit,
    onSelectDate: (SchedulerData, String) => Unit,
    onViewChange: (SchedulerData, View) => Unit,
    prevClick: SchedulerData => Unit,
    schedulerData: SchedulerData,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactBigScheduler.mod.Scheduler] = {
    val __obj = js.Dynamic.literal(nextClick = js.Any.fromFunction1(nextClick), onSelectDate = js.Any.fromFunction2(onSelectDate), onViewChange = js.Any.fromFunction2(onViewChange), prevClick = js.Any.fromFunction1(prevClick), schedulerData = schedulerData.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SchedulerProps
}

