package typingsSlinky.blueprintjsTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderMode extends StObject {
  
  var renderMode: typingsSlinky.blueprintjsTable.renderModeMod.RenderMode = js.native
}
object RenderMode {
  
  @scala.inline
  def apply(renderMode: typingsSlinky.blueprintjsTable.renderModeMod.RenderMode): RenderMode = {
    val __obj = js.Dynamic.literal(renderMode = renderMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderMode]
  }
  
  @scala.inline
  implicit class RenderModeMutableBuilder[Self <: RenderMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderMode(value: typingsSlinky.blueprintjsTable.renderModeMod.RenderMode): Self = StObject.set(x, "renderMode", value.asInstanceOf[js.Any])
  }
}
