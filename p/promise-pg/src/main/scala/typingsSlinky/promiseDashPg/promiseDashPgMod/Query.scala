package typingsSlinky.promiseDashPg.promiseDashPgMod

import typingsSlinky.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-pg", "Query")
@js.native
class Query ()
  extends typingsSlinky.pg.pgMod.Query[js.Any, js.Any] {
  var promise: Promise[QueryResult] = js.native
}

