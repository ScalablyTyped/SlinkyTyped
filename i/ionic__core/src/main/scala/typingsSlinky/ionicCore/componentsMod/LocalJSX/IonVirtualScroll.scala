package typingsSlinky.ionicCore.componentsMod.LocalJSX

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.virtualScrollInterfaceMod.Cell
import typingsSlinky.ionicCore.virtualScrollInterfaceMod.FooterHeightFn
import typingsSlinky.ionicCore.virtualScrollInterfaceMod.HeaderFn
import typingsSlinky.ionicCore.virtualScrollInterfaceMod.HeaderHeightFn
import typingsSlinky.ionicCore.virtualScrollInterfaceMod.ItemHeightFn
import typingsSlinky.ionicCore.virtualScrollInterfaceMod.ItemRenderFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonVirtualScroll extends js.Object {
  /**
    * The approximate width of each footer template's cell. This dimension is used to help determine how many cells should be created when initialized, and to help calculate the height of the scrollable area. This height value can only use `px` units. Note that the actual rendered size of each cell comes from the app's CSS, whereas this approximation is used to help calculate initial dimensions before the item has been rendered.
    */
  var approxFooterHeight: js.UndefOr[Double] = js.native
  /**
    * The approximate height of each header template's cell. This dimension is used to help determine how many cells should be created when initialized, and to help calculate the height of the scrollable area. This height value can only use `px` units. Note that the actual rendered size of each cell comes from the app's CSS, whereas this approximation is used to help calculate initial dimensions before the item has been rendered.
    */
  var approxHeaderHeight: js.UndefOr[Double] = js.native
  /**
    * It is important to provide this if virtual item height will be significantly larger than the default The approximate height of each virtual item template's cell. This dimension is used to help determine how many cells should be created when initialized, and to help calculate the height of the scrollable area. This height value can only use `px` units. Note that the actual rendered size of each cell comes from the app's CSS, whereas this approximation is used to help calculate initial dimensions before the item has been rendered.
    */
  var approxItemHeight: js.UndefOr[Double] = js.native
  /**
    * Section footers and the data used within its given template can be dynamically created by passing a function to `footerFn`. The logic within the footer function can decide if the footer template should be used, and what data to give to the footer template. The function must return `null` if a footer cell shouldn't be created.
    */
  var footerFn: js.UndefOr[HeaderFn] = js.native
  /**
    * An optional function that maps each item footer within their height.
    */
  var footerHeight: js.UndefOr[FooterHeightFn] = js.native
  /**
    * Section headers and the data used within its given template can be dynamically created by passing a function to `headerFn`. For example, a large list of contacts usually has dividers between each letter in the alphabet. App's can provide their own custom `headerFn` which is called with each record within the dataset. The logic within the header function can decide if the header template should be used, and what data to give to the header template. The function must return `null` if a header cell shouldn't be created.
    */
  var headerFn: js.UndefOr[HeaderFn] = js.native
  /**
    * An optional function that maps each item header within their height.
    */
  var headerHeight: js.UndefOr[HeaderHeightFn] = js.native
  /**
    * An optional function that maps each item within their height. When this function is provides, heavy optimizations and fast path can be taked by `ion-virtual-scroll` leading to massive performance improvements.  This function allows to skip all DOM reads, which can be Doing so leads to massive performance
    */
  var itemHeight: js.UndefOr[ItemHeightFn] = js.native
  /**
    * The data that builds the templates within the virtual scroll. It's important to note that when this data has changed, then the entire virtual scroll is reset, which is an expensive operation and should be avoided if possible.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  /**
    * NOTE: only Vanilla JS API.
    */
  var nodeRender: js.UndefOr[ItemRenderFn] = js.native
  /**
    * NOTE: only JSX API for stencil.  Provide a render function for the footer to be rendered. Returns a JSX virtual-dom.
    */
  var renderFooter: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, _]] = js.native
  /**
    * NOTE: only JSX API for stencil.  Provide a render function for the header to be rendered. Returns a JSX virtual-dom.
    */
  var renderHeader: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, _]] = js.native
  /**
    * NOTE: only JSX API for stencil.  Provide a render function for the items to be rendered. Returns a JSX virtual-dom.
    */
  var renderItem: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, _]] = js.native
}

object IonVirtualScroll {
  @scala.inline
  def apply(): IonVirtualScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonVirtualScroll]
  }
  @scala.inline
  implicit class IonVirtualScrollOps[Self <: IonVirtualScroll] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApproxFooterHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approxFooterHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproxFooterHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approxFooterHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withApproxHeaderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approxHeaderHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproxHeaderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approxHeaderHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withApproxItemHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approxItemHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApproxItemHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("approxItemHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterFn(
      value: (/* item */ js.Any, /* index */ Double, /* items */ js.Array[js.Any]) => js.UndefOr[String | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFooterFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerFn")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterHeight(value: (/* item */ js.Any, /* index */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerHeight")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFooterHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderFn(
      value: (/* item */ js.Any, /* index */ Double, /* items */ js.Array[js.Any]) => js.UndefOr[String | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHeaderFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerFn")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderHeight(value: (/* item */ js.Any, /* index */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutHeaderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withItemHeight(value: (/* item */ js.Any, /* index */ Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutItemHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(js.undefined)
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
    def withNodeRender(value: (/* el */ HTMLElement | Null, /* cell */ Cell, /* domIndex */ Double) => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeRender")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutNodeRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeRender")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFooter(value: (/* item */ js.Any, /* index */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFooter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderHeader(value: (/* item */ js.Any, /* index */ Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeader")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRenderHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderItem(value: (/* item */ js.Any, /* index */ Double) => _): Self = {
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

