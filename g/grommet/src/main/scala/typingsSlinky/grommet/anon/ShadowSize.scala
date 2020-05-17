package typingsSlinky.grommet.anon

import typingsSlinky.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShadowSize extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.native
  var border: js.UndefOr[Width] = js.native
  var shadowSize: js.UndefOr[String] = js.native
  var zIndex: js.UndefOr[String] = js.native
}

object ShadowSize {
  @scala.inline
  def apply(): ShadowSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowSize]
  }
  @scala.inline
  implicit class ShadowSizeOps[Self <: ShadowSize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: BackgroundType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBorder(value: Width): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withShadowSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadowSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowSize")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

