package typingsSlinky.fastJsonPatch.duplexMod

import typingsSlinky.fastJsonPatch.coreMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer[T] extends js.Object {
  var `object`: T = js.native
  var patches: js.Array[Operation] = js.native
  def callback(patches: js.Array[Operation]): Unit = js.native
  def unobserve(): Unit = js.native
}

object Observer {
  @scala.inline
  def apply[T](
    callback: js.Array[Operation] => Unit,
    `object`: T,
    patches: js.Array[Operation],
    unobserve: () => Unit
  ): Observer[T] = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), patches = patches.asInstanceOf[js.Any], unobserve = js.Any.fromFunction0(unobserve))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observer[T]]
  }
  @scala.inline
  implicit class ObserverOps[Self[t] <: Observer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCallback(value: js.Array[Operation] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withObject(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatches(value: js.Array[Operation]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnobserve(value: () => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unobserve")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

