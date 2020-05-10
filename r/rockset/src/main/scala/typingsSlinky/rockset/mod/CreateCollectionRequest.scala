package typingsSlinky.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCollectionRequest extends js.Object {
  // text describing the collection
  var description: js.UndefOr[String] = js.native
  // configuration for event data
  var event_time_info: js.UndefOr[EventTimeInfo] = js.native
  // list of mappings
  var field_mappings: js.UndefOr[js.Array[FieldMappingV2]] = js.native
  // unique identifer for collection, can contain alphanumeric or dash characters
  var name: String = js.native
  // number of seconds after which data is purged, based on event time
  var retention_secs: js.UndefOr[Double] = js.native
  // list of sources from which to ingest data
  var sources: js.UndefOr[js.Array[Source]] = js.native
}

object CreateCollectionRequest {
  @scala.inline
  def apply(name: String): CreateCollectionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCollectionRequest]
  }
  @scala.inline
  implicit class CreateCollectionRequestOps[Self <: CreateCollectionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
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
    def withEvent_time_info(value: EventTimeInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_time_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent_time_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_time_info")(js.undefined)
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
  }
  
}

