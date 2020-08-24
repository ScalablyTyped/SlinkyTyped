package typingsSlinky.deleteEmpty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DeleteEmptyCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* deleted */ js.Array[java.lang.String], 
    scala.Unit
  ]
  type FilterFunction = js.Function2[/* file */ java.lang.String, /* regex */ js.RegExp, java.lang.String]
}
