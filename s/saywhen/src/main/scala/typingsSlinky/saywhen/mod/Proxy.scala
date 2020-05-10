package typingsSlinky.saywhen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Proxy[T /* <: Func */] extends js.Object {
  def `then`(fn: T): Proxy[T] = js.native
  def thenReturn(`val`: js.Any): Proxy[T] = js.native
  def thenThrow(err: js.Error): Proxy[T] = js.native
}

object Proxy {
  @scala.inline
  def apply[T](`then`: T => Proxy[T], thenReturn: js.Any => Proxy[T], thenThrow: js.Error => Proxy[T]): Proxy[T] = {
    val __obj = js.Dynamic.literal(thenReturn = js.Any.fromFunction1(thenReturn), thenThrow = js.Any.fromFunction1(thenThrow))
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[Proxy[T]]
  }
  @scala.inline
  implicit class ProxyOps[Self[t] <: Proxy[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withThen(value: T => Proxy[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("then")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThenReturn(value: js.Any => Proxy[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thenReturn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThenThrow(value: js.Error => Proxy[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thenThrow")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

