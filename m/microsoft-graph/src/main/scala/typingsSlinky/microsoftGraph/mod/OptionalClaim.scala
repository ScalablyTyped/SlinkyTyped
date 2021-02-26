package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionalClaim extends StObject {
  
  /**
    * Additional properties of the claim. If a property exists in this collection, it modifies the behavior of the optional
    * claim specified in the name property.
    */
  var additionalProperties: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  /**
    * If the value is true, the claim specified by the client is necessary to ensure a smooth authorization experience for
    * the specific task requested by the end user. The default value is false.
    */
  var essential: js.UndefOr[Boolean] = js.native
  
  // The name of the optional claim.
  var name: js.UndefOr[String] = js.native
  
  /**
    * The source (directory object) of the claim. There are predefined claims and user-defined claims from extension
    * properties. If the source value is null, the claim is a predefined optional claim. If the source value is user, the
    * value in the name property is the extension property from the user object.
    */
  var source: js.UndefOr[NullableOption[String]] = js.native
}
object OptionalClaim {
  
  @scala.inline
  def apply(): OptionalClaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalClaim]
  }
  
  @scala.inline
  implicit class OptionalClaimMutableBuilder[Self <: OptionalClaim] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalProperties(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalPropertiesNull: Self = StObject.set(x, "additionalProperties", null)
    
    @scala.inline
    def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    @scala.inline
    def setAdditionalPropertiesVarargs(value: String*): Self = StObject.set(x, "additionalProperties", js.Array(value :_*))
    
    @scala.inline
    def setEssential(value: Boolean): Self = StObject.set(x, "essential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEssentialUndefined: Self = StObject.set(x, "essential", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSource(value: NullableOption[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
