package typingsSlinky.pgPool.mod

import typingsSlinky.pg.mod.Client
import typingsSlinky.pg.mod.PoolConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config[T /* <: Client */] extends PoolConfig {
  var Client: js.UndefOr[ClientLikeCtr[T]] = js.native
}

object Config {
  @scala.inline
  def apply[T](): Config[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config[T]]
  }
  @scala.inline
  implicit class ConfigOps[Self[t] <: Config[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withClient(value: ClientLikeCtr[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClient: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Client")(js.undefined)
        ret
    }
  }
  
}

