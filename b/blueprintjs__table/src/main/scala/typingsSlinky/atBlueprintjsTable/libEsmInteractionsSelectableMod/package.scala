package typingsSlinky.atBlueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEsmInteractionsSelectableMod {
  import org.scalajs.dom.raw.KeyboardEvent
  import org.scalajs.dom.raw.MouseEvent
  import typingsSlinky.atBlueprintjsTable.libEsmInteractionsDraggableMod.ICoordinateData
  import typingsSlinky.atBlueprintjsTable.libEsmRegionsMod.IRegion

  type ISelectedRegionTransform = js.Function3[
    /* region */ IRegion, 
    /* event */ MouseEvent | KeyboardEvent, 
    /* coords */ js.UndefOr[ICoordinateData], 
    IRegion
  ]
}
