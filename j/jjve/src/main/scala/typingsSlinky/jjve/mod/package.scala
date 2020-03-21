package typingsSlinky.jjve

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Env = js.Function3[
    /* schema */ js.Object, 
    /* data */ js.Any, 
    /* errors */ typingsSlinky.jjv.mod.Errors, 
    js.Array[typingsSlinky.jjve.mod.Issue]
  ]
}
