package typingsSlinky.pgDashPool.pgDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-pool", JSImport.Namespace)
@js.native
class ^[T /* <: typingsSlinky.pg.pgMod.Client */] () extends Pool[T] {
  def this(config: Config[T]) = this()
  def this(config: Config[T], client: ClientLikeCtr[T]) = this()
}

