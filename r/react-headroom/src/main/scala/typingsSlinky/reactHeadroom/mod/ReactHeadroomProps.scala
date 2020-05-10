package typingsSlinky.reactHeadroom.mod

import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactHeadroomProps extends js.Object {
  var calcHeightOnResize: js.UndefOr[Boolean] = js.native
  var children: TagMod[Any] = js.native
  var className: js.UndefOr[String] = js.native
  var disable: js.UndefOr[Boolean] = js.native
  var disableInlineStyles: js.UndefOr[Boolean] = js.native
  var downTolerance: js.UndefOr[Double] = js.native
  var onPin: js.UndefOr[js.Function0[Unit]] = js.native
  var onUnfix: js.UndefOr[js.Function0[Unit]] = js.native
  var onUnpin: js.UndefOr[js.Function0[Unit]] = js.native
  var parent: js.UndefOr[js.Function0[_]] = js.native
  var pinStart: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var upTolerance: js.UndefOr[Double] = js.native
  var wrapperStyle: js.UndefOr[CSSProperties] = js.native
}

object ReactHeadroomProps {
  @scala.inline
  def apply(): ReactHeadroomProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactHeadroomProps]
  }
  @scala.inline
  implicit class ReactHeadroomPropsOps[Self <: ReactHeadroomProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalcHeightOnResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calcHeightOnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalcHeightOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calcHeightOnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableInlineStyles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableInlineStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableInlineStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableInlineStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withDownTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPin(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnfix(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnfix")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnUnfix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnfix")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnpin(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnpin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnUnpin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnpin")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withPinStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinStart")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withUpTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperStyle")(js.undefined)
        ret
    }
  }
  
}

