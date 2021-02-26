package typingsSlinky.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartRelationalDatabaseRequest extends StObject {
  
  /**
    * The name of your database to start.
    */
  var relationalDatabaseName: ResourceName = js.native
}
object StartRelationalDatabaseRequest {
  
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): StartRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRelationalDatabaseRequest]
  }
  
  @scala.inline
  implicit class StartRelationalDatabaseRequestMutableBuilder[Self <: StartRelationalDatabaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelationalDatabaseName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseName", value.asInstanceOf[js.Any])
  }
}
