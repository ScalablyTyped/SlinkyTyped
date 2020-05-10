package typingsSlinky.pulumiAws.snapshotCopyMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotCopyState extends js.Object {
  /**
    * The data encryption key identifier for the snapshot.
    * * `sourceSnapshotId` The ARN of the copied snapshot.
    * * `sourceRegion` The region of the source snapshot.
    */
  val dataEncryptionKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * A description of what the snapshot is.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Whether the snapshot is encrypted.
    */
  val encrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ARN for the KMS encryption key.
    * * `sourceSnapshotId` The ARN for the snapshot to be copied.
    * * `sourceRegion` The region of the source snapshot.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
    */
  val ownerAlias: js.UndefOr[Input[String]] = js.native
  /**
    * The AWS account ID of the snapshot owner.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  val sourceRegion: js.UndefOr[Input[String]] = js.native
  val sourceSnapshotId: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags for the snapshot.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  val volumeId: js.UndefOr[Input[String]] = js.native
  /**
    * The size of the drive in GiBs.
    */
  val volumeSize: js.UndefOr[Input[Double]] = js.native
}

object SnapshotCopyState {
  @scala.inline
  def apply(): SnapshotCopyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotCopyState]
  }
  @scala.inline
  implicit class SnapshotCopyStateOps[Self <: SnapshotCopyState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataEncryptionKeyId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataEncryptionKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataEncryptionKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataEncryptionKeyId")(js.undefined)
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
    def withOwnerAlias(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerAlias")(js.undefined)
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
    def withSourceRegion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceSnapshotId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSnapshotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceSnapshotId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSnapshotId")(js.undefined)
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
    def withVolumeId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeId")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeSize(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeSize")(js.undefined)
        ret
    }
  }
  
}

