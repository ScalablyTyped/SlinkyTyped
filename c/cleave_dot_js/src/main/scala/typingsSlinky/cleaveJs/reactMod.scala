package typingsSlinky.cleaveJs

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.cleaveJs.propsMod.Props
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("cleave.js/react", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends Component[Props, js.Object, js.Any] {
    def this(props: Props) = this()
    def this(props: Props, context: js.Any) = this()
  }
  @JSImport("cleave.js/react", JSImport.Namespace)
  @js.native
  val ^ : ComponentClass[Props, js.Object] = js.native
  
  type _To = ComponentClass[Props, js.Object]
  
  /* This means you don't have to write `^`, but can instead just say `reactMod.foo` */
  override def _to: ComponentClass[Props, js.Object] = ^
}
