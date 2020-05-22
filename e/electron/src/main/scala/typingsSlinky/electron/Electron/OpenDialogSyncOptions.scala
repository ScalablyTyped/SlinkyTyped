package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.createDirectory
import typingsSlinky.electron.electronStrings.multiSelections
import typingsSlinky.electron.electronStrings.noResolveAliases
import typingsSlinky.electron.electronStrings.openDirectory
import typingsSlinky.electron.electronStrings.openFile
import typingsSlinky.electron.electronStrings.promptToCreate
import typingsSlinky.electron.electronStrings.showHiddenFiles
import typingsSlinky.electron.electronStrings.treatPackageAsDirectory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenDialogSyncOptions extends js.Object {
  /**
    * Custom label for the confirmation button, when left empty the default label will
    * be used.
    */
  var buttonLabel: js.UndefOr[String] = js.undefined
  var defaultPath: js.UndefOr[String] = js.undefined
  var filters: js.UndefOr[js.Array[FileFilter]] = js.undefined
  /**
    * Message to display above input boxes.
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * Contains which features the dialog should use. The following values are
    * supported:
    */
  var properties: js.UndefOr[
    js.Array[
      openFile | openDirectory | multiSelections | showHiddenFiles | createDirectory | promptToCreate | noResolveAliases | treatPackageAsDirectory
    ]
  ] = js.undefined
  /**
    * Create when packaged for the Mac App Store.
    */
  var securityScopedBookmarks: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object OpenDialogSyncOptions {
  @scala.inline
  def apply(
    buttonLabel: String = null,
    defaultPath: String = null,
    filters: js.Array[FileFilter] = null,
    message: String = null,
    properties: js.Array[
      openFile | openDirectory | multiSelections | showHiddenFiles | createDirectory | promptToCreate | noResolveAliases | treatPackageAsDirectory
    ] = null,
    securityScopedBookmarks: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): OpenDialogSyncOptions = {
    val __obj = js.Dynamic.literal()
    if (buttonLabel != null) __obj.updateDynamic("buttonLabel")(buttonLabel.asInstanceOf[js.Any])
    if (defaultPath != null) __obj.updateDynamic("defaultPath")(defaultPath.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (!js.isUndefined(securityScopedBookmarks)) __obj.updateDynamic("securityScopedBookmarks")(securityScopedBookmarks.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenDialogSyncOptions]
  }
}

