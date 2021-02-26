package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specification for a token used to generate iframes. The token specifies
  * what data the admin is allowed to modify and the URI the iframe is allowed
  * to communiate with.
  */
@js.native
trait SchemaAdministratorWebTokenSpec extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#administratorWebTokenSpec&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Options for displaying the Managed Configuration page.
    */
  var managedConfigurations: js.UndefOr[SchemaAdministratorWebTokenSpecManagedConfigurations] = js.native
  
  /**
    * The URI of the parent frame hosting the iframe. To prevent XSS, the
    * iframe may not be hosted at other URIs. This URI must be https.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. Use PlaySearch.approveApps.
    */
  var permission: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Options for displaying the managed Play Search apps page.
    */
  var playSearch: js.UndefOr[SchemaAdministratorWebTokenSpecPlaySearch] = js.native
  
  /**
    * Options for displaying the Private Apps page.
    */
  var privateApps: js.UndefOr[SchemaAdministratorWebTokenSpecPrivateApps] = js.native
  
  /**
    * Options for displaying the Organize apps page.
    */
  var storeBuilder: js.UndefOr[SchemaAdministratorWebTokenSpecStoreBuilder] = js.native
  
  /**
    * Options for displaying the Web Apps page.
    */
  var webApps: js.UndefOr[SchemaAdministratorWebTokenSpecWebApps] = js.native
}
object SchemaAdministratorWebTokenSpec {
  
  @scala.inline
  def apply(): SchemaAdministratorWebTokenSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdministratorWebTokenSpec]
  }
  
  @scala.inline
  implicit class SchemaAdministratorWebTokenSpecMutableBuilder[Self <: SchemaAdministratorWebTokenSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setManagedConfigurations(value: SchemaAdministratorWebTokenSpecManagedConfigurations): Self = StObject.set(x, "managedConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedConfigurationsUndefined: Self = StObject.set(x, "managedConfigurations", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setPermission(value: js.Array[String]): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    @scala.inline
    def setPermissionVarargs(value: String*): Self = StObject.set(x, "permission", js.Array(value :_*))
    
    @scala.inline
    def setPlaySearch(value: SchemaAdministratorWebTokenSpecPlaySearch): Self = StObject.set(x, "playSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaySearchUndefined: Self = StObject.set(x, "playSearch", js.undefined)
    
    @scala.inline
    def setPrivateApps(value: SchemaAdministratorWebTokenSpecPrivateApps): Self = StObject.set(x, "privateApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateAppsUndefined: Self = StObject.set(x, "privateApps", js.undefined)
    
    @scala.inline
    def setStoreBuilder(value: SchemaAdministratorWebTokenSpecStoreBuilder): Self = StObject.set(x, "storeBuilder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreBuilderUndefined: Self = StObject.set(x, "storeBuilder", js.undefined)
    
    @scala.inline
    def setWebApps(value: SchemaAdministratorWebTokenSpecWebApps): Self = StObject.set(x, "webApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebAppsUndefined: Self = StObject.set(x, "webApps", js.undefined)
  }
}
