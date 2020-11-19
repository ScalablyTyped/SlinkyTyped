package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object childProcessMod {
  
  type Serializable = java.lang.String | js.Object | scala.Double | scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.node.nodeStrings.pipe
    - typingsSlinky.node.nodeStrings.ignore
    - typingsSlinky.node.nodeStrings.inherit
    - js.Array[
  js.UndefOr[
    typingsSlinky.node.nodeStrings.pipe | typingsSlinky.node.nodeStrings.ipc | typingsSlinky.node.nodeStrings.ignore | typingsSlinky.node.nodeStrings.inherit | typingsSlinky.node.streamMod.Stream | scala.Double | scala.Null
  ]]
  */
  type StdioOptions = typingsSlinky.node.childProcessMod._StdioOptions | (js.Array[
    js.UndefOr[
      typingsSlinky.node.nodeStrings.pipe | typingsSlinky.node.nodeStrings.ipc | typingsSlinky.node.nodeStrings.ignore | typingsSlinky.node.nodeStrings.inherit | typingsSlinky.node.streamMod.Stream | scala.Double | scala.Null
    ]
  ])
  
  type StdioPipe = js.UndefOr[scala.Null | typingsSlinky.node.nodeStrings.pipe]
}
