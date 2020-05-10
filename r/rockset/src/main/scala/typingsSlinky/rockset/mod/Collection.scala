package typingsSlinky.rockset.mod

import typingsSlinky.rockset.rocksetStrings.CATCHINGUP
import typingsSlinky.rockset.rocksetStrings.CREATED
import typingsSlinky.rockset.rocksetStrings.DELETED
import typingsSlinky.rockset.rocksetStrings.PAUSED
import typingsSlinky.rockset.rocksetStrings.PAUSING
import typingsSlinky.rockset.rocksetStrings.READY
import typingsSlinky.rockset.rocksetStrings.RESUMING
import typingsSlinky.rockset.rocksetStrings.UNKNOWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection extends js.Object {
  // ISO-8601 date
  var created_at: js.UndefOr[String] = js.native
  // email of user who created the collection
  var created_by: js.UndefOr[String] = js.native
  // text describing the collection
  var description: js.UndefOr[String] = js.native
  // list of mappings applied on all documents in a collection
  var field_mappings: js.UndefOr[js.Array[FieldMappingV2]] = js.native
  // unique identifer for collection, can contain alphanumeric or dash characters
  var name: js.UndefOr[String] = js.native
  // number of seconds after which data is purged based on event time
  var retention_secs: js.UndefOr[Double] = js.native
  // list of sources from which collection ingests
  var sources: js.UndefOr[js.Array[Source]] = js.native
  // metrics about the collection
  var stats: js.UndefOr[CollectionStats] = js.native
  // current status of collection, one of: CREATED, READY, DELETED
  var status: js.UndefOr[CREATED | READY | PAUSED | DELETED | PAUSING | RESUMING | CATCHINGUP | UNKNOWN] = js.native
  // name of the workspace that the collection is in
  var workspace: js.UndefOr[String] = js.native
}

object Collection {
  @scala.inline
  def apply(): Collection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collection]
  }
  @scala.inline
  implicit class CollectionOps[Self <: Collection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated_by(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated_by: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_by")(js.undefined)
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
    def withField_mappings(value: js.Array[FieldMappingV2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field_mappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField_mappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field_mappings")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withRetention_secs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retention_secs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetention_secs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retention_secs")(js.undefined)
        ret
    }
    @scala.inline
    def withSources(value: js.Array[Source]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(js.undefined)
        ret
    }
    @scala.inline
    def withStats(value: CollectionStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: CREATED | READY | PAUSED | DELETED | PAUSING | RESUMING | CATCHINGUP | UNKNOWN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspace")(js.undefined)
        ret
    }
  }
  
}

