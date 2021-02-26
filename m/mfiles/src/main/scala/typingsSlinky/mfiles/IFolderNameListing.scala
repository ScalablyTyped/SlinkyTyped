package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFolderNameListing extends StObject {
  
  val Count: Double = js.native
  
  def Item(Index: Double): ITypedValue = js.native
  
  val MoreValues: Boolean = js.native
  
  def SortWithExpression(Expression: IExpression, Locale: Double): Unit = js.native
}
object IFolderNameListing {
  
  @scala.inline
  def apply(
    Count: Double,
    Item: Double => ITypedValue,
    MoreValues: Boolean,
    SortWithExpression: (IExpression, Double) => Unit
  ): IFolderNameListing = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), MoreValues = MoreValues.asInstanceOf[js.Any], SortWithExpression = js.Any.fromFunction2(SortWithExpression))
    __obj.asInstanceOf[IFolderNameListing]
  }
  
  @scala.inline
  implicit class IFolderNameListingMutableBuilder[Self <: IFolderNameListing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => ITypedValue): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoreValues(value: Boolean): Self = StObject.set(x, "MoreValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortWithExpression(value: (IExpression, Double) => Unit): Self = StObject.set(x, "SortWithExpression", js.Any.fromFunction2(value))
  }
}
