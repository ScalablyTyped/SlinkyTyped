package typingsSlinky.pulumiAws.windowsFileSystemMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.fsx.WindowsFileSystemSelfManagedActiveDirectory
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsFileSystemArgs extends js.Object {
  /**
    * The ID for an existing Microsoft Active Directory instance that the file system should join when it's created. Cannot be specified with `selfManagedActiveDirectory`.
    */
  val activeDirectoryId: js.UndefOr[Input[String]] = js.native
  /**
    * The number of days to retain automatic backups. Minimum of `0` and maximum of `35`. Defaults to `7`. Set to `0` to disable.
    */
  val automaticBackupRetentionDays: js.UndefOr[Input[Double]] = js.native
  /**
    * A boolean flag indicating whether tags on the file system should be copied to backups. Defaults to `false`.
    */
  val copyTagsToBackups: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The preferred time (in `HH:MM` format) to take daily automatic backups, in the UTC time zone.
    */
  val dailyAutomaticBackupStartTime: js.UndefOr[Input[String]] = js.native
  /**
    * ARN for the KMS Key to encrypt the file system at rest. Defaults to an AWS managed KMS Key.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Configuration block that Amazon FSx uses to join the Windows File Server instance to your self-managed (including on-premises) Microsoft Active Directory (AD) directory. Cannot be specified with `activeDirectoryId`. Detailed below.
    */
  val selfManagedActiveDirectory: js.UndefOr[Input[WindowsFileSystemSelfManagedActiveDirectory]] = js.native
  /**
    * When enabled, will skip the default final backup taken when the file system is deleted. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
    */
  val skipFinalBackup: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Storage capacity (GiB) of the file system. Minimum of 32 and maximum of 65536.
    */
  val storageCapacity: Input[Double] = js.native
  /**
    * A list of IDs for the subnets that the file system will be accessible from. File systems support only one subnet. The file server is also launched in that subnet's Availability Zone.
    */
  val subnetIds: Input[String] = js.native
  /**
    * A mapping of tags to assign to the file system.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Throughput (megabytes per second) of the file system in power of 2 increments. Minimum of `8` and maximum of `2048`.
    */
  val throughputCapacity: Input[Double] = js.native
  /**
    * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
    */
  val weeklyMaintenanceStartTime: js.UndefOr[Input[String]] = js.native
}

object WindowsFileSystemArgs {
  @scala.inline
  def apply(storageCapacity: Input[Double], subnetIds: Input[String], throughputCapacity: Input[Double]): WindowsFileSystemArgs = {
    val __obj = js.Dynamic.literal(storageCapacity = storageCapacity.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], throughputCapacity = throughputCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsFileSystemArgs]
  }
  @scala.inline
  implicit class WindowsFileSystemArgsOps[Self <: WindowsFileSystemArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStorageCapacity(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetIds(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThroughputCapacity(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throughputCapacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveDirectoryId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDirectoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeDirectoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomaticBackupRetentionDays(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticBackupRetentionDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomaticBackupRetentionDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticBackupRetentionDays")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyTagsToBackups(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyTagsToBackups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyTagsToBackups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyTagsToBackups")(js.undefined)
        ret
    }
    @scala.inline
    def withDailyAutomaticBackupStartTime(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dailyAutomaticBackupStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDailyAutomaticBackupStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dailyAutomaticBackupStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyId")(js.undefined)
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
    def withSelfManagedActiveDirectory(value: Input[WindowsFileSystemSelfManagedActiveDirectory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfManagedActiveDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfManagedActiveDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfManagedActiveDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipFinalBackup(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFinalBackup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipFinalBackup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipFinalBackup")(js.undefined)
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

