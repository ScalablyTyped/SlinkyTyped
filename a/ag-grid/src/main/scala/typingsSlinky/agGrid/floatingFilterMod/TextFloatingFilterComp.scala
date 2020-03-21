package typingsSlinky.agGrid.floatingFilterMod

import typingsSlinky.agGrid.textFilterMod.SerializedTextFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/filter/floatingFilter", "TextFloatingFilterComp")
@js.native
class TextFloatingFilterComp () extends InputTextFloatingFilterComp[
      SerializedTextFilter, 
      IFloatingFilterParams[SerializedTextFilter, BaseFloatingFilterChange[SerializedTextFilter]]
    ]

