package typingsSlinky.instagramPrivateApi.anon

import typingsSlinky.instagramPrivateApi.mod.IgApiClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends js.Object {
  var buffer: typingsSlinky.node.Buffer
  var client: IgApiClient
}

object Buffer {
  @scala.inline
  def apply(buffer: typingsSlinky.node.Buffer, client: IgApiClient): Buffer = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
}

