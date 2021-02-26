package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A managed configurations settings resource contains the set of managed
  * properties that have been configured for an Android app to be applied to a
  * set of users. The app&#39;s developer would have defined configurable
  * properties in the managed configurations schema.
  */
@js.native
trait SchemaManagedConfigurationsSettings extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#managedConfigurationsSettings&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The last updated time of the managed configuration settings in
    * milliseconds since 1970-01-01T00:00:00Z.
    */
  var lastUpdatedTimestampMillis: js.UndefOr[String] = js.native
  
  /**
    * The set of managed properties for this configuration.
    */
  var managedProperty: js.UndefOr[js.Array[SchemaManagedProperty]] = js.native
  
  /**
    * The ID of the managed configurations settings.
    */
  var mcmId: js.UndefOr[String] = js.native
  
  /**
    * The name of the managed configurations settings.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaManagedConfigurationsSettings {
  
  @scala.inline
  def apply(): SchemaManagedConfigurationsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedConfigurationsSettings]
  }
  
  @scala.inline
  implicit class SchemaManagedConfigurationsSettingsMutableBuilder[Self <: SchemaManagedConfigurationsSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestampMillis(value: String): Self = StObject.set(x, "lastUpdatedTimestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimestampMillisUndefined: Self = StObject.set(x, "lastUpdatedTimestampMillis", js.undefined)
    
    @scala.inline
    def setManagedProperty(value: js.Array[SchemaManagedProperty]): Self = StObject.set(x, "managedProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedPropertyUndefined: Self = StObject.set(x, "managedProperty", js.undefined)
    
    @scala.inline
    def setManagedPropertyVarargs(value: SchemaManagedProperty*): Self = StObject.set(x, "managedProperty", js.Array(value :_*))
    
    @scala.inline
    def setMcmId(value: String): Self = StObject.set(x, "mcmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMcmIdUndefined: Self = StObject.set(x, "mcmId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
