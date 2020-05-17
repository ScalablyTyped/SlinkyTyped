package typingsSlinky.csvParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* records */ js.UndefOr[js.Any], 
    /* info */ typingsSlinky.csvParse.mod.Info, 
    scala.Unit
  ]
  type CastingDateFunction = js.Function2[
    /* value */ java.lang.String, 
    /* context */ typingsSlinky.csvParse.mod.CastingContext, 
    js.Date
  ]
  type CastingFunction = js.Function2[
    /* value */ java.lang.String, 
    /* context */ typingsSlinky.csvParse.mod.CastingContext, 
    js.Any
  ]
}
