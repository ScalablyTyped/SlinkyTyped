package typingsSlinky.maximMazurokGapiClientCloudshell.gapi.client.cloudshell

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersResource extends StObject {
  
  var environments: EnvironmentsResource = js.native
}
object UsersResource {
  
  @scala.inline
  def apply(environments: EnvironmentsResource): UsersResource = {
    val __obj = js.Dynamic.literal(environments = environments.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersResource]
  }
  
  @scala.inline
  implicit class UsersResourceMutableBuilder[Self <: UsersResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironments(value: EnvironmentsResource): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
  }
}
