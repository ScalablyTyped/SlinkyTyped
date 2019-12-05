package typingsSlinky.chromeDashApps.chrome.fileSystemProvider

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.chromeDashApps.Anon_ABORT
import typingsSlinky.chromeDashApps.chrome.ToStringLiteral
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.ABORT
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.ACCESS_DENIED
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.EXISTS
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.FAILED
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.INVALID_OPERATION
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.INVALID_URL
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.IN_USE
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.IO
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.NOT_A_DIRECTORY
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.NOT_A_FILE
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.NOT_EMPTY
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.NOT_FOUND
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.NO_MEMORY
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.NO_SPACE
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.OK
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.SECURITY
import typingsSlinky.chromeDashApps.chromeDashAppsStrings.TOO_MANY_OPENED
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Raised when moving an entry (recursively if a directory) is requested.
  * If an error occurs, then errorCallback must be called.
  * @see ProviderError
  */
@JSGlobal("chrome.fileSystemProvider.onMoveEntryRequested")
@js.native
object onMoveEntryRequested
  extends TopLevel[
      typingsSlinky.chromeDashApps.chrome.events.Event[
        js.Function3[
          /* options */ MoveEntryRequestedEventOptions, 
          /* successCallback */ js.Function0[Unit], 
          /* errorCallback */ js.Function1[
            /* error */ ToStringLiteral[
              Anon_ABORT, 
              String, 
              Exclude[
                String, 
                IN_USE | ACCESS_DENIED | NOT_A_DIRECTORY | INVALID_OPERATION | OK | NO_MEMORY | SECURITY | ABORT | INVALID_URL | NOT_EMPTY | NOT_A_FILE | NO_SPACE | NOT_FOUND | IO | TOO_MANY_OPENED | FAILED | EXISTS
              ]
            ], 
            Unit
          ], 
          Unit
        ]
      ]
    ]

