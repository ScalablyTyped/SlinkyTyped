package typingsSlinky.hapiHawk.clientMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authentication extends js.Object {
  var headers: Record[String, String]
}

object Authentication {
  @scala.inline
  def apply(headers: Record[String, String]): Authentication = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authentication]
  }
}

