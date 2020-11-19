package typingsSlinky.chromeApps.global.chrome.fileSystemProvider

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.chromeApps.anon.ABORT
import typingsSlinky.chromeApps.chrome.ToStringLiteral
import typingsSlinky.chromeApps.chrome.events.Event
import typingsSlinky.chromeApps.chrome.fileSystemProvider.ExecuteActionRequestedEventOptions
import typingsSlinky.chromeApps.chromeAppsStrings.ACCESS_DENIED
import typingsSlinky.chromeApps.chromeAppsStrings.EXISTS
import typingsSlinky.chromeApps.chromeAppsStrings.FAILED
import typingsSlinky.chromeApps.chromeAppsStrings.INVALID_OPERATION
import typingsSlinky.chromeApps.chromeAppsStrings.INVALID_URL
import typingsSlinky.chromeApps.chromeAppsStrings.IN_USE
import typingsSlinky.chromeApps.chromeAppsStrings.IO
import typingsSlinky.chromeApps.chromeAppsStrings.NOT_A_DIRECTORY
import typingsSlinky.chromeApps.chromeAppsStrings.NOT_A_FILE
import typingsSlinky.chromeApps.chromeAppsStrings.NOT_EMPTY
import typingsSlinky.chromeApps.chromeAppsStrings.NOT_FOUND
import typingsSlinky.chromeApps.chromeAppsStrings.NO_MEMORY
import typingsSlinky.chromeApps.chromeAppsStrings.NO_SPACE
import typingsSlinky.chromeApps.chromeAppsStrings.OK
import typingsSlinky.chromeApps.chromeAppsStrings.SECURITY
import typingsSlinky.chromeApps.chromeAppsStrings.TOO_MANY_OPENED
import typingsSlinky.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Raised when executing an action for a set of files or directories is requested.
  * After the action is completed, successCallback must be called.
  * On error, errorCallback must be called.
  * @see ProviderError
  * @since Chrome 48.
  */
@JSGlobal("chrome.fileSystemProvider.onExecuteActionRequested")
@js.native
object onExecuteActionRequested
  extends TopLevel[
      Event[
        js.Function3[
          /* options */ ExecuteActionRequestedEventOptions, 
          /* successCallback */ js.Function0[Unit], 
          /* errorCallback */ js.Function1[
            /* error */ ToStringLiteral[
              ABORT, 
              /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | typingsSlinky.chromeApps.chromeAppsStrings.ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
              Exclude[
                /* keyof chrome-apps.anon.ABORT */ OK | FAILED | IN_USE | EXISTS | NOT_FOUND | ACCESS_DENIED | TOO_MANY_OPENED | NO_MEMORY | NO_SPACE | NOT_A_DIRECTORY | INVALID_OPERATION | SECURITY | typingsSlinky.chromeApps.chromeAppsStrings.ABORT | NOT_A_FILE | NOT_EMPTY | INVALID_URL | IO, 
                INVALID_URL | IN_USE | OK | typingsSlinky.chromeApps.chromeAppsStrings.ABORT | SECURITY | NOT_A_DIRECTORY | NOT_A_FILE | INVALID_OPERATION | TOO_MANY_OPENED | NO_MEMORY | ACCESS_DENIED | NOT_FOUND | FAILED | NO_SPACE | EXISTS | NOT_EMPTY | IO
              ]
            ], 
            Unit
          ], 
          Unit
        ]
      ]
    ]
