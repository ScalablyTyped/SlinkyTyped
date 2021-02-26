package typingsSlinky.azure.mod

import typingsSlinky.azure.anon.Database
import typingsSlinky.azure.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterCreationOptions extends StObject {
  
  var additionalStorageAccounts: js.UndefOr[js.Array[Key]] = js.native
  
  var defaultStorageAccountKey: String = js.native
  
  var defaultStorageAccountName: String = js.native
  
  var defaultStorageContainer: String = js.native
  
  var hiveMetastore: js.UndefOr[Database] = js.native
  
  var location: String = js.native
  
  var name: String = js.native
  
  var nodes: Double = js.native
  
  var oozieMetastore: js.UndefOr[Database] = js.native
  
  var password: String = js.native
  
  var user: String = js.native
}
object ClusterCreationOptions {
  
  @scala.inline
  def apply(
    defaultStorageAccountKey: String,
    defaultStorageAccountName: String,
    defaultStorageContainer: String,
    location: String,
    name: String,
    nodes: Double,
    password: String,
    user: String
  ): ClusterCreationOptions = {
    val __obj = js.Dynamic.literal(defaultStorageAccountKey = defaultStorageAccountKey.asInstanceOf[js.Any], defaultStorageAccountName = defaultStorageAccountName.asInstanceOf[js.Any], defaultStorageContainer = defaultStorageContainer.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCreationOptions]
  }
  
  @scala.inline
  implicit class ClusterCreationOptionsMutableBuilder[Self <: ClusterCreationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalStorageAccounts(value: js.Array[Key]): Self = StObject.set(x, "additionalStorageAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalStorageAccountsUndefined: Self = StObject.set(x, "additionalStorageAccounts", js.undefined)
    
    @scala.inline
    def setAdditionalStorageAccountsVarargs(value: Key*): Self = StObject.set(x, "additionalStorageAccounts", js.Array(value :_*))
    
    @scala.inline
    def setDefaultStorageAccountKey(value: String): Self = StObject.set(x, "defaultStorageAccountKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultStorageAccountName(value: String): Self = StObject.set(x, "defaultStorageAccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultStorageContainer(value: String): Self = StObject.set(x, "defaultStorageContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiveMetastore(value: Database): Self = StObject.set(x, "hiveMetastore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiveMetastoreUndefined: Self = StObject.set(x, "hiveMetastore", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodes(value: Double): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOozieMetastore(value: Database): Self = StObject.set(x, "oozieMetastore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOozieMetastoreUndefined: Self = StObject.set(x, "oozieMetastore", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
