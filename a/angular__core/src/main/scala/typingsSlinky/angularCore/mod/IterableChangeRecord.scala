package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IterableChangeRecord[V] extends js.Object {
  /** Current index of the item in `Iterable` or null if removed. */
  val currentIndex: Double | Null = js.native
  /** The item. */
  val item: V = js.native
  /** Previous index of the item in `Iterable` or null if added. */
  val previousIndex: Double | Null = js.native
  /** Track by identity as computed by the `TrackByFunction`. */
  val trackById: js.Any = js.native
}

object IterableChangeRecord {
  @scala.inline
  def apply[V](item: V, trackById: js.Any): IterableChangeRecord[V] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], trackById = trackById.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterableChangeRecord[V]]
  }
  @scala.inline
  implicit class IterableChangeRecordOps[Self[v] <: IterableChangeRecord[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withItem(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackById(value: js.Any): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackById")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentIndex(value: Double): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentIndexNull: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentIndex")(null)
        ret
    }
    @scala.inline
    def withPreviousIndex(value: Double): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousIndexNull: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousIndex")(null)
        ret
    }
  }
  
}

