package typingsSlinky.prosemirrorCollab

import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.Transaction
import typingsSlinky.prosemirrorTransform.mod.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrigins[S /* <: Schema[_, _] */] extends js.Object {
  var clientID: Double | String
  var origins: js.Array[Transaction[S]]
  var steps: js.Array[Step[S]]
  var version: Double
}

object AnonOrigins {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](
    clientID: Double | String,
    origins: js.Array[Transaction[S]],
    steps: js.Array[Step[S]],
    version: Double
  ): AnonOrigins[S] = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], origins = origins.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOrigins[S]]
  }
}

