package typingsSlinky.muicss

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.muicss.reactMod.InputProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("muicss/lib/react/input", JSImport.Default)
  @js.native
  class default () extends Input
  
  @js.native
  trait Input
    extends Component[InputProps, js.Object, js.Any] {
    
    var controlEl: js.UndefOr[HTMLInputElement] = js.native
  }
}
