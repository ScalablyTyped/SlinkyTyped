package typingsSlinky.rcVirtualList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interfaceMod {
  
  type GetKey[T] = js.Function1[/* item */ T, typingsSlinky.react.mod.Key]
  
  type RenderFunc[T] = js.Function3[
    /* item */ T, 
    /* index */ scala.Double, 
    /* props */ typingsSlinky.rcVirtualList.anon.Style, 
    slinky.core.facade.ReactElement
  ]
}
