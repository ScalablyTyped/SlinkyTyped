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
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.sass.AnonFile
    - typingsSlinky.sass.AnonContents
    - typingsSlinky.std.Error
    - scala.Null
  */
  type ImporterReturnType = typingsSlinky.sass.mod._ImporterReturnType | js.Error | scala.Null
}
