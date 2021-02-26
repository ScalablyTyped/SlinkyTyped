package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlookItem extends Entity {
  
  // The categories associated with the item
  var categories: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  /**
    * Identifies the version of the item. Every time the item is changed, changeKey changes as well. This allows Exchange to
    * apply changes to the correct version of the object. Read-only.
    */
  var changeKey: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.native
}
object OutlookItem {
  
  @scala.inline
  def apply(): OutlookItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlookItem]
  }
  
  @scala.inline
  implicit class OutlookItemMutableBuilder[Self <: OutlookItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesNull: Self = StObject.set(x, "categories", null)
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setChangeKey(value: NullableOption[String]): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeKeyNull: Self = StObject.set(x, "changeKey", null)
    
    @scala.inline
    def setChangeKeyUndefined: Self = StObject.set(x, "changeKey", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
  }
}
