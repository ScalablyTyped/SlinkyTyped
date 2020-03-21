package typingsSlinky.nodeRsa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Data = java.lang.String | js.Object | js.Array[js.Any]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.node.Buffer
    - typingsSlinky.nodeRsa.mod.KeyComponentsPrivate
    - typingsSlinky.nodeRsa.mod.KeyComponentsPublic
  */
  type Key = typingsSlinky.nodeRsa.mod._Key | java.lang.String | typingsSlinky.node.Buffer
}
