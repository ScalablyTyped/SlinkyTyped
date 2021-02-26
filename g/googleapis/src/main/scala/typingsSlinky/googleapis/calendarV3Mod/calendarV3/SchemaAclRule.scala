package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import typingsSlinky.googleapis.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAclRule extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Identifier of the ACL rule.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Type of the resource (&quot;calendar#aclRule&quot;).
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The role assigned to the scope. Possible values are:   - &quot;none&quot;
    * - Provides no access.  - &quot;freeBusyReader&quot; - Provides read
    * access to free/busy information.  - &quot;reader&quot; - Provides read
    * access to the calendar. Private events will appear to users with reader
    * access, but event details will be hidden.  - &quot;writer&quot; -
    * Provides read and write access to the calendar. Private events will
    * appear to users with writer access, and event details will be visible.  -
    * &quot;owner&quot; - Provides ownership of the calendar. This role has all
    * of the permissions of the writer role with the additional ability to see
    * and manipulate ACLs.
    */
  var role: js.UndefOr[String] = js.native
  
  /**
    * The scope of the rule.
    */
  var scope: js.UndefOr[Value] = js.native
}
object SchemaAclRule {
  
  @scala.inline
  def apply(): SchemaAclRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAclRule]
  }
  
  @scala.inline
  implicit class SchemaAclRuleMutableBuilder[Self <: SchemaAclRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setScope(value: Value): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
