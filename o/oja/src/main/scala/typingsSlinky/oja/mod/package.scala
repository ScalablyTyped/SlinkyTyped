package typingsSlinky.oja

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddableFunction = js.Function1[/* runtime */ typingsSlinky.oja.mod.Flow, scala.Unit]
  type AddableToAction = typingsSlinky.oja.mod.Action | typingsSlinky.oja.mod.AddableFunction
  type ConsumerCallback = js.Function2[/* payload */ js.Any, /* runtime */ typingsSlinky.oja.mod.Flow, scala.Unit]
  type DefinitionFunction = js.Function2[
    /* publisher */ typingsSlinky.oja.mod.StageContext, 
    /* runtime */ typingsSlinky.oja.mod.Flow, 
    js.Any
  ]
  type Primitive = js.UndefOr[scala.Boolean | scala.Double | java.lang.String | js.Symbol | scala.Null]
}
