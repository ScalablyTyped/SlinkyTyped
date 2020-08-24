package typingsSlinky.reactVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esCollectionMod {
  type CollectionCellGroupRenderer = js.Function1[
    /* params */ typingsSlinky.reactVirtualized.esCollectionMod.CollectionCellGroupRendererParams, 
    js.Array[slinky.core.facade.ReactElement]
  ]
  type CollectionCellRenderer = js.Function1[
    /* params */ typingsSlinky.reactVirtualized.esCollectionMod.CollectionCellRendererParams, 
    slinky.core.facade.ReactElement
  ]
  type CollectionCellSizeAndPositionGetter = js.Function1[
    /* params */ typingsSlinky.reactVirtualized.mod.Index, 
    typingsSlinky.reactVirtualized.esCollectionMod.CollectionCellSizeAndPosition
  ]
}
