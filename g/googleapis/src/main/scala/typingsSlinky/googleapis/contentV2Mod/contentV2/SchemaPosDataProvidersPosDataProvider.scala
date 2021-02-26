package typingsSlinky.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPosDataProvidersPosDataProvider extends StObject {
  
  /**
    * The display name of Pos data Provider.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The full name of this POS data Provider.
    */
  var fullName: js.UndefOr[String] = js.native
  
  /**
    * The ID of the account.
    */
  var providerId: js.UndefOr[String] = js.native
}
object SchemaPosDataProvidersPosDataProvider {
  
  @scala.inline
  def apply(): SchemaPosDataProvidersPosDataProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosDataProvidersPosDataProvider]
  }
  
  @scala.inline
  implicit class SchemaPosDataProvidersPosDataProviderMutableBuilder[Self <: SchemaPosDataProvidersPosDataProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    @scala.inline
    def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
  }
}
