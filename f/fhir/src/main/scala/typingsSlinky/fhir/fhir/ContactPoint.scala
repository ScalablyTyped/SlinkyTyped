package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of a Technology mediated contact point (phone, fax, email, etc.)
  */
@js.native
trait ContactPoint extends Element {
  /**
    * Contains extended information for property 'rank'.
    */
  var _rank: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.native
  /**
    * Time period when the contact point was/is in use
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * Specify preferred order of use (1 = highest)
    */
  var rank: js.UndefOr[positiveInt] = js.native
  /**
    * phone | fax | email | pager | url | sms | other
    */
  var system: js.UndefOr[code] = js.native
  /**
    * home | work | temp | old | mobile - purpose of this contact point
    */
  var use: js.UndefOr[code] = js.native
  /**
    * The actual contact point details
    */
  var value: js.UndefOr[String] = js.native
}

object ContactPoint {
  @scala.inline
  def apply(): ContactPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactPoint]
  }
  @scala.inline
  implicit class ContactPointOps[Self <: ContactPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_rank(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_rank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rank")(js.undefined)
        ret
    }
    @scala.inline
    def with_system(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_system: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_system")(js.undefined)
        ret
    }
    @scala.inline
    def with_use(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_use")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_use: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_use")(js.undefined)
        ret
    }
    @scala.inline
    def with_value(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_value")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
        ret
    }
    @scala.inline
    def withRank(value: positiveInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(js.undefined)
        ret
    }
    @scala.inline
    def withSystem(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("system")(js.undefined)
        ret
    }
    @scala.inline
    def withUse(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

