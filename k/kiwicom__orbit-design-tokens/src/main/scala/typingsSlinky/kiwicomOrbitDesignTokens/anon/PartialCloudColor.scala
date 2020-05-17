package typingsSlinky.kiwicomOrbitDesignTokens.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@kiwicom/orbit-design-tokens.@kiwicom/orbit-design-tokens.CloudColor> */
@js.native
trait PartialCloudColor extends js.Object {
  var dark: js.UndefOr[String] = js.native
  var light: js.UndefOr[String] = js.native
  var lightActive: js.UndefOr[String] = js.native
  var lightHover: js.UndefOr[String] = js.native
  var normal: js.UndefOr[String] = js.native
  var normalActive: js.UndefOr[String] = js.native
  var normalHover: js.UndefOr[String] = js.native
}

object PartialCloudColor {
  @scala.inline
  def apply(): PartialCloudColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCloudColor]
  }
  @scala.inline
  implicit class PartialCloudColorOps[Self <: PartialCloudColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dark")(js.undefined)
        ret
    }
    @scala.inline
    def withLight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("light")(js.undefined)
        ret
    }
    @scala.inline
    def withLightActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightActive")(js.undefined)
        ret
    }
    @scala.inline
    def withLightHover(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightHover")(js.undefined)
        ret
    }
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

