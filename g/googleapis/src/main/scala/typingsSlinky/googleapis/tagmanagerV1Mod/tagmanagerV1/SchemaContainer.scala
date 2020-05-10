package typingsSlinky.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Container.
  */
@js.native
trait SchemaContainer extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The Container ID uniquely identifies the GTM Container.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * Optional list of domain names associated with the Container.
    */
  var domainName: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of enabled built-in variables. Valid values include: pageUrl,
    * pageHostname, pagePath, referrer, event, clickElement, clickClasses,
    * clickId, clickTarget, clickUrl, clickText, formElement, formClasses,
    * formId, formTarget, formUrl, formText, errorMessage, errorUrl, errorLine,
    * newHistoryFragment, oldHistoryFragment, newHistoryState, oldHistoryState,
    * historySource, containerVersion, debugMode, randomNumber, containerId.
    */
  var enabledBuiltInVariable: js.UndefOr[js.Array[String]] = js.native
  /**
    * The fingerprint of the GTM Container as computed at storage time. This
    * value is recomputed whenever the account is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * Container display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Container Notes.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * Container Public ID.
    */
  var publicId: js.UndefOr[String] = js.native
  /**
    * Container Country ID.
    */
  var timeZoneCountryId: js.UndefOr[String] = js.native
  /**
    * Container Time Zone ID.
    */
  var timeZoneId: js.UndefOr[String] = js.native
  /**
    * List of Usage Contexts for the Container. Valid values include: web,
    * android, ios.
    */
  var usageContext: js.UndefOr[js.Array[String]] = js.native
}

object SchemaContainer {
  @scala.inline
  def apply(): SchemaContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainer]
  }
  @scala.inline
  implicit class SchemaContainerOps[Self <: SchemaContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(js.undefined)
        ret
    }
    @scala.inline
    def withDomainName(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledBuiltInVariable(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledBuiltInVariable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledBuiltInVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledBuiltInVariable")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicId")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZoneCountryId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneCountryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZoneCountryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneCountryId")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withUsageContext(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsageContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usageContext")(js.undefined)
        ret
    }
  }
  
}

