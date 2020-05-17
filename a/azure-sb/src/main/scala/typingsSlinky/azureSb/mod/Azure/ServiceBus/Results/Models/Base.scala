package typingsSlinky.azureSb.mod.Azure.ServiceBus.Results.Models

import typingsSlinky.azureSb.anon.Author
import typingsSlinky.azureSb.mod.Azure.ServiceBus.DateString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  var CreatedAt: DateString = js.native
  @JSName("_")
  var _underscore: Author = js.native
}

object Base {
  @scala.inline
  def apply(CreatedAt: DateString, _underscore: Author): Base = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: DateString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_underscore(value: Author): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

