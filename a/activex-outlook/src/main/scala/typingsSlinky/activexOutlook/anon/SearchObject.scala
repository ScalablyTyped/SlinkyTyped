package typingsSlinky.activexOutlook.anon

import typingsSlinky.activexOutlook.Outlook.Search
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchObject extends StObject {
  
  val SearchObject: Search = js.native
}
object SearchObject {
  
  @scala.inline
  def apply(SearchObject: Search): SearchObject = {
    val __obj = js.Dynamic.literal(SearchObject = SearchObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchObject]
  }
  
  @scala.inline
  implicit class SearchObjectMutableBuilder[Self <: SearchObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearchObject(value: Search): Self = StObject.set(x, "SearchObject", value.asInstanceOf[js.Any])
  }
}
