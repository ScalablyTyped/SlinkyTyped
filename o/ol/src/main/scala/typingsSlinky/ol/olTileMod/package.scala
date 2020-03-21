package typingsSlinky.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object olTileMod {
  type LoadFunction = js.Function2[/* p0 */ typingsSlinky.ol.olTileMod.Tile, /* p1 */ java.lang.String, scala.Unit]
  type UrlFunction = js.Function3[
    /* p0 */ typingsSlinky.ol.tilecoordMod.TileCoord, 
    /* p1 */ scala.Double, 
    /* p2 */ typingsSlinky.ol.projectionMod.default, 
    java.lang.String
  ]
}
