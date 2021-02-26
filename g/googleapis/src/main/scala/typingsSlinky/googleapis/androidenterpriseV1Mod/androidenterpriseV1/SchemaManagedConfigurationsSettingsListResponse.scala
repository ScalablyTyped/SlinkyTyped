package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The managed configurations settings for a product.
  */
@js.native
trait SchemaManagedConfigurationsSettingsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#managedConfigurationsSettingsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * A managed configurations settings for an app that may be assigned to a
    * group of users in an enterprise.
    */
  var managedConfigurationsSettings: js.UndefOr[js.Array[SchemaManagedConfigurationsSettings]] = js.native
}
object SchemaManagedConfigurationsSettingsListResponse {
  
  @scala.inline
  def apply(): SchemaManagedConfigurationsSettingsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedConfigurationsSettingsListResponse]
  }
  
  @scala.inline
  implicit class SchemaManagedConfigurationsSettingsListResponseMutableBuilder[Self <: SchemaManagedConfigurationsSettingsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setManagedConfigurationsSettings(value: js.Array[SchemaManagedConfigurationsSettings]): Self = StObject.set(x, "managedConfigurationsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedConfigurationsSettingsUndefined: Self = StObject.set(x, "managedConfigurationsSettings", js.undefined)
    
    @scala.inline
    def setManagedConfigurationsSettingsVarargs(value: SchemaManagedConfigurationsSettings*): Self = StObject.set(x, "managedConfigurationsSettings", js.Array(value :_*))
  }
}
