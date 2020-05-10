package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceIpConfig extends js.Object {
  /**
    * A list of one to four Classless Inter-Domain Routing (CIDR) values. Maximum: Four CIDR values  The following Length Constraints apply to individual CIDR values in the CIDR value list. 
    */
  var Cidrs: typingsSlinky.awsSdk.sagemakerMod.Cidrs = js.native
}

object SourceIpConfig {
  @scala.inline
  def apply(Cidrs: Cidrs): SourceIpConfig = {
    val __obj = js.Dynamic.literal(Cidrs = Cidrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceIpConfig]
  }
  @scala.inline
  implicit class SourceIpConfigOps[Self <: SourceIpConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidrs(value: Cidrs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cidrs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

