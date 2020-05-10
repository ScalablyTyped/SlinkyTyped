package typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupDescriptionMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupDetailsMod.BackupDetails
import typingsSlinky.awsSdkClientDynamodbBrowser.typesSourceTableDetailsMod.SourceTableDetails
import typingsSlinky.awsSdkClientDynamodbBrowser.typesSourceTableFeatureDetailsMod.SourceTableFeatureDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupDescription extends js.Object {
  /**
    * <p>Contains the details of the backup created for the table. </p>
    */
  var BackupDetails: js.UndefOr[typingsSlinky.awsSdkClientDynamodbBrowser.typesBackupDetailsMod.BackupDetails] = js.native
  /**
    * <p>Contains the details of the table when the backup was created. </p>
    */
  var SourceTableDetails: js.UndefOr[
    typingsSlinky.awsSdkClientDynamodbBrowser.typesSourceTableDetailsMod.SourceTableDetails
  ] = js.native
  /**
    * <p>Contains the details of the features enabled on the table when the backup was created. For example, LSIs, GSIs, streams, TTL.</p>
    */
  var SourceTableFeatureDetails: js.UndefOr[
    typingsSlinky.awsSdkClientDynamodbBrowser.typesSourceTableFeatureDetailsMod.SourceTableFeatureDetails
  ] = js.native
}

object BackupDescription {
  @scala.inline
  def apply(): BackupDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupDescription]
  }
  @scala.inline
  implicit class BackupDescriptionOps[Self <: BackupDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupDetails(value: BackupDetails): Self = {
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
    def withSourceTableDetails(value: SourceTableDetails): Self = {
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
    def withSourceTableFeatureDetails(value: SourceTableFeatureDetails): Self = {
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

