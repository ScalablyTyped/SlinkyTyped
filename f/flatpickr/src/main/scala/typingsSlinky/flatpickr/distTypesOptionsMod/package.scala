package typingsSlinky.flatpickr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesOptionsMod {
  import typingsSlinky.flatpickr.distTypesGlobalsMod._Global_.Date
  import typingsSlinky.flatpickr.distTypesInstanceMod.Instance
  import typingsSlinky.std.Partial

  type DateLimit[D] = D | DateRangeLimit[D] | (js.Function1[/* date */ Date, Boolean])
  type DateOption = Date | String | Double
  type Hook = js.Function4[
    /* dates */ js.Array[Date], 
    /* currentDateString */ String, 
    /* self */ Instance, 
    /* data */ js.UndefOr[js.Any], 
    Unit
  ]
  type Options = Partial[BaseOptions]
  type Plugin[E] = js.Function1[/* fp */ Instance with E, Options]
}
