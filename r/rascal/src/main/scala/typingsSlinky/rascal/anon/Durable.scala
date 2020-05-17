package typingsSlinky.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Durable extends js.Object {
  var durable: Boolean = js.native
}

object Durable {
  @scala.inline
  def apply(durable: Boolean): Durable = {
    val __obj = js.Dynamic.literal(durable = durable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Durable]
  }
  @scala.inline
  implicit class DurableOps[Self <: Durable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durable")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

