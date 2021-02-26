package typingsSlinky.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the InkAnalysisParagraphCollection object, for use in "inkAnalysisParagraphCollection.set({ ... })". */
@js.native
trait InkAnalysisParagraphCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[InkAnalysisParagraphData]] = js.native
}
object InkAnalysisParagraphCollectionUpdateData {
  
  @scala.inline
  def apply(): InkAnalysisParagraphCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisParagraphCollectionUpdateData]
  }
  
  @scala.inline
  implicit class InkAnalysisParagraphCollectionUpdateDataMutableBuilder[Self <: InkAnalysisParagraphCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[InkAnalysisParagraphData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: InkAnalysisParagraphData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
