package typingsSlinky.oja

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddableFunction = js.Function1[/* runtime */ typingsSlinky.oja.mod.Flow, scala.Unit]
  type ConsumerCallback = js.Function2[/* payload */ js.Any, /* runtime */ typingsSlinky.oja.mod.Flow, scala.Unit]
  type DefinitionFunction = js.Function2[
    /* publisher */ typingsSlinky.oja.mod.StageContext, 
    /* runtime */ typingsSlinky.oja.mod.Flow, 
    js.Any
  ]
}
