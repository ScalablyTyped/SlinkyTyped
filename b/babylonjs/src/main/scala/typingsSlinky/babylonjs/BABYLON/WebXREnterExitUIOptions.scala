package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.XRReferenceSpaceType
import typingsSlinky.babylonjs.XRSessionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebXREnterExitUIOptions extends js.Object {
  
  /**
    * User provided buttons to enable/disable WebXR. The system will provide default if not set
    */
  var customButtons: js.UndefOr[js.Array[WebXREnterExitUIButton]] = js.native
  
  /**
    * A reference space type to use when creating the default button.
    * Default is local-floor
    */
  var referenceSpaceType: js.UndefOr[XRReferenceSpaceType] = js.native
  
  /**
    * Context to enter xr with
    */
  var renderTarget: js.UndefOr[Nullable[WebXRRenderTarget]] = js.native
  
  /**
    * A session mode to use when creating the default button.
    * Default is immersive-vr
    */
  var sessionMode: js.UndefOr[XRSessionMode] = js.native
}
object WebXREnterExitUIOptions {
  
  @scala.inline
  def apply(): WebXREnterExitUIOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebXREnterExitUIOptions]
  }
  
  @scala.inline
  implicit class WebXREnterExitUIOptionsOps[Self <: WebXREnterExitUIOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomButtonsVarargs(value: WebXREnterExitUIButton*): Self = this.set("customButtons", js.Array(value :_*))
    
    @scala.inline
    def setCustomButtons(value: js.Array[WebXREnterExitUIButton]): Self = this.set("customButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomButtons: Self = this.set("customButtons", js.undefined)
    
    @scala.inline
    def setReferenceSpaceType(value: XRReferenceSpaceType): Self = this.set("referenceSpaceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceSpaceType: Self = this.set("referenceSpaceType", js.undefined)
    
    @scala.inline
    def setRenderTarget(value: Nullable[WebXRRenderTarget]): Self = this.set("renderTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderTarget: Self = this.set("renderTarget", js.undefined)
    
    @scala.inline
    def setRenderTargetNull: Self = this.set("renderTarget", null)
    
    @scala.inline
    def setSessionMode(value: XRSessionMode): Self = this.set("sessionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionMode: Self = this.set("sessionMode", js.undefined)
  }
}
