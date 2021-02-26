package typingsSlinky.fscreen

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import typingsSlinky.std.AddEventListenerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("fscreen", JSImport.Default)
  @js.native
  val default: Fscreen = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.fscreen.fscreenStrings.fullscreenEnabled
    - typingsSlinky.fscreen.fscreenStrings.fullscreenElement
    - typingsSlinky.fscreen.fscreenStrings.requestFullscreen
    - typingsSlinky.fscreen.fscreenStrings.exitFullscreen
    - typingsSlinky.fscreen.fscreenStrings.fullscreenchange
    - typingsSlinky.fscreen.fscreenStrings.fullscreenerror
  */
  trait EventName extends StObject
  object EventName {
    
    @scala.inline
    def exitFullscreen: typingsSlinky.fscreen.fscreenStrings.exitFullscreen = "exitFullscreen".asInstanceOf[typingsSlinky.fscreen.fscreenStrings.exitFullscreen]
    
    @scala.inline
    def fullscreenElement: typingsSlinky.fscreen.fscreenStrings.fullscreenElement = "fullscreenElement".asInstanceOf[typingsSlinky.fscreen.fscreenStrings.fullscreenElement]
    
    @scala.inline
    def fullscreenEnabled: typingsSlinky.fscreen.fscreenStrings.fullscreenEnabled = "fullscreenEnabled".asInstanceOf[typingsSlinky.fscreen.fscreenStrings.fullscreenEnabled]
    
    @scala.inline
    def fullscreenchange: typingsSlinky.fscreen.fscreenStrings.fullscreenchange = "fullscreenchange".asInstanceOf[typingsSlinky.fscreen.fscreenStrings.fullscreenchange]
    
    @scala.inline
    def fullscreenerror: typingsSlinky.fscreen.fscreenStrings.fullscreenerror = "fullscreenerror".asInstanceOf[typingsSlinky.fscreen.fscreenStrings.fullscreenerror]
    
    @scala.inline
    def requestFullscreen: typingsSlinky.fscreen.fscreenStrings.requestFullscreen = "requestFullscreen".asInstanceOf[typingsSlinky.fscreen.fscreenStrings.requestFullscreen]
  }
  
  @js.native
  trait Fscreen extends StObject {
    
    def addEventListener(`type`: EventName, handler: Handler): Unit = js.native
    def addEventListener(`type`: EventName, handler: Handler, options: Boolean): Unit = js.native
    def addEventListener(`type`: EventName, handler: Handler, options: AddEventListenerOptions): Unit = js.native
    
    def exitFullscreen(): Unit = js.native
    def exitFullscreen(e: Event): Unit = js.native
    
    val fullscreenElement: js.UndefOr[Element] = js.native
    
    val fullscreenEnabled: Boolean = js.native
    
    def onfullscreenchange(): Unit = js.native
    def onfullscreenchange(e: Event): Unit = js.native
    @JSName("onfullscreenchange")
    var onfullscreenchange_Original: Handler = js.native
    
    def onfullscreenerror(): Unit = js.native
    def onfullscreenerror(e: Event): Unit = js.native
    @JSName("onfullscreenerror")
    var onfullscreenerror_Original: Handler = js.native
    
    def removeEventListener(`type`: EventName, handler: Handler): Unit = js.native
    def removeEventListener(`type`: EventName, handler: Handler, options: Boolean): Unit = js.native
    def removeEventListener(`type`: EventName, handler: Handler, options: AddEventListenerOptions): Unit = js.native
    
    def requestFullscreen(element: Element): Unit = js.native
    
    def requestFullscreenFunction(element: Element): RequestFullScreenFunction = js.native
  }
  
  type Handler = js.Function1[/* e */ js.UndefOr[Event], Unit]
  
  type RequestFullScreenFunction = js.Function1[/* element */ Element, Unit]
  
  type _To = Fscreen
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Fscreen = default
}
