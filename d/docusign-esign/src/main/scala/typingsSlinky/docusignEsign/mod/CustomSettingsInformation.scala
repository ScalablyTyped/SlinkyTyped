package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomSettingsInformation extends StObject {
  
  /**
    * The name/value pair information for the user custom setting.
    */
  var customSettings: js.UndefOr[
    js.Array[
      /* A name-value pair that describes an item and provides a value for the item. */ NameValue
    ]
  ] = js.native
}
object CustomSettingsInformation {
  
  @scala.inline
  def apply(): CustomSettingsInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomSettingsInformation]
  }
  
  @scala.inline
  implicit class CustomSettingsInformationMutableBuilder[Self <: CustomSettingsInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomSettings(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = StObject.set(x, "customSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSettingsUndefined: Self = StObject.set(x, "customSettings", js.undefined)
    
    @scala.inline
    def setCustomSettingsVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = StObject.set(x, "customSettings", js.Array(value :_*))
  }
}
