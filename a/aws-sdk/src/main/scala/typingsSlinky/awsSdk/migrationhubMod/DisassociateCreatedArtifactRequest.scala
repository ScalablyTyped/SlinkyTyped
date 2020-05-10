package typingsSlinky.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateCreatedArtifactRequest extends js.Object {
  /**
    * An ARN of the AWS resource related to the migration (e.g., AMI, EC2 instance, RDS instance, etc.)
    */
  var CreatedArtifactName: typingsSlinky.awsSdk.migrationhubMod.CreatedArtifactName = js.native
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.DryRun] = js.native
  /**
    * Unique identifier that references the migration task to be disassociated with the artifact. Do not store personal data in this field. 
    */
  var MigrationTaskName: typingsSlinky.awsSdk.migrationhubMod.MigrationTaskName = js.native
  /**
    * The name of the ProgressUpdateStream. 
    */
  var ProgressUpdateStream: typingsSlinky.awsSdk.migrationhubMod.ProgressUpdateStream = js.native
}

object DisassociateCreatedArtifactRequest {
  @scala.inline
  def apply(
    CreatedArtifactName: CreatedArtifactName,
    MigrationTaskName: MigrationTaskName,
    ProgressUpdateStream: ProgressUpdateStream
  ): DisassociateCreatedArtifactRequest = {
    val __obj = js.Dynamic.literal(CreatedArtifactName = CreatedArtifactName.asInstanceOf[js.Any], MigrationTaskName = MigrationTaskName.asInstanceOf[js.Any], ProgressUpdateStream = ProgressUpdateStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateCreatedArtifactRequest]
  }
  @scala.inline
  implicit class DisassociateCreatedArtifactRequestOps[Self <: DisassociateCreatedArtifactRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedArtifactName(value: CreatedArtifactName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedArtifactName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMigrationTaskName(value: MigrationTaskName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MigrationTaskName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgressUpdateStream(value: ProgressUpdateStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProgressUpdateStream")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDryRun(value: DryRun): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDryRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DryRun")(js.undefined)
        ret
    }
  }
  
}

