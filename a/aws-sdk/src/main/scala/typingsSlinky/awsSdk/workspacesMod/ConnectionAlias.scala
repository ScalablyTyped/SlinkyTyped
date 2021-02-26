package typingsSlinky.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionAlias extends StObject {
  
  /**
    * The identifier of the connection alias.
    */
  var AliasId: js.UndefOr[ConnectionAliasId] = js.native
  
  /**
    * The association status of the connection alias.
    */
  var Associations: js.UndefOr[ConnectionAliasAssociationList] = js.native
  
  /**
    * The connection string specified for the connection alias. The connection string must be in the form of a fully qualified domain name (FQDN), such as www.example.com.
    */
  var ConnectionString: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.ConnectionString] = js.native
  
  /**
    * The identifier of the AWS account that owns the connection alias.
    */
  var OwnerAccountId: js.UndefOr[AwsAccount] = js.native
  
  /**
    * The current state of the connection alias.
    */
  var State: js.UndefOr[ConnectionAliasState] = js.native
}
object ConnectionAlias {
  
  @scala.inline
  def apply(): ConnectionAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionAlias]
  }
  
  @scala.inline
  implicit class ConnectionAliasMutableBuilder[Self <: ConnectionAlias] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasId(value: ConnectionAliasId): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasIdUndefined: Self = StObject.set(x, "AliasId", js.undefined)
    
    @scala.inline
    def setAssociations(value: ConnectionAliasAssociationList): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
    
    @scala.inline
    def setAssociationsVarargs(value: ConnectionAliasAssociation*): Self = StObject.set(x, "Associations", js.Array(value :_*))
    
    @scala.inline
    def setConnectionString(value: ConnectionString): Self = StObject.set(x, "ConnectionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionStringUndefined: Self = StObject.set(x, "ConnectionString", js.undefined)
    
    @scala.inline
    def setOwnerAccountId(value: AwsAccount): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    @scala.inline
    def setState(value: ConnectionAliasState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
