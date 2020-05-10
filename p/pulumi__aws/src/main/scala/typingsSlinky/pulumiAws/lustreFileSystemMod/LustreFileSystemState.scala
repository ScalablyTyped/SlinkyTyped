package typingsSlinky.pulumiAws.lustreFileSystemMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LustreFileSystemState extends js.Object {
  /**
    * Amazon Resource Name of the file system.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * DNS name for the file system, e.g. `fs-12345678.fsx.us-west-2.amazonaws.com`
    */
  val dnsName: js.UndefOr[Input[String]] = js.native
  /**
    * S3 URI (with optional prefix) where the root of your Amazon FSx file system is exported. Can only be specified with `importPath` argument and the path must use the same Amazon S3 bucket as specified in `importPath`. Set equal to `importPath` to overwrite files on export. Defaults to `s3://{IMPORT BUCKET}/FSxLustre{CREATION TIMESTAMP}`.
    */
  val exportPath: js.UndefOr[Input[String]] = js.native
  /**
    * S3 URI (with optional prefix) that you're using as the data repository for your FSx for Lustre file system. For example, `s3://example-bucket/optional-prefix/`.
    */
  val importPath: js.UndefOr[Input[String]] = js.native
  /**
    * For files imported from a data repository, this value determines the stripe count and maximum amount of data per file (in MiB) stored on a single physical disk. Can only be specified with `importPath` argument. Defaults to `1024`. Minimum of `1` and maximum of `512000`.
    */
  val importedFileChunkSize: js.UndefOr[Input[Double]] = js.native
  /**
    * Set of Elastic Network Interface identifiers from which the file system is accessible.
    */
  val networkInterfaceIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * AWS account identifier that created the file system.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  /**
    * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The storage capacity (GiB) of the file system. Minimum of `1200`. Storage capacity is provisioned in increments of 3,600 GiB.
    */
  val storageCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * A list of IDs for the subnets that the file system will be accessible from. File systems currently support only one subnet. The file server is also launched in that subnet's Availability Zone.
    */
  val subnetIds: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the file system.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Identifier of the Virtual Private Cloud for the file system.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
  /**
    * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
    */
  val weeklyMaintenanceStartTime: js.UndefOr[Input[String]] = js.native
}

object LustreFileSystemState {
  @scala.inline
  def apply(): LustreFileSystemState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LustreFileSystemState]
  }
  @scala.inline
  implicit class LustreFileSystemStateOps[Self <: LustreFileSystemState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsName")(js.undefined)
        ret
    }
    @scala.inline
    def withExportPath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportPath")(js.undefined)
        ret
    }
    @scala.inline
    def withImportPath(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importPath")(js.undefined)
        ret
    }
    @scala.inline
    def withImportedFileChunkSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importedFileChunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportedFileChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importedFileChunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaceIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceIds")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageCapacity(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageCapacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageCapacity")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetIds(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(js.undefined)
        ret
    }
    @scala.inline
    def withWeeklyMaintenanceStartTime(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeklyMaintenanceStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeeklyMaintenanceStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weeklyMaintenanceStartTime")(js.undefined)
        ret
    }
  }
  
}

