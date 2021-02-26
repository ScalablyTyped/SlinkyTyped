package typingsSlinky.carbonComponents.mod

import typingsSlinky.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "Checkbox")
@js.native
class Checkbox protected ()
  extends typingsSlinky.carbonComponents.componentsMod.Checkbox {
  def this(element: js.Any, options: js.Any) = this()
}
object Checkbox {
  
  @JSImport("carbon-components", "Checkbox")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("carbon-components", "Checkbox.components")
  @js.native
  def components: WeakMap[js.Object, js.Any] = js.native
  @scala.inline
  def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  
  /* static member */
  object stateChangeTypes {
    
    @JSImport("carbon-components", "Checkbox.stateChangeTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components", "Checkbox.stateChangeTypes.mixed")
    @js.native
    def mixed: String = js.native
    @scala.inline
    def mixed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mixed")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "Checkbox.stateChangeTypes.false")
    @js.native
    val `false`: String = js.native
    
    @JSImport("carbon-components", "Checkbox.stateChangeTypes.true")
    @js.native
    val `true`: String = js.native
  }
}
