package typingsSlinky.chromeApps.chrome.fileSystemProvider

import typingsSlinky.chromeApps.chrome.fileSystemProvider.internal.EntryPathRequestedEventOptions
import typingsSlinky.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEntryRequestedEventOptions extends EntryPathRequestedEventOptions {
  /** Whether the operation is recursive (for directories only). */
  var recursive: Boolean
}

object DeleteEntryRequestedEventOptions {
  @scala.inline
  def apply(entryPath: String, fileSystemId: String, recursive: Boolean, requestId: integer): DeleteEntryRequestedEventOptions = {
    val __obj = js.Dynamic.literal(entryPath = entryPath.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEntryRequestedEventOptions]
  }
}

