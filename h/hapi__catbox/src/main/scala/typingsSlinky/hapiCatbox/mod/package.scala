package typingsSlinky.hapiCatbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EnginePrototypeOrObject = typingsSlinky.hapiCatbox.mod.EnginePrototype[js.Any] | typingsSlinky.hapiCatbox.mod.ClientApi[js.Any]
  type GenerateFunc[T] = js.Function2[
    /* id */ typingsSlinky.hapiCatbox.mod.Id, 
    /* flags */ typingsSlinky.hapiCatbox.mod.GenerateFuncFlags, 
    js.Promise[T]
  ]
  type Id = java.lang.String | typingsSlinky.hapiCatbox.anon.Id
}
