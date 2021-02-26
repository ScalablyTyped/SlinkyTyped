package typingsSlinky.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "pageContentCollection.toJSON()". */
@js.native
trait PageContentCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[PageContentData]] = js.native
}
object PageContentCollectionData {
  
  @scala.inline
  def apply(): PageContentCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageContentCollectionData]
  }
  
  @scala.inline
  implicit class PageContentCollectionDataMutableBuilder[Self <: PageContentCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PageContentData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: PageContentData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
