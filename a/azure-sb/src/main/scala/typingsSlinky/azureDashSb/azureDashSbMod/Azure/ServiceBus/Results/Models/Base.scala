package typingsSlinky.azureDashSb.azureDashSbMod.Azure.ServiceBus.Results.Models

import typingsSlinky.azureDashSb.Anon_Author
import typingsSlinky.azureDashSb.azureDashSbMod.Azure.ServiceBus.DateString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base extends js.Object {
  var CreatedAt: DateString
  @JSName("_")
  var _underscore: Anon_Author
}

object Base {
  @scala.inline
  def apply(CreatedAt: DateString, _underscore: Anon_Author): Base = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
}

