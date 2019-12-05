package typingsSlinky.atBlueprintjsTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libEsmLayersRegionsMod {
  import typingsSlinky.atBlueprintjsTable.libEsmQuadrantsTableQuadrantMod.QuadrantType
  import typingsSlinky.atBlueprintjsTable.libEsmRegionsMod.IRegion
  import typingsSlinky.react.reactMod.CSSProperties

  type IRegionStyler = js.Function2[/* region */ IRegion, /* quadrantType */ js.UndefOr[QuadrantType], CSSProperties]
}
