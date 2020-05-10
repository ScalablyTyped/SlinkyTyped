package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.MeshParticleEmitter")
@js.native
/**
  * Creates a new instance MeshParticleEmitter
  * @param mesh defines the mesh to use as source
  */
class MeshParticleEmitter () extends IParticleEmitterType {
  def this(/** Defines the mesh to use as source */
  mesh: AbstractMesh) = this()
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

