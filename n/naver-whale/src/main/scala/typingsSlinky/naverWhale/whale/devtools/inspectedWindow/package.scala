package typingsSlinky.naverWhale.whale.devtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object inspectedWindow {
  
  type ResourceAddedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[
      /* resource */ typingsSlinky.chrome.chrome.devtools.inspectedWindow.Resource, 
      scala.Unit
    ]
  ]
  
  type ResourceContentCommittedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* resource */ typingsSlinky.chrome.chrome.devtools.inspectedWindow.Resource, 
      /* content */ java.lang.String, 
      scala.Unit
    ]
  ]
}
