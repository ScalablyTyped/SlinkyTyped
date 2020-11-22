package typingsSlinky.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentHtmlDisplayAnchor extends js.Object {
  
  /**
    * When set to **true**, the start or end anchor strings must match the strings specified by the start and end anchor settings in case as well as in content.
    */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  /**
    * This object defines how the HTML section inside the `startAnchor` and `endAnchor` displays.
    */
  var displaySettings: js.UndefOr[DocumentHtmlDisplaySettings] = js.native
  
  /**
    * Specifies the end of the area in the HTML where the display settings will be applied. If you do not specify an end anchor, the end of the document will be used by default.
    *
    * **Note**: A start anchor, an end anchor, or both are required.
    */
  var endAnchor: js.UndefOr[String] = js.native
  
  /**
    * When **true**, removes the end anchor string for the Smart Section from the HTML, preventing it from displaying.
    */
  var removeEndAnchor: js.UndefOr[Boolean] = js.native
  
  /**
    * When **true**, removes the start anchor string for the Smart Section from the HTML, preventing it from displaying.
    */
  var removeStartAnchor: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the beginning of the area in the HTML where the display settings will be applied. If you do not specify a start anchor, the beginning of the document will be used by default.
    *
    * **Note**: A start anchor, an end anchor, or both are required.
    */
  var startAnchor: js.UndefOr[String] = js.native
}
object DocumentHtmlDisplayAnchor {
  
  @scala.inline
  def apply(): DocumentHtmlDisplayAnchor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentHtmlDisplayAnchor]
  }
  
  @scala.inline
  implicit class DocumentHtmlDisplayAnchorOps[Self <: DocumentHtmlDisplayAnchor] (val x: Self) extends AnyVal {
    
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setDisplaySettings(value: DocumentHtmlDisplaySettings): Self = this.set("displaySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplaySettings: Self = this.set("displaySettings", js.undefined)
    
    @scala.inline
    def setEndAnchor(value: String): Self = this.set("endAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndAnchor: Self = this.set("endAnchor", js.undefined)
    
    @scala.inline
    def setRemoveEndAnchor(value: Boolean): Self = this.set("removeEndAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveEndAnchor: Self = this.set("removeEndAnchor", js.undefined)
    
    @scala.inline
    def setRemoveStartAnchor(value: Boolean): Self = this.set("removeStartAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveStartAnchor: Self = this.set("removeStartAnchor", js.undefined)
    
    @scala.inline
    def setStartAnchor(value: String): Self = this.set("startAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAnchor: Self = this.set("startAnchor", js.undefined)
  }
}
