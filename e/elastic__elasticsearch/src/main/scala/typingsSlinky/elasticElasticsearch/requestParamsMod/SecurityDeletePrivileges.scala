package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityDeletePrivileges extends Generic {
  
  var application: String = js.native
  
  var name: String = js.native
  
  var refresh: js.UndefOr[wait_for | Boolean] = js.native
}
object SecurityDeletePrivileges {
  
  @scala.inline
  def apply(application: String, name: String): SecurityDeletePrivileges = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDeletePrivileges]
  }
  
  @scala.inline
  implicit class SecurityDeletePrivilegesMutableBuilder[Self <: SecurityDeletePrivileges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: String): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: wait_for | Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
  }
}
