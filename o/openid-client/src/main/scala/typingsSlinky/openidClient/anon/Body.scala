package typingsSlinky.openidClient.anon

import typingsSlinky.node.Buffer
import typingsSlinky.openidClient.openidClientStrings.DELETE
import typingsSlinky.openidClient.openidClientStrings.GET
import typingsSlinky.openidClient.openidClientStrings.HEAD
import typingsSlinky.openidClient.openidClientStrings.OPTIONS
import typingsSlinky.openidClient.openidClientStrings.POST
import typingsSlinky.openidClient.openidClientStrings.PUT
import typingsSlinky.openidClient.openidClientStrings.TRACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: String | Buffer
  var headers: js.UndefOr[js.Object] = js.undefined
  var method: js.UndefOr[GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE] = js.undefined
  var tokenType: js.UndefOr[String] = js.undefined
}

object Body {
  @scala.inline
  def apply(
    body: String | Buffer,
    headers: js.Object = null,
    method: GET | POST | PUT | HEAD | DELETE | OPTIONS | TRACE = null,
    tokenType: String = null
  ): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (tokenType != null) __obj.updateDynamic("tokenType")(tokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

