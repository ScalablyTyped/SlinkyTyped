package typingsSlinky.chromeDashApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileSystemProvider {
  import typingsSlinky.chromeDashApps.chrome.fileSystemProvider._internal_.FilePathRequestedEventOptions
  import typingsSlinky.chromeDashApps.chrome.fileSystemProvider._internal_.RequestedEventOptions

  type ConfigureRequestedEventOptions = RequestedEventOptions
  type CreateFileRequestedEventOptions = FilePathRequestedEventOptions
  type MoveEntryRequestedEventOptions = CopyEntryRequestedEventOptions
  type UnmountRequestedEventOptions = RequestedEventOptions
}
