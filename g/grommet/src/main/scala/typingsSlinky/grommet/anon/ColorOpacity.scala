package typingsSlinky.grommet.anon

import typingsSlinky.grommet.utilsMod.OpacityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorOpacity extends js.Object {
  var color: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[OpacityType] = js.native
}

object ColorOpacity {
  @scala.inline
  def apply(): ColorOpacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorOpacity]
  }
  @scala.inline
  implicit class ColorOpacityOps[Self <: ColorOpacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
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
    def withOpacity(value: OpacityType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
  }
  
}

