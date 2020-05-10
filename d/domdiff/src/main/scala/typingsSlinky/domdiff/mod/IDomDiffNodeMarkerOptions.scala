package typingsSlinky.domdiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDomDiffNodeMarkerOptions[T] extends js.Object {
  /**
    * A specific live node to use as boundary for all nodes operations.
    * With live nodes [a,d] and {before: d}, the operation [] => [b, c]
    * would place nodes right before d, resulting a live collection of [a, b, c, d].
    * 
    * `before` doesn't necessarily have to be a node
    */
  var before: T = js.native
}

object IDomDiffNodeMarkerOptions {
  @scala.inline
  def apply[T](before: T): IDomDiffNodeMarkerOptions[T] = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDomDiffNodeMarkerOptions[T]]
  }
  @scala.inline
  implicit class IDomDiffNodeMarkerOptionsOps[Self[t] <: IDomDiffNodeMarkerOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBefore(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

