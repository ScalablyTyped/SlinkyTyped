package typingsSlinky.materialUiCore

import typingsSlinky.materialUiCore.anon.Fn0
import typingsSlinky.materialUiCore.anon.PartialRenderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createRenderMod {
  
  @JSImport("@material-ui/core/test-utils/createRender", JSImport.Default)
  @js.native
  def default(): Fn0 = js.native
  @JSImport("@material-ui/core/test-utils/createRender", JSImport.Default)
  @js.native
  def default(options: PartialRenderOptions): Fn0 = js.native
  
  @js.native
  trait RenderOptions extends StObject {
    
    var render: Fn0 = js.native
  }
  object RenderOptions {
    
    @scala.inline
    def apply(render: Fn0): RenderOptions = {
      val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderOptions]
    }
    
    @scala.inline
    implicit class RenderOptionsMutableBuilder[Self <: RenderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: Fn0): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    }
  }
}
