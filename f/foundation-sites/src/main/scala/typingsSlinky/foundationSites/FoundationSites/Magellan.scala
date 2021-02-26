package typingsSlinky.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/magellan.html#javascript-reference
@js.native
trait Magellan extends StObject {
  
  def calcPoints(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def reflow(): Unit = js.native
  
  def scrollToLoc(location: String): Unit = js.native
}
object Magellan {
  
  @scala.inline
  def apply(calcPoints: () => Unit, destroy: () => Unit, reflow: () => Unit, scrollToLoc: String => Unit): Magellan = {
    val __obj = js.Dynamic.literal(calcPoints = js.Any.fromFunction0(calcPoints), destroy = js.Any.fromFunction0(destroy), reflow = js.Any.fromFunction0(reflow), scrollToLoc = js.Any.fromFunction1(scrollToLoc))
    __obj.asInstanceOf[Magellan]
  }
  
  @scala.inline
  implicit class MagellanMutableBuilder[Self <: Magellan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalcPoints(value: () => Unit): Self = StObject.set(x, "calcPoints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReflow(value: () => Unit): Self = StObject.set(x, "reflow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollToLoc(value: String => Unit): Self = StObject.set(x, "scrollToLoc", js.Any.fromFunction1(value))
  }
}
