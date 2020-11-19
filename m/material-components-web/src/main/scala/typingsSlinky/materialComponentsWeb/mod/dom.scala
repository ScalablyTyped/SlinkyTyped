package typingsSlinky.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.EventListenerOptions
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.Window
import typingsSlinky.materialDom.focusTrapMod.FocusOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "dom")
@js.native
object dom extends js.Object {
  
  @js.native
  object events extends js.Object {
    
    def applyPassive(): Boolean | EventListenerOptions = js.native
    def applyPassive(globalObj: Window): Boolean | EventListenerOptions = js.native
  }
  
  @js.native
  object focusTrap extends js.Object {
    
    @js.native
    class FocusTrap protected ()
      extends typingsSlinky.materialDom.mod.focusTrap.FocusTrap {
      def this(root: HTMLElement) = this()
      def this(root: HTMLElement, options: FocusOptions) = this()
    }
  }
  
  @js.native
  object keyboard extends js.Object {
    
    def isNavigationEvent(evt: KeyboardEvent): Boolean = js.native
    
    def normalizeKey(evt: KeyboardEvent): String = js.native
    
    @js.native
    object KEY extends js.Object {
      
      var ARROW_DOWN: String = js.native
      
      var ARROW_LEFT: String = js.native
      
      var ARROW_RIGHT: String = js.native
      
      var ARROW_UP: String = js.native
      
      var BACKSPACE: String = js.native
      
      var DELETE: String = js.native
      
      var END: String = js.native
      
      var ENTER: String = js.native
      
      var ESCAPE: String = js.native
      
      var HOME: String = js.native
      
      var PAGE_DOWN: String = js.native
      
      var PAGE_UP: String = js.native
      
      var SPACEBAR: String = js.native
      
      var UNKNOWN: String = js.native
    }
  }
  
  @js.native
  object ponyfill extends js.Object {
    
    def closest(element: Element, selector: String): Element | Null = js.native
    
    def estimateScrollWidth(element: Element): Double = js.native
    
    def matches(element: Element, selector: String): Boolean = js.native
  }
}
