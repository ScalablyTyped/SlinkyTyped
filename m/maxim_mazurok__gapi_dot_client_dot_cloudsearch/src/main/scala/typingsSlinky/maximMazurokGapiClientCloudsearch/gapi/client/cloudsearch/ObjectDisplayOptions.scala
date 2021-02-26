package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectDisplayOptions extends StObject {
  
  /**
    * Defines the properties that are displayed in the metalines of the search results. The property values are displayed in the order given here. If a property holds multiple values, all
    * of the values are displayed before the next properties. For this reason, it is a good practice to specify singular properties before repeated properties in this list. All of the
    * properties must set is_returnable to true. The maximum number of metalines is 3.
    */
  var metalines: js.UndefOr[js.Array[Metaline]] = js.native
  
  /**
    * The user friendly label to display in the search result to indicate the type of the item. This is OPTIONAL; if not provided, an object label isn't displayed on the context line of
    * the search results. The maximum length is 64 characters.
    */
  var objectDisplayLabel: js.UndefOr[String] = js.native
}
object ObjectDisplayOptions {
  
  @scala.inline
  def apply(): ObjectDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectDisplayOptions]
  }
  
  @scala.inline
  implicit class ObjectDisplayOptionsMutableBuilder[Self <: ObjectDisplayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetalines(value: js.Array[Metaline]): Self = StObject.set(x, "metalines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetalinesUndefined: Self = StObject.set(x, "metalines", js.undefined)
    
    @scala.inline
    def setMetalinesVarargs(value: Metaline*): Self = StObject.set(x, "metalines", js.Array(value :_*))
    
    @scala.inline
    def setObjectDisplayLabel(value: String): Self = StObject.set(x, "objectDisplayLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectDisplayLabelUndefined: Self = StObject.set(x, "objectDisplayLabel", js.undefined)
  }
}
