package typingsSlinky.foundationSites.FoundationSites

import typingsSlinky.foundationSites.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/accordion.html#javascript-reference
@js.native
trait Accordion extends StObject {
  
  def destroy(): Unit = js.native
  
  def down($target: JQuery, firstTime: Boolean): Unit = js.native
  
  def toggle($target: JQuery): Unit = js.native
  
  def up($target: JQuery): Unit = js.native
}
object Accordion {
  
  @scala.inline
  def apply(destroy: () => Unit, down: (JQuery, Boolean) => Unit, toggle: JQuery => Unit, up: JQuery => Unit): Accordion = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), down = js.Any.fromFunction2(down), toggle = js.Any.fromFunction1(toggle), up = js.Any.fromFunction1(up))
    __obj.asInstanceOf[Accordion]
  }
  
  @scala.inline
  implicit class AccordionMutableBuilder[Self <: Accordion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDown(value: (JQuery, Boolean) => Unit): Self = StObject.set(x, "down", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToggle(value: JQuery => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUp(value: JQuery => Unit): Self = StObject.set(x, "up", js.Any.fromFunction1(value))
  }
}
