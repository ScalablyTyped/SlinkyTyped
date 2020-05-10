package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.devextremeStrings.contains
import typingsSlinky.devextreme.devextremeStrings.equals
import typingsSlinky.devextreme.devextremeStrings.startswith
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBoxMixinOptions[T] extends js.Object {
  /** Configures the search panel. */
  var searchEditorOptions: js.UndefOr[dxTextBoxOptions[dxTextBox]] = js.native
  /** Specifies whether the search panel is visible. */
  var searchEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies a data object's field name or an expression whose value is compared to the search string. */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.native
  /** Specifies a comparison operation used to search widget items. */
  var searchMode: js.UndefOr[contains | startswith | equals] = js.native
  /** Specifies a delay in milliseconds between when a user finishes typing, and the search is executed. */
  var searchTimeout: js.UndefOr[Double] = js.native
  /** Specifies the current search string. */
  var searchValue: js.UndefOr[String] = js.native
}

object SearchBoxMixinOptions {
  @scala.inline
  def apply[T](): SearchBoxMixinOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBoxMixinOptions[T]]
  }
  @scala.inline
  implicit class SearchBoxMixinOptionsOps[Self[t] <: SearchBoxMixinOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSearchEditorOptions(value: dxTextBoxOptions[dxTextBox]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchEditorOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchEditorOptions: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchEditorOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchExpr(value: String | js.Function | (js.Array[String | js.Function])): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchExpr: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchMode(value: contains | startswith | equals): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchMode: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchTimeout(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchTimeout: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchValue(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchValue")(js.undefined)
        ret
    }
  }
  
}

