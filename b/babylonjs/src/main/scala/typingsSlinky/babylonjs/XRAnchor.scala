package typingsSlinky.babylonjs

import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XRAnchor extends js.Object {
  var anchorSpace: EventTarget = js.native
  // remove?
  var id: js.UndefOr[String] = js.native
  var lastChangedTime: Double = js.native
  def detach(): Unit = js.native
}

object XRAnchor {
  @scala.inline
  def apply(anchorSpace: EventTarget, detach: () => Unit, lastChangedTime: Double): XRAnchor = {
    val __obj = js.Dynamic.literal(anchorSpace = anchorSpace.asInstanceOf[js.Any], detach = js.Any.fromFunction0(detach), lastChangedTime = lastChangedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRAnchor]
  }
  @scala.inline
  implicit class XRAnchorOps[Self <: XRAnchor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorSpace(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetach(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detach")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLastChangedTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChangedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

