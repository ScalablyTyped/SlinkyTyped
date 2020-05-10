package typingsSlinky.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiscoveredSchemaRequest extends js.Object {
  /**
    * An array of strings that
    */
  var Events: listOfGetDiscoveredSchemaVersionItemInput = js.native
  /**
    * The type of event.
    */
  var Type: typingsSlinky.awsSdk.schemasMod.Type = js.native
}

object GetDiscoveredSchemaRequest {
  @scala.inline
  def apply(Events: listOfGetDiscoveredSchemaVersionItemInput, Type: Type): GetDiscoveredSchemaRequest = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDiscoveredSchemaRequest]
  }
  @scala.inline
  implicit class GetDiscoveredSchemaRequestOps[Self <: GetDiscoveredSchemaRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvents(value: listOfGetDiscoveredSchemaVersionItemInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

