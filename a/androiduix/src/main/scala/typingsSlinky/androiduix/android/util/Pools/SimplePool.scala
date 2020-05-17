package typingsSlinky.androiduix.android.util.Pools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimplePool[T] extends Pool[T] {
  var mPool: js.Array[T] = js.native
  var mPoolSize: Double = js.native
  /* private */ def isInPool(instance: js.Any): js.Any = js.native
}

object SimplePool {
  @scala.inline
  def apply[T](
    acquire: () => T,
    isInPool: js.Any => js.Any,
    mPool: js.Array[T],
    mPoolSize: Double,
    release: T => Boolean
  ): SimplePool[T] = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), isInPool = js.Any.fromFunction1(isInPool), mPool = mPool.asInstanceOf[js.Any], mPoolSize = mPoolSize.asInstanceOf[js.Any], release = js.Any.fromFunction1(release))
    __obj.asInstanceOf[SimplePool[T]]
  }
  @scala.inline
  implicit class SimplePoolOps[Self[t] <: SimplePool[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIsInPool(value: js.Any => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInPool")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMPool(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPoolSize(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPoolSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

