package typingsSlinky.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollapsePinSettings extends js.Object {
  
  /** Specifies the custom tooltip for collapse pin.Refer to ejRibbon#tabs-&gt;groups-&gt;content-&gt;groups-&gt;customToolTip for its inner properties.
    * @Default {Object}
    */
  var customToolTip: js.UndefOr[js.Any] = js.native
  
  /** Sets tooltip for the collapse pin .
    * @Default {null}
    */
  var toolTip: js.UndefOr[String] = js.native
}
object CollapsePinSettings {
  
  @scala.inline
  def apply(): CollapsePinSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapsePinSettings]
  }
  
  @scala.inline
  implicit class CollapsePinSettingsOps[Self <: CollapsePinSettings] (val x: Self) extends AnyVal {
    
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
    def setCustomToolTip(value: js.Any): Self = this.set("customToolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomToolTip: Self = this.set("customToolTip", js.undefined)
    
    @scala.inline
    def setToolTip(value: String): Self = this.set("toolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolTip: Self = this.set("toolTip", js.undefined)
  }
}
