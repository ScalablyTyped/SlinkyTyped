package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.XRHitResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebXRHitResult extends js.Object {
  /**
    * Transformation matrix that can be applied to a node that will put it in the hit point location
    */
  var transformationMatrix: Matrix = js.native
  /**
    * The native hit test result
    */
  var xrHitResult: XRHitResult = js.native
}

object IWebXRHitResult {
  @scala.inline
  def apply(transformationMatrix: Matrix, xrHitResult: XRHitResult): IWebXRHitResult = {
    val __obj = js.Dynamic.literal(transformationMatrix = transformationMatrix.asInstanceOf[js.Any], xrHitResult = xrHitResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRHitResult]
  }
  @scala.inline
  implicit class IWebXRHitResultOps[Self <: IWebXRHitResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransformationMatrix(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformationMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXrHitResult(value: XRHitResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xrHitResult")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

