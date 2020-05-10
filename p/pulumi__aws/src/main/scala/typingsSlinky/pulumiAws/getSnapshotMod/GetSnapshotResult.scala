package typingsSlinky.pulumiAws.getSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ebs.GetSnapshotFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotResult extends js.Object {
  /**
    * The data encryption key identifier for the snapshot.
    */
  val dataEncryptionKeyId: String = js.native
  /**
    * A description for the snapshot
    */
  val description: String = js.native
  /**
    * Whether the snapshot is encrypted.
    */
  val encrypted: Boolean = js.native
  val filters: js.UndefOr[js.Array[GetSnapshotFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: String = js.native
  val mostRecent: js.UndefOr[Boolean] = js.native
  /**
    * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
    */
  val ownerAlias: String = js.native
  /**
    * The AWS account ID of the EBS snapshot owner.
    */
  val ownerId: String = js.native
  val owners: js.UndefOr[js.Array[String]] = js.native
  val restorableByUserIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The snapshot ID (e.g. snap-59fcb34e).
    */
  val snapshotId: String = js.native
  val snapshotIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The snapshot state.
    */
  val state: String = js.native
  /**
    * A mapping of tags for the resource.
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * The volume ID (e.g. vol-59fcb34e).
    */
  val volumeId: String = js.native
  /**
    * The size of the drive in GiBs.
    */
  val volumeSize: Double = js.native
}

object GetSnapshotResult {
  @scala.inline
  def apply(
    dataEncryptionKeyId: String,
    description: String,
    encrypted: Boolean,
    id: String,
    kmsKeyId: String,
    ownerAlias: String,
    ownerId: String,
    snapshotId: String,
    state: String,
    tags: StringDictionary[js.Any],
    volumeId: String,
    volumeSize: Double
  ): GetSnapshotResult = {
    val __obj = js.Dynamic.literal(dataEncryptionKeyId = dataEncryptionKeyId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], ownerAlias = ownerAlias.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotResult]
  }
  @scala.inline
  implicit class GetSnapshotResultOps[Self <: GetSnapshotResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataEncryptionKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataEncryptionKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKmsKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshotId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumeSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetSnapshotFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withMostRecent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostRecent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMostRecent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostRecent")(js.undefined)
        ret
    }
    @scala.inline
    def withOwners(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(js.undefined)
        ret
    }
    @scala.inline
    def withRestorableByUserIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restorableByUserIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestorableByUserIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restorableByUserIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotIds")(js.undefined)
        ret
    }
  }
  
}

