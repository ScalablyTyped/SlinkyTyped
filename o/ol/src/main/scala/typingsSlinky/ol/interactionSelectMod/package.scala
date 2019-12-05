package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interactionSelectMod {
  import typingsSlinky.ol.featureMod.FeatureLike

  type FilterFunction = js.Function2[/* p0 */ FeatureLike, /* p1 */ typingsSlinky.ol.layerLayerMod.default, Boolean]
}
