package typingsSlinky.pkcs11js.Pkcs11Js

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mechanism extends js.Object {
  var mechanism: Double = js.native
  var parameter: js.UndefOr[Buffer | IParams] = js.native
}

object Mechanism {
  @scala.inline
  def apply(mechanism: Double): Mechanism = {
    val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mechanism]
  }
  @scala.inline
  implicit class MechanismOps[Self <: Mechanism] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMechanism(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mechanism")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameter(value: Buffer | IParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameter")(js.undefined)
        ret
    }
  }
  
}

