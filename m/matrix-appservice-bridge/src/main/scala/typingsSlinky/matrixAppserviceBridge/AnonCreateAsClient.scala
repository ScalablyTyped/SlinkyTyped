package typingsSlinky.matrixAppserviceBridge

import typingsSlinky.matrixAppserviceBridge.mod.CreateRoomOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCreateAsClient extends js.Object {
  var createAsClient: Boolean = js.native
  var options: CreateRoomOptions = js.native
}

object AnonCreateAsClient {
  @scala.inline
  def apply(createAsClient: Boolean, options: CreateRoomOptions): AnonCreateAsClient = {
    val __obj = js.Dynamic.literal(createAsClient = createAsClient.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreateAsClient]
  }
  @scala.inline
  implicit class AnonCreateAsClientOps[Self <: AnonCreateAsClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateAsClient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createAsClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: CreateRoomOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

