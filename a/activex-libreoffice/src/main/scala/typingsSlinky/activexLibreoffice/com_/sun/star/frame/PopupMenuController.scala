package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XPopupMenu
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsSlinky.activexLibreoffice.com_.sun.star.util.URL
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a pop-up menu controller.
  *
  * A pop-up menu controller is used to make special functions available to users, which depend on runtime or context specific conditions. ;  A typical
  * example for a pop-up menu controller can be a recent file list implementation which provides a list of latest files that a user has worked on. This
  * list gets changes consistently during a work session.
  * @since OOo 2.0
  */
@js.native
trait PopupMenuController
  extends XStatusListener
     with XPopupMenuController
     with XInitialization
     with XDispatchProvider
     with XComponent
object PopupMenuController {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    disposing: EventObject => Unit,
    initialize: SeqEquiv[_] => Unit,
    queryDispatch: (URL, String, Double) => XDispatch,
    queryDispatches: SeqEquiv[DispatchDescriptor] => SafeArray[XDispatch],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setPopupMenu: XPopupMenu => Unit,
    statusChanged: FeatureStateEvent => Unit,
    updatePopupMenu: () => Unit
  ): PopupMenuController = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), disposing = js.Any.fromFunction1(disposing), initialize = js.Any.fromFunction1(initialize), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setPopupMenu = js.Any.fromFunction1(setPopupMenu), statusChanged = js.Any.fromFunction1(statusChanged), updatePopupMenu = js.Any.fromFunction0(updatePopupMenu))
    __obj.asInstanceOf[PopupMenuController]
  }
}
