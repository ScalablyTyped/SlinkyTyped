package typingsSlinky.chrome.chrome.contentSettings

import typingsSlinky.chrome.chromeStrings.allow
import typingsSlinky.chrome.chromeStrings.block
import typingsSlinky.chrome.chromeStrings.detect_important_content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginsSetDetails extends SetDetails {
  
  @JSName("setting")
  var setting_PluginsSetDetails: allow | block | detect_important_content = js.native
}
object PluginsSetDetails {
  
  @scala.inline
  def apply(primaryPattern: String, setting: allow | block | detect_important_content): PluginsSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginsSetDetails]
  }
  
  @scala.inline
  implicit class PluginsSetDetailsOps[Self <: PluginsSetDetails] (val x: Self) extends AnyVal {
    
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
    def setSetting(value: allow | block | detect_important_content): Self = this.set("setting", value.asInstanceOf[js.Any])
  }
}
