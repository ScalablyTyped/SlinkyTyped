package typingsSlinky.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListViewOptions extends js.Object {
  var autodividers: js.UndefOr[Boolean] = js.native
  var autodividersSelector: js.UndefOr[js.Function1[/* jq */ js.UndefOr[JQuery], String]] = js.native
  var countTheme: js.UndefOr[String] = js.native
  var defaults: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var dividerTheme: js.UndefOr[String] = js.native
  var filter: js.UndefOr[Boolean] = js.native
  var filterCallback: js.UndefOr[js.Function] = js.native
  var filterPlaceholder: js.UndefOr[String] = js.native
  var filterTheme: js.UndefOr[String] = js.native
  var headerTheme: js.UndefOr[String] = js.native
  var initSelector: js.UndefOr[String] = js.native
  var inset: js.UndefOr[Boolean] = js.native
  var splitIcon: js.UndefOr[String] = js.native
  var splitTheme: js.UndefOr[String] = js.native
  var theme: js.UndefOr[String] = js.native
}

object ListViewOptions {
  @scala.inline
  def apply(): ListViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewOptions]
  }
  @scala.inline
  implicit class ListViewOptionsOps[Self <: ListViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutodividers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autodividers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutodividers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autodividers")(js.undefined)
        ret
    }
    @scala.inline
    def withAutodividersSelector(value: /* jq */ js.UndefOr[JQuery] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autodividersSelector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAutodividersSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autodividersSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withCountTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDividerTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dividerTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDividerTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dividerTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterTheme")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTheme")(js.undefined)
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
    def withSplitIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitTheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitTheme")(js.undefined)
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

