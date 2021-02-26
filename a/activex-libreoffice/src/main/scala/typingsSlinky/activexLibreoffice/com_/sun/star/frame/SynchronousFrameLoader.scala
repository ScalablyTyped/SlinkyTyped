package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNamed
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * derivations of this abstract service are used to load components into Frames of the environment
  *
  * Concrete implementations of this service register, for example, for file name extensions or MIME types to load appropriate components. The components
  * loaded are at least {@link Controller} . Instead of service {@link FrameLoader} this one use synchronous processes to load the component.
  * @see FrameLoader
  */
@js.native
trait SynchronousFrameLoader
  extends XSynchronousFrameLoader
     with XInitialization
     with XNamed
object SynchronousFrameLoader {
  
  @scala.inline
  def apply(
    Name: String,
    acquire: () => Unit,
    cancel: () => Unit,
    getName: () => String,
    initialize: SeqEquiv[_] => Unit,
    load: (SeqEquiv[PropertyValue], XFrame) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setName: String => Unit
  ): SynchronousFrameLoader = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), cancel = js.Any.fromFunction0(cancel), getName = js.Any.fromFunction0(getName), initialize = js.Any.fromFunction1(initialize), load = js.Any.fromFunction2(load), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[SynchronousFrameLoader]
  }
}
