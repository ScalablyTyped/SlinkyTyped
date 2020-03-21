package typingsSlinky.gulpSort

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IComparatorFunction = js.Function2[
    /* file1 */ typingsSlinky.vinyl.mod.File, 
    /* file2 */ typingsSlinky.vinyl.mod.File, 
    scala.Double
  ]
}
