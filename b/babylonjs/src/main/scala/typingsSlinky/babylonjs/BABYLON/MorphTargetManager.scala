package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MorphTargetManager extends js.Object {
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
    * Add a new target to this manager
    * @param target defines the target to add
    */
  def addTarget(target: MorphTarget): Unit = js.native
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

object MorphTargetManager {
  @scala.inline
  def apply(
    _activeTargets: js.Any,
    _influences: js.Any,
    _scene: js.Any,
    _supportsNormals: js.Any,
    _supportsTangents: js.Any,
    _supportsUVs: js.Any,
    _syncActiveTargets: js.Any,
    _targetDataLayoutChangedObservers: js.Any,
    _targetInfluenceChangedObservers: js.Any,
    _targets: js.Any,
    _tempInfluences: js.Any,
    _uniqueId: js.Any,
    _vertexCount: js.Any,
    addTarget: MorphTarget => Unit,
    enableNormalMorphing: Boolean,
    enableTangentMorphing: Boolean,
    enableUVMorphing: Boolean,
    getActiveTarget: Double => MorphTarget,
    getTarget: Double => MorphTarget,
    influences: () => js.typedarray.Float32Array,
    numInfluencers: () => Double,
    numTargets: () => Double,
    removeTarget: MorphTarget => Unit,
    serialize: () => js.Any,
    supportsNormals: () => Boolean,
    supportsTangents: () => Boolean,
    supportsUVs: () => Boolean,
    synchronize: () => Unit,
    uniqueId: () => Double,
    vertexCount: () => Double
  ): MorphTargetManager = {
    val __obj = js.Dynamic.literal(_activeTargets = _activeTargets.asInstanceOf[js.Any], _influences = _influences.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], _supportsNormals = _supportsNormals.asInstanceOf[js.Any], _supportsTangents = _supportsTangents.asInstanceOf[js.Any], _supportsUVs = _supportsUVs.asInstanceOf[js.Any], _syncActiveTargets = _syncActiveTargets.asInstanceOf[js.Any], _targetDataLayoutChangedObservers = _targetDataLayoutChangedObservers.asInstanceOf[js.Any], _targetInfluenceChangedObservers = _targetInfluenceChangedObservers.asInstanceOf[js.Any], _targets = _targets.asInstanceOf[js.Any], _tempInfluences = _tempInfluences.asInstanceOf[js.Any], _uniqueId = _uniqueId.asInstanceOf[js.Any], _vertexCount = _vertexCount.asInstanceOf[js.Any], addTarget = js.Any.fromFunction1(addTarget), enableNormalMorphing = enableNormalMorphing.asInstanceOf[js.Any], enableTangentMorphing = enableTangentMorphing.asInstanceOf[js.Any], enableUVMorphing = enableUVMorphing.asInstanceOf[js.Any], getActiveTarget = js.Any.fromFunction1(getActiveTarget), getTarget = js.Any.fromFunction1(getTarget), influences = js.Any.fromFunction0(influences), numInfluencers = js.Any.fromFunction0(numInfluencers), numTargets = js.Any.fromFunction0(numTargets), removeTarget = js.Any.fromFunction1(removeTarget), serialize = js.Any.fromFunction0(serialize), supportsNormals = js.Any.fromFunction0(supportsNormals), supportsTangents = js.Any.fromFunction0(supportsTangents), supportsUVs = js.Any.fromFunction0(supportsUVs), synchronize = js.Any.fromFunction0(synchronize), uniqueId = js.Any.fromFunction0(uniqueId), vertexCount = js.Any.fromFunction0(vertexCount))
    __obj.asInstanceOf[MorphTargetManager]
  }
  @scala.inline
  implicit class MorphTargetManagerOps[Self <: MorphTargetManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_activeTargets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_activeTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_influences(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_influences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_scene(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_supportsNormals(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_supportsNormals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_supportsTangents(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_supportsTangents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_supportsUVs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_supportsUVs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_syncActiveTargets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_syncActiveTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_targetDataLayoutChangedObservers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_targetDataLayoutChangedObservers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_targetInfluenceChangedObservers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_targetInfluenceChangedObservers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_targets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_tempInfluences(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_tempInfluences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_uniqueId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_uniqueId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_vertexCount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_vertexCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddTarget(value: MorphTarget => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnableNormalMorphing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableNormalMorphing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableTangentMorphing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTangentMorphing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableUVMorphing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUVMorphing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetActiveTarget(value: Double => MorphTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTarget(value: Double => MorphTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInfluences(value: () => js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("influences")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNumInfluencers(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numInfluencers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNumTargets(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numTargets")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveTarget(value: MorphTarget => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSerialize(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSupportsNormals(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsNormals")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSupportsTangents(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsTangents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSupportsUVs(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportsUVs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSynchronize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUniqueId(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniqueId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVertexCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexCount")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

