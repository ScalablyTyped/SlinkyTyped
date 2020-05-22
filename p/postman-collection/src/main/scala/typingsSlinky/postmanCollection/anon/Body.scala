package typingsSlinky.postmanCollection.anon

import typingsSlinky.node.Buffer
import typingsSlinky.postmanCollection.mod.HeaderDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: String | Buffer | js.typedarray.Uint8Array
  var elapsedTime: Double
  var headers: js.UndefOr[js.Array[HeaderDefinition]] = js.undefined
  var statusCode: Double
  var statusMessage: js.UndefOr[String] = js.undefined
}

object Body {
  @scala.inline
  def apply(
    body: String | Buffer | js.typedarray.Uint8Array,
    elapsedTime: Double,
    statusCode: Double,
    headers: js.Array[HeaderDefinition] = null,
    statusMessage: String = null
  ): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

