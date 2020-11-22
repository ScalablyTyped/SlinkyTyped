package typingsSlinky.bootstrap.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.bootstrap.anon.PartialOptionsMethod
import typingsSlinky.bootstrap.scrollspyMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "ScrollSpy")
@js.native
class ScrollSpy protected () extends default {
  def this(element: Element) = this()
  def this(element: Element, options: PartialOptionsMethod) = this()
}
/* static members */
@JSImport("bootstrap", "ScrollSpy")
@js.native
object ScrollSpy extends js.Object {
  
  /**
    * Static method which allows you to get the scrollspy instance associated
    * with a DOM element
    */
  def getInstance(element: Element): typingsSlinky.bootstrap.scrollspyMod.ScrollSpy = js.native
  def getInstance(element: Element, options: PartialOptionsMethod): typingsSlinky.bootstrap.scrollspyMod.ScrollSpy = js.native
  
  @js.native
  object Events extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.scrollspyMod.ScrollSpy.Events with String] = js.native
    
    /* "activate.bs.scrollspy" */ val activate: typingsSlinky.bootstrap.scrollspyMod.ScrollSpy.Events.activate with String = js.native
  }
}
