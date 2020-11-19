package typingsSlinky.luminoDatagrid.cellrendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object CellRenderer {
  
  /**
    * A type alias for a cell renderer config function.
    *
    * This type is used to compute a value from a cell config object.
    */
  type ConfigFunc[T] = js.Function1[
    /* config */ typingsSlinky.luminoDatagrid.cellrendererMod.CellRenderer.CellConfig, 
    T
  ]
  
  /**
    * A type alias for a cell renderer config option.
    *
    * A config option can be a static value or a config function.
    */
  type ConfigOption[T] = T | typingsSlinky.luminoDatagrid.cellrendererMod.CellRenderer.ConfigFunc[T]
}
