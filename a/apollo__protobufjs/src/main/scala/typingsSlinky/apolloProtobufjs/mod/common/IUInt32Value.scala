package typingsSlinky.apolloProtobufjs.mod.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.UInt32Value message. */
@js.native
trait IUInt32Value extends js.Object {
  var value: js.UndefOr[Double] = js.native
}

object IUInt32Value {
  @scala.inline
  def apply(): IUInt32Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUInt32Value]
  }
  @scala.inline
  implicit class IUInt32ValueOps[Self <: IUInt32Value] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: Double): Self = {
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

