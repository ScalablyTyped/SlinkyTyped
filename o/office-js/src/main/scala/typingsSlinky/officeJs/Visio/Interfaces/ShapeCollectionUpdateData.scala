package typingsSlinky.officeJs.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ShapeCollection object, for use in "shapeCollection.set({ ... })". */
@js.native
trait ShapeCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[ShapeData]] = js.native
}
object ShapeCollectionUpdateData {
  
  @scala.inline
  def apply(): ShapeCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeCollectionUpdateData]
  }
  
  @scala.inline
  implicit class ShapeCollectionUpdateDataMutableBuilder[Self <: ShapeCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ShapeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ShapeData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
