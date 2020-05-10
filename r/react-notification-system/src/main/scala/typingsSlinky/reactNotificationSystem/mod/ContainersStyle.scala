package typingsSlinky.reactNotificationSystem.mod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainersStyle extends js.Object {
  var DefaultStyle: CSSProperties = js.native
  var bc: js.UndefOr[CSSProperties] = js.native
  var bl: js.UndefOr[CSSProperties] = js.native
  var br: js.UndefOr[CSSProperties] = js.native
  var tc: js.UndefOr[CSSProperties] = js.native
  var tl: js.UndefOr[CSSProperties] = js.native
  var tr: js.UndefOr[CSSProperties] = js.native
}

object ContainersStyle {
  @scala.inline
  def apply(DefaultStyle: CSSProperties): ContainersStyle = {
    val __obj = js.Dynamic.literal(DefaultStyle = DefaultStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainersStyle]
  }
  @scala.inline
  implicit class ContainersStyleOps[Self <: ContainersStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBc(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bc")(js.undefined)
        ret
    }
    @scala.inline
    def withBl(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bl")(js.undefined)
        ret
    }
    @scala.inline
    def withBr(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("br")(js.undefined)
        ret
    }
    @scala.inline
    def withTc(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tc")(js.undefined)
        ret
    }
    @scala.inline
    def withTl(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tl")(js.undefined)
        ret
    }
    @scala.inline
    def withTr(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tr")(js.undefined)
        ret
    }
  }
  
}

