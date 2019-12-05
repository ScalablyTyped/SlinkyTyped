package typingsSlinky.ol.sourceClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster
  extends typingsSlinky.ol.sourceVectorMod.default {
  var distance: Double = js.native
  var features: js.Array[typingsSlinky.ol.featureMod.default] = js.native
  var resolution: Double = js.native
  var source: typingsSlinky.ol.sourceVectorMod.default = js.native
  /* protected */ def cluster(): Unit = js.native
  /* protected */ def createCluster(features: js.Array[typingsSlinky.ol.featureMod.default]): typingsSlinky.ol.featureMod.default = js.native
  /* protected */ def geometryFunction(p0: typingsSlinky.ol.featureMod.default): typingsSlinky.ol.geomPointMod.default = js.native
  def getDistance(): Double = js.native
  def getSource(): typingsSlinky.ol.sourceVectorMod.default = js.native
  def setDistance(distance: Double): Unit = js.native
}

