package typingsSlinky.babylonjs.webXRHitTestLegacyMod

import typingsSlinky.babylonjs.XRHitResult
import typingsSlinky.babylonjs.mathVectorMod.Matrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTransformationMatrix(value: Matrix): Self = this.set("transformationMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXrHitResult(value: XRHitResult): Self = this.set("xrHitResult", value.asInstanceOf[js.Any])
  }
}
