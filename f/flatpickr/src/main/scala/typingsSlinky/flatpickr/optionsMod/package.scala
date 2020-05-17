package typingsSlinky.flatpickr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object optionsMod {
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
