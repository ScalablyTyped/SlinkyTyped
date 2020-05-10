package typingsSlinky.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CPUUtilization extends js.Object {
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the I/O Wait state over the last 10 seconds.
    */
  var IOWait: js.UndefOr[NullableDouble] = js.native
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the IRQ state over the last 10 seconds.
    */
  var IRQ: js.UndefOr[NullableDouble] = js.native
  /**
    * Percentage of time that the CPU has spent in the Idle state over the last 10 seconds.
    */
  var Idle: js.UndefOr[NullableDouble] = js.native
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the Nice state over the last 10 seconds.
    */
  var Nice: js.UndefOr[NullableDouble] = js.native
  /**
    * Available on Windows environments only. Percentage of time that the CPU has spent in the Privileged state over the last 10 seconds.
    */
  var Privileged: js.UndefOr[NullableDouble] = js.native
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the SoftIRQ state over the last 10 seconds.
    */
  var SoftIRQ: js.UndefOr[NullableDouble] = js.native
  /**
    * Available on Linux environments only. Percentage of time that the CPU has spent in the System state over the last 10 seconds.
    */
  var System: js.UndefOr[NullableDouble] = js.native
  /**
    * Percentage of time that the CPU has spent in the User state over the last 10 seconds.
    */
  var User: js.UndefOr[NullableDouble] = js.native
}

object CPUUtilization {
  @scala.inline
  def apply(): CPUUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CPUUtilization]
  }
  @scala.inline
  implicit class CPUUtilizationOps[Self <: CPUUtilization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIOWait(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IOWait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIOWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IOWait")(js.undefined)
        ret
    }
    @scala.inline
    def withIRQ(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IRQ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIRQ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IRQ")(js.undefined)
        ret
    }
    @scala.inline
    def withIdle(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Idle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Idle")(js.undefined)
        ret
    }
    @scala.inline
    def withNice(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nice")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivileged(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Privileged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivileged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Privileged")(js.undefined)
        ret
    }
    @scala.inline
    def withSoftIRQ(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoftIRQ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftIRQ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoftIRQ")(js.undefined)
        ret
    }
    @scala.inline
    def withSystem(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("System")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("System")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(js.undefined)
        ret
    }
  }
  
}

