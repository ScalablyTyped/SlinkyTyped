package typingsSlinky.grommet

import typingsSlinky.grommet.diagramMod.DiagramConnectionAnchor
import typingsSlinky.grommet.diagramMod.DiagramConnectionType
import typingsSlinky.grommet.grommetStrings.hair
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.grommetStrings.xxsmall
import typingsSlinky.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnchor extends js.Object {
  var anchor: js.UndefOr[DiagramConnectionAnchor] = js.native
  var color: js.UndefOr[ColorType] = js.native
  var fromTarget: String | js.Object = js.native
  var label: js.UndefOr[String] = js.native
  var offset: js.UndefOr[xsmall | small | medium | large | String] = js.native
  var thickness: js.UndefOr[hair | xxsmall | xsmall | small | medium | large | String] = js.native
  var toTarget: String | js.Object = js.native
  var `type`: js.UndefOr[DiagramConnectionType] = js.native
}

object AnonAnchor {
  @scala.inline
  def apply(fromTarget: String | js.Object, toTarget: String | js.Object): AnonAnchor = {
    val __obj = js.Dynamic.literal(fromTarget = fromTarget.asInstanceOf[js.Any], toTarget = toTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnchor]
  }
  @scala.inline
  implicit class AnonAnchorOps[Self <: AnonAnchor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromTarget(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToTarget(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnchor(value: DiagramConnectionAnchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: ColorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: xsmall | small | medium | large | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withThickness(value: hair | xxsmall | xsmall | small | medium | large | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: DiagramConnectionType): Self = {
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

