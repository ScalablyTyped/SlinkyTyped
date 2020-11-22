package typingsSlinky.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomSettingsInformation extends js.Object {
  
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
  implicit class CustomSettingsInformationOps[Self <: CustomSettingsInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomSettingsVarargs(
      value: (/* A name-value pair that describes an item and provides a value for the item. */ NameValue)*
    ): Self = this.set("customSettings", js.Array(value :_*))
    
    @scala.inline
    def setCustomSettings(
      value: js.Array[
          /* A name-value pair that describes an item and provides a value for the item. */ NameValue
        ]
    ): Self = this.set("customSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSettings: Self = this.set("customSettings", js.undefined)
  }
}
