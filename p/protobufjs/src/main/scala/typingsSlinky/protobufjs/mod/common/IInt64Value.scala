package typingsSlinky.protobufjs.mod.common

import typingsSlinky.protobufjs.mod.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.Int64Value message. */
@js.native
trait IInt64Value extends js.Object {
  var value: js.UndefOr[Double | Long] = js.native
}

object IInt64Value {
  @scala.inline
  def apply(): IInt64Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInt64Value]
  }
  @scala.inline
  implicit class IInt64ValueOps[Self <: IInt64Value] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: Double | Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

