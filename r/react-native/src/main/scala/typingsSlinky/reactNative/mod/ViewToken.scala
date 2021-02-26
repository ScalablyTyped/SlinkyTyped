package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewToken extends StObject {
  
  var index: Double | Null = js.native
  
  var isViewable: Boolean = js.native
  
  var item: js.Any = js.native
  
  var key: String = js.native
  
  var section: js.UndefOr[js.Any] = js.native
}
object ViewToken {
  
  @scala.inline
  def apply(isViewable: Boolean, item: js.Any, key: String): ViewToken = {
    val __obj = js.Dynamic.literal(isViewable = isViewable.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewToken]
  }
  
  @scala.inline
  implicit class ViewTokenMutableBuilder[Self <: ViewToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNull: Self = StObject.set(x, "index", null)
    
    @scala.inline
    def setIsViewable(value: Boolean): Self = StObject.set(x, "isViewable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: js.Any): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
  }
}
