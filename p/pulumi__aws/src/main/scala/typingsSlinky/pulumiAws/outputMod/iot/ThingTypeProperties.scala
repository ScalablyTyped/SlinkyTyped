package typingsSlinky.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThingTypeProperties extends StObject {
  
  /**
    * The description of the thing type.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A list of searchable thing attribute names.
    */
  var searchableAttributes: js.Array[String] = js.native
}
object ThingTypeProperties {
  
  @scala.inline
  def apply(searchableAttributes: js.Array[String]): ThingTypeProperties = {
    val __obj = js.Dynamic.literal(searchableAttributes = searchableAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingTypeProperties]
  }
  
  @scala.inline
  implicit class ThingTypePropertiesMutableBuilder[Self <: ThingTypeProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setSearchableAttributes(value: js.Array[String]): Self = StObject.set(x, "searchableAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchableAttributesVarargs(value: String*): Self = StObject.set(x, "searchableAttributes", js.Array(value :_*))
  }
}
