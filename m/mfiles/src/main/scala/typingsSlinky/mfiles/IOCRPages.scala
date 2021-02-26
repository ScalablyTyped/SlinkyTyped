package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOCRPages extends StObject {
  
  def Add(Index: Double, OCRPage: IOCRPage): Unit = js.native
  
  def Clone(): IOCRPages = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IOCRPage = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IOCRPages {
  
  @scala.inline
  def apply(
    Add: (Double, IOCRPage) => Unit,
    Clone: () => IOCRPages,
    Count: Double,
    Item: Double => IOCRPage,
    Remove: Double => Unit
  ): IOCRPages = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IOCRPages]
  }
  
  @scala.inline
  implicit class IOCRPagesMutableBuilder[Self <: IOCRPages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IOCRPage) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IOCRPages): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IOCRPage): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
