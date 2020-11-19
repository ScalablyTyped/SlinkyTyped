package typingsSlinky.babylonjs.global.BABYLON

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.babylonjs.XRReferenceSpaceType
import typingsSlinky.babylonjs.XRSessionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
