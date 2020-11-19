package typingsSlinky.firefoxWebextBrowser.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firefoxWebextBrowser.browser.manifest.ExtensionID
import typingsSlinky.firefoxWebextBrowser.browser.manifest.NativeManifest
import typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataDescription extends NativeManifest {
  
  var data: StringDictionary[js.Any] = js.native
  
  var description: String = js.native
  
  var name: ExtensionID = js.native
  
  var `type`: storage = js.native
}
object DataDescription {
  
  @scala.inline
  def apply(data: StringDictionary[js.Any], description: String, name: ExtensionID, `type`: storage): DataDescription = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataDescription]
  }
  
  @scala.inline
  implicit class DataDescriptionOps[Self <: DataDescription] (val x: Self) extends AnyVal {
    
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
    def setData(value: StringDictionary[js.Any]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ExtensionID): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: storage): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
