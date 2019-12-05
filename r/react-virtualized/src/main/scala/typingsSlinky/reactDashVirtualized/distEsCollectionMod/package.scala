package typingsSlinky.reactDashVirtualized

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distEsCollectionMod {
  import slinky.core.TagMod
  import typingsSlinky.reactDashVirtualized.reactDashVirtualizedMod.Index

  type CollectionCellGroupRenderer = js.Function1[/* params */ CollectionCellGroupRendererParams, js.Array[TagMod[Any]]]
  type CollectionCellRenderer = js.Function1[/* params */ CollectionCellRendererParams, TagMod[Any]]
  type CollectionCellSizeAndPositionGetter = js.Function1[/* params */ Index, CollectionCellSizeAndPosition]
}
