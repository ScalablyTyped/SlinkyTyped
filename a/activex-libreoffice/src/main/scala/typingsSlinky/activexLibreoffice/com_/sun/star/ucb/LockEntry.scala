package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** defines the types of locks that can be used with a resource. */
@js.native
trait LockEntry extends js.Object {
  /** defines the lock's scope. */
  var Scope: LockScope = js.native
  /** defines the type of the lock. */
  var Type: LockType = js.native
}

object LockEntry {
  @scala.inline
  def apply(Scope: LockScope, Type: LockType): LockEntry = {
    val __obj = js.Dynamic.literal(Scope = Scope.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[LockEntry]
  }
  @scala.inline
  implicit class LockEntryOps[Self <: LockEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScope(value: LockScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: LockType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

