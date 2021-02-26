package typingsSlinky.ol

import typingsSlinky.ol.olTileMod.UrlFunction
import typingsSlinky.ol.tilecoordMod.TileCoord
import typingsSlinky.ol.tilegridTileGridMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileurlfunctionMod {
  
  @JSImport("ol/tileurlfunction", "createFromTemplate")
  @js.native
  def createFromTemplate(template: String, tileGrid: default): UrlFunction = js.native
  
  @JSImport("ol/tileurlfunction", "createFromTemplates")
  @js.native
  def createFromTemplates(templates: js.Array[String], tileGrid: default): UrlFunction = js.native
  
  @JSImport("ol/tileurlfunction", "createFromTileUrlFunctions")
  @js.native
  def createFromTileUrlFunctions(tileUrlFunctions: js.Array[UrlFunction]): UrlFunction = js.native
  
  @JSImport("ol/tileurlfunction", "expandUrl")
  @js.native
  def expandUrl(url: String): js.Array[String] = js.native
  
  @JSImport("ol/tileurlfunction", "nullTileUrlFunction")
  @js.native
  def nullTileUrlFunction(tileCoord: TileCoord, pixelRatio: Double, projection: typingsSlinky.ol.projectionMod.default): js.UndefOr[String] = js.native
}
