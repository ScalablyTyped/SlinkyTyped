package typingsSlinky.reactSketchapp

import typingsSlinky.react.mod.Component
import typingsSlinky.reactSketchapp.anon.IsInAParentText
import typingsSlinky.reactSketchapp.propsMod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-sketchapp/lib/components/Svg/TSpan", JSImport.Namespace)
@js.native
object tspanMod extends js.Object {
  
  @js.native
  trait TSpan
    extends Component[TextProps, js.Object, js.Any] {
    
    def getChildContext(): IsInAParentText = js.native
  }
  
  @js.native
  class default () extends TSpan
}
