package typingsSlinky.reactBigScheduler.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactBigScheduler.mod.SchedulerData
import typingsSlinky.reactBigScheduler.mod.SchedulerProps
import typingsSlinky.reactBigScheduler.mod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Scheduler {
  
  @JSImport("react-big-scheduler", "Scheduler")
  @js.native
  object component extends js.Object
  
  def withProps(p: SchedulerProps): Default[tag.type, typingsSlinky.reactBigScheduler.mod.Scheduler] = new Default[tag.type, typingsSlinky.reactBigScheduler.mod.Scheduler](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    nextClick: SchedulerData => Unit,
    onSelectDate: (SchedulerData, String) => Unit,
    onViewChange: (SchedulerData, View) => Unit,
    prevClick: SchedulerData => Unit,
    schedulerData: SchedulerData
  ): Default[tag.type, typingsSlinky.reactBigScheduler.mod.Scheduler] = {
    val __props = js.Dynamic.literal(nextClick = js.Any.fromFunction1(nextClick), onSelectDate = js.Any.fromFunction2(onSelectDate), onViewChange = js.Any.fromFunction2(onViewChange), prevClick = js.Any.fromFunction1(prevClick), schedulerData = schedulerData.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactBigScheduler.mod.Scheduler](js.Array(this.component, __props.asInstanceOf[SchedulerProps]))
  }
}
