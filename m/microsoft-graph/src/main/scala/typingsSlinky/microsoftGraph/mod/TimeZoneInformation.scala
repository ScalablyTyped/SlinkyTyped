package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeZoneInformation extends StObject {
  
  // An identifier for the time zone.
  var alias: js.UndefOr[NullableOption[String]] = js.native
  
  // A display string that represents the time zone.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
}
object TimeZoneInformation {
  
  @scala.inline
  def apply(): TimeZoneInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeZoneInformation]
  }
  
  @scala.inline
  implicit class TimeZoneInformationMutableBuilder[Self <: TimeZoneInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: NullableOption[String]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasNull: Self = StObject.set(x, "alias", null)
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
