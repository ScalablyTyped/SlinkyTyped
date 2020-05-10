package typingsSlinky.binPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The return value from the pack function. */
@js.native
trait PackResult[T] extends js.Object {
  /** Height of the bounding box around all bins. */
  var height: Double = js.native
  /** List of packed bins. */
  var items: js.Array[PackedItem[T]] = js.native
  /** Width of the bounding box around all bins. */
  var width: Double = js.native
}

object PackResult {
  @scala.inline
  def apply[T](height: Double, items: js.Array[PackedItem[T]], width: Double): PackResult[T] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackResult[T]]
  }
  @scala.inline
  implicit class PackResultOps[Self[t] <: PackResult[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withHeight(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[PackedItem[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

