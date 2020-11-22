package typingsSlinky.gridstack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.gridstack.gridstackStrings.moveScale
    - typingsSlinky.gridstack.gridstackStrings.move
    - typingsSlinky.gridstack.gridstackStrings.scale
    - typingsSlinky.gridstack.gridstackStrings.none
    - js.Function4[
  / * column * / scala.Double, 
  / * oldColumn * / scala.Double, 
  / * nodes * / js.Array[typingsSlinky.gridstack.typesMod.GridStackNode], 
  / * oldNodes * / js.Array[typingsSlinky.gridstack.typesMod.GridStackNode], 
  scala.Unit]
  */
  type ColumnOptions = typingsSlinky.gridstack.typesMod._ColumnOptions | (js.Function4[
    /* column */ scala.Double, 
    /* oldColumn */ scala.Double, 
    /* nodes */ js.Array[typingsSlinky.gridstack.typesMod.GridStackNode], 
    /* oldNodes */ js.Array[typingsSlinky.gridstack.typesMod.GridStackNode], 
    scala.Unit
  ])
  
  type numberOrString = scala.Double | java.lang.String
}
