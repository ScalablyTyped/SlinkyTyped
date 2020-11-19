package typingsSlinky.flatpickr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object optionsMod {
  
  type DateLimit[D] = D | typingsSlinky.flatpickr.optionsMod.DateRangeLimit[D] | (js.Function1[/* date */ typingsSlinky.flatpickr.globalsMod.global.Date, scala.Boolean])
  
  type DateOption = typingsSlinky.flatpickr.globalsMod.global.Date | java.lang.String | scala.Double
  
  type Hook = js.Function4[
    /* dates */ js.Array[typingsSlinky.flatpickr.globalsMod.global.Date], 
    /* currentDateString */ java.lang.String, 
    /* self */ typingsSlinky.flatpickr.instanceMod.Instance, 
    /* data */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  
  type Plugin[E] = js.Function1[
    /* fp */ typingsSlinky.flatpickr.instanceMod.Instance with E, 
    typingsSlinky.flatpickr.optionsMod.Options
  ]
}
