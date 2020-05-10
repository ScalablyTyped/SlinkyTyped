package typingsSlinky.intercomjs

import typingsSlinky.intercomjs.intercom.Intercom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntercomStatic extends js.Object {
  /**
    * Removes all data associated with intercom from localStorage.
    */
  def destroy(): Unit = js.native
  /**
    * Returns an instance of Intercom. If one doesn't exist, it will be instantiated.
    * @return an instance of Intercom.
    */
  def getInstance(): Intercom = js.native
}

object IntercomStatic {
  @scala.inline
  def apply(destroy: () => Unit, getInstance: () => Intercom): IntercomStatic = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getInstance = js.Any.fromFunction0(getInstance))
    __obj.asInstanceOf[IntercomStatic]
  }
  @scala.inline
  implicit class IntercomStaticOps[Self <: IntercomStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInstance(value: () => Intercom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

