package typingsSlinky.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BannerInstruction extends js.Object {
  /**
    * Float indicating in meters, how far from the upcoming maneuver
    * the banner instruction should begin being displayed. Only 1 banner should be displayed at a time.
    */
  var distanceAlongGeometry: Double = js.native
  /**
    * Most important content to display to the user. Our SDK displays this text larger and at the top.
    */
  var primary: Instruction = js.native
  /**
    * Additional content useful for visual guidance. Our SDK displays this text slightly smaller and below the primary. Can be null.
    */
  var secondary: js.UndefOr[js.Array[Instruction]] = js.native
  /**
    * Additional information that is included if we feel the driver needs a heads up about something.
    * Can include information about the next maneuver (the one after the upcoming one) if the step is short -
    * can be null, or can be lane information. If we have lane information, that trumps information about the next maneuver.
    */
  var sub: js.UndefOr[Sub] = js.native
  var `then`: js.UndefOr[js.Any] = js.native
}

object BannerInstruction {
  @scala.inline
  def apply(distanceAlongGeometry: Double, primary: Instruction): BannerInstruction = {
    val __obj = js.Dynamic.literal(distanceAlongGeometry = distanceAlongGeometry.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any])
    __obj.asInstanceOf[BannerInstruction]
  }
  @scala.inline
  implicit class BannerInstructionOps[Self <: BannerInstruction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistanceAlongGeometry(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceAlongGeometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimary(value: Instruction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondary(value: js.Array[Instruction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondary")(js.undefined)
        ret
    }
    @scala.inline
    def withSub(value: Sub): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(js.undefined)
        ret
    }
    @scala.inline
    def withThen(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(js.undefined)
        ret
    }
  }
  
}

