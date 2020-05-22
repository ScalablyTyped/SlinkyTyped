package typingsSlinky.passportSaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheItem extends js.Object {
  var createdAt: js.Date
  var value: js.Any
}

object CacheItem {
  @scala.inline
  def apply(createdAt: js.Date, value: js.Any): CacheItem = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheItem]
  }
}

