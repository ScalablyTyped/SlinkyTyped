package typingsSlinky.kiwicomOrbitDesignTokens.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.WhiteColor> */
@js.native
trait PartialWhiteColor extends js.Object {
  var normal: js.UndefOr[String] = js.native
  var normalActive: js.UndefOr[String] = js.native
  var normalHover: js.UndefOr[String] = js.native
}

object PartialWhiteColor {
  @scala.inline
  def apply(): PartialWhiteColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWhiteColor]
  }
  @scala.inline
  implicit class PartialWhiteColorOps[Self <: PartialWhiteColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalActive")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalHover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalHover")(js.undefined)
        ret
    }
  }
  
}

