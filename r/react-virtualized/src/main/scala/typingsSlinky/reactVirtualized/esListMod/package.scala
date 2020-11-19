package typingsSlinky.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object esListMod {
  
  type ListRowRenderer = js.Function1[
    /* props */ typingsSlinky.reactVirtualized.esListMod.ListRowProps, 
    slinky.core.facade.ReactElement
  ]
  
  type RenderedRows = typingsSlinky.reactVirtualized.mod.OverscanIndexRange with typingsSlinky.reactVirtualized.mod.IndexRange
}
