package typingsSlinky.casperjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FunctionOnTimeout = js.ThisFunction2[
    /* this */ typingsSlinky.casperjs.mod.Casper, 
    /* timeout */ scala.Double, 
    /* details */ js.Any, 
    scala.Unit
  ]
  type FunctionThen = js.ThisFunction1[
    /* this */ typingsSlinky.casperjs.mod.Casper, 
    /* response */ typingsSlinky.casperjs.mod.HttpResponse, 
    scala.Unit
  ]
}
