package typingsSlinky.babylonjs.webXRAnchorSystemMod

import typingsSlinky.babylonjs.transformNodeMod.TransformNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebXRAnchorSystemOptions extends js.Object {
  
  /**
    * Should a new anchor be added every time a select event is triggered
    */
  var addAnchorOnSelect: js.UndefOr[Boolean] = js.native
  
  /**
    * should the anchor system use plane detection.
    * If set to true, the plane-detection feature should be set using setPlaneDetector
    */
  var usePlaneDetection: js.UndefOr[Boolean] = js.native
  
  /**
    * a node that will be used to convert local to world coordinates
    */
  var worldParentNode: js.UndefOr[TransformNode] = js.native
}
object IWebXRAnchorSystemOptions {
  
  @scala.inline
  def apply(): IWebXRAnchorSystemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRAnchorSystemOptions]
  }
  
  @scala.inline
  implicit class IWebXRAnchorSystemOptionsOps[Self <: IWebXRAnchorSystemOptions] (val x: Self) extends AnyVal {
    
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
    def setAddAnchorOnSelect(value: Boolean): Self = this.set("addAnchorOnSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddAnchorOnSelect: Self = this.set("addAnchorOnSelect", js.undefined)
    
    @scala.inline
    def setUsePlaneDetection(value: Boolean): Self = this.set("usePlaneDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePlaneDetection: Self = this.set("usePlaneDetection", js.undefined)
    
    @scala.inline
    def setWorldParentNode(value: TransformNode): Self = this.set("worldParentNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorldParentNode: Self = this.set("worldParentNode", js.undefined)
  }
}
