package typingsSlinky.ol.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cluster
  extends typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default] {
  
  /* protected */ def cluster(): Unit = js.native
  
  /* protected */ def createCluster(features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
  
  var distance: Double = js.native
  
  var features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
  
  /* protected */ def geometryFunction(feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]): typingsSlinky.ol.pointMod.default = js.native
  
  def getDistance(): Double = js.native
  
  def getSource(): typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default] = js.native
  
  var resolution: Double = js.native
  
  def setDistance(distance: Double): Unit = js.native
  
  def setSource(source: typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default]): Unit = js.native
}
