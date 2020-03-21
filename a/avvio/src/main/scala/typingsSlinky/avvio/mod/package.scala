package typingsSlinky.avvio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type OnClose[I, C] = js.Function1[/* fn */ js.Function2[/* context */ C, /* done */ js.Function, scala.Unit], C]
  type Plugin[O, I] = js.Function3[
    /* server */ typingsSlinky.avvio.mod.context[I], 
    /* options */ O, 
    /* done */ js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit], 
    scala.Unit
  ]
  type Use[I, C] = js.Function2[
    /* fn */ typingsSlinky.avvio.mod.Plugin[js.Any, I], 
    /* options */ js.UndefOr[js.Any], 
    C
  ]
  type context[I] = typingsSlinky.avvio.mod.mixedInstance[I] | typingsSlinky.avvio.mod.Avvio[I]
  type mixedInstance[I] = I with typingsSlinky.avvio.mod.Server[I]
}
