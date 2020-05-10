package typingsSlinky.awsSdkRoute53IdNormalizerMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentifierBearer extends js.Object {
  var DelegationSetId: js.UndefOr[String] = js.native
  var HostedZoneId: js.UndefOr[String] = js.native
  var Id: js.UndefOr[String] = js.native
}

object IdentifierBearer {
  @scala.inline
  def apply(): IdentifierBearer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentifierBearer]
  }
  @scala.inline
  implicit class IdentifierBearerOps[Self <: IdentifierBearer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelegationSetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DelegationSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegationSetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DelegationSetId")(js.undefined)
        ret
    }
    @scala.inline
    def withHostedZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostedZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
  }
  
}

