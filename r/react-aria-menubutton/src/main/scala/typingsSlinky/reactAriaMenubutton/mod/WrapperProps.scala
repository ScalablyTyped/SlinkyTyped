package typingsSlinky.reactAriaMenubutton.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapperProps[T /* <: HTMLElement */]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  /**
  	 * By default, it does automatically close.
  	 * If false, the menu will not automatically close when it
  	 * blurs. Default: `true`.
  	 */
  var closeOnBlur: js.UndefOr[Boolean] = js.native
  /**
  	 * By default, it does automatically close.
  	 * If false, the menu will not automatically close when a
  	 * selection is made. Default: `true`.
  	 */
  var closeOnSelection: js.UndefOr[Boolean] = js.native
  /**
  	 * A callback to run when the menu is opened or closed.
  	 */
  var onMenuToggle: js.UndefOr[js.Function1[/* obj */ WrapperState, _]] = js.native
  /**
  	 * A callback to run when the user makes a selection
  	 * (i.e. clicks or presses Enter or Space on a `MenuItem`).
  	 * It will be passed the value of the selected `MenuItem` and
  	 * the React `SyntheticEvent`.
  	 */
  var onSelection: js.UndefOr[js.Function2[/* value */ js.Any, /* event */ SyntheticEvent[Event, T], _]] = js.native
  var tag: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any
  ] = js.native
}

object WrapperProps {
  @scala.inline
  def apply[T](): WrapperProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WrapperProps[T]]
  }
  @scala.inline
  implicit class WrapperPropsOps[Self[t] <: WrapperProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCloseOnBlur(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnBlur: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseOnSelection(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseOnSelection: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeOnSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMenuToggle(value: /* obj */ WrapperState => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuToggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMenuToggle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMenuToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelection(value: (/* value */ js.Any, /* event */ SyntheticEvent[Event, T]) => _): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelection")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelection: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: /* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
  }
  
}

