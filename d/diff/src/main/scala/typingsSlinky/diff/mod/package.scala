package typingsSlinky.diff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function2[
    /* err */ js.UndefOr[scala.Nothing], 
    /* value */ js.UndefOr[js.Array[typingsSlinky.diff.mod.Change]], 
    scala.Unit
  ]
}
