package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CirctuiBreakerConfig extends js.Object {
  var circuitBreakerErrorThresholdPercentage: Double = js.native
  var circuitBreakerForceClosed: Boolean = js.native
  var circuitBreakerForceOpened: Boolean = js.native
  var circuitBreakerRequestVolumeThreshold: Double = js.native
  var circuitBreakerSleepWindowInMilliseconds: Double = js.native
  var commandGroup: String = js.native
  var commandKey: String = js.native
}

object CirctuiBreakerConfig {
  @scala.inline
  def apply(
    circuitBreakerErrorThresholdPercentage: Double,
    circuitBreakerForceClosed: Boolean,
    circuitBreakerForceOpened: Boolean,
    circuitBreakerRequestVolumeThreshold: Double,
    circuitBreakerSleepWindowInMilliseconds: Double,
    commandGroup: String,
    commandKey: String
  ): CirctuiBreakerConfig = {
    val __obj = js.Dynamic.literal(circuitBreakerErrorThresholdPercentage = circuitBreakerErrorThresholdPercentage.asInstanceOf[js.Any], circuitBreakerForceClosed = circuitBreakerForceClosed.asInstanceOf[js.Any], circuitBreakerForceOpened = circuitBreakerForceOpened.asInstanceOf[js.Any], circuitBreakerRequestVolumeThreshold = circuitBreakerRequestVolumeThreshold.asInstanceOf[js.Any], circuitBreakerSleepWindowInMilliseconds = circuitBreakerSleepWindowInMilliseconds.asInstanceOf[js.Any], commandGroup = commandGroup.asInstanceOf[js.Any], commandKey = commandKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CirctuiBreakerConfig]
  }
  @scala.inline
  implicit class CirctuiBreakerConfigOps[Self <: CirctuiBreakerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCircuitBreakerErrorThresholdPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerErrorThresholdPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCircuitBreakerForceClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCircuitBreakerForceOpened(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerForceOpened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCircuitBreakerRequestVolumeThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerRequestVolumeThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCircuitBreakerSleepWindowInMilliseconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circuitBreakerSleepWindowInMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommandGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommandKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

