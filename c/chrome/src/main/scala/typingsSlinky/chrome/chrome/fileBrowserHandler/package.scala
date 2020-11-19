package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fileBrowserHandler {
  
  type FileBrowserHandlerExecuteEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* details */ typingsSlinky.chrome.chrome.fileBrowserHandler.FileHandlerExecuteEventDetails, 
      scala.Unit
    ]
  ]
}
