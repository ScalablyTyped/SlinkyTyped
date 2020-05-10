package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options defining a data set within Google Cloud Datastore.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DatastoreOptions extends js.Object {
  /**
    * The kind to process.
    */
  var kind: js.UndefOr[SchemaGooglePrivacyDlpV2KindExpression] = js.native
  /**
    * A partition ID identifies a grouping of entities. The grouping is always
    * by project and namespace, however the namespace ID may be empty.
    */
  var partitionId: js.UndefOr[SchemaGooglePrivacyDlpV2PartitionId] = js.native
}

object SchemaGooglePrivacyDlpV2DatastoreOptions {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DatastoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DatastoreOptions]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DatastoreOptionsOps[Self <: SchemaGooglePrivacyDlpV2DatastoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: SchemaGooglePrivacyDlpV2KindExpression): Self = {
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
    def withPartitionId(value: SchemaGooglePrivacyDlpV2PartitionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionId")(js.undefined)
        ret
    }
  }
  
}

