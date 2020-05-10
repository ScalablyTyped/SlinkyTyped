package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Termination extends js.Object {
  /**
    * The countries to which calls are allowed, in ISO 3166-1 alpha-2 format. Required.
    */
  var CallingRegions: js.UndefOr[CallingRegionList] = js.native
  /**
    * The IP addresses allowed to make calls, in CIDR format. Required.
    */
  var CidrAllowedList: js.UndefOr[StringList] = js.native
  /**
    * The limit on calls per second. Max value based on account service quota. Default value of 1.
    */
  var CpsLimit: js.UndefOr[typingsSlinky.awsSdk.chimeMod.CpsLimit] = js.native
  /**
    * The default caller ID phone number.
    */
  var DefaultPhoneNumber: js.UndefOr[E164PhoneNumber] = js.native
  /**
    * When termination settings are disabled, outbound calls can not be made.
    */
  var Disabled: js.UndefOr[Boolean] = js.native
}

object Termination {
  @scala.inline
  def apply(): Termination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Termination]
  }
  @scala.inline
  implicit class TerminationOps[Self <: Termination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallingRegions(value: CallingRegionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallingRegions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallingRegions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallingRegions")(js.undefined)
        ret
    }
    @scala.inline
    def withCidrAllowedList(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrAllowedList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrAllowedList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CidrAllowedList")(js.undefined)
        ret
    }
    @scala.inline
    def withCpsLimit(value: CpsLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CpsLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCpsLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CpsLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultPhoneNumber(value: E164PhoneNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultPhoneNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultPhoneNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultPhoneNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Disabled")(js.undefined)
        ret
    }
  }
  
}

