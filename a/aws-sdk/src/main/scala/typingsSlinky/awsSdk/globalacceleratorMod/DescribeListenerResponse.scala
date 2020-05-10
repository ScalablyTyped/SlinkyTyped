package typingsSlinky.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeListenerResponse extends js.Object {
  /**
    * The description of a listener.
    */
  var Listener: js.UndefOr[typingsSlinky.awsSdk.globalacceleratorMod.Listener] = js.native
}

object DescribeListenerResponse {
  @scala.inline
  def apply(): DescribeListenerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeListenerResponse]
  }
  @scala.inline
  implicit class DescribeListenerResponseOps[Self <: DescribeListenerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListener(value: Listener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Listener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Listener")(js.undefined)
        ret
    }
  }
  
}

