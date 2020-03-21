package typingsSlinky.amapJsApi.AMap.GeoJSON

import typingsSlinky.amapJsApi.amapJsApiStrings.Feature
import typingsSlinky.amapJsApi.amapJsApiStrings.FeatureCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.amapJsApi.AnonGeometry
  - typingsSlinky.amapJsApi.AnonFeatures
*/
trait GeoJSONObject extends js.Object

object GeoJSONObject {
  @scala.inline
  def AnonGeometry(geometry: Geometry, properties: js.Any, `type`: Feature): GeoJSONObject = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONObject]
  }
  @scala.inline
  def AnonFeatures(
    features: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias amap-js-api.AMap.GeoJSON.GeoJSONObject */ js.Object
    ],
    properties: js.Any,
    `type`: FeatureCollection
  ): GeoJSONObject = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONObject]
  }
}

