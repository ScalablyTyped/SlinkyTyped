package typingsSlinky.inboxsdk.mod.Toolbars

import typingsSlinky.inboxsdk.mod.Keyboard.KeyboardShortcutHandle
import typingsSlinky.inboxsdk.mod.Router.RouteView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegacyToolbarButtonDescriptor extends js.Object {
  var hasDropdown: js.UndefOr[Boolean] = js.native
  var hideFor: js.UndefOr[js.Function1[/* routeView */ RouteView, Unit]] = js.native
  var iconClass: js.UndefOr[String] = js.native
  var iconUrl: js.UndefOr[String] = js.native
  var keyboardShortcutHandle: js.UndefOr[KeyboardShortcutHandle] = js.native
  var section: SectionNames = js.native
  var title: String = js.native
  def onClick(event: LegacyToolbarButtonEvent): Unit = js.native
}

object LegacyToolbarButtonDescriptor {
  @scala.inline
  def apply(onClick: LegacyToolbarButtonEvent => Unit, section: SectionNames, title: String): LegacyToolbarButtonDescriptor = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), section = section.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyToolbarButtonDescriptor]
  }
  @scala.inline
  implicit class LegacyToolbarButtonDescriptorOps[Self <: LegacyToolbarButtonDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClick(value: LegacyToolbarButtonEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSection(value: SectionNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(value.asInstanceOf[js.Any])
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
  }
  
}

