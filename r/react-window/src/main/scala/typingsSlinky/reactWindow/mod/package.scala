package typingsSlinky.reactWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GridItemKeySelector = js.Function1[
    /* params */ typingsSlinky.reactWindow.anon.ColumnIndex, 
    typingsSlinky.react.mod.Key
  ]
  
  type ListItemKeySelector = js.Function2[/* index */ scala.Double, /* data */ js.Any, typingsSlinky.react.mod.Key]
  
  type ReactElementType = slinky.core.ReactComponentClass[js.Any] | java.lang.String
}
