package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshParticleEmitter extends IParticleEmitterType {
  
  var _indices: js.Any = js.native
  
  var _normals: js.Any = js.native
  
  var _positions: js.Any = js.native
  
  var _storedNormal: js.Any = js.native
  
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    */
  var direction1: Vector3 = js.native
  
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    */
  var direction2: Vector3 = js.native
  
  /** Defines the mesh to use as source */
  var mesh: js.UndefOr[AbstractMesh] = js.native
  
  /**
    * Gets or sets a boolean indicating that particle directions must be built from mesh face normals
    */
  var useMeshNormalsForDirection: Boolean = js.native
}
object MeshParticleEmitter {
  
  @scala.inline
  def apply(
    _indices: js.Any,
    _normals: js.Any,
    _positions: js.Any,
    _storedNormal: js.Any,
    applyToShader: Effect => Unit,
    direction1: Vector3,
    direction2: Vector3,
    getClassName: () => String,
    getEffectDefines: () => String,
    parse: (js.Any, Scene) => Unit,
    serialize: () => js.Any,
    startDirectionFunction: (Matrix, Vector3, Particle, Boolean) => Unit,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Unit,
    useMeshNormalsForDirection: Boolean
  ): MeshParticleEmitter = {
    val __obj = js.Dynamic.literal(_indices = _indices.asInstanceOf[js.Any], _normals = _normals.asInstanceOf[js.Any], _positions = _positions.asInstanceOf[js.Any], _storedNormal = _storedNormal.asInstanceOf[js.Any], applyToShader = js.Any.fromFunction1(applyToShader), direction1 = direction1.asInstanceOf[js.Any], direction2 = direction2.asInstanceOf[js.Any], getClassName = js.Any.fromFunction0(getClassName), getEffectDefines = js.Any.fromFunction0(getEffectDefines), parse = js.Any.fromFunction2(parse), serialize = js.Any.fromFunction0(serialize), startDirectionFunction = js.Any.fromFunction4(startDirectionFunction), startPositionFunction = js.Any.fromFunction4(startPositionFunction), useMeshNormalsForDirection = useMeshNormalsForDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshParticleEmitter]
  }
  
  @scala.inline
  implicit class MeshParticleEmitterOps[Self <: MeshParticleEmitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_indices(value: js.Any): Self = this.set("_indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_normals(value: js.Any): Self = this.set("_normals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_positions(value: js.Any): Self = this.set("_positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_storedNormal(value: js.Any): Self = this.set("_storedNormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection1(value: Vector3): Self = this.set("direction1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection2(value: Vector3): Self = this.set("direction2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMeshNormalsForDirection(value: Boolean): Self = this.set("useMeshNormalsForDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMesh(value: AbstractMesh): Self = this.set("mesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMesh: Self = this.set("mesh", js.undefined)
  }
}
