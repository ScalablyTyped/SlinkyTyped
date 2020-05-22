package typingsSlinky.blueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object selectableMod {
  type ISelectedRegionTransform = js.Function3[
    /* region */ typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion, 
    /* event */ org.scalajs.dom.raw.MouseEvent | org.scalajs.dom.raw.KeyboardEvent, 
    /* coords */ js.UndefOr[typingsSlinky.blueprintjsTable.dragTypesMod.ICoordinateData], 
    typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion
  ]
}
