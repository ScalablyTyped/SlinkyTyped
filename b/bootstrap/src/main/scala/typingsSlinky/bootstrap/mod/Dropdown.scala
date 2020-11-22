package typingsSlinky.bootstrap.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.bootstrap.anon.PartialOptionsBoundary
import typingsSlinky.bootstrap.dropdownMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "Dropdown")
@js.native
class Dropdown protected () extends default {
  def this(element: Element) = this()
  def this(element: Element, options: PartialOptionsBoundary) = this()
}
/* static members */
@JSImport("bootstrap", "Dropdown")
@js.native
object Dropdown extends js.Object {
  
  /**
    * Static method which allows you to get the dropdown instance associated
    * with a DOM element.
    */
  def getInstance(element: Element): typingsSlinky.bootstrap.dropdownMod.Dropdown = js.native
  def getInstance(element: Element, options: PartialOptionsBoundary): typingsSlinky.bootstrap.dropdownMod.Dropdown = js.native
  
  @js.native
  object Events extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.bootstrap.dropdownMod.Dropdown.Events with String] = js.native
    
    /* "hidden.bs.dropdown" */ val hidden: typingsSlinky.bootstrap.dropdownMod.Dropdown.Events.hidden with String = js.native
    
    /* "hide.bs.dropdown" */ val hide: typingsSlinky.bootstrap.dropdownMod.Dropdown.Events.hide with String = js.native
    
    /* "show.bs.dropdown" */ val show: typingsSlinky.bootstrap.dropdownMod.Dropdown.Events.show with String = js.native
    
    /* "shown.bs.dropdown" */ val shown: typingsSlinky.bootstrap.dropdownMod.Dropdown.Events.shown with String = js.native
  }
}
