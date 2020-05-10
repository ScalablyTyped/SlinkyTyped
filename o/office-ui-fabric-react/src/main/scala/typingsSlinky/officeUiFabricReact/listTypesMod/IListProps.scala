package typingsSlinky.officeUiFabricReact.listTypesMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.listListMod.List
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irectangleMod.IRectangle
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IListProps[T] extends HTMLAttributes[List[T] | HTMLDivElement] {
  /**
    * Optional callback to access the IList interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IList]] = js.native
  /**
    * Method called by the list to get how many items to render per page from specified index.
    * In general, use `getPageSpecification` instead.
    */
  var getItemCountForPage: js.UndefOr[
    js.Function2[/* itemIndex */ js.UndefOr[Double], /* visibleRect */ js.UndefOr[IRectangle], Double]
  ] = js.native
  /** Optional callback to get the item key, to be used on render. */
  var getKey: js.UndefOr[js.Function2[/* item */ T, /* index */ js.UndefOr[Double], String]] = js.native
  /**
    * Method called by the list to get the pixel height for a given page. By default, we measure the first
    * page's height and default all other pages to that height when calculating the surface space. It is
    * ideal to be able to adequately predict page heights in order to keep the surface space from jumping
    * in pixels, which has been seen to cause browser performance issues.
    * In general, use `getPageSpecification` instead.
    */
  var getPageHeight: js.UndefOr[
    js.Function3[
      /* itemIndex */ js.UndefOr[Double], 
      /* visibleRect */ js.UndefOr[IRectangle], 
      /* itemCount */ js.UndefOr[Double], 
      Double
    ]
  ] = js.native
  /**
    * Called by the list to get the specification for a page.
    * Use this method to provide an allocation of items per page,
    * as well as an estimated rendered height for the page.
    * The list will use this to optimize virtualization.
    */
  var getPageSpecification: js.UndefOr[
    js.Function2[
      /* itemIndex */ js.UndefOr[Double], 
      /* visibleRect */ js.UndefOr[IRectangle], 
      IPageSpecification
    ]
  ] = js.native
  /**
    * Method called by the list to derive the page style object. For spacer pages, the list will derive
    * the height and passed in heights will be ignored.
    */
  var getPageStyle: js.UndefOr[js.Function1[/* page */ IPage[T], _]] = js.native
  /**
    * Whether to disable scroll state updates. This causes the isScrolling arg in onRenderCell to always be undefined.
    * This is a performance optimization to let List skip a render cycle by not updating its scrolling state.
    */
  var ignoreScrollingState: js.UndefOr[Boolean] = js.native
  /** Items to render. */
  var items: js.UndefOr[js.Array[T]] = js.native
  /** Optional callback for monitoring when a page is added. */
  var onPageAdded: js.UndefOr[js.Function1[/* page */ IPage[T], Unit]] = js.native
  /** Optional callback for monitoring when a page is removed. */
  var onPageRemoved: js.UndefOr[js.Function1[/* page */ IPage[T], Unit]] = js.native
  /**
    * Optional callback invoked when List rendering completed.
    * This can be on initial mount or on re-render due to scrolling.
    * This method will be called as a result of changes in List pages (added or removed),
    * and after ALL the changes complete.
    * To track individual page Add / Remove use onPageAdded / onPageRemoved instead.
    * @param pages - The current array of pages in the List.
    */
  var onPagesUpdated: js.UndefOr[js.Function1[/* pages */ js.Array[IPage[T]], Unit]] = js.native
  /**
    * Method to call when trying to render an item.
    * @param item - The data associated with the cell that is being rendered.
    * @param index - The index of the cell being rendered.
    * @param isScrolling - True if the list is being scrolled. May be useful for rendering a placeholder if your cells
    * are complex.
    */
  var onRenderCell: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[T], 
      /* index */ js.UndefOr[Double], 
      /* isScrolling */ js.UndefOr[Boolean], 
      TagMod[Any]
    ]
  ] = js.native
  /**
    * Called when the List will render a page.
    * Override this to control how cells are rendered within a page.
    */
  var onRenderPage: js.UndefOr[
    js.Function2[
      /* pageProps */ IPageProps[T], 
      /* defaultRender */ js.UndefOr[IRenderFunction[IPageProps[T]]], 
      TagMod[Any]
    ]
  ] = js.native
  /**
    * Optional callback to determine whether the list should be rendered in full, or virtualized.
    * Virtualization will add and remove pages of items as the user scrolls them into the visible range.
    * This benefits larger list scenarios by reducing the DOM on the screen, but can negatively affect performance for
    * smaller lists.
    * The default implementation will virtualize when this callback is not provided.
    */
  var onShouldVirtualize: js.UndefOr[js.Function1[/* props */ IListProps[T], Boolean]] = js.native
  /** Number of items to render. Defaults to items.length. */
  var renderCount: js.UndefOr[Double] = js.native
  /**
    * In addition to the visible window, how many windowHeights should we render ahead.
    * @defaultvalue 2
    */
  var renderedWindowsAhead: js.UndefOr[Double] = js.native
  /**
    * In addition to the visible window, how many windowHeights should we render behind.
    * @defaultvalue 2
    */
  var renderedWindowsBehind: js.UndefOr[Double] = js.native
  /** Index in items array to start rendering from. Defaults to 0. */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * Boolean value to enable render page caching. This is an experimental performance optimization
    * that is off by default.
    * @defaultvalue false
    */
  var usePageCache: js.UndefOr[Boolean] = js.native
  /**
    * An object which can be passed in as a fresh instance to 'force update' the list.
    */
  var version: js.UndefOr[js.Object] = js.native
}

