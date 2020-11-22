package typingsSlinky.maximMazurokGapiClientChat.gapi.client.chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageButton extends js.Object {
  
  /** The icon specified by an enum that indices to an icon provided by Chat API. */
  var icon: js.UndefOr[String] = js.native
  
  /** The icon specified by a URL. */
  var iconUrl: js.UndefOr[String] = js.native
  
  /** The name of this image_button which will be used for accessibility. Default value will be provided if developers don't specify. */
  var name: js.UndefOr[String] = js.native
  
  /** The onclick action. */
  var onClick: js.UndefOr[OnClick] = js.native
}
object ImageButton {
  
  @scala.inline
  def apply(): ImageButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageButton]
  }
  
  @scala.inline
  implicit class ImageButtonOps[Self <: ImageButton] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnClick(value: OnClick): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
}
