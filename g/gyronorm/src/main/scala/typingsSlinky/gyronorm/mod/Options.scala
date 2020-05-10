package typingsSlinky.gyronorm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * How many digits after the decimal point will there be in the return values
    */
  var decimalCount: js.UndefOr[Double] = js.native
  /**
    * How often GyroNorm returns data (in milliseconds)
    */
  var frequency: js.UndefOr[Double] = js.native
  /**
    * If the gravity related values to be normalized
    */
  var gravityNormalized: js.UndefOr[Boolean] = js.native
  /**
    * Function to be called to log messages from gyronorm.js
    */
  var logger: js.UndefOr[LogListener] = js.native
  /**
    * Can be GyroNorm.GAME or GyroNorm.WORLD. gn.GAME returns
    * orientation values with respect to the head direction of the device.
    * gn.WORLD returns the orientation values with respect to the actual
    * north direction of the world.
    */
  var orientationBase: js.UndefOr[String] = js.native
  /**
    * If set to true it will return screen adjusted values
    */
  var screenAdjusted: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimalCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecimalCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimalCount")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(js.undefined)
        ret
    }
    @scala.inline
    def withGravityNormalized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityNormalized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGravityNormalized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravityNormalized")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: /* data */ LoggerData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientationBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientationBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientationBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientationBase")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenAdjusted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenAdjusted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenAdjusted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenAdjusted")(js.undefined)
        ret
    }
  }
  
}

