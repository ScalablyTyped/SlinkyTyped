package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainResponse extends js.Object {
  /**
    * The domain Amazon Resource Name (ARN).
    */
  var DomainArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.DomainArn] = js.native
}

object UpdateDomainResponse {
  @scala.inline
  def apply(): UpdateDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDomainResponse]
  }
  @scala.inline
  implicit class UpdateDomainResponseOps[Self <: UpdateDomainResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainArn(value: DomainArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainArn")(js.undefined)
        ret
    }
  }
  
}

