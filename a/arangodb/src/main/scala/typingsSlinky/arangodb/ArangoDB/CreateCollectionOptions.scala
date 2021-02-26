package typingsSlinky.arangodb.ArangoDB

import typingsSlinky.arangodb.anon.AllowUserKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCollectionOptions extends StObject {
  
  var isSystem: js.UndefOr[Boolean] = js.native
  
  var isVolatile: js.UndefOr[Boolean] = js.native
  
  var journalSize: js.UndefOr[Double] = js.native
  
  var keyOptions: js.UndefOr[AllowUserKeys] = js.native
  
  var numberOfShards: js.UndefOr[Double] = js.native
  
  var replicationFactor: js.UndefOr[Double] = js.native
  
  var shardKeys: js.UndefOr[js.Array[String]] = js.native
  
  var waitForSync: js.UndefOr[Boolean] = js.native
}
object CreateCollectionOptions {
  
  @scala.inline
  def apply(): CreateCollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCollectionOptions]
  }
  
  @scala.inline
  implicit class CreateCollectionOptionsMutableBuilder[Self <: CreateCollectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsSystem(value: Boolean): Self = StObject.set(x, "isSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSystemUndefined: Self = StObject.set(x, "isSystem", js.undefined)
    
    @scala.inline
    def setIsVolatile(value: Boolean): Self = StObject.set(x, "isVolatile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVolatileUndefined: Self = StObject.set(x, "isVolatile", js.undefined)
    
    @scala.inline
    def setJournalSize(value: Double): Self = StObject.set(x, "journalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJournalSizeUndefined: Self = StObject.set(x, "journalSize", js.undefined)
    
    @scala.inline
    def setKeyOptions(value: AllowUserKeys): Self = StObject.set(x, "keyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyOptionsUndefined: Self = StObject.set(x, "keyOptions", js.undefined)
    
    @scala.inline
    def setNumberOfShards(value: Double): Self = StObject.set(x, "numberOfShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfShardsUndefined: Self = StObject.set(x, "numberOfShards", js.undefined)
    
    @scala.inline
    def setReplicationFactor(value: Double): Self = StObject.set(x, "replicationFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationFactorUndefined: Self = StObject.set(x, "replicationFactor", js.undefined)
    
    @scala.inline
    def setShardKeys(value: js.Array[String]): Self = StObject.set(x, "shardKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardKeysUndefined: Self = StObject.set(x, "shardKeys", js.undefined)
    
    @scala.inline
    def setShardKeysVarargs(value: String*): Self = StObject.set(x, "shardKeys", js.Array(value :_*))
    
    @scala.inline
    def setWaitForSync(value: Boolean): Self = StObject.set(x, "waitForSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForSyncUndefined: Self = StObject.set(x, "waitForSync", js.undefined)
  }
}
