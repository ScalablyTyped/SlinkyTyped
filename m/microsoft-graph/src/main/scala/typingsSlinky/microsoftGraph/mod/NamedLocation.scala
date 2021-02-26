package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedLocation extends Entity {
  
  /**
    * The Timestamp type represents creation date and time of the location using ISO 8601 format and is always in UTC time.
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Human-readable name of the location.
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The Timestamp type represents last modified date and time of the location using ISO 8601 format and is always in UTC
    * time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Read-only.
    */
  var modifiedDateTime: js.UndefOr[NullableOption[String]] = js.native
}
object NamedLocation {
  
  @scala.inline
  def apply(): NamedLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedLocation]
  }
  
  @scala.inline
  implicit class NamedLocationMutableBuilder[Self <: NamedLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "modifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedDateTimeNull: Self = StObject.set(x, "modifiedDateTime", null)
    
    @scala.inline
    def setModifiedDateTimeUndefined: Self = StObject.set(x, "modifiedDateTime", js.undefined)
  }
}
