package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object downloads {
  type DownloadChangedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[
      /* downloadDelta */ typingsSlinky.chrome.chrome.downloads.DownloadDelta, 
      scala.Unit
    ]
  ]
  type DownloadCreatedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* downloadItem */ typingsSlinky.chrome.chrome.downloads.DownloadItem, scala.Unit]
  ]
  type DownloadDeterminingFilenameEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* downloadItem */ typingsSlinky.chrome.chrome.downloads.DownloadItem, 
      /* suggest */ js.Function1[
        /* suggestion */ js.UndefOr[typingsSlinky.chrome.chrome.downloads.DownloadFilenameSuggestion], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ]
  type DownloadErasedEvent = typingsSlinky.chrome.chrome.events.Event[js.Function1[/* downloadId */ scala.Double, scala.Unit]]
}
