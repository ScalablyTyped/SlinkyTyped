package typingsSlinky.carbonComponents.mod

import typingsSlinky.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("carbon-components", "Tab")
@js.native
class Tab protected ()
  extends typingsSlinky.carbonComponents.componentsMod.Tab {
  def this(element: js.Any, options: js.Any) = this()
}
object Tab {
  
  @JSImport("carbon-components", "Tab")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  object NAVIGATE {
    
    @JSImport("carbon-components", "Tab.NAVIGATE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("carbon-components", "Tab.NAVIGATE.BACKWARD")
    @js.native
    def BACKWARD: Double = js.native
    @scala.inline
    def BACKWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKWARD")(x.asInstanceOf[js.Any])
    
    @JSImport("carbon-components", "Tab.NAVIGATE.FORWARD")
    @js.native
    def FORWARD: Double = js.native
    @scala.inline
    def FORWARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FORWARD")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSImport("carbon-components", "Tab.components")
  @js.native
  def components: WeakMap[js.Object, js.Any] = js.native
  @scala.inline
  def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
}
