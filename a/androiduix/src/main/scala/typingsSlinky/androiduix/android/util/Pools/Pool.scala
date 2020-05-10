package typingsSlinky.androiduix.android.util.Pools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pool[T] extends js.Object {
  def acquire(): T = js.native
  def release(instance: T): Boolean = js.native
}

object Pool {
  @scala.inline
  def apply[T](acquire: () => T, release: T => Boolean): Pool[T] = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), release = js.Any.fromFunction1(release))
    __obj.asInstanceOf[Pool[T]]
  }
  @scala.inline
  implicit class PoolOps[Self[t] <: Pool[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAcquire(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acquire")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRelease(value: T => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

