package typingsSlinky.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object esGridMod {
  
  type GridCellRangeRenderer = js.Function1[
    /* params */ typingsSlinky.reactVirtualized.esGridMod.GridCellRangeProps, 
    js.Array[slinky.core.facade.ReactElement]
  ]
  
  type GridCellRenderer = js.Function1[
    /* props */ typingsSlinky.reactVirtualized.esGridMod.GridCellProps, 
    slinky.core.facade.ReactElement
  ]
  
  type OverscanIndices = typingsSlinky.reactVirtualized.mod.OverscanIndexRange
  
  type OverscanIndicesGetter = js.Function1[
    /* params */ typingsSlinky.reactVirtualized.esGridMod.OverscanIndicesGetterParams, 
    typingsSlinky.reactVirtualized.esGridMod.OverscanIndices
  ]
  
  type SCROLL_DIRECTION_HORIZONTAL = typingsSlinky.reactVirtualized.reactVirtualizedStrings.horizontal
  
  type SCROLL_DIRECTION_VERTICAL = typingsSlinky.reactVirtualized.reactVirtualizedStrings.vertical
  
  type SectionRenderedParams = typingsSlinky.reactVirtualized.esGridMod.RenderedSection
}
