package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.createDirectory
import typingsSlinky.electron.electronStrings.dontAddToRecent
import typingsSlinky.electron.electronStrings.showHiddenFiles
import typingsSlinky.electron.electronStrings.showOverwriteConfirmation
import typingsSlinky.electron.electronStrings.treatPackageAsDirectory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveDialogSyncOptions extends js.Object {
  
  /**
    * Custom label for the confirmation button, when left empty the default label will
    * be used.
    */
  var buttonLabel: js.UndefOr[String] = js.native
  
  /**
    * Absolute directory path, absolute file path, or file name to use by default.
    */
  var defaultPath: js.UndefOr[String] = js.native
  
  var filters: js.UndefOr[js.Array[FileFilter]] = js.native
  
  /**
    * Message to display above text fields.
    *
    * @platform darwin
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * Custom label for the text displayed in front of the filename text field.
    *
    * @platform darwin
    */
  var nameFieldLabel: js.UndefOr[String] = js.native
  
  var properties: js.UndefOr[
    js.Array[
      showHiddenFiles | createDirectory | treatPackageAsDirectory | showOverwriteConfirmation | dontAddToRecent
    ]
  ] = js.native
  
  /**
    * Create a security scoped bookmark when packaged for the Mac App Store. If this
    * option is enabled and the file doesn't already exist a blank file will be
    * created at the chosen path.
    *
    * @platform darwin,mas
    */
  var securityScopedBookmarks: js.UndefOr[Boolean] = js.native
  
  /**
    * Show the tags input box, defaults to `true`.
    *
    * @platform darwin
    */
  var showsTagField: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object SaveDialogSyncOptions {
  
  @scala.inline
  def apply(): SaveDialogSyncOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveDialogSyncOptions]
  }
  
  @scala.inline
  implicit class SaveDialogSyncOptionsOps[Self <: SaveDialogSyncOptions] (val x: Self) extends AnyVal {
    
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
    def setButtonLabel(value: String): Self = this.set("buttonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonLabel: Self = this.set("buttonLabel", js.undefined)
    
    @scala.inline
    def setDefaultPath(value: String): Self = this.set("defaultPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPath: Self = this.set("defaultPath", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: FileFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[FileFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setNameFieldLabel(value: String): Self = this.set("nameFieldLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameFieldLabel: Self = this.set("nameFieldLabel", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(
      value: (showHiddenFiles | createDirectory | treatPackageAsDirectory | showOverwriteConfirmation | dontAddToRecent)*
    ): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(
      value: js.Array[
          showHiddenFiles | createDirectory | treatPackageAsDirectory | showOverwriteConfirmation | dontAddToRecent
        ]
    ): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    
    @scala.inline
    def setSecurityScopedBookmarks(value: Boolean): Self = this.set("securityScopedBookmarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityScopedBookmarks: Self = this.set("securityScopedBookmarks", js.undefined)
    
    @scala.inline
    def setShowsTagField(value: Boolean): Self = this.set("showsTagField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowsTagField: Self = this.set("showsTagField", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
