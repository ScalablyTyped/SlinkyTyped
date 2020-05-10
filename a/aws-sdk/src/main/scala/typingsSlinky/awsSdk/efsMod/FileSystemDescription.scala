package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemDescription extends js.Object {
  /**
    * The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z).
    */
  var CreationTime: js.Date = js.native
  /**
    * The opaque string specified in the request.
    */
  var CreationToken: typingsSlinky.awsSdk.efsMod.CreationToken = js.native
  /**
    * A Boolean value that, if true, indicates that the file system is encrypted.
    */
  var Encrypted: js.UndefOr[typingsSlinky.awsSdk.efsMod.Encrypted] = js.native
  /**
    * The ID of the file system, assigned by Amazon EFS.
    */
  var FileSystemId: typingsSlinky.awsSdk.efsMod.FileSystemId = js.native
  /**
    * The ID of an AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the encrypted file system.
    */
  var KmsKeyId: js.UndefOr[typingsSlinky.awsSdk.efsMod.KmsKeyId] = js.native
  /**
    * The lifecycle phase of the file system.
    */
  var LifeCycleState: typingsSlinky.awsSdk.efsMod.LifeCycleState = js.native
  /**
    * You can add tags to a file system, including a Name tag. For more information, see CreateFileSystem. If the file system has a Name tag, Amazon EFS returns the value in this field. 
    */
  var Name: js.UndefOr[TagValue] = js.native
  /**
    * The current number of mount targets that the file system has. For more information, see CreateMountTarget.
    */
  var NumberOfMountTargets: MountTargetCount = js.native
  /**
    * The AWS account that created the file system. If the file system was created by an IAM user, the parent account to which the user belongs is the owner.
    */
  var OwnerId: AwsAccountId = js.native
  /**
    * The performance mode of the file system.
    */
  var PerformanceMode: typingsSlinky.awsSdk.efsMod.PerformanceMode = js.native
  /**
    * The throughput, measured in MiB/s, that you want to provision for a file system. Valid values are 1-1024. Required if ThroughputMode is set to provisioned. The limit on throughput is 1024 MiB/s. You can get these limits increased by contacting AWS Support. For more information, see Amazon EFS Limits That You Can Increase in the Amazon EFS User Guide. 
    */
  var ProvisionedThroughputInMibps: js.UndefOr[typingsSlinky.awsSdk.efsMod.ProvisionedThroughputInMibps] = js.native
  /**
    * The latest known metered size (in bytes) of data stored in the file system, in its Value field, and the time at which that size was determined in its Timestamp field. The Timestamp value is the integer number of seconds since 1970-01-01T00:00:00Z. The SizeInBytes value doesn't represent the size of a consistent snapshot of the file system, but it is eventually consistent when there are no writes to the file system. That is, SizeInBytes represents actual size only if the file system is not modified for a period longer than a couple of hours. Otherwise, the value is not the exact size that the file system was at any point in time. 
    */
  var SizeInBytes: FileSystemSize = js.native
  /**
    * The tags associated with the file system, presented as an array of Tag objects.
    */
  var Tags: typingsSlinky.awsSdk.efsMod.Tags = js.native
  /**
    * The throughput mode for a file system. There are two throughput modes to choose from for your file system: bursting and provisioned. If you set ThroughputMode to provisioned, you must also set a value for ProvisionedThroughPutInMibps. You can decrease your file system's throughput in Provisioned Throughput mode or change between the throughput modes as long as it’s been more than 24 hours since the last decrease or throughput mode change. 
    */
  var ThroughputMode: js.UndefOr[typingsSlinky.awsSdk.efsMod.ThroughputMode] = js.native
}

object FileSystemDescription {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    CreationToken: CreationToken,
    FileSystemId: FileSystemId,
    LifeCycleState: LifeCycleState,
    NumberOfMountTargets: MountTargetCount,
    OwnerId: AwsAccountId,
    PerformanceMode: PerformanceMode,
    SizeInBytes: FileSystemSize,
    Tags: Tags
  ): FileSystemDescription = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], CreationToken = CreationToken.asInstanceOf[js.Any], FileSystemId = FileSystemId.asInstanceOf[js.Any], LifeCycleState = LifeCycleState.asInstanceOf[js.Any], NumberOfMountTargets = NumberOfMountTargets.asInstanceOf[js.Any], OwnerId = OwnerId.asInstanceOf[js.Any], PerformanceMode = PerformanceMode.asInstanceOf[js.Any], SizeInBytes = SizeInBytes.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemDescription]
  }
  @scala.inline
  implicit class FileSystemDescriptionOps[Self <: FileSystemDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationToken(value: CreationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSystemId(value: FileSystemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLifeCycleState(value: LifeCycleState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifeCycleState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfMountTargets(value: MountTargetCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfMountTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerId(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerformanceMode(value: PerformanceMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PerformanceMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeInBytes(value: FileSystemSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncrypted(value: Encrypted): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyId(value: KmsKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KmsKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: TagValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedThroughputInMibps(value: ProvisionedThroughputInMibps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedThroughputInMibps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedThroughputInMibps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedThroughputInMibps")(js.undefined)
        ret
    }
    @scala.inline
    def withThroughputMode(value: ThroughputMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThroughputMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThroughputMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThroughputMode")(js.undefined)
        ret
    }
  }
  
}

