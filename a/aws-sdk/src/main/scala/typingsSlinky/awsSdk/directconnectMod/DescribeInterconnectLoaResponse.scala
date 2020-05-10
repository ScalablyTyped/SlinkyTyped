package typingsSlinky.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInterconnectLoaResponse extends js.Object {
  /**
    * The Letter of Authorization - Connecting Facility Assignment (LOA-CFA).
    */
  var loa: js.UndefOr[Loa] = js.native
}

object DescribeInterconnectLoaResponse {
  @scala.inline
  def apply(): DescribeInterconnectLoaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInterconnectLoaResponse]
  }
  @scala.inline
  implicit class DescribeInterconnectLoaResponseOps[Self <: DescribeInterconnectLoaResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoa(value: Loa): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loa")(js.undefined)
        ret
    }
  }
  
}

