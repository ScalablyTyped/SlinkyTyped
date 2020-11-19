package typingsSlinky.promisePg.mod

import typingsSlinky.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("promise-pg", "Query")
@js.native
class Query ()
  extends typingsSlinky.pg.mod.Query[js.Any, js.Any] {
  
  var promise: Promise[QueryResult] = js.native
}
