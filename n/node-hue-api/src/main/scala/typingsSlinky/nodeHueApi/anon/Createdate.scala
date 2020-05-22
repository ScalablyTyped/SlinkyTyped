package typingsSlinky.nodeHueApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Createdate extends js.Object {
  var `create date`: js.Date
  var `last use date`: js.Date
  var name: String
}

object Createdate {
  @scala.inline
  def apply(`create date`: js.Date, `last use date`: js.Date, name: String): Createdate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("create date")((`create date`).asInstanceOf[js.Any])
    __obj.updateDynamic("last use date")((`last use date`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Createdate]
  }
}

