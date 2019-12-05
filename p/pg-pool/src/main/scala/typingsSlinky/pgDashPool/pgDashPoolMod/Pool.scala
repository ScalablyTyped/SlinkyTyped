package typingsSlinky.pgDashPool.pgDashPoolMod

import typingsSlinky.pg.pgMod.PoolClient
import typingsSlinky.pgDashPool.pgDashPoolStrings.acquire
import typingsSlinky.pgDashPool.pgDashPoolStrings.connect
import typingsSlinky.pgDashPool.pgDashPoolStrings.error
import typingsSlinky.pgDashPool.pgDashPoolStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pool[T /* <: typingsSlinky.pg.pgMod.Client */]
  extends typingsSlinky.pg.pgMod.Pool {
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

