package typingsSlinky.antdMobileRn.gridPropsTypeMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridPropsType extends js.Object {
  var carouselMaxRow: js.UndefOr[Double] = js.native
  var columnNum: js.UndefOr[Double] = js.native
  var data: js.UndefOr[js.Array[js.UndefOr[DataItem]]] = js.native
  var hasLine: js.UndefOr[Boolean] = js.native
  var isCarousel: js.UndefOr[Boolean] = js.native
  var onClick: js.UndefOr[js.Function2[/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double, Unit]] = js.native
  var renderItem: js.UndefOr[
    js.Function2[/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double, ReactElement]
  ] = js.native
}

object GridPropsType {
  @scala.inline
  def apply(): GridPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridPropsType]
  }
  @scala.inline
  implicit class GridPropsTypeOps[Self <: GridPropsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCarouselMaxRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carouselMaxRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarouselMaxRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carouselMaxRow")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnNum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnNum")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Array[js.UndefOr[DataItem]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withHasLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLine")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCarousel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCarousel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCarousel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCarousel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderItem(value: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.undefined)
        ret
    }
  }
  
}

