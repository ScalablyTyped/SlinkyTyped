package typingsSlinky.mobx.observablearrayMod

import typingsSlinky.mobx.mobxStrings.splice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IArrayWillSplice[T] extends js.Object {
  var added: js.Array[T] = js.native
  var index: Double = js.native
  var `object`: IObservableArray[T] = js.native
  var removedCount: Double = js.native
  var `type`: splice = js.native
}

object IArrayWillSplice {
  @scala.inline
  def apply[T](
    added: js.Array[T],
    index: Double,
    `object`: IObservableArray[T],
    removedCount: Double,
    `type`: splice
  ): IArrayWillSplice[T] = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removedCount = removedCount.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IArrayWillSplice[T]]
  }
  @scala.inline
  implicit class IArrayWillSpliceOps[Self[t] <: IArrayWillSplice[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAdded(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: IObservableArray[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemovedCount(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: splice): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

