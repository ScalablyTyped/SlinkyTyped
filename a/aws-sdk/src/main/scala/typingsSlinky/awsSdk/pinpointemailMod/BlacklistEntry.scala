package typingsSlinky.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlacklistEntry extends StObject {
  
  /**
    * Additional information about the blacklisting event, as provided by the blacklist maintainer.
    */
  var Description: js.UndefOr[BlacklistingDescription] = js.native
  
  /**
    * The time when the blacklisting event occurred, shown in Unix time format.
    */
  var ListingTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The name of the blacklist that the IP address appears on.
    */
  var RblName: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.RblName] = js.native
}
object BlacklistEntry {
  
  @scala.inline
  def apply(): BlacklistEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlacklistEntry]
  }
  
  @scala.inline
  implicit class BlacklistEntryMutableBuilder[Self <: BlacklistEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: BlacklistingDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setListingTime(value: js.Date): Self = StObject.set(x, "ListingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListingTimeUndefined: Self = StObject.set(x, "ListingTime", js.undefined)
    
    @scala.inline
    def setRblName(value: RblName): Self = StObject.set(x, "RblName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRblNameUndefined: Self = StObject.set(x, "RblName", js.undefined)
  }
}
