package typingsSlinky.jqueryDynatree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynatreeClassNamesOptions extends js.Object {
  var active: js.UndefOr[String] = js.native
  var checkbox: js.UndefOr[String] = js.native
  var combinedExpanderPrefix: js.UndefOr[String] = js.native
  var combinedIconPrefix: js.UndefOr[String] = js.native
  var connector: js.UndefOr[String] = js.native
  var container: js.UndefOr[String] = js.native
  var empty: js.UndefOr[String] = js.native
  var expanded: js.UndefOr[String] = js.native
  var expander: js.UndefOr[String] = js.native
  var focused: js.UndefOr[String] = js.native
  var folder: js.UndefOr[String] = js.native
  var hasChildren: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[String] = js.native
  var lastsib: js.UndefOr[String] = js.native
  var `lazy`: js.UndefOr[String] = js.native
  var noConnector: js.UndefOr[String] = js.native
  var node: js.UndefOr[String] = js.native
  var nodeError: js.UndefOr[String] = js.native
  var nodeIcon: js.UndefOr[String] = js.native
  var nodeWait: js.UndefOr[String] = js.native
  var partsel: js.UndefOr[String] = js.native
  var selected: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var vline: js.UndefOr[String] = js.native
}

object DynatreeClassNamesOptions {
  @scala.inline
  def apply(): DynatreeClassNamesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynatreeClassNamesOptions]
  }
  @scala.inline
  implicit class DynatreeClassNamesOptionsOps[Self <: DynatreeClassNamesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckbox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkbox")(js.undefined)
        ret
    }
    @scala.inline
    def withCombinedExpanderPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combinedExpanderPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCombinedExpanderPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combinedExpanderPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withCombinedIconPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combinedIconPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCombinedIconPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combinedIconPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withConnector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connector")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withEmpty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("empty")(js.undefined)
        ret
    }
    @scala.inline
    def withExpanded(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(js.undefined)
        ret
    }
    @scala.inline
    def withExpander(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expander")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpander: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expander")(js.undefined)
        ret
    }
    @scala.inline
    def withFocused(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(js.undefined)
        ret
    }
    @scala.inline
    def withFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("folder")(js.undefined)
        ret
    }
    @scala.inline
    def withHasChildren(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: String): Self = {
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
    def withLastsib(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastsib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastsib: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastsib")(js.undefined)
        ret
    }
    @scala.inline
    def withLazy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(js.undefined)
        ret
    }
    @scala.inline
    def withNoConnector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noConnector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoConnector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noConnector")(js.undefined)
        ret
    }
    @scala.inline
    def withNode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeError")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeWait(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeWait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeWait")(js.undefined)
        ret
    }
    @scala.inline
    def withPartsel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partsel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartsel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partsel")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withVline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vline")(js.undefined)
        ret
    }
  }
  
}

