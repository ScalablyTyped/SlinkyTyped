package typingsSlinky.jointjs.mod.dia.Paper

import typingsSlinky.jointjs.anon.Color
import typingsSlinky.jointjs.jointjsStrings.linearGradient
import typingsSlinky.jointjs.jointjsStrings.radialGradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GradientOptions extends js.Object {
  var id: js.UndefOr[String] = js.native
  var stops: js.Array[Color] = js.native
  var `type`: linearGradient | radialGradient = js.native
}

object GradientOptions {
  @scala.inline
  def apply(stops: js.Array[Color], `type`: linearGradient | radialGradient): GradientOptions = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradientOptions]
  }
  @scala.inline
  implicit class GradientOptionsOps[Self <: GradientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStops(value: js.Array[Color]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: linearGradient | radialGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

