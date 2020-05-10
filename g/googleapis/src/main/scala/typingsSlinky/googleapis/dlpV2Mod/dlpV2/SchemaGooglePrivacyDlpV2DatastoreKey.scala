package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Record key for a finding in Cloud Datastore.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DatastoreKey extends js.Object {
  /**
    * Datastore entity key.
    */
  var entityKey: js.UndefOr[SchemaGooglePrivacyDlpV2Key] = js.native
}

object SchemaGooglePrivacyDlpV2DatastoreKey {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DatastoreKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DatastoreKey]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DatastoreKeyOps[Self <: SchemaGooglePrivacyDlpV2DatastoreKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityKey(value: SchemaGooglePrivacyDlpV2Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityKey")(js.undefined)
        ret
    }
  }
  
}