object IListProps {
  @scala.inline
  def apply[T](): IListProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListProps[T]]
  }
  @scala.inline
  implicit class IListPropsOps[Self[t] <: IListProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IList | Null => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IList]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IList]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemCountForPage(value: (/* itemIndex */ js.UndefOr[Double], /* visibleRect */ js.UndefOr[IRectangle]) => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemCountForPage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetItemCountForPage: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemCountForPage")(js.undefined)
        ret
    }
    @scala.inline
    def withGetKey(value: (/* item */ T, /* index */ js.UndefOr[Double]) => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetKey: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPageHeight(
      value: (/* itemIndex */ js.UndefOr[Double], /* visibleRect */ js.UndefOr[IRectangle], /* itemCount */ js.UndefOr[Double]) => Double
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageHeight")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetPageHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPageSpecification(
      value: (/* itemIndex */ js.UndefOr[Double], /* visibleRect */ js.UndefOr[IRectangle]) => IPageSpecification
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageSpecification")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetPageSpecification: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPageStyle(value: /* page */ IPage[T] => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPageStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPageStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreScrollingState(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreScrollingState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreScrollingState: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreScrollingState")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageAdded(value: /* page */ IPage[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageAdded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageAdded: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageRemoved(value: /* page */ IPage[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageRemoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageRemoved: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPagesUpdated(value: /* pages */ js.Array[IPage[T]] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPagesUpdated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPagesUpdated: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPagesUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderCell(
      value: (/* item */ js.UndefOr[T], /* index */ js.UndefOr[Double], /* isScrolling */ js.UndefOr[Boolean]) => TagMod[Any]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderCell")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnRenderCell: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderCell")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderPage(
      value: (/* pageProps */ IPageProps[T], /* defaultRender */ js.UndefOr[IRenderFunction[IPageProps[T]]]) => TagMod[Any]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderPage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderPage: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderPage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShouldVirtualize(value: /* props */ IListProps[T] => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShouldVirtualize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShouldVirtualize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShouldVirtualize")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderCount(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderCount: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderedWindowsAhead(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedWindowsAhead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderedWindowsAhead: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedWindowsAhead")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderedWindowsBehind(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedWindowsBehind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderedWindowsBehind: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderedWindowsBehind")(js.undefined)
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePageCache(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePageCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePageCache: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePageCache")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: js.Object): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

