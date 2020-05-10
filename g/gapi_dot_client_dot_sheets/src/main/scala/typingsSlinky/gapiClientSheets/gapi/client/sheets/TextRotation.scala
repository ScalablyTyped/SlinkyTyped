package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextRotation extends js.Object {
  /**
    * The angle between the standard orientation and the desired orientation.
    * Measured in degrees. Valid values are between -90 and 90. Positive
    * angles are angled upwards, negative are angled downwards.
    *
    * Note: For LTR text direction positive angles are in the
    * counterclockwise direction, whereas for RTL they are in the clockwise
    * direction
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * If true, text reads top to bottom, but the orientation of individual
    * characters is unchanged.
    * For example:
    *
    * | V |
    * | e |
    * | r |
    * | t |
    * | i |
    * | c |
    * | a |
    * | l |
    */
  var vertical: js.UndefOr[Boolean] = js.native
}

object TextRotation {
  @scala.inline
  def apply(): TextRotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextRotation]
  }
  @scala.inline
  implicit class TextRotationOps[Self <: TextRotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

