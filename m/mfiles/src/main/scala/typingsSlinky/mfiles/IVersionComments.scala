package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVersionComments extends StObject {
  
  val Count: Double = js.native
  
  def Item(Index: Double): IVersionComment = js.native
}
object IVersionComments {
  
  @scala.inline
  def apply(Count: Double, Item: Double => IVersionComment): IVersionComments = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IVersionComments]
  }
  
  @scala.inline
  implicit class IVersionCommentsMutableBuilder[Self <: IVersionComments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IVersionComment): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
