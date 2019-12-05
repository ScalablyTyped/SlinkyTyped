package typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typingsSlinky.moment.momentMod.Moment
import typingsSlinky.reactDashCalendarDashTimeline.Anon_Key
import typingsSlinky.reactDashCalendarDashTimeline.Anon_Style
import typingsSlinky.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomHeaderPropsChildrenFnProps[Data] extends js.Object {
  var data: Data = js.native
  var headerContext: HeaderContext = js.native
  var timelineContext: TimelineContext = js.native
  def getIntervalProps(): Required[GetIntervalProps] with Anon_Key = js.native
  def getIntervalProps(props: GetIntervalProps): Required[GetIntervalProps] with Anon_Key = js.native
  def getRootProps(): Anon_Style = js.native
  def getRootProps(propsToOverride: Anon_Style): Anon_Style = js.native
  def showPeriod(startDate: Double, endDate: Double): scala.Unit = js.native
  def showPeriod(startDate: Double, endDate: Moment): scala.Unit = js.native
  def showPeriod(startDate: Moment, endDate: Double): scala.Unit = js.native
  def showPeriod(startDate: Moment, endDate: Moment): scala.Unit = js.native
}

