package typingsSlinky.ldapjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var filter: typingsSlinky.ldapjs.mod.Filter
}

object Filter {
  @scala.inline
  def apply(filter: typingsSlinky.ldapjs.mod.Filter): Filter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

