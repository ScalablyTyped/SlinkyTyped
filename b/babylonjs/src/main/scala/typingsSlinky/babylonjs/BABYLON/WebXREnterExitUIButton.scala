package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.babylonjs.XRReferenceSpaceType
import typingsSlinky.babylonjs.XRSessionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebXREnterExitUIButton extends js.Object {
  /** button element */
  var element: HTMLElement = js.native
  /** Reference space type */
  var referenceSpaceType: XRReferenceSpaceType = js.native
  /** XR initialization options for the button */
  var sessionMode: XRSessionMode = js.native
  /**
    * Extendable function which can be used to update the button's visuals when the state changes
    * @param activeButton the current active button in the UI
    */
  def update(activeButton: Nullable[WebXREnterExitUIButton]): Unit = js.native
}

object WebXREnterExitUIButton {
  @scala.inline
  def apply(
    element: HTMLElement,
    referenceSpaceType: XRReferenceSpaceType,
    sessionMode: XRSessionMode,
    update: Nullable[WebXREnterExitUIButton] => Unit
  ): WebXREnterExitUIButton = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], referenceSpaceType = referenceSpaceType.asInstanceOf[js.Any], sessionMode = sessionMode.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[WebXREnterExitUIButton]
  }
  @scala.inline
  implicit class WebXREnterExitUIButtonOps[Self <: WebXREnterExitUIButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferenceSpaceType(value: XRReferenceSpaceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceSpaceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionMode(value: XRSessionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: Nullable[WebXREnterExitUIButton] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

