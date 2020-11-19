package typingsSlinky.chrome.chrome.devtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object network {
  
  type HAREntry = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HARFormatEntry */ js.Any
  
  type HARLog = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HARFormatLog */ js.Any
  
  type NavigatedEvent = typingsSlinky.chrome.chrome.events.Event[js.Function1[/* url */ java.lang.String, scala.Unit]]
  
  type RequestFinishedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* request */ typingsSlinky.chrome.chrome.devtools.network.Request, scala.Unit]
  ]
}
