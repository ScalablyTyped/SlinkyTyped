package typingsSlinky.hammerjs

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class Hammer protected () extends HammerManager {
    def this(element: HTMLElement) = this()
    def this(element: SVGElement) = this()
    def this(element: HTMLElement, options: HammerOptions) = this()
    def this(element: SVGElement, options: HammerOptions) = this()
  }
  @js.native
  object Hammer extends TopLevel[HammerStatic]
  
  @js.native
  class HammerInput protected ()
    extends typingsSlinky.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
  }
  
  @js.native
  class MouseInput protected ()
    extends typingsSlinky.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
  }
  
  @js.native
  class PointerEventInput protected ()
    extends typingsSlinky.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
  }
  
  @js.native
  class SingleTouchInput protected ()
    extends typingsSlinky.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
  }
  
  @js.native
  class TouchAction protected ()
    extends typingsSlinky.hammerjs.TouchAction {
    def this(manager: HammerManager, value: String) = this()
  }
  
  @js.native
  class TouchInput protected ()
    extends typingsSlinky.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
  }
  
  @js.native
  class TouchMouseInput protected ()
    extends typingsSlinky.hammerjs.HammerInput {
    def this(manager: HammerManager, callback: js.Function) = this()
  }
}
