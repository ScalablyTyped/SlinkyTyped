package typingsSlinky.copy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* files */ js.UndefOr[js.Array[typingsSlinky.vinyl.mod.File]], 
    scala.Unit
  ]
}
