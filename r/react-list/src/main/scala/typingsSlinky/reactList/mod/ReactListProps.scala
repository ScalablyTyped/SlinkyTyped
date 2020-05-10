package typingsSlinky.reactList.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Props
import typingsSlinky.reactList.reactListStrings.x
import typingsSlinky.reactList.reactListStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactListProps extends Props[ReactList] {
  var axis: js.UndefOr[x | y] = js.native
  var initialIndex: js.UndefOr[Double] = js.native
  var itemRenderer: js.UndefOr[ItemRenderer] = js.native
  var itemSizeEstimator: js.UndefOr[ItemSizeEstimator] = js.native
  var itemSizeGetter: js.UndefOr[ItemSizeGetter] = js.native
  var itemsRenderer: js.UndefOr[ItemsRenderer] = js.native
  var length: js.UndefOr[Double] = js.native
  var minSize: js.UndefOr[Double] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var scrollParentGetter: js.UndefOr[ScrollParentGetter] = js.native
  var threshold: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
  var useStaticSize: js.UndefOr[Boolean] = js.native
  var useTranslate3d: js.UndefOr[Boolean] = js.native
}

object ReactListProps {
  @scala.inline
  def apply(): ReactListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactListProps]
  }
  @scala.inline
  implicit class ReactListPropsOps[Self <: ReactListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxis(value: x | y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withItemRenderer(value: (/* index */ Double, /* key */ Double | String) => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRenderer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutItemRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withItemSizeEstimator(value: (/* index */ Double, /* cache */ js.Object) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSizeEstimator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutItemSizeEstimator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSizeEstimator")(js.undefined)
        ret
    }
    @scala.inline
    def withItemSizeGetter(value: /* index */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSizeGetter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemSizeGetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSizeGetter")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsRenderer(value: (/* items */ js.Array[ReactElement], /* ref */ String) => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsRenderer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutItemsRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollParentGetter(value: () => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollParentGetter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutScrollParentGetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollParentGetter")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUseStaticSize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStaticSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseStaticSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStaticSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTranslate3d(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTranslate3d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTranslate3d: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTranslate3d")(js.undefined)
        ret
    }
  }
  
}

