package typingsSlinky.catbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GenerateFunc[T] = js.Function2[
    /* id */ typingsSlinky.catbox.mod.Id, 
    /* flags */ typingsSlinky.catbox.mod.GenerateFuncFlags, 
    js.Promise[T]
  ]
}
