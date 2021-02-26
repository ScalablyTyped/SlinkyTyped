package typingsSlinky.reactSketchapp

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactSketchapp.propsMod.FontProps
import typingsSlinky.reactSketchapp.propsMod.PathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/G", JSImport.Default)
  @js.native
  class default ()
    extends Component[GProps, js.Object, js.Any]
  
  type G = ReactComponentClass[GProps]
  
  @js.native
  trait GProps
    extends PathProps
       with FontProps
  object GProps {
    
    @scala.inline
    def apply(): GProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GProps]
    }
  }
}
