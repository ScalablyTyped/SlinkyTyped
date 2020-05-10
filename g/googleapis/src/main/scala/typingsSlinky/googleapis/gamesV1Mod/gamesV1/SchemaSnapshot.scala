package typingsSlinky.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for an snapshot object.
  */
@js.native
trait SchemaSnapshot extends js.Object {
  /**
    * The cover image of this snapshot. May be absent if there is no image.
    */
  var coverImage: js.UndefOr[SchemaSnapshotImage] = js.native
  /**
    * The description of this snapshot.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The ID of the file underlying this snapshot in the Drive API. Only
    * present if the snapshot is a view on a Drive file and the file is owned
    * by the caller.
    */
  var driveId: js.UndefOr[String] = js.native
  /**
    * The duration associated with this snapshot, in millis.
    */
  var durationMillis: js.UndefOr[String] = js.native
  /**
    * The ID of the snapshot.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#snapshot.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The timestamp (in millis since Unix epoch) of the last modification to
    * this snapshot.
    */
  var lastModifiedMillis: js.UndefOr[String] = js.native
  /**
    * The progress value (64-bit integer set by developer) associated with this
    * snapshot.
    */
  var progressValue: js.UndefOr[String] = js.native
  /**
    * The title of this snapshot.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The type of this snapshot. Possible values are:   - &quot;SAVE_GAME&quot;
    * - A snapshot representing a save game.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The unique name provided when the snapshot was created.
    */
  var uniqueName: js.UndefOr[String] = js.native
}

object SchemaSnapshot {
  @scala.inline
  def apply(): SchemaSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnapshot]
  }
  @scala.inline
  implicit class SchemaSnapshotOps[Self <: SchemaSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverImage(value: SchemaSnapshotImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverImage")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
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
    def withDriveId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDriveId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driveId")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedMillis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUniqueName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniqueName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueName")(js.undefined)
        ret
    }
  }
  
}

