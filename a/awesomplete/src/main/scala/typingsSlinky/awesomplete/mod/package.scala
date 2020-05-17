package typingsSlinky.awesomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SortFunction = js.Function2[
    /* left */ scala.Double | js.Array[js.Any], 
    /* right */ scala.Double | js.Array[js.Any], 
    scala.Double
  ]
}
