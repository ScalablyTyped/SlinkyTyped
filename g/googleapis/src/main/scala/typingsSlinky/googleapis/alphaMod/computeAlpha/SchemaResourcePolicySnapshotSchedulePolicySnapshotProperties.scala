package typingsSlinky.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specified snapshot properties for scheduled snapshots created by this
  * policy.
  */
@js.native
trait SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties extends js.Object {
  /**
    * Indication to perform a ?guest aware? snapshot.
    */
  var guestFlush: js.UndefOr[Boolean] = js.native
  /**
    * Labels to apply to scheduled snapshots. These can be later modified by
    * the setLabels method. Label values may be empty.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * GCS bucket storage location of the auto snapshot (regional or
    * multi-regional).
    */
  var storageLocations: js.UndefOr[js.Array[String]] = js.native
}

object SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties {
  @scala.inline
  def apply(): SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties]
  }
  @scala.inline
  implicit class SchemaResourcePolicySnapshotSchedulePolicySnapshotPropertiesOps[Self <: SchemaResourcePolicySnapshotSchedulePolicySnapshotProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGuestFlush(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestFlush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuestFlush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestFlush")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageLocations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageLocations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageLocations")(js.undefined)
        ret
    }
  }
  
}

