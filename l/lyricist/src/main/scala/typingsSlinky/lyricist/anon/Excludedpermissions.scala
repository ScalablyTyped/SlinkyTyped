package typingsSlinky.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Excludedpermissions extends StObject {
  
  var excluded_permissions: js.Array[String] = js.native
  
  var interactions: Following = js.native
  
  var iq_by_action: js.Any = js.native
  
  var permissions: js.Array[String] = js.native
  
  var relationships: js.Any = js.native
}
object Excludedpermissions {
  
  @scala.inline
  def apply(
    excluded_permissions: js.Array[String],
    interactions: Following,
    iq_by_action: js.Any,
    permissions: js.Array[String],
    relationships: js.Any
  ): Excludedpermissions = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], iq_by_action = iq_by_action.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
    __obj.asInstanceOf[Excludedpermissions]
  }
  
  @scala.inline
  implicit class ExcludedpermissionsMutableBuilder[Self <: Excludedpermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcluded_permissions(value: js.Array[String]): Self = StObject.set(x, "excluded_permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcluded_permissionsVarargs(value: String*): Self = StObject.set(x, "excluded_permissions", js.Array(value :_*))
    
    @scala.inline
    def setInteractions(value: Following): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIq_by_action(value: js.Any): Self = StObject.set(x, "iq_by_action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setRelationships(value: js.Any): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
  }
}
