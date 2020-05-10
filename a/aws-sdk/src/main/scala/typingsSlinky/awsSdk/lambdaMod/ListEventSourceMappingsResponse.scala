package typingsSlinky.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEventSourceMappingsResponse extends js.Object {
  /**
    * A list of event source mappings.
    */
  var EventSourceMappings: js.UndefOr[EventSourceMappingsList] = js.native
  /**
    * A pagination token that's returned when the response doesn't contain all event source mappings.
    */
  var NextMarker: js.UndefOr[String] = js.native
}

object ListEventSourceMappingsResponse {
  @scala.inline
  def apply(): ListEventSourceMappingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventSourceMappingsResponse]
  }
  @scala.inline
  implicit class ListEventSourceMappingsResponseOps[Self <: ListEventSourceMappingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventSourceMappings(value: EventSourceMappingsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSourceMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventSourceMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSourceMappings")(js.undefined)
        ret
    }
    @scala.inline
    def withNextMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextMarker")(js.undefined)
        ret
    }
  }
  
}

