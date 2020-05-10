package typingsSlinky.awsSdk.clouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpgradePublishedSchemaRequest extends js.Object {
  /**
    * The ARN of the development schema with the changes used for the upgrade.
    */
  var DevelopmentSchemaArn: Arn = js.native
  /**
    * Used for testing whether the Development schema provided is backwards compatible, or not, with the publish schema provided by the user to be upgraded. If schema compatibility fails, an exception would be thrown else the call would succeed. This parameter is optional and defaults to false.
    */
  var DryRun: js.UndefOr[Bool] = js.native
  /**
    * Identifies the minor version of the published schema that will be created. This parameter is NOT optional.
    */
  var MinorVersion: Version = js.native
  /**
    * The ARN of the published schema to be upgraded.
    */
  var PublishedSchemaArn: Arn = js.native
}

object UpgradePublishedSchemaRequest {
  @scala.inline
  def apply(DevelopmentSchemaArn: Arn, MinorVersion: Version, PublishedSchemaArn: Arn): UpgradePublishedSchemaRequest = {
    val __obj = js.Dynamic.literal(DevelopmentSchemaArn = DevelopmentSchemaArn.asInstanceOf[js.Any], MinorVersion = MinorVersion.asInstanceOf[js.Any], PublishedSchemaArn = PublishedSchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradePublishedSchemaRequest]
  }
  @scala.inline
  implicit class UpgradePublishedSchemaRequestOps[Self <: UpgradePublishedSchemaRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevelopmentSchemaArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DevelopmentSchemaArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorVersion(value: Version): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinorVersion")(value.asInstanceOf[js.Any])
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

