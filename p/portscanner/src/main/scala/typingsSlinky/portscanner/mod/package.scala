package typingsSlinky.portscanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type PortCallback = js.Function2[/* error */ js.Error | scala.Null, /* port */ scala.Double, scala.Unit]
  type StatusCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* port */ typingsSlinky.portscanner.mod.Status, 
    scala.Unit
  ]
}
