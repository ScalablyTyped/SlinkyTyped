package typingsSlinky.kss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CallbackFn = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* styleguide */ typingsSlinky.kss.mod.KssStyleguide, 
    scala.Unit
  ]
}
