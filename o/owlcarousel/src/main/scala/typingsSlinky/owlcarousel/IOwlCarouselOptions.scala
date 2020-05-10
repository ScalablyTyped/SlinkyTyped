package typingsSlinky.owlcarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOwlCarouselOptions extends js.Object {
  var addClassActive: js.UndefOr[Boolean] = js.native
  var afterAction: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  var afterInit: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  var afterLazyLoad: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  var afterMove: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  var afterUpdate: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  var autoHeight: js.UndefOr[Boolean] = js.native
  var autoPlay: js.UndefOr[js.Any] = js.native
  var baseClass: js.UndefOr[String] = js.native
  var beforeInit: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  var beforeMove: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  // callbacks
  var beforeUpdate: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  var dragBeforeAnimFinish: js.UndefOr[Boolean] = js.native
  // options
  var items: js.UndefOr[Double] = js.native
  var itemsCustom: js.UndefOr[js.Any] = js.native
  var itemsDesktop: js.UndefOr[js.Array[Double]] = js.native
  var itemsDesktopSmall: js.UndefOr[js.Array[Double]] = js.native
  var itemsMobile: js.UndefOr[js.Array[Double]] = js.native
  var itemsScaleUp: js.UndefOr[Boolean] = js.native
  var itemsTablet: js.UndefOr[js.Array[Double]] = js.native
  var itemsTabletSmall: js.UndefOr[js.Any] = js.native
  var jsonPath: js.UndefOr[js.Any] = js.native
  var jsonSuccess: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.native
  var lazyEffect: js.UndefOr[js.Any] = js.native
  var lazyFollow: js.UndefOr[Boolean] = js.native
  var lazyLoad: js.UndefOr[Boolean] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var mouseDrag: js.UndefOr[Boolean] = js.native
  var nav: js.UndefOr[Boolean] = js.native
  var navigation: js.UndefOr[Boolean] = js.native
  var navigationText: js.UndefOr[js.Any] = js.native
  var pagination: js.UndefOr[Boolean] = js.native
  var paginationNumbers: js.UndefOr[Boolean] = js.native
  var paginationSpeed: js.UndefOr[Double] = js.native
  var responsive: js.UndefOr[Boolean] = js.native
  var responsiveBaseWidth: js.UndefOr[JQuery | String] = js.native
  var responsiveRefreshRate: js.UndefOr[Double] = js.native
  var rewindNav: js.UndefOr[Boolean] = js.native
  var rewindSpeed: js.UndefOr[Double] = js.native
  var scrollPerPage: js.UndefOr[Boolean] = js.native
  var singleItem: js.UndefOr[Boolean] = js.native
  var slideSpeed: js.UndefOr[Double] = js.native
  var startDragging: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
  var stopOnHover: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[String] = js.native
  var touchDrag: js.UndefOr[Boolean] = js.native
  var transitionStyle: js.UndefOr[js.Any] = js.native
}

object IOwlCarouselOptions {
  @scala.inline
  def apply(): IOwlCarouselOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOwlCarouselOptions]
  }
  @scala.inline
  implicit class IOwlCarouselOptionsOps[Self <: IOwlCarouselOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClassActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClassActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddClassActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClassActive")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterAction(value: /* params */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterAction")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterInit(value: /* params */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterInit")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterLazyLoad(value: /* params */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLazyLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterLazyLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterLazyLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterMove(value: /* params */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterMove")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterUpdate(value: /* params */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoPlay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeInit(value: /* params */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeInit")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeMove(value: /* params */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeMove")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeUpdate(value: /* params */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withDragBeforeAnimFinish(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragBeforeAnimFinish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragBeforeAnimFinish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragBeforeAnimFinish")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: Double): Self = {
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
    def withItemsCustom(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsCustom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsCustom")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsDesktop(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsDesktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsDesktop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsDesktop")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsDesktopSmall(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsDesktopSmall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsDesktopSmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsDesktopSmall")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsMobile(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsMobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsMobile")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsScaleUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsScaleUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsScaleUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsScaleUp")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsTablet(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsTablet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsTablet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsTablet")(js.undefined)
        ret
    }
    @scala.inline
    def withItemsTabletSmall(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsTabletSmall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemsTabletSmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsTabletSmall")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonPath(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonPath")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonSuccess(value: /* data */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutJsonSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyEffect(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyEffect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyEffect")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyFollow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyFollow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyFollow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyFollow")(js.undefined)
        ret
    }
    @scala.inline
    def withLazyLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazyLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazyLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withNav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nav")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigation")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationText")(js.undefined)
        ret
    }
    @scala.inline
    def withPagination(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagination")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationNumbers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationNumbers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationNumbers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationNumbers")(js.undefined)
        ret
    }
    @scala.inline
    def withPaginationSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaginationSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paginationSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveBaseWidth(value: JQuery | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveBaseWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsiveBaseWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveBaseWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withResponsiveRefreshRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveRefreshRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsiveRefreshRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsiveRefreshRate")(js.undefined)
        ret
    }
    @scala.inline
    def withRewindNav(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewindNav")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRewindNav: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewindNav")(js.undefined)
        ret
    }
    @scala.inline
    def withRewindSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewindSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRewindSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewindSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollPerPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPerPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollPerPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPerPage")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleItem")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDragging(value: /* params */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDragging")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStartDragging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDragging")(js.undefined)
        ret
    }
    @scala.inline
    def withStopOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionStyle")(js.undefined)
        ret
    }
  }
  
}

