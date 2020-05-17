package typingsSlinky.hapiCatbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GenerateFunc[T] = js.Function2[
    /* id */ typingsSlinky.hapiCatbox.mod.Id, 
    /* flags */ typingsSlinky.hapiCatbox.mod.GenerateFuncFlags, 
    js.Promise[T]
  ]
}
