package typingsSlinky.csvParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object es5Mod {
  type Callback = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* records */ js.UndefOr[js.Any], 
    /* info */ typingsSlinky.csvParse.es5Mod.Info, 
    scala.Unit
  ]
  type CastingDateFunction = js.Function2[
    /* value */ java.lang.String, 
    /* context */ typingsSlinky.csvParse.es5Mod.CastingContext, 
    js.Date
  ]
  type CastingFunction = js.Function2[
    /* value */ java.lang.String, 
    /* context */ typingsSlinky.csvParse.es5Mod.CastingContext, 
    js.Any
  ]
}
