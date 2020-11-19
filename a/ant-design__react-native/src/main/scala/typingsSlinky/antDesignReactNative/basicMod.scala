package typingsSlinky.antDesignReactNative

import typingsSlinky.antDesignReactNative.anon.ActiveSections
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ant-design/react-native/lib/accordion/demo/basic", JSImport.Namespace)
@js.native
object basicMod extends js.Object {
  
  @js.native
  trait AccordionExmple
    extends Component[js.Any, js.Any, js.Any] {
    
    def onChange(activeSections: js.Array[Double]): Unit = js.native
    
    @JSName("state")
    var state_AccordionExmple: ActiveSections = js.native
  }
  
  @js.native
  class default () extends AccordionExmple
}
