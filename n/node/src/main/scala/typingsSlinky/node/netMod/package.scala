package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object netMod {
  import typingsSlinky.node.NodeJS.ErrnoException
  import typingsSlinky.node.dnsMod.LookupOneOptions

  type LookupFunction = js.Function3[
    /* hostname */ String, 
    /* options */ LookupOneOptions, 
    /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit], 
    Unit
  ]
}
