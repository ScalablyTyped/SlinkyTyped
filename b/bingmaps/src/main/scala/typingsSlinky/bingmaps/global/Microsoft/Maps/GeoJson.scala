package typingsSlinky.bingmaps.global.Microsoft.Maps

import typingsSlinky.bingmaps.Microsoft.Maps.IGeoJsonObject
import typingsSlinky.bingmaps.Microsoft.Maps.IPrimitive
import typingsSlinky.bingmaps.Microsoft.Maps.IStylesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.GeoJson")
@js.native
object GeoJson extends js.Object {
  
  def read(geoJson: String): IPrimitive | js.Array[IPrimitive] = js.native
  def read(geoJson: String, styles: IStylesOptions): IPrimitive | js.Array[IPrimitive] = js.native
  def read(geoJson: IGeoJsonObject): IPrimitive | js.Array[IPrimitive] = js.native
  def read(geoJson: IGeoJsonObject, styles: IStylesOptions): IPrimitive | js.Array[IPrimitive] = js.native
  
  def readFromUrl(url: String, callback: js.Function1[/* data */ IPrimitive | js.Array[IPrimitive], Unit]): Unit = js.native
  def readFromUrl(
    url: String,
    callback: js.Function1[/* data */ IPrimitive | js.Array[IPrimitive], Unit],
    jsonpQueryParam: js.UndefOr[scala.Nothing],
    styles: IStylesOptions
  ): Unit = js.native
  def readFromUrl(
    url: String,
    callback: js.Function1[/* data */ IPrimitive | js.Array[IPrimitive], Unit],
    jsonpQueryParam: String
  ): Unit = js.native
  def readFromUrl(
    url: String,
    callback: js.Function1[/* data */ IPrimitive | js.Array[IPrimitive], Unit],
    jsonpQueryParam: String,
    styles: IStylesOptions
  ): Unit = js.native
  
  def write(data: js.Array[IPrimitive]): IGeoJsonObject = js.native
  def write(data: IPrimitive): IGeoJsonObject = js.native
}
