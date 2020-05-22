package typingsSlinky.babylonjs.global.BABYLON

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.XRReferenceSpaceType
import typingsSlinky.babylonjs.XRSessionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.WebXREnterExitUIButton")
@js.native
class WebXREnterExitUIButton protected ()
  extends typingsSlinky.babylonjs.BABYLON.WebXREnterExitUIButton {
  /**
    * Creates a WebXREnterExitUIButton
    * @param element button element
    * @param sessionMode XR initialization session mode
    * @param referenceSpaceType the type of reference space to be used
    */
  def this(
    /** button element */
  element: HTMLElement,
    /** XR initialization options for the button */
  sessionMode: XRSessionMode,
    /** Reference space type */
  referenceSpaceType: XRReferenceSpaceType
  ) = this()
  /** button element */
  /* CompleteClass */
  override var element: HTMLElement = js.native
  /** Reference space type */
  /* CompleteClass */
  override var referenceSpaceType: XRReferenceSpaceType = js.native
  /** XR initialization options for the button */
  /* CompleteClass */
  override var sessionMode: XRSessionMode = js.native
  /**
    * Extendable function which can be used to update the button's visuals when the state changes
    * @param activeButton the current active button in the UI
    */
  /* CompleteClass */
  override def update(activeButton: Nullable[typingsSlinky.babylonjs.BABYLON.WebXREnterExitUIButton]): Unit = js.native
}

