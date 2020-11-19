package typingsSlinky.blueprintjsSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object itemRendererMod {
  
  type ItemRenderer[T] = js.Function2[
    /* item */ T, 
    /* itemProps */ typingsSlinky.blueprintjsSelect.itemRendererMod.IItemRendererProps, 
    slinky.core.facade.ReactElement | scala.Null
  ]
}
