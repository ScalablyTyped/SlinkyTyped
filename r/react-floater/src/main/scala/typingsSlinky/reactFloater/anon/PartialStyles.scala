package typingsSlinky.reactFloater.anon

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-floater.react-floater.Styles> */
@js.native
trait PartialStyles extends js.Object {
  var arrow: js.UndefOr[CSSPropertieslengthnumber] = js.native
  var close: js.UndefOr[CSSProperties] = js.native
  var container: js.UndefOr[CSSProperties] = js.native
  var content: js.UndefOr[CSSProperties] = js.native
  var floater: js.UndefOr[CSSProperties] = js.native
  var floaterCentered: js.UndefOr[CSSProperties] = js.native
  var floaterClosing: js.UndefOr[CSSProperties] = js.native
  var floaterOpening: js.UndefOr[CSSProperties] = js.native
  var floaterWithAnimation: js.UndefOr[CSSProperties] = js.native
  var floaterWithComponent: js.UndefOr[CSSProperties] = js.native
  var footer: js.UndefOr[CSSProperties] = js.native
  var options: js.UndefOr[ZIndex] = js.native
  var title: js.UndefOr[CSSProperties] = js.native
  var wrapper: js.UndefOr[CSSProperties] = js.native
  var wrapperPosition: js.UndefOr[CSSProperties] = js.native
}

object PartialStyles {
  @scala.inline
  def apply(): PartialStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyles]
  }
  @scala.inline
  implicit class PartialStylesOps[Self <: PartialStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrow(value: CSSPropertieslengthnumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrow")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withContent(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withFloater(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floater")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloater: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floater")(js.undefined)
        ret
    }
    @scala.inline
    def withFloaterCentered(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floaterCentered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloaterCentered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floaterCentered")(js.undefined)
        ret
    }
    @scala.inline
    def withFloaterClosing(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floaterClosing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloaterClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floaterClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withFloaterOpening(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floaterOpening")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloaterOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floaterOpening")(js.undefined)
        ret
    }
    @scala.inline
    def withFloaterWithAnimation(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floaterWithAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloaterWithAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floaterWithAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withFloaterWithComponent(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floaterWithComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloaterWithComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floaterWithComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withFooter(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footer")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: ZIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapper(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperPosition(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperPosition")(js.undefined)
        ret
    }
  }
  
}

