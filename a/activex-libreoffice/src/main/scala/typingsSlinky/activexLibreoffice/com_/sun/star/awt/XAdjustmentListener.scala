package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive adjustment events. */
@js.native
trait XAdjustmentListener extends XEventListener {
  
  /** is invoked when the adjustment has changed. */
  def adjustmentValueChanged(rEvent: AdjustmentEvent): Unit = js.native
}
object XAdjustmentListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    adjustmentValueChanged: AdjustmentEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAdjustmentListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), adjustmentValueChanged = js.Any.fromFunction1(adjustmentValueChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAdjustmentListener]
  }
  
  @scala.inline
  implicit class XAdjustmentListenerMutableBuilder[Self <: XAdjustmentListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustmentValueChanged(value: AdjustmentEvent => Unit): Self = StObject.set(x, "adjustmentValueChanged", js.Any.fromFunction1(value))
  }
}
