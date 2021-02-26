package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A structure for content events. */
@js.native
trait ContentEvent extends EventObject {
  
  /**
    * The action.
    *
    * The value can be one of the {@link ContentAction} constants.
    */
  var Action: Double = js.native
  
  /**
    * The content to that the action is related (e.g., the content that was just physically destroyed, the content that was just inserted into a folder
    * content).
    *
    * This member must be filled as follows:
    *
    * {{table here, see documentation}}
    */
  var Content: XContent = js.native
  
  /**
    * A content identifier, which must be filled according to the action notified (e.g., the id of the folder content into which another content was
    * inserted).
    *
    * This member must be filled as follows:
    *
    * {{table here, see documentation}}
    */
  var Id: XContentIdentifier = js.native
}
object ContentEvent {
  
  @scala.inline
  def apply(Action: Double, Content: XContent, Id: XContentIdentifier, Source: XInterface): ContentEvent = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentEvent]
  }
  
  @scala.inline
  implicit class ContentEventMutableBuilder[Self <: ContentEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Double): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: XContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: XContentIdentifier): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
