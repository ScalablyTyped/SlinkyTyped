package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the information about a changed title. */
@js.native
trait TitleChangedEvent extends EventObject {
  
  /** The new title */
  var Title: String = js.native
}
object TitleChangedEvent {
  
  @scala.inline
  def apply(Source: XInterface, Title: String): TitleChangedEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleChangedEvent]
  }
  
  @scala.inline
  implicit class TitleChangedEventMutableBuilder[Self <: TitleChangedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
