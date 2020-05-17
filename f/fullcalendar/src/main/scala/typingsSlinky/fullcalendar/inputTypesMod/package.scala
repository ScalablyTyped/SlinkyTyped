package typingsSlinky.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object inputTypesMod {
  type EventSourceFunction = js.Function4[
    /* start */ typingsSlinky.moment.mod.Moment, 
    /* end */ typingsSlinky.moment.mod.Moment, 
    /* timezone */ java.lang.String, 
    /* callback */ js.Function1[
      /* events */ js.Array[typingsSlinky.fullcalendar.inputTypesMod.EventObjectInput], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
