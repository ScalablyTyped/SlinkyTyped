package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive events when the state of a feature changes.
  *
  * Nobody guarantee any notification. Use combination of {@link XNotifyingDispatch} and {@link XDispatchResultListener} for that.
  * @see XDispatch
  * @see XNotifyingDispatch
  * @see XDispatchResultListener
  */
@js.native
trait XStatusListener extends XEventListener {
  
  /**
    * is called when the status of the feature changes.
    * @param State provides information about changes of the requested feature
    */
  def statusChanged(State: FeatureStateEvent): Unit = js.native
}
object XStatusListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    statusChanged: FeatureStateEvent => Unit
  ): XStatusListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), statusChanged = js.Any.fromFunction1(statusChanged))
    __obj.asInstanceOf[XStatusListener]
  }
  
  @scala.inline
  implicit class XStatusListenerMutableBuilder[Self <: XStatusListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatusChanged(value: FeatureStateEvent => Unit): Self = StObject.set(x, "statusChanged", js.Any.fromFunction1(value))
  }
}
