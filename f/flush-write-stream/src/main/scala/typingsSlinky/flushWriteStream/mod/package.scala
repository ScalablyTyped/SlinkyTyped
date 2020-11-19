package typingsSlinky.flushWriteStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function1[/* error */ js.UndefOr[js.Error], scala.Unit]
  
  type Flush = js.Function1[/* callback */ typingsSlinky.flushWriteStream.mod.Callback, scala.Unit]
  
  type Write = js.Function3[
    /* chunk */ js.Any, 
    /* encoding */ java.lang.String, 
    /* callback */ typingsSlinky.flushWriteStream.mod.Callback, 
    scala.Unit
  ]
}
