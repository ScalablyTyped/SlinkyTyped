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
  * Raised when aborting an operation with operationRequestId is requested.
  * The operation executed with operationRequestId must be immediately stopped
  * and successCallback of this abort request executed. If aborting fails,
  * then errorCallback must be called. Note, that callbacks of the aborted
  * operation must not be called, as they will be ignored. Despite calling
  * errorCallback, the request may be forcibly aborted.
  * @see ProviderError
  */
@JSGlobal("chrome.fileSystemProvider.onAbortRequested")
@js.native
object onAbortRequested
  extends TopLevel[
      Event[
        js.Function3[
          /* options */ AbortRequestedEventOptions, 
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

