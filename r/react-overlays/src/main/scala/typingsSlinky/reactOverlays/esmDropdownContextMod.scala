package typingsSlinky.reactOverlays

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmDropdownContextMod extends Shortcut {
  
  @JSImport("react-overlays/esm/DropdownContext", JSImport.Default)
  @js.native
  val default: Context[DropdownContextValue | Null] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactOverlays.reactOverlaysStrings.up
    - typingsSlinky.reactOverlays.reactOverlaysStrings.down
    - typingsSlinky.reactOverlays.reactOverlaysStrings.left
    - typingsSlinky.reactOverlays.reactOverlaysStrings.right
  */
  trait DropDirection extends StObject
  object DropDirection {
    
    @scala.inline
    def down: typingsSlinky.reactOverlays.reactOverlaysStrings.down = "down".asInstanceOf[typingsSlinky.reactOverlays.reactOverlaysStrings.down]
    
    @scala.inline
    def left: typingsSlinky.reactOverlays.reactOverlaysStrings.left = "left".asInstanceOf[typingsSlinky.reactOverlays.reactOverlaysStrings.left]
    
    @scala.inline
    def right: typingsSlinky.reactOverlays.reactOverlaysStrings.right = "right".asInstanceOf[typingsSlinky.reactOverlays.reactOverlaysStrings.right]
    
    @scala.inline
    def up: typingsSlinky.reactOverlays.reactOverlaysStrings.up = "up".asInstanceOf[typingsSlinky.reactOverlays.reactOverlaysStrings.up]
  }
  
  @js.native
  trait DropdownContextValue extends StObject {
    
    var alignEnd: js.UndefOr[Boolean] = js.native
    
    var drop: js.UndefOr[DropDirection] = js.native
    
    var menuElement: HTMLElement | Null = js.native
    
    def setMenu(): Unit = js.native
    def setMenu(ref: HTMLElement): Unit = js.native
    
    def setToggle(): Unit = js.native
    def setToggle(ref: HTMLElement): Unit = js.native
    
    var show: Boolean = js.native
    
    def toggle(nextShow: Boolean): Unit = js.native
    def toggle(nextShow: Boolean, event: Event): Unit = js.native
    def toggle(nextShow: Boolean, event: SyntheticEvent[Event, Element]): Unit = js.native
    
    var toggleElement: HTMLElement | Null = js.native
  }
  
  type _To = Context[DropdownContextValue | Null]
  
  /* This means you don't have to write `default`, but can instead just say `esmDropdownContextMod.foo` */
  override def _to: Context[DropdownContextValue | Null] = default
}
