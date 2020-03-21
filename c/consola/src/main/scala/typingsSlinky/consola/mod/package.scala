package typingsSlinky.consola

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConsolaMock = js.Function1[/* args */ js.Any, scala.Unit]
  type ConsolaMockFn = js.Function2[
    /* type */ java.lang.String, 
    /* defaults */ typingsSlinky.consola.mod.ConsolaLogObject, 
    typingsSlinky.consola.mod.ConsolaMock
  ]
}
