package typingsSlinky.bootstrap.scrollspyMod

import org.scalajs.dom.raw.Element
import typingsSlinky.bootstrap.anon.PartialOptionsMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap/js/dist/scrollspy", JSImport.Default)
@js.native
class default protected () extends ScrollSpy {
  def this(element: Element) = this()
  def this(element: Element, options: PartialOptionsMethod) = this()
}
/* static members */
@JSImport("bootstrap/js/dist/scrollspy", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Static method which allows you to get the scrollspy instance associated
    * with a DOM element
    */
  def getInstance(element: Element): ScrollSpy = js.native
  def getInstance(element: Element, options: PartialOptionsMethod): ScrollSpy = js.native
  
  @js.native
  object Events extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.scrollspyMod.ScrollSpy.Events with String] = js.native
    
    /* "activate.bs.scrollspy" */ val activate: typingsSlinky.bootstrap.scrollspyMod.ScrollSpy.Events.activate with String = js.native
  }
}
