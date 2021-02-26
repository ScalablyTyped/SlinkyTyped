package typingsSlinky.qlik.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.qlik.qlikStrings.A
import typingsSlinky.qlik.qlikStrings.B
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QHeader extends StObject {
  
  var col: Double = js.native
  
  var errorCode: js.UndefOr[Double] = js.native
  
  var errorMessage: js.UndefOr[Double] = js.native
  
  var isOrderedBy: Boolean = js.native
  
  def orderBy(): Unit = js.native
  
  var qCardinal: js.UndefOr[Double] = js.native
  
  var qFallbackTitle: String = js.native
  
  var qMax: js.UndefOr[Double] = js.native
  
  // field?: Field
  var qMin: js.UndefOr[Double] = js.native
  
  var qReverseSort: Boolean = js.native
  
  var qSortIndicator: A | B = js.native
  
  var qStateCounts: js.UndefOr[StringDictionary[Double]] = js.native
  
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
  implicit class QHeaderMutableBuilder[Self <: QHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: Double): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setIsOrderedBy(value: Boolean): Self = StObject.set(x, "isOrderedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderBy(value: () => Unit): Self = StObject.set(x, "orderBy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setQCardinal(value: Double): Self = StObject.set(x, "qCardinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCardinalUndefined: Self = StObject.set(x, "qCardinal", js.undefined)
    
    @scala.inline
    def setQFallbackTitle(value: String): Self = StObject.set(x, "qFallbackTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMax(value: Double): Self = StObject.set(x, "qMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMaxUndefined: Self = StObject.set(x, "qMax", js.undefined)
    
    @scala.inline
    def setQMin(value: Double): Self = StObject.set(x, "qMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMinUndefined: Self = StObject.set(x, "qMin", js.undefined)
    
    @scala.inline
    def setQReverseSort(value: Boolean): Self = StObject.set(x, "qReverseSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortIndicator(value: A | B): Self = StObject.set(x, "qSortIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateCounts(value: StringDictionary[Double]): Self = StObject.set(x, "qStateCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateCountsUndefined: Self = StObject.set(x, "qStateCounts", js.undefined)
    
    @scala.inline
    def setReverseOrder(value: () => Unit): Self = StObject.set(x, "reverseOrder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectRange(value: (Double, Double, Boolean, Boolean) => js.Promise[_]): Self = StObject.set(x, "selectRange", js.Any.fromFunction4(value))
  }
}
