package typingsSlinky.momentTimezone.momentTimezoneMod.momentAugmentingMod

import typingsSlinky.moment.mod.MomentFormatSpecification
import typingsSlinky.momentTimezone.AnonLinks
import typingsSlinky.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MomentTimezone extends js.Object {
  def apply(): typingsSlinky.moment.mod.Moment = js.native
  def apply(
    date: String,
    format: MomentFormatSpecification,
    language: String,
    strict: Boolean,
    timezone: String
  ): typingsSlinky.moment.mod.Moment = js.native
  def apply(date: String, format: MomentFormatSpecification, language: String, timezone: String): typingsSlinky.moment.mod.Moment = js.native
  def apply(date: String, format: MomentFormatSpecification, strict: Boolean, timezone: String): typingsSlinky.moment.mod.Moment = js.native
  def apply(date: String, format: MomentFormatSpecification, timezone: String): typingsSlinky.moment.mod.Moment = js.native
  def apply(date: String, timezone: String): typingsSlinky.moment.mod.Moment = js.native
  def apply(date: js.Any, timezone: String): typingsSlinky.moment.mod.Moment = js.native
  def apply(date: js.Array[Double], timezone: String): typingsSlinky.moment.mod.Moment = js.native
  def apply(date: Double, timezone: String): typingsSlinky.moment.mod.Moment = js.native
  def apply(date: typingsSlinky.moment.mod.Moment, timezone: String): typingsSlinky.moment.mod.Moment = js.native
  def apply(date: Date, timezone: String): typingsSlinky.moment.mod.Moment = js.native
  def apply(timezone: String): typingsSlinky.moment.mod.Moment = js.native
  def add(packedZoneString: String): Unit = js.native
  def add(packedZoneString: js.Array[String]): Unit = js.native
  def guess(): String = js.native
  def guess(ignoreCache: Boolean): String = js.native
  def link(packedLinkString: String): Unit = js.native
  def link(packedLinkString: js.Array[String]): Unit = js.native
  def load(data: AnonLinks): Unit = js.native
  def names(): js.Array[String] = js.native
  def setDefault(): MomentTimezone = js.native
  def setDefault(timezone: String): MomentTimezone = js.native
  def zone(timezone: String): MomentZone | Null = js.native
}

