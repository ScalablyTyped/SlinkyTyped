package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Alert for setting the domain or IP that malicious email comes from as
  * whitelisted domain or IP in Gmail advanced settings.
  */
@js.native
trait SchemaBadWhitelist extends js.Object {
  /**
    * The domain ID.
    */
  var domainId: js.UndefOr[SchemaDomainId] = js.native
  /**
    * The entity whose actions triggered a Gmail phishing alert.
    */
  var maliciousEntity: js.UndefOr[SchemaMaliciousEntity] = js.native
  /**
    * The list of messages contained by this alert.
    */
  var messages: js.UndefOr[js.Array[SchemaGmailMessageInfo]] = js.native
  /**
    * The source IP address of the malicious email, for example, `127.0.0.1`.
    */
  var sourceIp: js.UndefOr[String] = js.native
}

object SchemaBadWhitelist {
  @scala.inline
  def apply(): SchemaBadWhitelist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBadWhitelist]
  }
  @scala.inline
  implicit class SchemaBadWhitelistOps[Self <: SchemaBadWhitelist] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainId(value: SchemaDomainId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainId")(js.undefined)
        ret
    }
    @scala.inline
    def withMaliciousEntity(value: SchemaMaliciousEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maliciousEntity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaliciousEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maliciousEntity")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: js.Array[SchemaGmailMessageInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceIp")(js.undefined)
        ret
    }
  }
  
}

