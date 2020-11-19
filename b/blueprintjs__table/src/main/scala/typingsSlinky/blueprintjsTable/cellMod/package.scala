package typingsSlinky.blueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cellMod {
  
  type ICellRenderer = js.Function2[
    /* rowIndex */ scala.Double, 
    /* columnIndex */ scala.Double, 
    slinky.core.facade.ReactElement
  ]
}
