package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceMinutes extends js.Object {
  /**
    * When specified, represents only the sum of metered minutes used by the resource to run tests.
    */
  var metered: js.UndefOr[Double] = js.native
  /**
    * When specified, represents the total minutes used by the resource to run tests.
    */
  var total: js.UndefOr[Double] = js.native
  /**
    * When specified, represents only the sum of unmetered minutes used by the resource to run tests.
    */
  var unmetered: js.UndefOr[Double] = js.native
}

object DeviceMinutes {
  @scala.inline
  def apply(): DeviceMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceMinutes]
  }
  @scala.inline
  implicit class DeviceMinutesOps[Self <: DeviceMinutes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetered(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metered")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmetered(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmetered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmetered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmetered")(js.undefined)
        ret
    }
  }
  
}

