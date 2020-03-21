package typingsSlinky.gulpChanged

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IComparator = js.Function4[
    /* stream */ typingsSlinky.node.streamMod.Transform, 
    /* callback */ js.Function, 
    /* sourceFile */ typingsSlinky.vinyl.mod.File, 
    /* destPath */ java.lang.String, 
    scala.Unit
  ]
  type IDestination = js.Function1[/* file */ java.lang.String | typingsSlinky.node.Buffer, java.lang.String]
}
