package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Proto for all phishing alerts with common payload. Supported types are any
  * of the following:  * User reported phishing * User reported spam spike *
  * Suspicious message reported * Phishing reclassification * Malware
  * reclassification
  */
@js.native
trait SchemaMailPhishing extends js.Object {
  /**
    * The domain ID.
    */
  var domainId: js.UndefOr[SchemaDomainId] = js.native
  /**
    * If `true`, the email originated from within the organization.
    */
  var isInternal: js.UndefOr[Boolean] = js.native
  /**
    * The entity whose actions triggered a Gmail phishing alert.
    */
  var maliciousEntity: js.UndefOr[SchemaMaliciousEntity] = js.native
  /**
    * The list of messages contained by this alert.
    */
  var messages: js.UndefOr[js.Array[SchemaGmailMessageInfo]] = js.native
}

object SchemaMailPhishing {
  @scala.inline
  def apply(): SchemaMailPhishing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMailPhishing]
  }
  @scala.inline
  implicit class SchemaMailPhishingOps[Self <: SchemaMailPhishing] (val x: Self) extends AnyVal {
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
    def withIsInternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInternal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInternal")(js.undefined)
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
  }
  
}

