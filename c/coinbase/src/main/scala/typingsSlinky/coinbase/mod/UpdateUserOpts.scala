package typingsSlinky.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserOpts extends js.Object {
  /**
    * User’s name
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Local currency used to display amounts converted from BTC
    */
  var native_currency: js.UndefOr[String] = js.native
  /**
    * Time zone
    */
  var time_zone: js.UndefOr[String] = js.native
}

object UpdateUserOpts {
  @scala.inline
  def apply(): UpdateUserOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserOpts]
  }
  @scala.inline
  implicit class UpdateUserOptsOps[Self <: UpdateUserOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNative_currency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native_currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNative_currency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native_currency")(js.undefined)
        ret
    }
    @scala.inline
    def withTime_zone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime_zone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_zone")(js.undefined)
        ret
    }
  }
  
}

