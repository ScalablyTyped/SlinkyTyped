package typingsSlinky.kiwicomOrbitDesignTokens.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  palette  :@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.CustomPalette,   base  :@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.CustomBase}> */
@js.native
trait CustomFoundation extends js.Object {
  var base: js.UndefOr[CustomBase] = js.native
  var palette: js.UndefOr[CustomPalette] = js.native
}

object CustomFoundation {
  @scala.inline
  def apply(): CustomFoundation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFoundation]
  }
  @scala.inline
  implicit class CustomFoundationOps[Self <: CustomFoundation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: CustomBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
    @scala.inline
    def withPalette(value: CustomPalette): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(js.undefined)
        ret
    }
  }
  
}

