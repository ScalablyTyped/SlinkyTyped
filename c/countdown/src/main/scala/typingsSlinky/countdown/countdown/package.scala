package typingsSlinky.countdown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object countdown {
  
  type DateFunction = js.Function1[/* timespan */ typingsSlinky.countdown.countdown.Timespan, scala.Unit]
  
  type DateTime = js.UndefOr[
    scala.Double | js.Date | typingsSlinky.countdown.countdown.DateFunction | scala.Null
  ]
}
