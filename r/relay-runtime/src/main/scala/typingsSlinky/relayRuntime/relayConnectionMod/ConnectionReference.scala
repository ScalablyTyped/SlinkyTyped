package typingsSlinky.relayRuntime.relayConnectionMod

import typingsSlinky.relayRuntime.readerNodeMod.ReaderLinkedField
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionReference[TEdge] extends js.Object {
  var edgesField: ReaderLinkedField = js.native
  var id: ConnectionID = js.native
  var label: String = js.native
  var variables: Variables = js.native
}

object ConnectionReference {
  @scala.inline
  def apply[TEdge](edgesField: ReaderLinkedField, id: ConnectionID, label: String, variables: Variables): ConnectionReference[TEdge] = {
    val __obj = js.Dynamic.literal(edgesField = edgesField.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionReference[TEdge]]
  }
  @scala.inline
  implicit class ConnectionReferenceOps[Self[tedge] <: ConnectionReference[tedge], TEdge] (val x: Self[TEdge]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TEdge] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TEdge]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TEdge] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TEdge] with Other]
    @scala.inline
    def withEdgesField(value: ReaderLinkedField): Self[TEdge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgesField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: ConnectionID): Self[TEdge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self[TEdge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: Variables): Self[TEdge] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

