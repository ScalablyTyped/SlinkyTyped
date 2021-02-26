package typingsSlinky.konva.anon

import typingsSlinky.konva.containerMod.Container
import typingsSlinky.konva.nodeMod.Node
import typingsSlinky.konva.nodeMod.NodeConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelativeTo extends StObject {
  
  var relativeTo: js.UndefOr[Container[Node[NodeConfig]]] = js.native
  
  var skipShadow: js.UndefOr[Boolean] = js.native
  
  var skipStroke: js.UndefOr[Boolean] = js.native
  
  var skipTransform: js.UndefOr[Boolean] = js.native
}
object RelativeTo {
  
  @scala.inline
  def apply(): RelativeTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeTo]
  }
  
  @scala.inline
  implicit class RelativeToMutableBuilder[Self <: RelativeTo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRelativeTo(value: Container[Node[NodeConfig]]): Self = StObject.set(x, "relativeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeToUndefined: Self = StObject.set(x, "relativeTo", js.undefined)
    
    @scala.inline
    def setSkipShadow(value: Boolean): Self = StObject.set(x, "skipShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipShadowUndefined: Self = StObject.set(x, "skipShadow", js.undefined)
    
    @scala.inline
    def setSkipStroke(value: Boolean): Self = StObject.set(x, "skipStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipStrokeUndefined: Self = StObject.set(x, "skipStroke", js.undefined)
    
    @scala.inline
    def setSkipTransform(value: Boolean): Self = StObject.set(x, "skipTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipTransformUndefined: Self = StObject.set(x, "skipTransform", js.undefined)
  }
}
