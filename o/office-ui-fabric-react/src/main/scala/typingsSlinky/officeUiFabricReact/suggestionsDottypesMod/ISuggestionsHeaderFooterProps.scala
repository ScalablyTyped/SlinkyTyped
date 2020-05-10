package typingsSlinky.officeUiFabricReact.suggestionsDottypesMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionsHeaderFooterProps extends js.Object {
  var ariaLabel: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var onExecute: js.UndefOr[js.Function0[Unit]] = js.native
  def renderItem(): ReactElement = js.native
  def shouldShow(): Boolean = js.native
}

object ISuggestionsHeaderFooterProps {
  @scala.inline
  def apply(renderItem: () => ReactElement, shouldShow: () => Boolean): ISuggestionsHeaderFooterProps = {
    val __obj = js.Dynamic.literal(renderItem = js.Any.fromFunction0(renderItem), shouldShow = js.Any.fromFunction0(shouldShow))
    __obj.asInstanceOf[ISuggestionsHeaderFooterProps]
  }
  @scala.inline
  implicit class ISuggestionsHeaderFooterPropsOps[Self <: ISuggestionsHeaderFooterProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderItem(value: () => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderItem")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShouldShow(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
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
    def withOnExecute(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExecute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnExecute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExecute")(js.undefined)
        ret
    }
  }
  
}

