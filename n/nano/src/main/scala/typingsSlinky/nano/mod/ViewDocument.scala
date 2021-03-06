package typingsSlinky.nano.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewDocument[D] extends IdentifiedDocument {
  
  var views: StringDictionary[View[D]] = js.native
}
object ViewDocument {
  
  @scala.inline
  def apply[D](_id: String, views: StringDictionary[View[D]]): ViewDocument[D] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewDocument[D]]
  }
  
  @scala.inline
  implicit class ViewDocumentMutableBuilder[Self <: ViewDocument[_], D] (val x: Self with ViewDocument[D]) extends AnyVal {
    
    @scala.inline
    def setViews(value: StringDictionary[View[D]]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
  }
}
