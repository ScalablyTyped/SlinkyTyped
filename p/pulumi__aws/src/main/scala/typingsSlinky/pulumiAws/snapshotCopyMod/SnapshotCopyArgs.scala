package typingsSlinky.pulumiAws.snapshotCopyMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotCopyArgs extends js.Object {
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
  val sourceRegion: Input[String] = js.native
  val sourceSnapshotId: Input[String] = js.native
  /**
    * A mapping of tags for the snapshot.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object SnapshotCopyArgs {
  @scala.inline
  def apply(sourceRegion: Input[String], sourceSnapshotId: Input[String]): SnapshotCopyArgs = {
    val __obj = js.Dynamic.literal(sourceRegion = sourceRegion.asInstanceOf[js.Any], sourceSnapshotId = sourceSnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCopyArgs]
  }
  @scala.inline
  implicit class SnapshotCopyArgsOps[Self <: SnapshotCopyArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourceRegion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceSnapshotId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceSnapshotId")(value.asInstanceOf[js.Any])
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
  }
  
}

