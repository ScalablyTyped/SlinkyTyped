package typingsSlinky.bufferToStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ToStream = js.Function2[
    /* buffer */ java.lang.String | typingsSlinky.node.Buffer, 
    /* chunkSize */ js.UndefOr[scala.Double], 
    typingsSlinky.node.streamMod.Readable
  ]
}
