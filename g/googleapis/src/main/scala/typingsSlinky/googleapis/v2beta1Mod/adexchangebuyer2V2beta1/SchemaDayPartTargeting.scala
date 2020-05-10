package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the day part targeting criteria.
  */
@js.native
trait SchemaDayPartTargeting extends js.Object {
  /**
    * A list of day part targeting criterion.
    */
  var dayParts: js.UndefOr[js.Array[SchemaDayPart]] = js.native
  /**
    * The timezone to use for interpreting the day part targeting.
    */
  var timeZoneType: js.UndefOr[String] = js.native
}

object SchemaDayPartTargeting {
  @scala.inline
  def apply(): SchemaDayPartTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDayPartTargeting]
  }
  @scala.inline
  implicit class SchemaDayPartTargetingOps[Self <: SchemaDayPartTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDayParts(value: js.Array[SchemaDayPart]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayParts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayParts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayParts")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZoneType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZoneType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneType")(js.undefined)
        ret
    }
  }
  
}

