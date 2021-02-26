package typingsSlinky.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "StyleExpression")
@js.native
class StyleExpression () extends StObject {
  
  def evaluate(feature: Cesium3DTileFeature): Boolean | Double | String | js.RegExp | Cartesian2 | Cartesian3 | Cartesian4 | Color = js.native
  def evaluate(feature: Cesium3DTileFeature, result: js.Any): Boolean | Double | String | js.RegExp | Cartesian2 | Cartesian3 | Cartesian4 | Color = js.native
  
  def evaluateColor(feature: Cesium3DTileFeature): Color = js.native
  def evaluateColor(feature: Cesium3DTileFeature, result: Color): Color = js.native
}
