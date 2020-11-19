package typingsSlinky.merge2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type StreamType = typingsSlinky.node.NodeJS.ReadableStream | typingsSlinky.merge2.mod.Merge2Stream
  
  type Streams = typingsSlinky.merge2.mod.StreamType | js.Array[typingsSlinky.merge2.mod.StreamType]
}
