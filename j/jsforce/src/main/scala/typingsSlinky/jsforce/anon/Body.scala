package typingsSlinky.jsforce.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: String | Null
  var created_date: js.Date | Null
}

object Body {
  @scala.inline
  def apply(body: String = null, created_date: js.Date = null): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], created_date = created_date.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

