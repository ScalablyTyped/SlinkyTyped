package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AlternateStateData...
  */
@js.native
trait IAlternateStateData extends StObject {
  
  /**
    * List of the selections <Array of BookmarkFieldItem>
    */
  var qFieldItems: js.Array[IBookmarkFieldItem] = js.native
  
  /**
    * Name of the alternate state.
    * Default is current selections: $
    */
  var qStateName: String = js.native
}
object IAlternateStateData {
  
  @scala.inline
  def apply(qFieldItems: js.Array[IBookmarkFieldItem], qStateName: String): IAlternateStateData = {
    val __obj = js.Dynamic.literal(qFieldItems = qFieldItems.asInstanceOf[js.Any], qStateName = qStateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlternateStateData]
  }
  
  @scala.inline
  implicit class IAlternateStateDataMutableBuilder[Self <: IAlternateStateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQFieldItems(value: js.Array[IBookmarkFieldItem]): Self = StObject.set(x, "qFieldItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFieldItemsVarargs(value: IBookmarkFieldItem*): Self = StObject.set(x, "qFieldItems", js.Array(value :_*))
    
    @scala.inline
    def setQStateName(value: String): Self = StObject.set(x, "qStateName", value.asInstanceOf[js.Any])
  }
}
