package typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models

import typingsSlinky.azureSb.anon.Author
import typingsSlinky.azureSb.mod.Azure.ServiceBus.DateString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var CreatedAt: DateString
  @JSName("_")
  var _underscore: Author
}

object Base {
  @scala.inline
  def apply(CreatedAt: DateString, _underscore: Author): Base = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}

