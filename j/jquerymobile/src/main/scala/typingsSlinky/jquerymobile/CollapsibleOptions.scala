package typingsSlinky.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapsibleOptions extends js.Object {
  var collapseCueText: js.UndefOr[String] = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
  var collapsedIcon: js.UndefOr[String] = js.native
  var contentTheme: js.UndefOr[String] = js.native
  var expandCueText: js.UndefOr[String] = js.native
  var expandedIcon: js.UndefOr[String] = js.native
  var heading: js.UndefOr[String] = js.native
  var iconpos: js.UndefOr[String] = js.native
  var initSelector: js.UndefOr[String] = js.native
  var inset: js.UndefOr[Boolean] = js.native
  var mini: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[String] = js.native
}

object CollapsibleOptions {
  @scala.inline
  def apply(): CollapsibleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsibleOptions]
  }
  @scala.inline
  implicit class CollapsibleOptionsOps[Self <: CollapsibleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseCueText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseCueText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseCueText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseCueText")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsedIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsedIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsedIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withContentTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandCueText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandCueText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandCueText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandCueText")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandedIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandedIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandedIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withHeading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(js.undefined)
        ret
    }
    @scala.inline
    def withIconpos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconpos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconpos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconpos")(js.undefined)
        ret
    }
    @scala.inline
    def withInitSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withInset(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset")(js.undefined)
        ret
    }
    @scala.inline
    def withMini(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mini")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMini: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mini")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

