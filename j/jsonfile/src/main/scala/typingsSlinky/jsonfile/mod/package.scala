package typingsSlinky.jsonfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ReadCallback = js.Function2[
    /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
    /* data */ js.Any, 
    scala.Unit
  ]
  type WriteCallback = js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException, scala.Unit]
}
