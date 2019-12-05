package typingsSlinky.ol

import typingsSlinky.ol.tileMod.UrlFunction
import typingsSlinky.ol.tilecoordMod.TileCoord
import typingsSlinky.ol.tilegridTileGridMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/tileurlfunction", JSImport.Namespace)
@js.native
object tileurlfunctionMod extends js.Object {
  def createFromTemplate(template: String, tileGrid: default): UrlFunction = js.native
  def createFromTemplates(templates: js.Array[String], tileGrid: default): UrlFunction = js.native
  def createFromTileUrlFunctions(tileUrlFunctions: js.Array[UrlFunction]): UrlFunction = js.native
  def expandUrl(url: String): js.Array[String] = js.native
  def nullTileUrlFunction(tileCoord: TileCoord, pixelRatio: Double, projection: typingsSlinky.ol.projProjectionMod.default): js.UndefOr[String] = js.native
}

