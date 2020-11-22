package typingsSlinky.konva.shapeMod

import typingsSlinky.konva.nodeMod.Node
import typingsSlinky.konva.nodeMod.NodeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShapegGetClientRectConfig extends js.Object {
  
  var relativeTo: js.UndefOr[Node[NodeConfig]] = js.native
  
  var skipShadow: js.UndefOr[Boolean] = js.native
  
  var skipStroke: js.UndefOr[Boolean] = js.native
  
  var skipTransform: js.UndefOr[Boolean] = js.native
}
object ShapegGetClientRectConfig {
  
  @scala.inline
  def apply(): ShapegGetClientRectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapegGetClientRectConfig]
  }
  
  @scala.inline
  implicit class ShapegGetClientRectConfigOps[Self <: ShapegGetClientRectConfig] (val x: Self) extends AnyVal {
    
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
    def setRelativeTo(value: Node[NodeConfig]): Self = this.set("relativeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativeTo: Self = this.set("relativeTo", js.undefined)
    
    @scala.inline
    def setSkipShadow(value: Boolean): Self = this.set("skipShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipShadow: Self = this.set("skipShadow", js.undefined)
    
    @scala.inline
    def setSkipStroke(value: Boolean): Self = this.set("skipStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipStroke: Self = this.set("skipStroke", js.undefined)
    
    @scala.inline
    def setSkipTransform(value: Boolean): Self = this.set("skipTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipTransform: Self = this.set("skipTransform", js.undefined)
  }
}
