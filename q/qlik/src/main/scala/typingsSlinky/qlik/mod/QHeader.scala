package typingsSlinky.qlik.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.qlik.qlikStrings.A
import typingsSlinky.qlik.qlikStrings.B
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QHeader extends js.Object {
  var col: Double = js.native
  var errorCode: js.UndefOr[Double] = js.native
  var errorMessage: js.UndefOr[Double] = js.native
  var isOrderedBy: Boolean = js.native
  var qCardinal: js.UndefOr[Double] = js.native
  var qFallbackTitle: String = js.native
  var qMax: js.UndefOr[Double] = js.native
  // field?: Field
  var qMin: js.UndefOr[Double] = js.native
  var qReverseSort: Boolean = js.native
  var qSortIndicator: A | B = js.native
  var qStateCounts: js.UndefOr[StringDictionary[Double]] = js.native
  def orderBy(): Unit = js.native
  def reverseOrder(): Unit = js.native
  def selectRange(min: Double, max: Double, inclMin: Boolean, inclMax: Boolean): js.Promise[_] = js.native
}

object QHeader {
  @scala.inline
  def apply(
    col: Double,
    isOrderedBy: Boolean,
    orderBy: () => Unit,
    qFallbackTitle: String,
    qReverseSort: Boolean,
    qSortIndicator: A | B,
    reverseOrder: () => Unit,
    selectRange: (Double, Double, Boolean, Boolean) => js.Promise[_]
  ): QHeader = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], isOrderedBy = isOrderedBy.asInstanceOf[js.Any], orderBy = js.Any.fromFunction0(orderBy), qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qReverseSort = qReverseSort.asInstanceOf[js.Any], qSortIndicator = qSortIndicator.asInstanceOf[js.Any], reverseOrder = js.Any.fromFunction0(reverseOrder), selectRange = js.Any.fromFunction4(selectRange))
    __obj.asInstanceOf[QHeader]
  }
  @scala.inline
  implicit class QHeaderOps[Self <: QHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOrderedBy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOrderedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrderBy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQFallbackTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFallbackTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQReverseSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qReverseSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSortIndicator(value: A | B): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReverseOrder(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseOrder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelectRange(value: (Double, Double, Boolean, Boolean) => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRange")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withQCardinal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCardinal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQCardinal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCardinal")(js.undefined)
        ret
    }
    @scala.inline
    def withQMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMax")(js.undefined)
        ret
    }
    @scala.inline
    def withQMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMin")(js.undefined)
        ret
    }
    @scala.inline
    def withQStateCounts(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qStateCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQStateCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qStateCounts")(js.undefined)
        ret
    }
  }
  
}

