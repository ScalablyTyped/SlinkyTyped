package typingsSlinky.reactScrollspy.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollspyProps extends js.Object {
  // ClassName attribute to be passed to the generated <ul /> element
  var className: js.UndefOr[String] = js.native
  // HTML tag for Scrollspy component if you want to use other than ul
  var componentTag: js.UndefOr[String | ReactComponentClass[js.Object]] = js.native
  // Class name that apply to the navigation element paired with the content element in viewport
  var currentClassName: String = js.native
  // Array of target element IDs
  var items: js.Array[String] = js.native
  // Offset value that adjusts to determine the elements are in the viewport
  var offset: js.UndefOr[Double] = js.native
  // Function to be executed when the active item has been updated
  var onUpdate: js.UndefOr[js.Function1[/* item */ String, Unit]] = js.native
  // Selector for the element of scrollable container that can be used with querySelector
  var rootEl: js.UndefOr[String] = js.native
  // Class name that apply to the navigation elements that have been scrolled past
  var scrolledPastClassName: js.UndefOr[String] = js.native
  // Style attribute to be passed to the generated <ul /> element
  var style: js.UndefOr[CSSProperties] = js.native
}

object ScrollspyProps {
  @scala.inline
  def apply(currentClassName: String, items: js.Array[String]): ScrollspyProps = {
    val __obj = js.Dynamic.literal(currentClassName = currentClassName.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollspyProps]
  }
  @scala.inline
  implicit class ScrollspyPropsOps[Self <: ScrollspyProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
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
    def withComponentTagFunctionComponent(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentTagComponentClass(value: ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentTag(value: String | ReactComponentClass[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentTag")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: /* item */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withRootEl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootEl")(js.undefined)
        ret
    }
    @scala.inline
    def withScrolledPastClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolledPastClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrolledPastClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolledPastClassName")(js.undefined)
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
  }
  
}

