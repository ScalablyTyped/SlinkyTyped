package typingsSlinky.rcDrawer.idrawerproptypesMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDrawerChildProps extends IProps {
  var getContainer: js.UndefOr[js.Function0[HTMLElement]] = js.native
  var getOpenCount: js.UndefOr[js.Function0[Double]] = js.native
  var switchScrollingEffect: js.UndefOr[js.Function1[/* close */ js.UndefOr[Boolean], Unit]] = js.native
}

object IDrawerChildProps {
  @scala.inline
  def apply(): IDrawerChildProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDrawerChildProps]
  }
  @scala.inline
  implicit class IDrawerChildPropsOps[Self <: IDrawerChildProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetContainer(value: () => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOpenCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpenCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOpenCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOpenCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSwitchScrollingEffect(value: /* close */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchScrollingEffect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSwitchScrollingEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchScrollingEffect")(js.undefined)
        ret
    }
  }
  
}

