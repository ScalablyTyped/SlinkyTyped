package typingsSlinky.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Unresolved extends js.Object {
  var unresolved: Boolean = js.native
}

object Unresolved {
  @scala.inline
  def apply(unresolved: Boolean): Unresolved = {
    val __obj = js.Dynamic.literal(unresolved = unresolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unresolved]
  }
  @scala.inline
  implicit class UnresolvedOps[Self <: Unresolved] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnresolved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unresolved")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

