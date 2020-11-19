package typingsSlinky.chromeApps.chrome.fileSystem

import typingsSlinky.chromeApps.chromeAppsStrings.saveFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.chromeApps.chrome.fileSystem.ChooseEntryOptions because Already inherited */ @js.native
trait ChooseSaveFileEntryOptions extends ChooseEntryOptionsBase {
  
  var `type`: saveFile = js.native
}
object ChooseSaveFileEntryOptions {
  
  @scala.inline
  def apply(`type`: saveFile): ChooseSaveFileEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseSaveFileEntryOptions]
  }
  
  @scala.inline
  implicit class ChooseSaveFileEntryOptionsOps[Self <: ChooseSaveFileEntryOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: saveFile): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
