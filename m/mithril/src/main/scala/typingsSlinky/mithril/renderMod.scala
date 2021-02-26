package typingsSlinky.mithril

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod extends Shortcut {
  
  @JSImport("mithril/render", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  @js.native
  trait Static extends StObject {
    
    var render: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof render */ js.Any = js.native
  }
  object Static {
    
    @scala.inline
    def apply(render: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof render */ js.Any): Static = {
      val __obj = js.Dynamic.literal(render = render.asInstanceOf[js.Any])
      __obj.asInstanceOf[Static]
    }
    
    @scala.inline
    implicit class StaticMutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof render */ js.Any): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `renderMod.foo` */
  override def _to: Static = ^
}
