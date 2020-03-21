package typingsSlinky.daterangepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DataRangePickerCallback = js.Function3[
    /* start */ typingsSlinky.moment.mod.Moment, 
    /* end */ typingsSlinky.moment.mod.Moment, 
    /* label */ java.lang.String | scala.Null, 
    scala.Unit
  ]
  type DateOrString = java.lang.String | typingsSlinky.moment.mod.Moment | js.Date
}
