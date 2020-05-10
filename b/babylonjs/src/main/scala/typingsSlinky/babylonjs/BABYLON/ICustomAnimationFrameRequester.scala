package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomAnimationFrameRequester extends js.Object {
  /**
    * This function will be called when the render loop is ready. If this is not populated, the engine's renderloop function will be called
    */
  var renderFunction: js.UndefOr[js.Function] = js.native
  /**
    * Called to request the next frame to render to
    * @see https://developer.mozilla.org/en-US/docs/Web/API/window/requestAnimationFrame
    */
  var requestAnimationFrame: js.Function = js.native
  /**
    * You can pass this value to cancelAnimationFrame() to cancel the refresh callback request
    * @see https://developer.mozilla.org/en-US/docs/Web/API/window/requestAnimationFrame#Return_value
    */
  var requestID: js.UndefOr[Double] = js.native
}

object ICustomAnimationFrameRequester {
  @scala.inline
  def apply(requestAnimationFrame: js.Function): ICustomAnimationFrameRequester = {
    val __obj = js.Dynamic.literal(requestAnimationFrame = requestAnimationFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomAnimationFrameRequester]
  }
  @scala.inline
  implicit class ICustomAnimationFrameRequesterOps[Self <: ICustomAnimationFrameRequester] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestAnimationFrame(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestAnimationFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderFunction(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestID")(js.undefined)
        ret
    }
  }
  
}

