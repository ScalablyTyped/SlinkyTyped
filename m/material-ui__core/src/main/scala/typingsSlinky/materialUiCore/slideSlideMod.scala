package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.createMuiThemeMod.Theme
import typingsSlinky.materialUiCore.materialUiCoreStrings.down
import typingsSlinky.materialUiCore.materialUiCoreStrings.left
import typingsSlinky.materialUiCore.materialUiCoreStrings.right
import typingsSlinky.materialUiCore.materialUiCoreStrings.up
import typingsSlinky.materialUiCore.transitionMod.TransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideSlideMod extends Shortcut {
  
  @JSImport("@material-ui/core/Slide/Slide", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SlideProps] = js.native
  
  @js.native
  trait SlideProps extends TransitionProps {
    
    var direction: left | right | up | down = js.native
    
    var theme: js.UndefOr[Theme] = js.native
  }
  object SlideProps {
    
    @scala.inline
    def apply(direction: left | right | up | down): SlideProps = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlideProps]
    }
    
    @scala.inline
    implicit class SlidePropsMutableBuilder[Self <: SlideProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: left | right | up | down): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[SlideProps]
  
  /* This means you don't have to write `default`, but can instead just say `slideSlideMod.foo` */
  override def _to: ReactComponentClass[SlideProps] = default
}
