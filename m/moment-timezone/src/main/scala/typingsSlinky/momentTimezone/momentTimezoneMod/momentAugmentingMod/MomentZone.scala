package typingsSlinky.momentTimezone.momentTimezoneMod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MomentZone extends js.Object {
  var abbrs: js.Array[String] = js.native
  var name: String = js.native
  var offsets: js.Array[Double] = js.native
  var population: Double = js.native
  var untils: js.Array[Double] = js.native
  def abbr(timestamp: Double): String = js.native
  def offset(timestamp: Double): Double = js.native
  def parse(timestamp: Double): Double = js.native
  def utcOffset(timestamp: Double): Double = js.native
}

object MomentZone {
  @scala.inline
  def apply(
    abbr: Double => String,
    abbrs: js.Array[String],
    name: String,
    offset: Double => Double,
    offsets: js.Array[Double],
    parse: Double => Double,
    population: Double,
    untils: js.Array[Double],
    utcOffset: Double => Double
  ): MomentZone = {
    val __obj = js.Dynamic.literal(abbr = js.Any.fromFunction1(abbr), abbrs = abbrs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = js.Any.fromFunction1(offset), offsets = offsets.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), population = population.asInstanceOf[js.Any], untils = untils.asInstanceOf[js.Any], utcOffset = js.Any.fromFunction1(utcOffset))
    __obj.asInstanceOf[MomentZone]
  }
  @scala.inline
  implicit class MomentZoneOps[Self <: MomentZone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbbr(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAbbrs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abbrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOffsets(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParse(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPopulation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("population")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUntils(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtcOffset(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utcOffset")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

