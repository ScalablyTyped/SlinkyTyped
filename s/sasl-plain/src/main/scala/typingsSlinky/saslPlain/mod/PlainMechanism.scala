package typingsSlinky.saslPlain.mod

import typingsSlinky.saslPlain.saslPlainBooleans.`true`
import typingsSlinky.saslPlain.saslPlainStrings.PLAIN
import typingsSlinky.saslmechanisms.mod.Mechanism
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlainMechanism extends Mechanism {
  var clientFirst: `true` = js.native
  @JSName("name")
  var name_PlainMechanism: PLAIN = js.native
  def response(cred: Credentials): String = js.native
}

object PlainMechanism {
  @scala.inline
  def apply(challenge: String => Unit, clientFirst: `true`, name: PLAIN, response: Credentials => String): PlainMechanism = {
    val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = clientFirst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = js.Any.fromFunction1(response))
    __obj.asInstanceOf[PlainMechanism]
  }
  @scala.inline
  implicit class PlainMechanismOps[Self <: PlainMechanism] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientFirst(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: PLAIN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: Credentials => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

