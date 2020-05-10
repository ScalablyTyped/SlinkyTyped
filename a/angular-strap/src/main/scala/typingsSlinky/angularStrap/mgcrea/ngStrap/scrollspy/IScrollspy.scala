package typingsSlinky.angularStrap.mgcrea.ngStrap.scrollspy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollspy extends js.Object {
  def activate(index: Double): Unit = js.native
  def checkOffsets(): Unit = js.native
  def trackElement(target: js.Any, source: js.Any): Unit = js.native
  def untrackElement(target: js.Any, source: js.Any): Unit = js.native
}

object IScrollspy {
  @scala.inline
  def apply(
    activate: Double => Unit,
    checkOffsets: () => Unit,
    trackElement: (js.Any, js.Any) => Unit,
    untrackElement: (js.Any, js.Any) => Unit
  ): IScrollspy = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), checkOffsets = js.Any.fromFunction0(checkOffsets), trackElement = js.Any.fromFunction2(trackElement), untrackElement = js.Any.fromFunction2(untrackElement))
    __obj.asInstanceOf[IScrollspy]
  }
  @scala.inline
  implicit class IScrollspyOps[Self <: IScrollspy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivate(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCheckOffsets(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOffsets")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTrackElement(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUntrackElement(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("untrackElement")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

