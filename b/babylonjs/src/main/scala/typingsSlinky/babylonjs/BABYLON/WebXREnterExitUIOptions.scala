package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.XRReferenceSpaceType
import typingsSlinky.babylonjs.XRSessionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withCustomButtons(value: js.Array[WebXREnterExitUIButton]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceSpaceType(value: XRReferenceSpaceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceSpaceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceSpaceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceSpaceType")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTarget(value: Nullable[WebXRRenderTarget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTargetNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTarget")(null)
        ret
    }
    @scala.inline
    def withSessionMode(value: XRSessionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionMode")(js.undefined)
        ret
    }
  }
  
}

