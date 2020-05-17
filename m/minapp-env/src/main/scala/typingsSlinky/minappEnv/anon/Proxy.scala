package typingsSlinky.minappEnv.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Proxy[T /* <: js.Object */] extends js.Object {
  var proxy: T = js.native
  def revoke(): Unit = js.native
}

object Proxy {
  @scala.inline
  def apply[T](proxy: T, revoke: () => Unit): Proxy[T] = {
    val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any], revoke = js.Any.fromFunction0(revoke))
    __obj.asInstanceOf[Proxy[T]]
  }
  @scala.inline
  implicit class ProxyOps[Self[t] <: Proxy[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withProxy(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevoke(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revoke")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

