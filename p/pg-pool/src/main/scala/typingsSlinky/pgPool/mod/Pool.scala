package typingsSlinky.pgPool.mod

import typingsSlinky.pg.mod.PoolClient
import typingsSlinky.pgPool.pgPoolStrings.acquire
import typingsSlinky.pgPool.pgPoolStrings.connect
import typingsSlinky.pgPool.pgPoolStrings.error
import typingsSlinky.pgPool.pgPoolStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pool[T /* <: typingsSlinky.pg.mod.Client */]
  extends typingsSlinky.pg.mod.Pool {
  
  val Client: ClientLikeCtr[T] = js.native
  
  @JSName("on")
  def on_acquire(event: acquire, listener: js.Function1[/* client */ T with PoolClient, Unit]): this.type = js.native
  @JSName("on")
  def on_connect(event: connect, listener: js.Function1[/* client */ T with PoolClient, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function2[/* err */ js.Error, /* client */ T with PoolClient, Unit]): this.type = js.native
  @JSName("on")
  def on_remove(event: remove, listener: js.Function1[/* client */ T with PoolClient, Unit]): this.type = js.native
}
