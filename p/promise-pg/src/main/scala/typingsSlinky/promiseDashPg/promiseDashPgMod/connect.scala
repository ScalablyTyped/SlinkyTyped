package typingsSlinky.promiseDashPg.promiseDashPgMod

import typingsSlinky.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-pg", "connect")
@js.native
object connect extends js.Object {
  def apply(connection: String): Promise[Client] = js.native
  def apply(connection: typingsSlinky.pg.pgMod.ClientConfig): Promise[Client] = js.native
}

