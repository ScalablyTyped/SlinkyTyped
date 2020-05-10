package typingsSlinky.esfxTypeModel.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodPropertyDescriptor[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  var configurable: js.UndefOr[Boolean] = js.native
  var enumerable: js.UndefOr[Boolean] = js.native
  var value: T = js.native
  var writable: js.UndefOr[Boolean] = js.native
}

object MethodPropertyDescriptor {
  @scala.inline
  def apply[T](value: T): MethodPropertyDescriptor[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodPropertyDescriptor[T]]
  }
  @scala.inline
  implicit class MethodPropertyDescriptorOps[Self[t] <: MethodPropertyDescriptor[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurable")(js.undefined)
        ret
    }
    @scala.inline
    def withEnumerable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnumerable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumerable")(js.undefined)
        ret
    }
    @scala.inline
    def withWritable(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritable: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writable")(js.undefined)
        ret
    }
  }
  
}

