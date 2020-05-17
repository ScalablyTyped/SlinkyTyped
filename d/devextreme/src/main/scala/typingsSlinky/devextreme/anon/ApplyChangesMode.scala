package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeNumbers.`1`
import typingsSlinky.devextreme.devextremeNumbers.`2`
import typingsSlinky.devextreme.devextremeStrings.instantly
import typingsSlinky.devextreme.devextremeStrings.onDemand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyChangesMode extends js.Object {
  var allowSearch: js.UndefOr[Boolean] = js.native
  var applyChangesMode: js.UndefOr[instantly | onDemand] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var layout: js.UndefOr[typingsSlinky.devextreme.devextremeNumbers.`0` | `1` | `2`] = js.native
  var searchTimeout: js.UndefOr[Double] = js.native
  var texts: js.UndefOr[AllFields] = js.native
  var title: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ApplyChangesMode {
  @scala.inline
  def apply(): ApplyChangesMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyChangesMode]
  }
  @scala.inline
  implicit class ApplyChangesModeOps[Self <: ApplyChangesMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyChangesMode(value: instantly | onDemand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyChangesMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyChangesMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyChangesMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: typingsSlinky.devextreme.devextremeNumbers.`0` | `1` | `2`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTexts(value: AllFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(js.undefined)
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
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

