package typingsSlinky.momentRange.mod

import typingsSlinky.moment.mod.Moment
import typingsSlinky.moment.mod.unitOfTime.Diff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MomentRangeStaticMethods extends js.Object {
  
  // @deprecated 4.0.0
  def parseZoneRange(isoTimeInterval: String): DateRange = js.native
  
  def range(): DateRange = js.native
  def range(range: String): DateRange = js.native
  def range(range: js.Tuple2[js.Date | Moment, js.Date | Moment]): DateRange = js.native
  def range(start: Moment, end: Moment): DateRange = js.native
  def range(start: Moment, end: js.Date): DateRange = js.native
  def range(start: js.Date, end: Moment): DateRange = js.native
  def range(start: js.Date, end: js.Date): DateRange = js.native
  
  def rangeFromISOString(isoTimeInterval: String): DateRange = js.native
  
  def rangeFromInterval(interval: Diff): DateRange = js.native
  def rangeFromInterval(interval: Diff, count: js.UndefOr[scala.Nothing], date: Moment): DateRange = js.native
  def rangeFromInterval(interval: Diff, count: js.UndefOr[scala.Nothing], date: js.Date): DateRange = js.native
  def rangeFromInterval(interval: Diff, count: Double): DateRange = js.native
  def rangeFromInterval(interval: Diff, count: Double, date: Moment): DateRange = js.native
  def rangeFromInterval(interval: Diff, count: Double, date: js.Date): DateRange = js.native
}
