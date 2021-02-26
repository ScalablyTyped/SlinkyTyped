package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Filter options to be applied on query.
  */
@js.native
trait SchemaFilterOptions extends StObject {
  
  /**
    * Generic filter to restrict the search, such as `lang:en`, `site:xyz`.
    */
  var filter: js.UndefOr[SchemaFilter] = js.native
  
  /**
    * If object_type is set, only objects of that type are returned. This
    * should correspond to the name of the object that was registered within
    * the definition of schema. The maximum length is 256 characters.
    */
  var objectType: js.UndefOr[String] = js.native
}
object SchemaFilterOptions {
  
  @scala.inline
  def apply(): SchemaFilterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterOptions]
  }
  
  @scala.inline
  implicit class SchemaFilterOptionsMutableBuilder[Self <: SchemaFilterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: SchemaFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
  }
}
