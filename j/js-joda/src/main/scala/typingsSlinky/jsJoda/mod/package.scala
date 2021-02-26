package typingsSlinky.jsJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // TODO: js-joda doesn't have Chronology yet. Methods like `LocalDate.chronology()`
  // actually return an `IsoChronology` so Chronology is an alias type of that class
  // for now. Change this if Chronology is added.
  type Chronology = typingsSlinky.jsJoda.mod.IsoChronology
  
  @scala.inline
  def convert(temporal: typingsSlinky.jsJoda.mod.LocalDate): typingsSlinky.jsJoda.anon.ToDate = typingsSlinky.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jsJoda.anon.ToDate]
  @scala.inline
  def convert(temporal: typingsSlinky.jsJoda.mod.LocalDateTime): typingsSlinky.jsJoda.anon.ToDate = typingsSlinky.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jsJoda.anon.ToDate]
  @scala.inline
  def convert(temporal: typingsSlinky.jsJoda.mod.LocalDateTime, zone: typingsSlinky.jsJoda.mod.ZoneId): typingsSlinky.jsJoda.anon.ToDate = (typingsSlinky.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.jsJoda.anon.ToDate]
  @scala.inline
  def convert(temporal: typingsSlinky.jsJoda.mod.LocalDate, zone: typingsSlinky.jsJoda.mod.ZoneId): typingsSlinky.jsJoda.anon.ToDate = (typingsSlinky.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.jsJoda.anon.ToDate]
  @scala.inline
  def convert(temporal: typingsSlinky.jsJoda.mod.ZonedDateTime): typingsSlinky.jsJoda.anon.ToDate = typingsSlinky.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jsJoda.anon.ToDate]
  @scala.inline
  def convert(temporal: typingsSlinky.jsJoda.mod.ZonedDateTime, zone: typingsSlinky.jsJoda.mod.ZoneId): typingsSlinky.jsJoda.anon.ToDate = (typingsSlinky.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convert")(temporal.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.jsJoda.anon.ToDate]
  
  @scala.inline
  def nativeJs(date: js.Any): typingsSlinky.jsJoda.mod.TemporalAccessor = typingsSlinky.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("nativeJs")(date.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jsJoda.mod.TemporalAccessor]
  @scala.inline
  def nativeJs(date: js.Any, zone: typingsSlinky.jsJoda.mod.ZoneId): typingsSlinky.jsJoda.mod.TemporalAccessor = (typingsSlinky.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("nativeJs")(date.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.jsJoda.mod.TemporalAccessor]
  @scala.inline
  def nativeJs(date: js.Date): typingsSlinky.jsJoda.mod.TemporalAccessor = typingsSlinky.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("nativeJs")(date.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.jsJoda.mod.TemporalAccessor]
  @scala.inline
  def nativeJs(date: js.Date, zone: typingsSlinky.jsJoda.mod.ZoneId): typingsSlinky.jsJoda.mod.TemporalAccessor = (typingsSlinky.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("nativeJs")(date.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.jsJoda.mod.TemporalAccessor]
  
  @scala.inline
  def use(plugin: js.Function): js.Any = typingsSlinky.jsJoda.mod.^.asInstanceOf[js.Dynamic].applyDynamic("use")(plugin.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
