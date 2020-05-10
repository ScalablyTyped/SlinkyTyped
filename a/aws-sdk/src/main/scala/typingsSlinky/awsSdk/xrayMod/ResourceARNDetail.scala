package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceARNDetail extends js.Object {
  /**
    * The ARN of a corresponding resource.
    */
  var ARN: js.UndefOr[String] = js.native
}

object ResourceARNDetail {
  @scala.inline
  def apply(): ResourceARNDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceARNDetail]
  }
  @scala.inline
  implicit class ResourceARNDetailOps[Self <: ResourceARNDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(js.undefined)
        ret
    }
  }
  
}

