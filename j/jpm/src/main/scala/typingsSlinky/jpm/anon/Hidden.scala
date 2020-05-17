package typingsSlinky.jpm.anon

import typingsSlinky.jpm.toolbarMod.Toolbar
import typingsSlinky.jpm.toolbarMod.ToolbarItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hidden extends js.Object {
  var hidden: js.UndefOr[Boolean] = js.native
  var items: js.Array[ToolbarItem] = js.native
  var onAttach: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.native
  var onDetach: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.native
  var onHide: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.native
  var onShow: js.UndefOr[js.Function1[/* toolbar */ Toolbar, _]] = js.native
  var title: String = js.native
}

object Hidden {
  @scala.inline
  def apply(items: js.Array[ToolbarItem], title: String): Hidden = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hidden]
  }
  @scala.inline
  implicit class HiddenOps[Self <: Hidden] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[ToolbarItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAttach(value: /* toolbar */ Toolbar => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAttach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAttach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAttach")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDetach(value: /* toolbar */ Toolbar => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDetach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDetach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDetach")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(value: /* toolbar */ Toolbar => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: /* toolbar */ Toolbar => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
  }
  
}

