package typingsSlinky.reactVirtualized.esWindowScrollerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import slinky.core.TagMod
import typingsSlinky.reactVirtualized.AnonHeight
import typingsSlinky.reactVirtualized.AnonScrollLeft
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowScrollerProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  /** Callback to be invoked on-resize: ({ height, width }) */
  var onResize: js.UndefOr[js.Function1[/* params */ AnonHeight, Unit]] = js.native
  /** Callback to be invoked on-scroll: ({ scrollLeft, scrollTop }) */
  var onScroll: js.UndefOr[js.Function1[/* params */ AnonScrollLeft, Unit]] = js.native
  /** Element to attach scroll event listeners. Defaults to window. */
  var scrollElement: js.UndefOr[(Window_ with (/* globalThis */ js.Any)) | Element] = js.native
  /**
    * Wait this amount of time after the last scroll event before resetting child `pointer-events`.
    */
  var scrollingResetTimeInterval: js.UndefOr[Double] = js.native
  /** Height used for server-side rendering */
  var serverHeight: js.UndefOr[Double] = js.native
  /** Width used for server-side rendering */
  var serverWidth: js.UndefOr[Double] = js.native
  /**
    * Function responsible for rendering children.
    * This function should implement the following signature:
    * ({ height, isScrolling, scrollLeft, scrollTop, width, onChildScroll }) => PropTypes.element
    */
  def children(params: WindowScrollerChildProps): TagMod[Any] = js.native
}

object WindowScrollerProps {
  @scala.inline
  def apply(children: WindowScrollerChildProps => TagMod[Any]): WindowScrollerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[WindowScrollerProps]
  }
  @scala.inline
  implicit class WindowScrollerPropsOps[Self <: WindowScrollerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: WindowScrollerChildProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnResize(value: /* params */ AnonHeight => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: /* params */ AnonScrollLeft => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollElementElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollElement(value: (Window_ with (/* globalThis */ js.Any)) | Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollElement")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollingResetTimeInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingResetTimeInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollingResetTimeInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingResetTimeInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withServerHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withServerWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverWidth")(js.undefined)
        ret
    }
  }
  
}

