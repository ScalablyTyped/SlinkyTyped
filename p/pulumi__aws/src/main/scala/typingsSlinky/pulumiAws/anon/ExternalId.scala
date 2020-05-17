package typingsSlinky.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalId extends js.Object {
  var externalId: js.UndefOr[String] = js.native
  var policy: js.UndefOr[String] = js.native
  var roleArn: js.UndefOr[String] = js.native
  var sessionName: js.UndefOr[String] = js.native
}

object ExternalId {
  @scala.inline
  def apply(): ExternalId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalId]
  }
  @scala.inline
  implicit class ExternalIdOps[Self <: ExternalId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalId")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionName")(js.undefined)
        ret
    }
  }
  
}

