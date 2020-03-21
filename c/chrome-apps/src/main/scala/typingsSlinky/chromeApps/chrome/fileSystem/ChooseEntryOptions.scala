package typingsSlinky.chromeApps.chrome.fileSystem

import typingsSlinky.chromeApps.chromeAppsBooleans.`false`
import typingsSlinky.chromeApps.chromeAppsBooleans.`true`
import typingsSlinky.chromeApps.chromeAppsStrings.openDirectory
import typingsSlinky.chromeApps.chromeAppsStrings.openFile
import typingsSlinky.chromeApps.chromeAppsStrings.openWritableFile
import typingsSlinky.chromeApps.chromeAppsStrings.saveFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chromeApps.chrome.fileSystem.ChooseFileEntryOptions
  - typingsSlinky.chromeApps.chrome.fileSystem.ChooseSaveFileEntryOptions
  - typingsSlinky.chromeApps.chrome.fileSystem.ChooseMultipleFilesEntryOptions
  - typingsSlinky.chromeApps.chrome.fileSystem.ChooseDirectoryEntryOptions
  - typingsSlinky.chromeApps.chrome.fileSystem.ChooseEntryOptionsBase
*/
trait ChooseEntryOptions extends js.Object

object ChooseEntryOptions {
  @scala.inline
  def ChooseSaveFileEntryOptions(
    `type`: saveFile,
    accepts: js.Array[AcceptOptions] = null,
    acceptsAllTypes: js.UndefOr[Boolean] = js.undefined,
    suggestedName: String = null
  ): ChooseEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptsAllTypes)) __obj.updateDynamic("acceptsAllTypes")(acceptsAllTypes.asInstanceOf[js.Any])
    if (suggestedName != null) __obj.updateDynamic("suggestedName")(suggestedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseEntryOptions]
  }
  @scala.inline
  def ChooseEntryOptionsBase(
    accepts: js.Array[AcceptOptions] = null,
    acceptsAllTypes: js.UndefOr[Boolean] = js.undefined,
    suggestedName: String = null
  ): ChooseEntryOptions = {
    val __obj = js.Dynamic.literal()
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptsAllTypes)) __obj.updateDynamic("acceptsAllTypes")(acceptsAllTypes.asInstanceOf[js.Any])
    if (suggestedName != null) __obj.updateDynamic("suggestedName")(suggestedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseEntryOptions]
  }
  @scala.inline
  def ChooseMultipleFilesEntryOptions(
    acceptsMultiple: `true`,
    `type`: openFile | openWritableFile,
    accepts: js.Array[AcceptOptions] = null,
    acceptsAllTypes: js.UndefOr[Boolean] = js.undefined,
    suggestedName: String = null
  ): ChooseEntryOptions = {
    val __obj = js.Dynamic.literal(acceptsMultiple = acceptsMultiple.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptsAllTypes)) __obj.updateDynamic("acceptsAllTypes")(acceptsAllTypes.asInstanceOf[js.Any])
    if (suggestedName != null) __obj.updateDynamic("suggestedName")(suggestedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseEntryOptions]
  }
  @scala.inline
  def ChooseFileEntryOptions(
    `type`: openFile | openWritableFile,
    accepts: js.Array[AcceptOptions] = null,
    acceptsAllTypes: js.UndefOr[Boolean] = js.undefined,
    acceptsMultiple: `false` = null,
    suggestedName: String = null
  ): ChooseEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptsAllTypes)) __obj.updateDynamic("acceptsAllTypes")(acceptsAllTypes.asInstanceOf[js.Any])
    if (acceptsMultiple != null) __obj.updateDynamic("acceptsMultiple")(acceptsMultiple.asInstanceOf[js.Any])
    if (suggestedName != null) __obj.updateDynamic("suggestedName")(suggestedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseEntryOptions]
  }
  @scala.inline
  def ChooseDirectoryEntryOptions(
    `type`: openDirectory,
    accepts: js.Array[AcceptOptions] = null,
    acceptsAllTypes: js.UndefOr[Boolean] = js.undefined,
    suggestedName: String = null
  ): ChooseEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (accepts != null) __obj.updateDynamic("accepts")(accepts.asInstanceOf[js.Any])
    if (!js.isUndefined(acceptsAllTypes)) __obj.updateDynamic("acceptsAllTypes")(acceptsAllTypes.asInstanceOf[js.Any])
    if (suggestedName != null) __obj.updateDynamic("suggestedName")(suggestedName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseEntryOptions]
  }
}

