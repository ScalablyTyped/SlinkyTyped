package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object requestidlecallback {
  
  type IdleCallbackHandle = scala.Double
  
  type IdleRequestCallback = js.Function1[/* deadline */ typingsSlinky.requestidlecallback.IdleDeadline, scala.Unit]
}
