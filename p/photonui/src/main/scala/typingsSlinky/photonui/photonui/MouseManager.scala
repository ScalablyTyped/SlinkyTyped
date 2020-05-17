package typingsSlinky.photonui.photonui

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MouseManager extends Base {
  var action: String = js.native
   // readonly
  var btnLeft: Boolean = js.native
   // readonly
  var btnMiddle: Boolean = js.native
   // readonly
  var btnRight: Boolean = js.native
   // readonly
  var button: String = js.native
   // readonly
  var deltaX: Double = js.native
   // readonly
  var deltaY: Double = js.native
  var element: HTMLElement = js.native
   // readonly
  var pageX: Double = js.native
   // readonly
  var pageY: Double = js.native
  var threshold: Double = js.native
   // readonly
  var x: Double = js.native
   // readonly
  var y: Double = js.native
}

object MouseManager {
  @scala.inline
  def apply(
    action: String,
    btnLeft: Boolean,
    btnMiddle: Boolean,
    btnRight: Boolean,
    button: String,
    deltaX: Double,
    deltaY: Double,
    destroy: () => Unit,
    element: HTMLElement,
    pageX: Double,
    pageY: Double,
    registerCallback: (String, String, js.Function, js.Any) => Unit,
    removeCallback: String => Unit,
    threshold: Double,
    x: Double,
    y: Double
  ): MouseManager = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], btnLeft = btnLeft.asInstanceOf[js.Any], btnMiddle = btnMiddle.asInstanceOf[js.Any], btnRight = btnRight.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), element = element.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], registerCallback = js.Any.fromFunction4(registerCallback), removeCallback = js.Any.fromFunction1(removeCallback), threshold = threshold.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseManager]
  }
  @scala.inline
  implicit class MouseManagerOps[Self <: MouseManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBtnLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBtnMiddle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnMiddle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBtnRight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("btnRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeltaX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeltaY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

