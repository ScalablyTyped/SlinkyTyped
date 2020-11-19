package typingsSlinky.nodelibFsWalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object asyncMod {
  
  type AsyncCallback = js.Function2[
    /* err */ typingsSlinky.nodelibFsWalk.typesMod.Errno, 
    /* entries */ js.Array[typingsSlinky.nodelibFsWalk.typesMod.Entry], 
    scala.Unit
  ]
}
