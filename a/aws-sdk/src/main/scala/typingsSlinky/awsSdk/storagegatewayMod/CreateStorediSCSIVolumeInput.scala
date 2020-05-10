package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStorediSCSIVolumeInput extends js.Object {
  /**
    * The unique identifier for the gateway local disk that is configured as a stored volume. Use ListLocalDisks to list disk IDs for a gateway.
    */
  var DiskId: typingsSlinky.awsSdk.storagegatewayMod.DiskId = js.native
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
  /**
    * True to use Amazon S3 server side encryption with your own AWS KMS key, or false to use a key managed by Amazon S3. Optional.
    */
  var KMSEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the KMS key used for Amazon S3 server side encryption. This value can only be set when KMSEncrypted is true. Optional.
    */
  var KMSKey: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.KMSKey] = js.native
  /**
    * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted. Use DescribeGatewayInformation to get a list of the network interfaces available on a gateway.  Valid Values: A valid IP address.
    */
  var NetworkInterfaceId: typingsSlinky.awsSdk.storagegatewayMod.NetworkInterfaceId = js.native
  /**
    * Specify this field as true if you want to preserve the data on the local disk. Otherwise, specifying this field as false creates an empty volume.  Valid Values: true, false
    */
  var PreserveExistingData: scala.Boolean = js.native
  /**
    * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new stored volume. Specify this field if you want to create the iSCSI storage volume from a snapshot otherwise do not include this field. To list snapshots for your account use DescribeSnapshots in the Amazon Elastic Compute Cloud API Reference.
    */
  var SnapshotId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.SnapshotId] = js.native
  /**
    * A list of up to 50 tags that can be assigned to a stored volume. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.Tags] = js.native
  /**
    * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN. For example, specifying TargetName as myvolume results in the target ARN of arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The target name must be unique across all volumes on a gateway. If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new target name.
    */
  var TargetName: typingsSlinky.awsSdk.storagegatewayMod.TargetName = js.native
}

object CreateStorediSCSIVolumeInput {
  @scala.inline
  def apply(
    DiskId: DiskId,
    GatewayARN: GatewayARN,
    NetworkInterfaceId: NetworkInterfaceId,
    PreserveExistingData: scala.Boolean,
    TargetName: TargetName
  ): CreateStorediSCSIVolumeInput = {
    val __obj = js.Dynamic.literal(DiskId = DiskId.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any], NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any], PreserveExistingData = PreserveExistingData.asInstanceOf[js.Any], TargetName = TargetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStorediSCSIVolumeInput]
  }
  @scala.inline
  implicit class CreateStorediSCSIVolumeInputOps[Self <: CreateStorediSCSIVolumeInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskId(value: DiskId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGatewayARN(value: GatewayARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkInterfaceId(value: NetworkInterfaceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreserveExistingData(value: scala.Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PreserveExistingData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetName(value: TargetName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKMSEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSEncrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKMSEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSEncrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withKMSKey(value: KMSKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKMSKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KMSKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotId(value: SnapshotId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotId")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

