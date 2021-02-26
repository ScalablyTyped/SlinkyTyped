package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OidcMemberDefinition extends StObject {
  
  /**
    * A list of comma seperated strings that identifies user groups in your OIDC IdP. Each user group is made up of a group of private workers.
    */
  var Groups: typingsSlinky.awsSdk.sagemakerMod.Groups = js.native
}
object OidcMemberDefinition {
  
  @scala.inline
  def apply(Groups: Groups): OidcMemberDefinition = {
    val __obj = js.Dynamic.literal(Groups = Groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[OidcMemberDefinition]
  }
  
  @scala.inline
  implicit class OidcMemberDefinitionMutableBuilder[Self <: OidcMemberDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: Groups): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: Group*): Self = StObject.set(x, "Groups", js.Array(value :_*))
  }
}
