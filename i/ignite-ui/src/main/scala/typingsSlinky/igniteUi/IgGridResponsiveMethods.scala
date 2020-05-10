package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridResponsiveMethods extends js.Object {
  /**
  	 * Destroys the responsive widget.
  	 */
  def destroy(): Unit = js.native
  /**
  	 * Returns the currently active responsive mode.
  	 */
  def getCurrentResponsiveMode(): Unit = js.native
}

object IgGridResponsiveMethods {
  @scala.inline
  def apply(destroy: () => Unit, getCurrentResponsiveMode: () => Unit): IgGridResponsiveMethods = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getCurrentResponsiveMode = js.Any.fromFunction0(getCurrentResponsiveMode))
    __obj.asInstanceOf[IgGridResponsiveMethods]
  }
  @scala.inline
  implicit class IgGridResponsiveMethodsOps[Self <: IgGridResponsiveMethods] (val x: Self) extends AnyVal {
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
    def withGetCurrentResponsiveMode(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentResponsiveMode")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

