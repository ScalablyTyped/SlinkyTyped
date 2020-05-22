package typingsSlinky.apolloLinkHttpCommon.anon

import typingsSlinky.apolloLinkHttpCommon.mod.HttpConfig
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: typingsSlinky.apolloLinkHttpCommon.mod.Body
  var options: HttpConfig with (Record[String, _])
}

object Body {
  @scala.inline
  def apply(body: typingsSlinky.apolloLinkHttpCommon.mod.Body, options: HttpConfig with (Record[String, _])): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

