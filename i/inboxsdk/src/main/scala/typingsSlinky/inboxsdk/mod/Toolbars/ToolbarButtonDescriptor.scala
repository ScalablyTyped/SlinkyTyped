package typingsSlinky.inboxsdk.mod.Toolbars

import typingsSlinky.inboxsdk.mod.Keyboard.KeyboardShortcutHandle
import typingsSlinky.inboxsdk.mod.Router.RouteView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarButtonDescriptor extends js.Object {
  var hasDropdown: js.UndefOr[Boolean] = js.native
  var hideFor: js.UndefOr[js.Function1[/* routeView */ RouteView, Unit]] = js.native
  var iconClass: js.UndefOr[String] = js.native
  var iconUrl: js.UndefOr[String] = js.native
  var keyboardShortcutHandle: js.UndefOr[KeyboardShortcutHandle] = js.native
  var listSection: js.UndefOr[SectionNames] = js.native
  var orderHint: js.UndefOr[Double] = js.native
  var positions: js.UndefOr[js.Array[ToolbarButtonPosition]] = js.native
  var threadSection: js.UndefOr[SectionNames] = js.native
  var title: String = js.native
  def onClick(event: ToolbarButtonEvent): Unit = js.native
}

object ToolbarButtonDescriptor {
  @scala.inline
  def apply(onClick: ToolbarButtonEvent => Unit, title: String): ToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarButtonDescriptor]
  }
  @scala.inline
  implicit class ToolbarButtonDescriptorOps[Self <: ToolbarButtonDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClick(value: ToolbarButtonEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasDropdown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasDropdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDropdown")(js.undefined)
        ret
    }
    @scala.inline
    def withHideFor(value: /* routeView */ RouteView => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHideFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFor")(js.undefined)
        ret
    }
    @scala.inline
    def withIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(js.undefined)
        ret
    }
    @scala.inline
    def withIconUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardShortcutHandle(value: KeyboardShortcutHandle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShortcutHandle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardShortcutHandle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardShortcutHandle")(js.undefined)
        ret
    }
    @scala.inline
    def withListSection(value: SectionNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListSection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listSection")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderHint(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderHint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderHint")(js.undefined)
        ret
    }
    @scala.inline
    def withPositions(value: js.Array[ToolbarButtonPosition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positions")(js.undefined)
        ret
    }
    @scala.inline
    def withThreadSection(value: SectionNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreadSection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadSection")(js.undefined)
        ret
    }
  }
  
}

