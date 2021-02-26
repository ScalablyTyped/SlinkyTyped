package typingsSlinky.activexLibreoffice.com_.sun.star.sdb

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is invoked in case of fired database exception triggered by a database object. */
@js.native
trait SQLErrorEvent extends EventObject {
  
  /** contains the exception that is going to be fired. */
  var Reason: js.Any = js.native
}
object SQLErrorEvent {
  
  @scala.inline
  def apply(Reason: js.Any, Source: XInterface): SQLErrorEvent = {
    val __obj = js.Dynamic.literal(Reason = Reason.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLErrorEvent]
  }
  
  @scala.inline
  implicit class SQLErrorEventMutableBuilder[Self <: SQLErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: js.Any): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
  }
}
