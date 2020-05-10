package typingsSlinky.aureliaTemplating.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentAttached extends js.Object {
  /**
    * Implement this hook if you want to perform custom logic when the component is attached to the DOM (in document).
    */
  def attached(): Unit = js.native
}

object ComponentAttached {
  @scala.inline
  def apply(attached: () => Unit): ComponentAttached = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction0(attached))
    __obj.asInstanceOf[ComponentAttached]
  }
  @scala.inline
  implicit class ComponentAttachedOps[Self <: ComponentAttached] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttached(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

