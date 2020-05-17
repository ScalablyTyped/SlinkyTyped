package typingsSlinky.amapJsApi.AMap.GeoJSON

import typingsSlinky.amapJsApi.anon.Features
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApi.anon.Geometry
  - typingsSlinky.amapJsApi.anon.Features
*/
trait GeoJSONObject extends js.Object

object GeoJSONObject {
  @scala.inline
  implicit def apply(value: Features): GeoJSONObject = value.asInstanceOf[GeoJSONObject]
  @scala.inline
  implicit def apply(value: typingsSlinky.amapJsApi.anon.Geometry): GeoJSONObject = value.asInstanceOf[GeoJSONObject]
}

