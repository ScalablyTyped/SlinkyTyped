package typingsSlinky.babylonjs.webXRPlaneDetectorMod

import typingsSlinky.babylonjs.transformNodeMod.TransformNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRPlaneDetectorOptions extends js.Object {
  
  /**
    * The node to use to transform the local results to world coordinates
    */
  var worldParentNode: js.UndefOr[TransformNode] = js.native
}
object IWebXRPlaneDetectorOptions {
  
  @scala.inline
  def apply(): IWebXRPlaneDetectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRPlaneDetectorOptions]
  }
  
  @scala.inline
  implicit class IWebXRPlaneDetectorOptionsOps[Self <: IWebXRPlaneDetectorOptions] (val x: Self) extends AnyVal {
    
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
    def setWorldParentNode(value: TransformNode): Self = this.set("worldParentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorldParentNode: Self = this.set("worldParentNode", js.undefined)
  }
}
