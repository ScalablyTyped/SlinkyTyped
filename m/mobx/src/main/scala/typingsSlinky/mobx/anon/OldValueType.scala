package typingsSlinky.mobx.anon

import typingsSlinky.mobx.mobxStrings.delete
import typingsSlinky.mobx.observablesetMod.ISetWillChange
import typingsSlinky.mobx.observablesetMod.ObservableSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OldValueType[T] extends ISetWillChange[T] {
  var `object`: ObservableSet[T] = js.native
  var oldValue: T = js.native
  var `type`: delete = js.native
}

object OldValueType {
  @scala.inline
  def apply[T](`object`: ObservableSet[T], oldValue: T, `type`: delete): OldValueType[T] = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldValueType[T]]
  }
  @scala.inline
  implicit class OldValueTypeOps[Self[t] <: OldValueType[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withObject(value: ObservableSet[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: delete): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

