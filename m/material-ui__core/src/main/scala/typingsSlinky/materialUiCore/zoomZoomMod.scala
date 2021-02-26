package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.createMuiThemeMod.Theme
import typingsSlinky.materialUiCore.transitionMod.TransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomZoomMod extends Shortcut {
  
  @JSImport("@material-ui/core/Zoom/Zoom", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ZoomProps] = js.native
  
  @js.native
  trait ZoomProps extends TransitionProps {
    
    var theme: js.UndefOr[Theme] = js.native
  }
  object ZoomProps {
    
    @scala.inline
    def apply(): ZoomProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomProps]
    }
    
    @scala.inline
    implicit class ZoomPropsMutableBuilder[Self <: ZoomProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ZoomProps]
  
  /* This means you don't have to write `default`, but can instead just say `zoomZoomMod.foo` */
  override def _to: ReactComponentClass[ZoomProps] = default
}
