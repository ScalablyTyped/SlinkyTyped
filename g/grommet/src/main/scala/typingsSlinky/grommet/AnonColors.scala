package typingsSlinky.grommet

import typingsSlinky.grommet.utilsMod.GraphColorsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColors extends js.Object {
  var colors: js.UndefOr[GraphColorsType] = js.native
}

object AnonColors {
  @scala.inline
  def apply(): AnonColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonColors]
  }
  @scala.inline
  implicit class AnonColorsOps[Self <: AnonColors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: GraphColorsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
  }
  
}

