package typingsSlinky.imageminPngquant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Plugin = js.Function1[
    /* input */ typingsSlinky.node.Buffer | typingsSlinky.node.NodeJS.ReadableStream, 
    js.Promise[typingsSlinky.node.Buffer]
  ]
}
