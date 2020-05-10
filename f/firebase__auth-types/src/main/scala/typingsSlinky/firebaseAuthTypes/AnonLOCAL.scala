package typingsSlinky.firebaseAuthTypes

import typingsSlinky.firebaseAuthTypes.mod.Persistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLOCAL extends js.Object {
  var LOCAL: Persistence = js.native
  var NONE: Persistence = js.native
  var SESSION: Persistence = js.native
}

object AnonLOCAL {
  @scala.inline
  def apply(LOCAL: Persistence, NONE: Persistence, SESSION: Persistence): AnonLOCAL = {
    val __obj = js.Dynamic.literal(LOCAL = LOCAL.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], SESSION = SESSION.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLOCAL]
  }
  @scala.inline
  implicit class AnonLOCALOps[Self <: AnonLOCAL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLOCAL(value: Persistence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOCAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNONE(value: Persistence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NONE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSESSION(value: Persistence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SESSION")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

