package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object identity {
  
  type SignInChangeEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* account */ typingsSlinky.chrome.chrome.identity.AccountInfo, 
      /* signedIn */ scala.Boolean, 
      scala.Unit
    ]
  ]
}
