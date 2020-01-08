package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object childUnderscoreProcessMod {
  import typingsSlinky.node.nodeStrings.ignore
  import typingsSlinky.node.nodeStrings.inherit
  import typingsSlinky.node.nodeStrings.ipc
  import typingsSlinky.node.nodeStrings.pipe
  import typingsSlinky.node.streamMod.Stream

  type Serializable = String | js.Object | Double | Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.node.nodeStrings.pipe
    - typings.node.nodeStrings.ignore
    - typings.node.nodeStrings.inherit
    - js.Array[
  js.UndefOr[
    typings.node.nodeStrings.pipe | typings.node.nodeStrings.ipc | typings.node.nodeStrings.ignore | typings.node.nodeStrings.inherit | typings.node.streamMod.Stream | scala.Double | scala.Null
  ]]
  */
  type StdioOptions = _StdioOptions | (js.Array[js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null]])
  type StdioPipe = js.UndefOr[Null | pipe]
}
