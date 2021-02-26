package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The description of a change to a {@link com.sun.star.ucb.XRemoteContentProviderSupplier} .
  * @author Stephan Bergmann
  * @version 1.0
  */
@js.native
trait RemoteContentProviderChangeEvent extends EventObject {
  
  /** An indicator whether a remote content provider has been added or removed. */
  var Action: RemoteContentProviderChangeAction = js.native
  
  /** The identifier with which the remote content provider is registered at the {@link com.sun.star.ucb.XRemoteContentProviderSupplier} . */
  var Identifier: String = js.native
}
object RemoteContentProviderChangeEvent {
  
  @scala.inline
  def apply(Action: RemoteContentProviderChangeAction, Identifier: String, Source: XInterface): RemoteContentProviderChangeEvent = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteContentProviderChangeEvent]
  }
  
  @scala.inline
  implicit class RemoteContentProviderChangeEventMutableBuilder[Self <: RemoteContentProviderChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: RemoteContentProviderChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
