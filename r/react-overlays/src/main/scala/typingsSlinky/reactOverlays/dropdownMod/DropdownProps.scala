package typingsSlinky.reactOverlays.dropdownMod

import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownProps extends js.Object {
  /**
    * Align the menu to the 'end' side of the placement side of the Dropdown toggle. The default placement is `top-start` or `bottom-start`.
    */
  var alignEnd: js.UndefOr[Boolean] = js.native
  /**
    * Determines the direction and location of the Menu in relation to it's Toggle.
    */
  var drop: js.UndefOr[Directions] = js.native
  /**
    * A css slector string that will return __focusable__ menu items.
    * Selectors should be relative to the menu component:
    * e.g. ` > li:not('.disabled')`
    */
  var itemSelector: js.UndefOr[String] = js.native
  /**
    * A callback fired when the Dropdown wishes to change visibility. Called with the requested
    * `show` value, the DOM event, and the source that fired it: `'click'`,`'keydown'`,`'rootClose'`, or `'select'`.
    */
  var onToggle: js.UndefOr[js.Function2[/* isOpen */ Boolean, /* event */ SyntheticEvent[Event_, _], Unit]] = js.native
  /**
    * Whether or not the Dropdown is visible
    */
  var show: js.UndefOr[Boolean] = js.native
  /**
    * A render prop that returns the root dropdown element. The `props`
    * argument should spread through to an element containing _both_ the
    * menu and toggle in order to handle keyboard events for focus management.
    */
  def children(renderProps: DropdownRenderProps): ReactElement = js.native
}

object DropdownProps {
  @scala.inline
  def apply(children: DropdownRenderProps => ReactElement): DropdownProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[DropdownProps]
  }
  @scala.inline
  implicit class DropdownPropsOps[Self <: DropdownProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: DropdownRenderProps => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAlignEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop(value: Directions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.undefined)
        ret
    }
    @scala.inline
    def withItemSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withOnToggle(value: (/* isOpen */ Boolean, /* event */ SyntheticEvent[Event_, _]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: Boolean): Self = {
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
  }
  
}

