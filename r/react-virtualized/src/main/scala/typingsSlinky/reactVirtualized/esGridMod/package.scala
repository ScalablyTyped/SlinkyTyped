package typingsSlinky.reactVirtualized

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object esGridMod {
  
  @scala.inline
  def DEFAULT_SCROLLING_RESET_TIME_INTERVAL: /* 150 */ scala.Double = typingsSlinky.reactVirtualized.esGridMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_SCROLLING_RESET_TIME_INTERVAL").asInstanceOf[/* 150 */ scala.Double]
  
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
  
  @scala.inline
  def accessibilityOverscanIndicesGetter: typingsSlinky.reactVirtualized.esGridMod.OverscanIndicesGetter = typingsSlinky.reactVirtualized.esGridMod.^.asInstanceOf[js.Dynamic].selectDynamic("accessibilityOverscanIndicesGetter").asInstanceOf[typingsSlinky.reactVirtualized.esGridMod.OverscanIndicesGetter]
  
  @scala.inline
  def defaultCellRangeRenderer: typingsSlinky.reactVirtualized.esGridMod.GridCellRangeRenderer = typingsSlinky.reactVirtualized.esGridMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultCellRangeRenderer").asInstanceOf[typingsSlinky.reactVirtualized.esGridMod.GridCellRangeRenderer]
  
  @scala.inline
  def defaultOverscanIndicesGetter: typingsSlinky.reactVirtualized.esGridMod.OverscanIndicesGetter = typingsSlinky.reactVirtualized.esGridMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultOverscanIndicesGetter").asInstanceOf[typingsSlinky.reactVirtualized.esGridMod.OverscanIndicesGetter]
}
