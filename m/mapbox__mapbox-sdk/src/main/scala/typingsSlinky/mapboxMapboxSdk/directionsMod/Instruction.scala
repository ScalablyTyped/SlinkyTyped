package typingsSlinky.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instruction extends js.Object {
  /**
    * Objects that, together, make up what should be displayed in the banner.
    * Includes additional information intended to be used to aid in visual layout
    */
  var components: js.Array[Component] = js.native
  /**
    * The degrees at which you will be exiting a roundabout, assuming 180 indicates going straight through the roundabout.
    */
  var degrees: js.UndefOr[Double] = js.native
  /**
    * A string representing which side the of the street people drive on in that location. Can be 'left' or 'right'.
    */
  var driving_side: DirectionsSide = js.native
  /**
    * The modifier for the maneuver. Can be used in combination with the type (and, if it is a roundabout, the degrees)
    * to for an icon to display. Possible values: 'left', 'right', 'slight left', 'slight right', 'sharp left', 'sharp right', 'straight', 'uturn'
    */
  var modifier: js.UndefOr[ManeuverModifier] = js.native
  /**
    * String that contains all the text that should be displayed.
    */
  var text: String = js.native
  /**
    * The type of maneuver. May be used in combination with the modifier (and, if it is a roundabout, the degrees) to for an icon to
    * display. Possible values: 'turn', 'merge', 'depart', 'arrive', 'fork', 'off ramp', 'roundabout'
    */
  var `type`: js.UndefOr[String] = js.native
}

object Instruction {
  @scala.inline
  def apply(components: js.Array[Component], driving_side: DirectionsSide, text: String): Instruction = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], driving_side = driving_side.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instruction]
  }
  @scala.inline
  implicit class InstructionOps[Self <: Instruction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponents(value: js.Array[Component]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDriving_side(value: DirectionsSide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driving_side")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDegrees(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degrees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDegrees: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degrees")(js.undefined)
        ret
    }
    @scala.inline
    def withModifier(value: ManeuverModifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifier")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

