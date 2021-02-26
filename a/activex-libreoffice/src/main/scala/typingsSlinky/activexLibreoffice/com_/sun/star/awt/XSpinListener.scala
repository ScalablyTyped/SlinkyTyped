package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive spin events. */
@js.native
trait XSpinListener extends XEventListener {
  
  /** is invoked when the spin field is spun down. */
  def down(rEvent: SpinEvent): Unit = js.native
  
  /** is invoked when the spin field is set to the lower value. */
  def first(rEvent: SpinEvent): Unit = js.native
  
  /** is invoked when the spin field is set to the upper value. */
  def last(rEvent: SpinEvent): Unit = js.native
  
  /** is invoked when the spin field is spun up. */
  def up(rEvent: SpinEvent): Unit = js.native
}
object XSpinListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    down: SpinEvent => Unit,
    first: SpinEvent => Unit,
    last: SpinEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    up: SpinEvent => Unit
  ): XSpinListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), down = js.Any.fromFunction1(down), first = js.Any.fromFunction1(first), last = js.Any.fromFunction1(last), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), up = js.Any.fromFunction1(up))
    __obj.asInstanceOf[XSpinListener]
  }
  
  @scala.inline
  implicit class XSpinListenerMutableBuilder[Self <: XSpinListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDown(value: SpinEvent => Unit): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirst(value: SpinEvent => Unit): Self = StObject.set(x, "first", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLast(value: SpinEvent => Unit): Self = StObject.set(x, "last", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUp(value: SpinEvent => Unit): Self = StObject.set(x, "up", js.Any.fromFunction1(value))
  }
}
