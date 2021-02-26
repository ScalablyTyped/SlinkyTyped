package typingsSlinky.activexLibreoffice.com_.sun.star.awt.grid

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An instance of this interface is used by the {@link XGridRowSelection} to get notifications about selection changes. */
@js.native
trait XGridSelectionListener extends XEventListener {
  
  /** Invoked after a selection was changed. */
  def selectionChanged(gridSelectionEvent: GridSelectionEvent): Unit = js.native
}
object XGridSelectionListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    selectionChanged: GridSelectionEvent => Unit
  ): XGridSelectionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), selectionChanged = js.Any.fromFunction1(selectionChanged))
    __obj.asInstanceOf[XGridSelectionListener]
  }
  
  @scala.inline
  implicit class XGridSelectionListenerMutableBuilder[Self <: XGridSelectionListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectionChanged(value: GridSelectionEvent => Unit): Self = StObject.set(x, "selectionChanged", js.Any.fromFunction1(value))
  }
}
