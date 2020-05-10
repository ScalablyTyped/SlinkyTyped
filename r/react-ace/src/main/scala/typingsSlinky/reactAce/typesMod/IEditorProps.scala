package typingsSlinky.reactAce.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditorProps
  extends /* index */ StringDictionary[js.Any] {
  @JSName("$blockScrolling")
  var $blockScrolling: js.UndefOr[Double | Boolean] = js.native
  @JSName("$blockSelectEnabled")
  var $blockSelectEnabled: js.UndefOr[Boolean] = js.native
  @JSName("$enableBlockSelect")
  var $enableBlockSelect: js.UndefOr[Boolean] = js.native
  @JSName("$enableMultiselect")
  var $enableMultiselect: js.UndefOr[Boolean] = js.native
  @JSName("$highlightPending")
  var $highlightPending: js.UndefOr[Boolean] = js.native
  @JSName("$highlightTagPending")
  var $highlightTagPending: js.UndefOr[Boolean] = js.native
  @JSName("$multiselectOnSessionChange")
  var $multiselectOnSessionChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  @JSName("$onAddRange")
  var $onAddRange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  @JSName("$onChangeAnnotation")
  var $onChangeAnnotation: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  @JSName("$onChangeBackMarker")
  var $onChangeBackMarker: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  @JSName("$onChangeBreakpoint")
  var $onChangeBreakpoint: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  @JSName("$onChangeFold")
  var $onChangeFold: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  @JSName("$onChangeFrontMarker")
  var $onChangeFrontMarker: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  @JSName("$onChangeMode")
  var $onChangeMode: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  @JSName("$onChangeTabSize")
  var $onChangeTabSize: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  @JSName("$onChangeWrapLimit")
  var $onChangeWrapLimit: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  @JSName("$onChangeWrapMode")
  var $onChangeWrapMode: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  @JSName("$onCursorChange")
  var $onCursorChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  @JSName("$onDocumentChange")
  var $onDocumentChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  @JSName("$onMultiSelect")
  var $onMultiSelect: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  @JSName("$onRemoveRange")
  var $onRemoveRange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  @JSName("$onScrollLeftChange")
  var $onScrollLeftChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  @JSName("$onScrollTopChange")
  var $onScrollTopChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  @JSName("$onSelectionChange")
  var $onSelectionChange: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  @JSName("$onSingleSelect")
  var $onSingleSelect: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  @JSName("$onTokenizerUpdate")
  var $onTokenizerUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}

object IEditorProps {
  @scala.inline
  def apply(): IEditorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorProps]
  }
  @scala.inline
  implicit class IEditorPropsOps[Self <: IEditorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$blockScrolling(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$blockScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$blockScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$blockScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def with$blockSelectEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$blockSelectEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$blockSelectEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$blockSelectEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def with$enableBlockSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$enableBlockSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$enableBlockSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$enableBlockSelect")(js.undefined)
        ret
    }
    @scala.inline
    def with$enableMultiselect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$enableMultiselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$enableMultiselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$enableMultiselect")(js.undefined)
        ret
    }
    @scala.inline
    def with$highlightPending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$highlightPending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$highlightPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$highlightPending")(js.undefined)
        ret
    }
    @scala.inline
    def with$highlightTagPending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$highlightTagPending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$highlightTagPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$highlightTagPending")(js.undefined)
        ret
    }
    @scala.inline
    def with$multiselectOnSessionChange(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$multiselectOnSessionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$multiselectOnSessionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$multiselectOnSessionChange")(js.undefined)
        ret
    }
    @scala.inline
    def with$onAddRange(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onAddRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$onAddRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onAddRange")(js.undefined)
        ret
    }
    @scala.inline
    def with$onChangeAnnotation(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onChangeAnnotation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$onChangeAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onChangeAnnotation")(js.undefined)
        ret
    }
    @scala.inline
    def with$onChangeBackMarker(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onChangeBackMarker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$onChangeBackMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onChangeBackMarker")(js.undefined)
        ret
    }
    @scala.inline
    def with$onChangeBreakpoint(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onChangeBreakpoint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$onChangeBreakpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onChangeBreakpoint")(js.undefined)
        ret
    }
    @scala.inline
    def with$onChangeFold(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onChangeFold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$onChangeFold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onChangeFold")(js.undefined)
        ret
    }
    @scala.inline
    def with$onChangeFrontMarker(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onChangeFrontMarker")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$onChangeFrontMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onChangeFrontMarker")(js.undefined)
        ret
    }
    @scala.inline
    def with$onChangeMode(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onChangeMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$onChangeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onChangeMode")(js.undefined)
        ret
    }
    @scala.inline
    def with$onChangeTabSize(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onChangeTabSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$onChangeTabSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onChangeTabSize")(js.undefined)
        ret
    }
    @scala.inline
    def with$onChangeWrapLimit(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onChangeWrapLimit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$onChangeWrapLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onChangeWrapLimit")(js.undefined)
        ret
    }
    @scala.inline
    def with$onChangeWrapMode(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onChangeWrapMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$onChangeWrapMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onChangeWrapMode")(js.undefined)
        ret
    }
    @scala.inline
    def with$onCursorChange(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onCursorChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$onCursorChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onCursorChange")(js.undefined)
        ret
    }
    @scala.inline
    def with$onDocumentChange(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onDocumentChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$onDocumentChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onDocumentChange")(js.undefined)
        ret
    }
    @scala.inline
    def with$onMultiSelect(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onMultiSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$onMultiSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onMultiSelect")(js.undefined)
        ret
    }
    @scala.inline
    def with$onRemoveRange(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onRemoveRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$onRemoveRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onRemoveRange")(js.undefined)
        ret
    }
    @scala.inline
    def with$onScrollLeftChange(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onScrollLeftChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$onScrollLeftChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onScrollLeftChange")(js.undefined)
        ret
    }
    @scala.inline
    def with$onScrollTopChange(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onScrollTopChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$onScrollTopChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onScrollTopChange")(js.undefined)
        ret
    }
    @scala.inline
    def with$onSelectionChange(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onSelectionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$onSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def with$onSingleSelect(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onSingleSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$onSingleSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onSingleSelect")(js.undefined)
        ret
    }
    @scala.inline
    def with$onTokenizerUpdate(value: /* repeated */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onTokenizerUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$onTokenizerUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$onTokenizerUpdate")(js.undefined)
        ret
    }
  }
  
}

