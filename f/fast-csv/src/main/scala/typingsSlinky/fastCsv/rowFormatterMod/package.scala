package typingsSlinky.fastCsv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rowFormatterMod {
  type RowFormatterCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* data */ js.UndefOr[js.Array[java.lang.String]], 
    scala.Unit
  ]
}
