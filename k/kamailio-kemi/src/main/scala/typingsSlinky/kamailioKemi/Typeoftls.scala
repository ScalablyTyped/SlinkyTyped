package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoftls extends js.Object {
  def is_peer_verified(): Double = js.native
}

object Typeoftls {
  @scala.inline
  def apply(is_peer_verified: () => Double): Typeoftls = {
    val __obj = js.Dynamic.literal(is_peer_verified = js.Any.fromFunction0(is_peer_verified))
    __obj.asInstanceOf[Typeoftls]
  }
  @scala.inline
  implicit class TypeoftlsOps[Self <: Typeoftls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIs_peer_verified(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_peer_verified")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

