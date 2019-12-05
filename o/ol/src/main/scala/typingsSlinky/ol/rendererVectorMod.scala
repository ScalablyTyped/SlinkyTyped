package typingsSlinky.ol

import typingsSlinky.ol.featureMod.FeatureLike
import typingsSlinky.ol.renderReplayGroupMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/vector", JSImport.Namespace)
@js.native
object rendererVectorMod extends js.Object {
  def defaultOrder(feature1: FeatureLike, feature2: FeatureLike): Double = js.native
  def getSquaredTolerance(resolution: Double, pixelRatio: Double): Double = js.native
  def getTolerance(resolution: Double, pixelRatio: Double): Double = js.native
  def renderFeature[T](
    replayGroup: default,
    feature: FeatureLike,
    style: typingsSlinky.ol.styleStyleMod.default,
    squaredTolerance: Double,
    listener: js.ThisFunction1[/* this */ T, /* p0 */ typingsSlinky.ol.eventsEventMod.default, Unit],
    thisArg: T
  ): Boolean = js.native
}

