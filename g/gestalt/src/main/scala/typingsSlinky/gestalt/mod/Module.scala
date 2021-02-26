package typingsSlinky.gestalt.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gestalt", "Module")
@js.native
class Module protected ()
  extends Component[js.Object, js.Any, js.Any] {
  def this(props: js.Object) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: js.Object, context: js.Any) = this()
}
/* static members */
object Module {
  
  @JSImport("gestalt", "Module")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gestalt", "Module.Expandable")
  @js.native
  def Expandable: ReactComponentClass[ModuleExpandableProps] = js.native
  @scala.inline
  def Expandable_=(x: ReactComponentClass[ModuleExpandableProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Expandable")(x.asInstanceOf[js.Any])
}
