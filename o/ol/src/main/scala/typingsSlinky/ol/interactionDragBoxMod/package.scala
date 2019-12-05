package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interactionDragBoxMod {
  import typingsSlinky.ol.pixelMod.Pixel

  type EndCondition = js.ThisFunction3[
    /* this */ js.Any, 
    /* p0 */ typingsSlinky.ol.mapBrowserEventMod.default, 
    /* p1 */ Pixel, 
    /* p2 */ Pixel, 
    Boolean
  ]
}
