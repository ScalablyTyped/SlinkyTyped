package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalculateCustomSummary extends js.Object {
  var calculateCustomSummary: js.UndefOr[js.Function1[/* options */ TotalValue, _]] = js.native
  var groupItems: js.UndefOr[js.Array[AlignByColumn]] = js.native
  var recalculateWhileEditing: js.UndefOr[Boolean] = js.native
  var skipEmptyValues: js.UndefOr[Boolean] = js.native
  var texts: js.UndefOr[Avg] = js.native
  var totalItems: js.UndefOr[js.Array[Alignment]] = js.native
}

object CalculateCustomSummary {
  @scala.inline
  def apply(): CalculateCustomSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalculateCustomSummary]
  }
  @scala.inline
  implicit class CalculateCustomSummaryOps[Self <: CalculateCustomSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculateCustomSummary(value: /* options */ TotalValue => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateCustomSummary")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCalculateCustomSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateCustomSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupItems(value: js.Array[AlignByColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupItems")(js.undefined)
        ret
    }
    @scala.inline
    def withRecalculateWhileEditing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recalculateWhileEditing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecalculateWhileEditing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recalculateWhileEditing")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipEmptyValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipEmptyValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipEmptyValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipEmptyValues")(js.undefined)
        ret
    }
    @scala.inline
    def withTexts(value: Avg): Self = {
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
    def withTotalItems(value: js.Array[Alignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalItems")(js.undefined)
        ret
    }
  }
  
}

