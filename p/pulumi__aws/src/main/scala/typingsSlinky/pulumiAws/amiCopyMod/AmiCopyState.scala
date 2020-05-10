package typingsSlinky.pulumiAws.amiCopyMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.AmiCopyEbsBlockDevice
import typingsSlinky.pulumiAws.inputMod.ec2.AmiCopyEphemeralBlockDevice
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiCopyState extends js.Object {
  /**
    * Machine architecture for created instances. Defaults to "x8664".
    */
  val architecture: js.UndefOr[Input[String]] = js.native
  /**
    * A longer, human-readable description for the AMI.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Nested block describing an EBS block device that should be
    * attached to created instances. The structure of this block is described below.
    */
  val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[AmiCopyEbsBlockDevice]]]] = js.native
  /**
    * Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
    */
  val enaSupport: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies whether the destination snapshots of the copied image should be encrypted. Defaults to `false`
    */
  val encrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Nested block describing an ephemeral block device that
    * should be attached to created instances. The structure of this block is described below.
    */
  val ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[AmiCopyEphemeralBlockDevice]]]] = js.native
  /**
    * Path to an S3 object containing an image manifest, e.g. created
    * by the `ec2-upload-bundle` command in the EC2 command line tools.
    */
  val imageLocation: js.UndefOr[Input[String]] = js.native
  /**
    * The id of the kernel image (AKI) that will be used as the paravirtual
    * kernel in created instances.
    */
  val kernelId: js.UndefOr[Input[String]] = js.native
  /**
    * The full ARN of the KMS Key to use when encrypting the snapshots of an image during a copy operation. If not specified, then the default AWS KMS Key will be used
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  val manageEbsSnapshots: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A region-unique name for the AMI.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The id of an initrd image (ARI) that will be used when booting the
    * created instances.
    */
  val ramdiskId: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
    */
  val rootDeviceName: js.UndefOr[Input[String]] = js.native
  val rootSnapshotId: js.UndefOr[Input[String]] = js.native
  /**
    * The id of the AMI to copy. This id must be valid in the region
    * given by `sourceAmiRegion`.
    */
  val sourceAmiId: js.UndefOr[Input[String]] = js.native
  /**
    * The region from which the AMI will be copied. This may be the
    * same as the AWS provider region in order to create a copy within the same region.
    */
  val sourceAmiRegion: js.UndefOr[Input[String]] = js.native
  /**
    * When set to "simple" (the default), enables enhanced networking
    * for created instances. No other value is supported at this time.
    */
  val sriovNetSupport: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Keyword to choose what virtualization mode created instances
    * will use. Can be either "paravirtual" (the default) or "hvm". The choice of virtualization type
    * changes the set of further arguments that are required, as described below.
    */
  val virtualizationType: js.UndefOr[Input[String]] = js.native
}

object AmiCopyState {
  @scala.inline
  def apply(): AmiCopyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmiCopyState]
  }
  @scala.inline
  implicit class AmiCopyStateOps[Self <: AmiCopyState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchitecture(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("architecture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchitecture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("architecture")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEbsBlockDevices(value: Input[js.Array[Input[AmiCopyEbsBlockDevice]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsBlockDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEbsBlockDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ebsBlockDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withEnaSupport(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enaSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnaSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enaSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withEncrypted(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withEphemeralBlockDevices(value: Input[js.Array[Input[AmiCopyEphemeralBlockDevice]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralBlockDevices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEphemeralBlockDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ephemeralBlockDevices")(js.undefined)
        ret
    }
    @scala.inline
    def withImageLocation(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withKernelId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelId")(js.undefined)
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
    def withManageEbsSnapshots(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manageEbsSnapshots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManageEbsSnapshots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manageEbsSnapshots")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRamdiskId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ramdiskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRamdiskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ramdiskId")(js.undefined)
        ret
    }
    @scala.inline
    def withRootDeviceName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDeviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootDeviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withRootSnapshotId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootSnapshotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootSnapshotId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootSnapshotId")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceAmiId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAmiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAmiId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAmiId")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceAmiRegion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAmiRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceAmiRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceAmiRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withSriovNetSupport(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sriovNetSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSriovNetSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sriovNetSupport")(js.undefined)
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
    def withVirtualizationType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualizationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualizationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualizationType")(js.undefined)
        ret
    }
  }
  
}

