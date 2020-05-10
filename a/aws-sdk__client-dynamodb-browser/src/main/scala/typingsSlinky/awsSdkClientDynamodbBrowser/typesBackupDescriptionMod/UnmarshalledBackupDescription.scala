package typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupDescriptionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupDetailsMod.UnmarshalledBackupDetails
import typingsSlinky.awsSdkClientDynamodbBrowser.typesSourceTableDetailsMod.UnmarshalledSourceTableDetails
import typingsSlinky.awsSdkClientDynamodbBrowser.typesSourceTableFeatureDetailsMod.UnmarshalledSourceTableFeatureDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledBackupDescription extends BackupDescription {
  /**
    * <p>Contains the details of the backup created for the table. </p>
    */
  @JSName("BackupDetails")
  var BackupDetails_UnmarshalledBackupDescription: js.UndefOr[UnmarshalledBackupDetails] = js.native
  /**
    * <p>Contains the details of the table when the backup was created. </p>
    */
  @JSName("SourceTableDetails")
  var SourceTableDetails_UnmarshalledBackupDescription: js.UndefOr[UnmarshalledSourceTableDetails] = js.native
  /**
    * <p>Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.</p>
    */
  @JSName("SourceTableFeatureDetails")
  var SourceTableFeatureDetails_UnmarshalledBackupDescription: js.UndefOr[UnmarshalledSourceTableFeatureDetails] = js.native
}

object UnmarshalledBackupDescription {
  @scala.inline
  def apply(): UnmarshalledBackupDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledBackupDescription]
  }
  @scala.inline
  implicit class UnmarshalledBackupDescriptionOps[Self <: UnmarshalledBackupDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupDetails(value: UnmarshalledBackupDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackupDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackupDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceTableDetails(value: UnmarshalledSourceTableDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceTableDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceTableDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceTableDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceTableFeatureDetails(value: UnmarshalledSourceTableFeatureDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceTableFeatureDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceTableFeatureDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceTableFeatureDetails")(js.undefined)
        ret
    }
  }
  
}

