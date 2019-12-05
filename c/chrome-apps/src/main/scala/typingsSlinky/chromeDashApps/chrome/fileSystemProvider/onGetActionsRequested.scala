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
  * Raised when a list of actions for a set of files or directories at entryPaths is requested.
  * All of the returned actions must be applicable to each entry.
  * If there are no such actions, an empty array should be returned.
  * The actions must be returned with the successCallback call.
  * In case of an error, errorCallback must be called.
  * @see ProviderError
  * @since Chrome 48.
  **/
@JSGlobal("chrome.fileSystemProvider.onGetActionsRequested")
@js.native
object onGetActionsRequested
  extends TopLevel[
      typingsSlinky.chromeDashApps.chrome.events.Event[
        js.Function3[
          /* options */ GetActionsRequestedEventOptions, 
          /* successCallback */ js.Function1[/* actions */ js.Array[Action], Unit], 
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

