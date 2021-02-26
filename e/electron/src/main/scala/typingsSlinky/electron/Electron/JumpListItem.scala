package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.file
import typingsSlinky.electron.electronStrings.separator
import typingsSlinky.electron.electronStrings.task
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JumpListItem extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/jump-list-item
  /**
    * The command line arguments when `program` is executed. Should only be set if
    * `type` is `task`.
    */
  var args: js.UndefOr[String] = js.native
  
  /**
    * Description of the task (displayed in a tooltip). Should only be set if `type`
    * is `task`.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The index of the icon in the resource file. If a resource file contains multiple
    * icons this value can be used to specify the zero-based index of the icon that
    * should be displayed for this task. If a resource file contains only one icon,
    * this property should be set to zero.
    */
  var iconIndex: js.UndefOr[Double] = js.native
  
  /**
    * The absolute path to an icon to be displayed in a Jump List, which can be an
    * arbitrary resource file that contains an icon (e.g. `.ico`, `.exe`, `.dll`). You
    * can usually specify `process.execPath` to show the program icon.
    */
  var iconPath: js.UndefOr[String] = js.native
  
  /**
    * Path of the file to open, should only be set if `type` is `file`.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Path of the program to execute, usually you should specify `process.execPath`
    * which opens the current program. Should only be set if `type` is `task`.
    */
  var program: js.UndefOr[String] = js.native
  
  /**
    * The text to be displayed for the item in the Jump List. Should only be set if
    * `type` is `task`.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * One of the following:
    */
  var `type`: js.UndefOr[task | separator | file] = js.native
  
  /**
    * The working directory. Default is empty.
    */
  var workingDirectory: js.UndefOr[String] = js.native
}
object JumpListItem {
  
  @scala.inline
  def apply(): JumpListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JumpListItem]
  }
  
  @scala.inline
  implicit class JumpListItemMutableBuilder[Self <: JumpListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: String): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIconIndex(value: Double): Self = StObject.set(x, "iconIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconIndexUndefined: Self = StObject.set(x, "iconIndex", js.undefined)
    
    @scala.inline
    def setIconPath(value: String): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setProgram(value: String): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: task | separator | file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWorkingDirectory(value: String): Self = StObject.set(x, "workingDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkingDirectoryUndefined: Self = StObject.set(x, "workingDirectory", js.undefined)
  }
}
