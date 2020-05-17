package typingsSlinky.hostile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function1[/* error */ js.Error | scala.Null, scala.Unit]
  type GetCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* lines */ typingsSlinky.hostile.mod.Lines, 
    scala.Unit
  ]
  type Lines = js.Array[typingsSlinky.hostile.mod.Line]
}
