package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightCaseSensitive extends js.Object {
  var highlightCaseSensitive: js.UndefOr[Boolean] = js.native
  var highlightSearchText: js.UndefOr[Boolean] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var searchVisibleColumnsOnly: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[String] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object HighlightCaseSensitive {
  @scala.inline
  def apply(): HighlightCaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightCaseSensitive]
  }
  @scala.inline
  implicit class HighlightCaseSensitiveOps[Self <: HighlightCaseSensitive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighlightCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCaseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightCaseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightSearchText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSearchText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightSearchText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightSearchText")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchVisibleColumnsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchVisibleColumnsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchVisibleColumnsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchVisibleColumnsOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
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

