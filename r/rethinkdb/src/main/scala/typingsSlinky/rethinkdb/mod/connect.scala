package typingsSlinky.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rethinkdb", "connect")
@js.native
object connect extends js.Object {
  
  def apply(host: String): js.Promise[Connection] = js.native
  def apply(host: String, cb: js.Function2[js.Error, /* conn */ Connection, Unit]): Unit = js.native
  def apply(opts: ConnectionOptions): js.Promise[Connection] = js.native
  def apply(opts: ConnectionOptions, cb: js.Function2[js.Error, /* conn */ Connection, Unit]): Unit = js.native
}
