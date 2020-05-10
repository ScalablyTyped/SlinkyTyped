package typingsSlinky.pReflect.mod

import typingsSlinky.pReflect.pReflectBooleans.`false`
import typingsSlinky.pReflect.pReflectBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseFulfilledResult[ValueType] extends PromiseResult[ValueType] {
  var isFulfilled: `true` = js.native
  var isRejected: `false` = js.native
  var value: ValueType = js.native
}

object PromiseFulfilledResult {
  @scala.inline
  def apply[ValueType](isFulfilled: `true`, isRejected: `false`, value: ValueType): PromiseFulfilledResult[ValueType] = {
    val __obj = js.Dynamic.literal(isFulfilled = isFulfilled.asInstanceOf[js.Any], isRejected = isRejected.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseFulfilledResult[ValueType]]
  }
  @scala.inline
  implicit class PromiseFulfilledResultOps[Self[valuetype] <: PromiseFulfilledResult[valuetype], ValueType] (val x: Self[ValueType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[ValueType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[ValueType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[ValueType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[ValueType] with Other]
    @scala.inline
    def withIsFulfilled(value: `true`): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFulfilled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRejected(value: `false`): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRejected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: ValueType): Self[ValueType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

