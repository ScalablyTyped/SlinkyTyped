package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputLocationRef extends js.Object {
  var DestinationRefId: js.UndefOr[string] = js.native
}

object OutputLocationRef {
  @scala.inline
  def apply(): OutputLocationRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputLocationRef]
  }
  @scala.inline
  implicit class OutputLocationRefOps[Self <: OutputLocationRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationRefId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationRefId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationRefId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DestinationRefId")(js.undefined)
        ret
    }
  }
  
}

