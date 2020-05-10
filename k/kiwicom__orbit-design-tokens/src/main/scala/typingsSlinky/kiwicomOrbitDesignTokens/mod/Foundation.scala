package typingsSlinky.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Foundation extends js.Object {
  var base: Base = js.native
  var palette: Palette = js.native
}

object Foundation {
  @scala.inline
  def apply(base: Base, palette: Palette): Foundation = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any])
    __obj.asInstanceOf[Foundation]
  }
  @scala.inline
  implicit class FoundationOps[Self <: Foundation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: Base): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPalette(value: Palette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

