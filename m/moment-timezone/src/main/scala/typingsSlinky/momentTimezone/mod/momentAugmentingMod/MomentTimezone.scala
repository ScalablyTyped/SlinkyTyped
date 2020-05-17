package typingsSlinky.momentTimezone.mod.momentAugmentingMod

import typingsSlinky.moment.mod.MomentFormatSpecification
import typingsSlinky.momentTimezone.anon.Links
import typingsSlinky.momentTimezone.momentTimezoneBooleans.`false`
import typingsSlinky.momentTimezone.momentTimezoneBooleans.`true`
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
  def apply(date: js.Date, timezone: String): typingsSlinky.moment.mod.Moment = js.native
  def apply(timezone: String): typingsSlinky.moment.mod.Moment = js.native
  def add(packedZoneString: String): Unit = js.native
  def add(packedZoneString: js.Array[String]): Unit = js.native
  def countries(): js.Array[String] = js.native
  def guess(): String = js.native
  def guess(ignoreCache: Boolean): String = js.native
  def link(packedLinkString: String): Unit = js.native
  def link(packedLinkString: js.Array[String]): Unit = js.native
  def load(data: Links): Unit = js.native
  def names(): js.Array[String] = js.native
  def setDefault(): typingsSlinky.momentTimezone.momentTimezoneMod.momentAugmentingMod.Moment = js.native
  def setDefault(timezone: String): typingsSlinky.momentTimezone.momentTimezoneMod.momentAugmentingMod.Moment = js.native
  def zone(timezone: String): typingsSlinky.momentTimezone.momentTimezoneMod.momentAugmentingMod.MomentZone | Null = js.native
  def zonesForCountry(country: String): js.Array[
    typingsSlinky.momentTimezone.momentTimezoneMod.momentAugmentingMod.MomentZoneOffset | String
  ] = js.native
  def zonesForCountry(country: String, with_offset: Boolean): js.Array[
    typingsSlinky.momentTimezone.momentTimezoneMod.momentAugmentingMod.MomentZoneOffset | String
  ] = js.native
  def zonesForCountry[T /* <: `false` */](country: String, with_offset: T): js.Array[String] = js.native
  @JSName("zonesForCountry")
  def zonesForCountry_T_false[T /* <: `false` */](country: String): js.Array[String] = js.native
  @JSName("zonesForCountry")
  def zonesForCountry_T_true[T /* <: `true` */](country: String, with_offset: T): js.Array[
    typingsSlinky.momentTimezone.momentTimezoneMod.momentAugmentingMod.MomentZoneOffset
  ] = js.native
}

