package typingsSlinky.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object scalesMod {
  
  type IIncludedValuesProvider[D] = js.Function2[
    /* scale */ typingsSlinky.plottable.scaleMod.Scale[D, js.Any], 
    /* ignoreAnchorState */ js.UndefOr[scala.Boolean], 
    js.Array[D]
  ]
  
  type IPaddingExceptionsProvider[D] = js.Function1[
    /* scale */ typingsSlinky.plottable.quantitativeScaleMod.QuantitativeScale[D], 
    js.Array[D]
  ]
}
