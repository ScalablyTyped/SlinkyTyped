package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists the dimensions. Is the layout for DimensionListDef.
  */
@js.native
trait IDimensionList extends StObject {
  
  /**
    * Information about the list of dimensions
    */
  var qItems: js.Array[IDimensionItemLayout] = js.native
}
object IDimensionList {
  
  @scala.inline
  def apply(qItems: js.Array[IDimensionItemLayout]): IDimensionList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDimensionList]
  }
  
  @scala.inline
  implicit class IDimensionListMutableBuilder[Self <: IDimensionList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQItems(value: js.Array[IDimensionItemLayout]): Self = StObject.set(x, "qItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQItemsVarargs(value: IDimensionItemLayout*): Self = StObject.set(x, "qItems", js.Array(value :_*))
  }
}
