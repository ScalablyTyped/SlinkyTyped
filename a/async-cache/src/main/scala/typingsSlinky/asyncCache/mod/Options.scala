package typingsSlinky.asyncCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[T]
  extends typingsSlinky.lruCache.mod.Options[String, T] {
  def load(
    key: String,
    callback: js.Function3[/* error */ js.Any, /* asyncValue */ T, /* maxAge */ js.UndefOr[Double], Unit]
  ): Unit = js.native
}

object Options {
  @scala.inline
  def apply[T](
    load: (String, js.Function3[/* error */ js.Any, /* asyncValue */ T, /* maxAge */ js.UndefOr[Double], Unit]) => Unit
  ): Options[T] = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction2(load))
    __obj.asInstanceOf[Options[T]]
  }
  @scala.inline
  implicit class OptionsOps[Self[t] <: Options[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withLoad(
      value: (String, js.Function3[/* error */ js.Any, /* asyncValue */ T, /* maxAge */ js.UndefOr[Double], Unit]) => Unit
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

