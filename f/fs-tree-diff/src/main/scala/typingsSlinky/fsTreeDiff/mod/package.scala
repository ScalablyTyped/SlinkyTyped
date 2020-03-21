package typingsSlinky.fsTreeDiff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Patch = js.Tuple3[
    typingsSlinky.fsTreeDiff.mod.ChangeType, 
    java.lang.String, 
    typingsSlinky.fsTreeDiff.mod.FSTreeEntry
  ]
}
