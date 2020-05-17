package typingsSlinky.mobx.anon

import typingsSlinky.mobx.mobxStrings.add
import typingsSlinky.mobx.observablesetMod.ISetWillChange
import typingsSlinky.mobx.observablesetMod.ObservableSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewValueObjectType[T] extends ISetWillChange[T] {
  var newValue: T = js.native
  var `object`: ObservableSet[T] = js.native
  var `type`: add = js.native
}

object NewValueObjectType {
  @scala.inline
  def apply[T](newValue: T, `object`: ObservableSet[T], `type`: add): NewValueObjectType[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValueObjectType[T]]
  }
  @scala.inline
  implicit class NewValueObjectTypeOps[Self[t] <: NewValueObjectType[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withNewValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: ObservableSet[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: add): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

