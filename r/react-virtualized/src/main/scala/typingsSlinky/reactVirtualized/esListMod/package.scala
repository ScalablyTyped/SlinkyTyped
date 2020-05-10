package typingsSlinky.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esListMod {
  type ListRowRenderer = js.Function1[
    /* props */ typingsSlinky.reactVirtualized.esListMod.ListRowProps, 
    slinky.core.TagMod[scala.Any]
  ]
  type RenderedRows = typingsSlinky.reactVirtualized.mod.OverscanIndexRange with typingsSlinky.reactVirtualized.mod.IndexRange
}
