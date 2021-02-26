package typingsSlinky.nodePgMigrate.distTypesMod

import typingsSlinky.pg.mod.ClientBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunnerOptionClient extends StObject {
  
  var dbClient: ClientBase = js.native
}
object RunnerOptionClient {
  
  @scala.inline
  def apply(dbClient: ClientBase): RunnerOptionClient = {
    val __obj = js.Dynamic.literal(dbClient = dbClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnerOptionClient]
  }
  
  @scala.inline
  implicit class RunnerOptionClientMutableBuilder[Self <: RunnerOptionClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDbClient(value: ClientBase): Self = StObject.set(x, "dbClient", value.asInstanceOf[js.Any])
  }
}
