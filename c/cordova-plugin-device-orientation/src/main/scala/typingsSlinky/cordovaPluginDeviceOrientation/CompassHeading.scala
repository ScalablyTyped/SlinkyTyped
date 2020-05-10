package typingsSlinky.cordovaPluginDeviceOrientation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A CompassHeading object is returned to the compassSuccess callback function. */
@js.native
trait CompassHeading extends js.Object {
  /** The deviation in degrees between the reported heading and the true heading. */
  var headingAccuracy: Double = js.native
  /** The heading in degrees from 0-359.99 at a single moment in time. */
  var magneticHeading: Double = js.native
  /** The time at which this heading was determined. */
  var timestamp: Double = js.native
  /** The heading relative to the geographic North Pole in degrees 0-359.99 at a single moment in time. A negative value indicates that the true heading can't be determined. */
  var trueHeading: Double = js.native
}

object CompassHeading {
  @scala.inline
  def apply(headingAccuracy: Double, magneticHeading: Double, timestamp: Double, trueHeading: Double): CompassHeading = {
    val __obj = js.Dynamic.literal(headingAccuracy = headingAccuracy.asInstanceOf[js.Any], magneticHeading = magneticHeading.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], trueHeading = trueHeading.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompassHeading]
  }
  @scala.inline
  implicit class CompassHeadingOps[Self <: CompassHeading] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeadingAccuracy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingAccuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMagneticHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magneticHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrueHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueHeading")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

