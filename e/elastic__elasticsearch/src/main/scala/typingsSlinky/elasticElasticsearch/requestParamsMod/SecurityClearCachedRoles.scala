package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityClearCachedRoles extends Generic {
  
  var name: String | js.Array[String] = js.native
}
object SecurityClearCachedRoles {
  
  @scala.inline
  def apply(name: String | js.Array[String]): SecurityClearCachedRoles = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityClearCachedRoles]
  }
  
  @scala.inline
  implicit class SecurityClearCachedRolesMutableBuilder[Self <: SecurityClearCachedRoles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String | js.Array[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameVarargs(value: String*): Self = StObject.set(x, "name", js.Array(value :_*))
  }
}
