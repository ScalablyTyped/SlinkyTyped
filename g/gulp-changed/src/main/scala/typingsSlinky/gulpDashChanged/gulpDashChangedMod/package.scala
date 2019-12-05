package typingsSlinky.gulpDashChanged

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashChangedMod {
  import typingsSlinky.node.Buffer
  import typingsSlinky.node.streamMod.Transform
  import typingsSlinky.vinyl.vinylMod.File

  type IComparator = js.Function4[
    /* stream */ Transform, 
    /* callback */ js.Function, 
    /* sourceFile */ File, 
    /* destPath */ String, 
    Unit
  ]
  type IDestination = js.Function1[/* file */ String | Buffer, String]
}
