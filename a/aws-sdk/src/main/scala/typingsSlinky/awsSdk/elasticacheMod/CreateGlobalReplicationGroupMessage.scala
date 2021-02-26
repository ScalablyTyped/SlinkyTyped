package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateGlobalReplicationGroupMessage extends StObject {
  
  /**
    * Provides details of the Global Datastore
    */
  var GlobalReplicationGroupDescription: js.UndefOr[String] = js.native
  
  /**
    * The suffix name of a Global Datastore. Amazon ElastiCache automatically applies a prefix to the Global Datastore ID when it is created. Each AWS Region has its own prefix. For instance, a Global Datastore ID created in the US-West-1 region will begin with "dsdfu" along with the suffix name you provide. The suffix, combined with the auto-generated prefix, guarantees uniqueness of the Global Datastore name across multiple regions.  For a full list of AWS Regions and their respective Global Datastore iD prefixes, see Using the AWS CLI with Global Datastores .
    */
  var GlobalReplicationGroupIdSuffix: String = js.native
  
  /**
    * The name of the primary cluster that accepts writes and will replicate updates to the secondary cluster.
    */
  var PrimaryReplicationGroupId: String = js.native
}
object CreateGlobalReplicationGroupMessage {
  
  @scala.inline
  def apply(GlobalReplicationGroupIdSuffix: String, PrimaryReplicationGroupId: String): CreateGlobalReplicationGroupMessage = {
    val __obj = js.Dynamic.literal(GlobalReplicationGroupIdSuffix = GlobalReplicationGroupIdSuffix.asInstanceOf[js.Any], PrimaryReplicationGroupId = PrimaryReplicationGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGlobalReplicationGroupMessage]
  }
  
  @scala.inline
  implicit class CreateGlobalReplicationGroupMessageMutableBuilder[Self <: CreateGlobalReplicationGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalReplicationGroupDescription(value: String): Self = StObject.set(x, "GlobalReplicationGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalReplicationGroupDescriptionUndefined: Self = StObject.set(x, "GlobalReplicationGroupDescription", js.undefined)
    
    @scala.inline
    def setGlobalReplicationGroupIdSuffix(value: String): Self = StObject.set(x, "GlobalReplicationGroupIdSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryReplicationGroupId(value: String): Self = StObject.set(x, "PrimaryReplicationGroupId", value.asInstanceOf[js.Any])
  }
}
