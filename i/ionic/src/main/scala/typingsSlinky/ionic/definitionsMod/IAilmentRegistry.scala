package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAilmentRegistry extends js.Object {
  var ailments: js.Array[IAilment] = js.native
  def get(id: String): js.UndefOr[IAilment] = js.native
  def register(ailment: IAilment): Unit = js.native
}

object IAilmentRegistry {
  @scala.inline
  def apply(ailments: js.Array[IAilment], get: String => js.UndefOr[IAilment], register: IAilment => Unit): IAilmentRegistry = {
    val __obj = js.Dynamic.literal(ailments = ailments.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[IAilmentRegistry]
  }
  @scala.inline
  implicit class IAilmentRegistryOps[Self <: IAilmentRegistry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAilments(value: js.Array[IAilment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ailments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGet(value: String => js.UndefOr[IAilment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegister(value: IAilment => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

