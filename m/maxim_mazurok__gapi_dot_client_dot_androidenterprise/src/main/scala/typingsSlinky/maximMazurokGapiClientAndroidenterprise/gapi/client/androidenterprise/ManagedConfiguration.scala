package typingsSlinky.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedConfiguration extends StObject {
  
  /** Contains the ID of the managed configuration profile and the set of configuration variables (if any) defined for the user. */
  var configurationVariables: js.UndefOr[ConfigurationVariables] = js.native
  
  /** Deprecated. */
  var kind: js.UndefOr[String] = js.native
  
  /** The set of managed properties for this configuration. */
  var managedProperty: js.UndefOr[js.Array[ManagedProperty]] = js.native
  
  /** The ID of the product that the managed configuration is for, e.g. "app:com.google.android.gm". */
  var productId: js.UndefOr[String] = js.native
}
object ManagedConfiguration {
  
  @scala.inline
  def apply(): ManagedConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedConfiguration]
  }
  
  @scala.inline
  implicit class ManagedConfigurationMutableBuilder[Self <: ManagedConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationVariables(value: ConfigurationVariables): Self = StObject.set(x, "configurationVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationVariablesUndefined: Self = StObject.set(x, "configurationVariables", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setManagedProperty(value: js.Array[ManagedProperty]): Self = StObject.set(x, "managedProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedPropertyUndefined: Self = StObject.set(x, "managedProperty", js.undefined)
    
    @scala.inline
    def setManagedPropertyVarargs(value: ManagedProperty*): Self = StObject.set(x, "managedProperty", js.Array(value :_*))
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
