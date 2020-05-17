package typingsSlinky.amqplib.anon

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mechanism extends js.Object {
  var mechanism: String = js.native
  def response(): Buffer = js.native
}

object Mechanism {
  @scala.inline
  def apply(mechanism: String, response: () => Buffer): Mechanism = {
    val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any], response = js.Any.fromFunction0(response))
    __obj.asInstanceOf[Mechanism]
  }
  @scala.inline
  implicit class MechanismOps[Self <: Mechanism] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMechanism(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mechanism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: () => Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

