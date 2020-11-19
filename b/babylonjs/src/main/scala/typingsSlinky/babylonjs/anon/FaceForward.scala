package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FaceForward extends js.Object {
  
  var faceForward: js.UndefOr[Boolean] = js.native
  
  var resolution: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var useDirectMapping: js.UndefOr[Boolean] = js.native
}
object FaceForward {
  
  @scala.inline
  def apply(): FaceForward = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceForward]
  }
  
  @scala.inline
  implicit class FaceForwardOps[Self <: FaceForward] (val x: Self) extends AnyVal {
    
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
    def setFaceForward(value: Boolean): Self = this.set("faceForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaceForward: Self = this.set("faceForward", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setUseDirectMapping(value: Boolean): Self = this.set("useDirectMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDirectMapping: Self = this.set("useDirectMapping", js.undefined)
  }
}
