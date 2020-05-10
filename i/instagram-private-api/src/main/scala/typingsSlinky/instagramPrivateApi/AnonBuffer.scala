package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.mod.IgApiClient
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBuffer extends js.Object {
  var buffer: Buffer = js.native
  var client: IgApiClient = js.native
}

object AnonBuffer {
  @scala.inline
  def apply(buffer: Buffer, client: IgApiClient): AnonBuffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBuffer]
  }
  @scala.inline
  implicit class AnonBufferOps[Self <: AnonBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient(value: IgApiClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

