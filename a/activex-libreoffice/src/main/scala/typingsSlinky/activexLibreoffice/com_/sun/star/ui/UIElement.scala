package typingsSlinky.activexLibreoffice.com_.sun.star.ui

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.frame.XFrame
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XUpdatable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a user interface element.
  *
  * A user interface element consists of a unique identifier and a type specifier. It provides an interface to retrieve a special purpose interface which
  * depends on the specific user interface element type. Every user interface must be initialized before it can be used.
  * @since OOo 2.0
  */
@js.native
trait UIElement
  extends XUIElement
     with XInitialization
     with XUpdatable
     with XComponent
object UIElement {
  
  @scala.inline
  def apply(
    Frame: XFrame,
    RealInterface: XInterface,
    ResourceURL: String,
    Type: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    getRealInterface: () => XInterface,
    initialize: SeqEquiv[_] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    update: () => Unit
  ): UIElement = {
    val __obj = js.Dynamic.literal(Frame = Frame.asInstanceOf[js.Any], RealInterface = RealInterface.asInstanceOf[js.Any], ResourceURL = ResourceURL.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getRealInterface = js.Any.fromFunction0(getRealInterface), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[UIElement]
  }
}
