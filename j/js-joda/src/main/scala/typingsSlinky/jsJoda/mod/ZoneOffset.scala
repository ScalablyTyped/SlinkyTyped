package typingsSlinky.jsJoda.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-joda", "ZoneOffset")
@js.native
class ZoneOffset protected () extends ZoneId {
  
  def adjustInto(temporal: Temporal): Temporal = js.native
  
  def compareTo(other: ZoneOffset): Double = js.native
  
  def get(field: TemporalField): Double = js.native
  
  def getLong(field: TemporalField): Double = js.native
  
  def query(query: TemporalQuery): js.Any = js.native
  
  def totalSeconds(): Double = js.native
}
object ZoneOffset {
  
  @JSImport("js-joda", "ZoneOffset")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("js-joda", "ZoneOffset.MAX")
  @js.native
  def MAX: ZoneOffset = js.native
  @scala.inline
  def MAX_=(x: ZoneOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ZoneOffset.MAX_SECONDS")
  @js.native
  def MAX_SECONDS: ZoneOffset = js.native
  @scala.inline
  def MAX_SECONDS_=(x: ZoneOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SECONDS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ZoneOffset.MIN")
  @js.native
  def MIN: ZoneOffset = js.native
  @scala.inline
  def MIN_=(x: ZoneOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ZoneOffset.UTC")
  @js.native
  def UTC: ZoneOffset = js.native
  @scala.inline
  def UTC_=(x: ZoneOffset): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UTC")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("js-joda", "ZoneOffset.of")
  @js.native
  def of(offsetId: String): ZoneOffset = js.native
  
  /* static member */
  @JSImport("js-joda", "ZoneOffset.ofHours")
  @js.native
  def ofHours(hours: Double): ZoneOffset = js.native
  
  /* static member */
  @JSImport("js-joda", "ZoneOffset.ofHoursMinutes")
  @js.native
  def ofHoursMinutes(hours: Double, minutes: Double): ZoneOffset = js.native
  
  /* static member */
  @JSImport("js-joda", "ZoneOffset.ofHoursMinutesSeconds")
  @js.native
  def ofHoursMinutesSeconds(hours: Double, minutes: Double, seconds: Double): ZoneOffset = js.native
  
  /* static member */
  @JSImport("js-joda", "ZoneOffset.ofTotalMinutes")
  @js.native
  def ofTotalMinutes(totalMinutes: Double): ZoneOffset = js.native
  
  /* static member */
  @JSImport("js-joda", "ZoneOffset.ofTotalSeconds")
  @js.native
  def ofTotalSeconds(totalSeconds: Double): ZoneOffset = js.native
}
