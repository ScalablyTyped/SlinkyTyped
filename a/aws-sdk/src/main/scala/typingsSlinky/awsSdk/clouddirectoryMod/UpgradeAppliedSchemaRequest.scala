package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpgradeAppliedSchemaRequest extends js.Object {
  /**
    * The ARN for the directory to which the upgraded schema will be applied.
    */
  var DirectoryArn: Arn = js.native
  /**
    * Used for testing whether the major version schemas are backward compatible or not. If schema compatibility fails, an exception would be thrown else the call would succeed but no changes will be saved. This parameter is optional.
    */
  var DryRun: js.UndefOr[Bool] = js.native
  /**
    * The revision of the published schema to upgrade the directory to.
    */
  var PublishedSchemaArn: Arn = js.native
}

object UpgradeAppliedSchemaRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, PublishedSchemaArn: Arn): UpgradeAppliedSchemaRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], PublishedSchemaArn = PublishedSchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeAppliedSchemaRequest]
  }
  @scala.inline
  implicit class UpgradeAppliedSchemaRequestOps[Self <: UpgradeAppliedSchemaRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublishedSchemaArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublishedSchemaArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDryRun(value: Bool): Self = {
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

