package typingsSlinky.jsforce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object connectionMod {
  
  type Callback[T] = js.Function2[/* err */ js.Error | scala.Null, /* result */ T, scala.Unit]
  
  type ConnectionEvent = typingsSlinky.jsforce.jsforceStrings.refresh
}
