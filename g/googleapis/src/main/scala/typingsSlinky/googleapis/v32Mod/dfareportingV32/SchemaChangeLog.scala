package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a change that a user has made to a resource.
  */
@js.native
trait SchemaChangeLog extends js.Object {
  /**
    * Account ID of the modified object.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Action which caused the change.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * Time when the object was modified.
    */
  var changeTime: js.UndefOr[String] = js.native
  /**
    * Field name of the object which changed.
    */
  var fieldName: js.UndefOr[String] = js.native
  /**
    * ID of this change log.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#changeLog&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * New value of the object field.
    */
  var newValue: js.UndefOr[String] = js.native
  /**
    * ID of the object of this change log. The object could be a campaign,
    * placement, ad, or other type.
    */
  var objectId: js.UndefOr[String] = js.native
  /**
    * Object type of the change log.
    */
  var objectType: js.UndefOr[String] = js.native
  /**
    * Old value of the object field.
    */
  var oldValue: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of the modified object.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Transaction ID of this change log. When a single API call results in many
    * changes, each change will have a separate ID in the change log but will
    * share the same transactionId.
    */
  var transactionId: js.UndefOr[String] = js.native
  /**
    * ID of the user who modified the object.
    */
  var userProfileId: js.UndefOr[String] = js.native
  /**
    * User profile name of the user who modified the object.
    */
  var userProfileName: js.UndefOr[String] = js.native
}

object SchemaChangeLog {
  @scala.inline
  def apply(): SchemaChangeLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChangeLog]
  }
  @scala.inline
  implicit class SchemaChangeLogOps[Self <: SchemaChangeLog] (val x: Self) extends AnyVal {
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
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withNewValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectType")(js.undefined)
        ret
    }
    @scala.inline
    def withOldValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(js.undefined)
        ret
    }
    @scala.inline
    def withSubaccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subaccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubaccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subaccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionId")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProfileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProfileId")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProfileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProfileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProfileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProfileName")(js.undefined)
        ret
    }
  }
  
}

