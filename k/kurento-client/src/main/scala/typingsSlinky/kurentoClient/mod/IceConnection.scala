package typingsSlinky.kurentoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IceConnection extends js.Object {
  var componentId: Double = js.native
  var state: js.Any = js.native
  var streamId: String = js.native
}

object IceConnection {
  @scala.inline
  def apply(componentId: Double, state: js.Any, streamId: String): IceConnection = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IceConnection]
  }
  @scala.inline
  implicit class IceConnectionOps[Self <: IceConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

