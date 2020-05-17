package typingsSlinky.sass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Importer = js.Function3[
    /* url */ java.lang.String, 
    /* prev */ java.lang.String, 
    /* done */ js.Function1[/* data */ typingsSlinky.sass.mod.ImporterReturnType, scala.Unit], 
    typingsSlinky.sass.mod.ImporterReturnType | scala.Unit
  ]
}
