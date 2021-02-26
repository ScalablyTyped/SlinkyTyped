package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * should be used for interaction to handle states of ambiguous filter detection
  *
  * This exception indicates, that generic filter detection can't decide which of two filters is the right one. In this case an interaction will be made.
  * Given URL can be used to decide between given two filters. Decision can be made e.g. by a dialog, on which the user must select one of these filters.
  * A possible continuation of type {@link XInteractionFilterSelect} transport this decision back to source of started interaction.
  * @see XInteractionFilterSelect
  */
@js.native
trait AmbigousFilterRequest extends Exception {
  
  /** transport the real detected filter, which stands in conflict to the pre selected one */
  var DetectedFilter: String = js.native
  
  /** transport the preselected filter */
  var SelectedFilter: String = js.native
  
  /** transport URL which couldn't be detected right */
  var URL: String = js.native
}
object AmbigousFilterRequest {
  
  @scala.inline
  def apply(Context: XInterface, DetectedFilter: String, Message: String, SelectedFilter: String, URL: String): AmbigousFilterRequest = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], DetectedFilter = DetectedFilter.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], SelectedFilter = SelectedFilter.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmbigousFilterRequest]
  }
  
  @scala.inline
  implicit class AmbigousFilterRequestMutableBuilder[Self <: AmbigousFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectedFilter(value: String): Self = StObject.set(x, "DetectedFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedFilter(value: String): Self = StObject.set(x, "SelectedFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setURL(value: String): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
