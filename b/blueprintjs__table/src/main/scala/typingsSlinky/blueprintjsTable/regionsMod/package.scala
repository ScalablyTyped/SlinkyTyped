package typingsSlinky.blueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object regionsMod {
  type IRegionStyler = js.Function2[
    /* region */ typingsSlinky.blueprintjsTable.esmRegionsMod.IRegion, 
    /* quadrantType */ js.UndefOr[typingsSlinky.blueprintjsTable.tableQuadrantMod.QuadrantType], 
    typingsSlinky.react.mod.CSSProperties
  ]
}
