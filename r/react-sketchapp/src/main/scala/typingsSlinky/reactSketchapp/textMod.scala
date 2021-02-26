package typingsSlinky.reactSketchapp

import typingsSlinky.react.mod.Component
import typingsSlinky.reactSketchapp.anon.IsInAParentText
import typingsSlinky.reactSketchapp.propsMod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("react-sketchapp/lib/components/Svg/Text", JSImport.Default)
  @js.native
  class default () extends Text
  
  @js.native
  trait Text
    extends Component[TextProps, js.Object, js.Any] {
    
    def getChildContext(): IsInAParentText = js.native
  }
}
