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
  
  /**
    * Get the distance in pixels between clusters.
    */
  def getDistance(): Double = js.native
  
  /**
    * Get a reference to the wrapped source.
    */
  def getSource(): typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default] = js.native
  
  var resolution: Double = js.native
  
  /**
    * Set the distance in pixels between clusters.
    */
  def setDistance(distance: Double): Unit = js.native
  
  /**
    * Replace the wrapped source.
    */
  def setSource(source: typingsSlinky.ol.sourceVectorMod.default[typingsSlinky.ol.geometryMod.default]): Unit = js.native
}
