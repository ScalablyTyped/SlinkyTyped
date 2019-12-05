package typingsSlinky.jjve

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jjveMod {
  import typingsSlinky.jjv.jjvMod.Errors

  type Env = js.Function3[/* schema */ js.Object, /* data */ js.Any, /* errors */ Errors, js.Array[Issue]]
}
