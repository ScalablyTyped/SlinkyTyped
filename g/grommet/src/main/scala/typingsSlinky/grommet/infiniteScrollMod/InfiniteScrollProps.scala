package typingsSlinky.grommet.infiniteScrollMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.grommet.grommetStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InfiniteScrollProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var items: js.UndefOr[js.Array[_]] = js.native
  var onMore: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var renderMarker: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var replace: js.UndefOr[Boolean] = js.native
  var scrollableAncestor: js.UndefOr[TagMod[Any] | window] = js.native
  var show: js.UndefOr[Double] = js.native
  var step: js.UndefOr[Double] = js.native
}

object InfiniteScrollProps {
  @scala.inline
  def apply(): InfiniteScrollProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfiniteScrollProps]
  }
  @scala.inline
  implicit class InfiniteScrollPropsOps[Self <: InfiniteScrollProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMore(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMore")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderMarker(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMarker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withReplace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollableAncestorReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollableAncestor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollableAncestor(value: TagMod[Any] | window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollableAncestor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollableAncestor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollableAncestor")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
  }
  
}

