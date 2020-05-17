package typingsSlinky.chromeApps.chrome.fileSystem

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
  implicit def apply(value: ChooseDirectoryEntryOptions): ChooseEntryOptions = value.asInstanceOf[ChooseEntryOptions]
  @scala.inline
  implicit def apply(value: ChooseEntryOptionsBase): ChooseEntryOptions = value.asInstanceOf[ChooseEntryOptions]
  @scala.inline
  implicit def apply(value: ChooseFileEntryOptions): ChooseEntryOptions = value.asInstanceOf[ChooseEntryOptions]
  @scala.inline
  implicit def apply(value: ChooseMultipleFilesEntryOptions): ChooseEntryOptions = value.asInstanceOf[ChooseEntryOptions]
  @scala.inline
  implicit def apply(value: ChooseSaveFileEntryOptions): ChooseEntryOptions = value.asInstanceOf[ChooseEntryOptions]
}

