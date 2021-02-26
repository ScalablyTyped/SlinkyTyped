package typingsSlinky.postmark.anon

import typingsSlinky.postmark.messageSupportingTypesMod.LinkClickLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickLocation extends StObject {
  
  var ClickLocation: LinkClickLocation = js.native
  
  var Link: String = js.native
  
  var Summary: String = js.native
}
object ClickLocation {
  
  @scala.inline
  def apply(ClickLocation: LinkClickLocation, Link: String, Summary: String): ClickLocation = {
    val __obj = js.Dynamic.literal(ClickLocation = ClickLocation.asInstanceOf[js.Any], Link = Link.asInstanceOf[js.Any], Summary = Summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickLocation]
  }
  
  @scala.inline
  implicit class ClickLocationMutableBuilder[Self <: ClickLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickLocation(value: LinkClickLocation): Self = StObject.set(x, "ClickLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
  }
}
