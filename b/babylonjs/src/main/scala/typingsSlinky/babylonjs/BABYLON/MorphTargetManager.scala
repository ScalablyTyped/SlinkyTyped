package typingsSlinky.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MorphTargetManager extends StObject {
  
  var _activeTargets: js.Any = js.native
  
  var _influences: js.Any = js.native
  
  var _scene: js.Any = js.native
  
  var _supportsNormals: js.Any = js.native
  
  var _supportsTangents: js.Any = js.native
  
  var _supportsUVs: js.Any = js.native
  
  var _syncActiveTargets: js.Any = js.native
  
  var _targetDataLayoutChangedObservers: js.Any = js.native
  
  var _targetInfluenceChangedObservers: js.Any = js.native
  
  var _targets: js.Any = js.native
  
  var _tempInfluences: js.Any = js.native
  
  var _uniqueId: js.Any = js.native
  
  var _vertexCount: js.Any = js.native
  
  /**
    * Add a new target to this manager
    * @param target defines the target to add
    */
  def addTarget(target: MorphTarget): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating if normals must be morphed
    */
  var enableNormalMorphing: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating if tangents must be morphed
    */
  var enableTangentMorphing: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating if UV must be morphed
    */
  var enableUVMorphing: Boolean = js.native
  
  /**
    * Gets the active target at specified index. An active target is a target with an influence > 0
    * @param index defines the index to check
    * @returns the requested target
    */
  def getActiveTarget(index: Double): MorphTarget = js.native
  
  /**
    * Gets the target at specified index
    * @param index defines the index to check
    * @returns the requested target
    */
  def getTarget(index: Double): MorphTarget = js.native
  
  /**
    * Gets the list of influences (one per target)
    */
  def influences: js.typedarray.Float32Array = js.native
  
  /**
    * Gets the number of influencers (ie. the number of targets with influences > 0)
    */
  def numInfluencers: Double = js.native
  
  /**
    * Gets the number of targets stored in this manager
    */
  def numTargets: Double = js.native
  
  /**
    * Removes a target from the manager
    * @param target defines the target to remove
    */
  def removeTarget(target: MorphTarget): Unit = js.native
  
  /**
    * Serializes the current manager into a Serialization object
    * @returns the serialized object
    */
  def serialize(): js.Any = js.native
  
  /**
    * Gets a boolean indicating if this manager supports morphing of normals
    */
  def supportsNormals: Boolean = js.native
  
  /**
    * Gets a boolean indicating if this manager supports morphing of tangents
    */
  def supportsTangents: Boolean = js.native
  
  /**
    * Gets a boolean indicating if this manager supports morphing of texture coordinates
    */
  def supportsUVs: Boolean = js.native
  
  /**
    * Syncrhonize the targets with all the meshes using this morph target manager
    */
  def synchronize(): Unit = js.native
  
  /**
    * Gets the unique ID of this manager
    */
  def uniqueId: Double = js.native
  
  /**
    * Gets the number of vertices handled by this manager
    */
  def vertexCount: Double = js.native
}
