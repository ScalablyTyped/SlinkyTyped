package typingsSlinky.chromeDashApps.chrome.fileSystemProvider

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.chromeDashApps.Anon_ABORT
import typingsSlinky.chromeDashApps.chrome.ToStringLiteral
import typingsSlinky.chromeDashApps.chrome.events.Event
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
  * Raised when deleting an entry is requested.
  * If recursive is true, and the entry is a directory,
  * then all of the entries inside must be recursively deleted as well.
  * @see ProviderError
  */
@JSGlobal("chrome.fileSystemProvider.onDeleteEntryRequested")
@js.native
object onDeleteEntryRequested
  extends TopLevel[
      Event[
        js.Function3[
          /* options */ DeleteEntryRequestedEventOptions, 
          /* successCallback */ js.Function0[Unit], 
          /* errorCallback */ js.Function1[
            /* error */ ToStringLiteral[
              Anon_ABORT, 
              String, 
              Exclude[
                String, 
                INVALID_URL | IN_USE | OK | ABORT | SECURITY | NOT_A_DIRECTORY | NOT_A_FILE | INVALID_OPERATION | TOO_MANY_OPENED | NO_MEMORY | ACCESS_DENIED | NOT_FOUND | FAILED | NO_SPACE | EXISTS | NOT_EMPTY | IO
              ]
            ], 
            Unit
          ], 
          Unit
        ]
      ]
    ]

