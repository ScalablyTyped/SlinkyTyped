package typingsSlinky.angularResource.mod.global

import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array[T] extends js.Object {
  /** The promise of the original server interaction that created this collection. */
  @JSName("$promise")
  var $promise: IPromise[Array[T]] = js.native
  @JSName("$resolved")
  var $resolved: Boolean = js.native
}

object Array {
  @scala.inline
  def apply[T]($promise: IPromise[Array[T]], $resolved: Boolean): Array[T] = {
    val __obj = js.Dynamic.literal($promise = $promise.asInstanceOf[js.Any], $resolved = $resolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array[T]]
  }
  @scala.inline
  implicit class ArrayOps[Self[t] <: Array[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$promise(value: IPromise[Array[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$resolved(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$resolved")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

