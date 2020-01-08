package typingsSlinky.ol

import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.formatFeatureMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/featureloader", JSImport.Namespace)
@js.native
object featureloaderMod extends js.Object {
  def loadFeaturesXhr(url: String, format: default, success: js.Function0[Unit], failure: js.Function0[Unit]): FeatureLoader = js.native
  def loadFeaturesXhr(
    url: String,
    format: default,
    success: js.Function0[Unit],
    failure: js.ThisFunction0[/* this */ typingsSlinky.ol.sourceVectorMod.default, Unit]
  ): FeatureLoader = js.native
  def loadFeaturesXhr(url: FeatureUrlFunction, format: default, success: js.Function0[Unit], failure: js.Function0[Unit]): FeatureLoader = js.native
  def loadFeaturesXhr(
    url: FeatureUrlFunction,
    format: default,
    success: js.Function0[Unit],
    failure: js.ThisFunction0[/* this */ typingsSlinky.ol.sourceVectorMod.default, Unit]
  ): FeatureLoader = js.native
  def xhr(url: String, format: default): FeatureLoader = js.native
  def xhr(url: FeatureUrlFunction, format: default): FeatureLoader = js.native
  type FeatureLoader = js.ThisFunction3[
    /* this */ typingsSlinky.ol.sourceVectorMod.default | typingsSlinky.ol.vectorTileMod.default, 
    /* p0 */ Extent, 
    /* p1 */ Double, 
    /* p2 */ typingsSlinky.ol.projProjectionMod.default, 
    Unit
  ]
  type FeatureUrlFunction = js.Function3[
    /* p0 */ Extent, 
    /* p1 */ Double, 
    /* p2 */ typingsSlinky.ol.projProjectionMod.default, 
    String
  ]
}

