package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.boundingInfoMod.BoundingInfo
import typingsSlinky.babylonjs.materialMod.Material
import typingsSlinky.babylonjs.mathColorMod.Color4
import typingsSlinky.babylonjs.mathPlaneMod.Plane
import typingsSlinky.babylonjs.mathVectorMod.Matrix
import typingsSlinky.babylonjs.mathVectorMod.Quaternion
import typingsSlinky.babylonjs.mathVectorMod.Vector2
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.mathVectorMod.Vector4
import typingsSlinky.babylonjs.meshMod.Mesh
import typingsSlinky.babylonjs.solidParticleSystemMod.SolidParticleSystem
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Particles/solidParticle", JSImport.Namespace)
@js.native
object solidParticleMod extends js.Object {
  
  @js.native
  class DepthSortedParticle protected () extends js.Object {
    /**
      * Creates a new sorted particle
      * @param materialIndex
      */
    def this(idx: Double, ind: Double, indLength: Double, materialIndex: Double) = this()
    
    /**
      * Particle index
      */
    var idx: Double = js.native
    
    /**
      * Index of the particle in the "indices" array
      */
    var ind: Double = js.native
    
    /**
      * Length of the particle shape in the "indices" array
      */
    var indicesLength: Double = js.native
    
    /**
      * Material index when used with MultiMaterials
      */
    var materialIndex: Double = js.native
    
    /**
      * Squared distance from the particle to the camera
      */
    var sqDistance: Double = js.native
  }
  
  @js.native
  class ModelShape protected () extends js.Object {
    /**
      * Creates a ModelShape object. This is an internal simplified reference to a mesh used as for a model to replicate particles from by the SPS.
      * SPS internal tool, don't use it manually.
      * @hidden
      */
    def this(
      id: Double,
      shape: js.Array[Vector3],
      indices: js.Array[Double],
      normals: js.Array[Double],
      colors: js.Array[Double],
      shapeUV: js.Array[Double],
      posFunction: Nullable[js.Function3[/* particle */ SolidParticle, /* i */ Double, /* s */ Double, Unit]],
      vtxFunction: Nullable[
            js.Function3[/* particle */ SolidParticle, /* vertex */ Vector3, /* i */ Double, Unit]
          ],
      material: Nullable[Material]
    ) = this()
    
    /**
      * indices array of the model
      * @hidden
      */
    var _indices: js.Array[Double] = js.native
    
    /**
      * length of the shape in the model indices array (internal use)
      * @hidden
      */
    var _indicesLength: Double = js.native
    
    /**
      * Model material (internal use)
      * @hidden
      */
    var _material: Nullable[Material] = js.native
    
    /**
      * normals array of the model
      * @hidden
      */
    var _normals: js.Array[Double] = js.native
    
    /**
      * Custom position function (internal use)
      * @hidden
      */
    var _positionFunction: Nullable[js.Function3[/* particle */ SolidParticle, /* i */ Double, /* s */ Double, Unit]] = js.native
    
    /**
      * flat array of model positions (internal use)
      * @hidden
      */
    var _shape: js.Array[Vector3] = js.native
    
    /**
      * color array of the model
      * @hidden
      */
    var _shapeColors: js.Array[Double] = js.native
    
    /**
      * flat array of model UVs (internal use)
      * @hidden
      */
    var _shapeUV: js.Array[Double] = js.native
    
    /**
      * Custom vertex function (internal use)
      * @hidden
      */
    var _vertexFunction: Nullable[
        js.Function3[/* particle */ SolidParticle, /* vertex */ Vector3, /* i */ Double, Unit]
      ] = js.native
    
    /**
      * The shape id
      * @hidden
      */
    var shapeID: Double = js.native
  }
  
  @js.native
  class SolidParticle protected () extends js.Object {
    /**
      * Creates a Solid Particle object.
      * Don't create particles manually, use instead the Solid Particle System internal tools like _addParticle()
      * @param particleIndex (integer) is the particle index in the Solid Particle System pool.
      * @param particleId (integer) is the particle identifier. Unless some particles are removed from the SPS, it's the same value than the particle idx.
      * @param positionIndex (integer) is the starting index of the particle vertices in the SPS "positions" array.
      * @param indiceIndex (integer) is the starting index of the particle indices in the SPS "indices" array.
      * @param model (ModelShape) is a reference to the model shape on what the particle is designed.
      * @param shapeId (integer) is the model shape identifier in the SPS.
      * @param idxInShape (integer) is the index of the particle in the current model (ex: the 10th box of addShape(box, 30))
      * @param sps defines the sps it is associated to
      * @param modelBoundingInfo is the reference to the model BoundingInfo used for intersection computations.
      * @param materialIndex is the particle material identifier (integer) when the MultiMaterials are enabled in the SPS.
      */
    def this(
      particleIndex: Double,
      particleId: Double,
      positionIndex: Double,
      indiceIndex: Double,
      model: Nullable[ModelShape],
      shapeId: Double,
      idxInShape: Double,
      sps: SolidParticleSystem
    ) = this()
    def this(
      particleIndex: Double,
      particleId: Double,
      positionIndex: Double,
      indiceIndex: Double,
      model: Nullable[ModelShape],
      shapeId: Double,
      idxInShape: Double,
      sps: SolidParticleSystem,
      modelBoundingInfo: Nullable[BoundingInfo]
    ) = this()
    def this(
      particleIndex: Double,
      particleId: Double,
      positionIndex: Double,
      indiceIndex: Double,
      model: Nullable[ModelShape],
      shapeId: Double,
      idxInShape: Double,
      sps: SolidParticleSystem,
      modelBoundingInfo: js.UndefOr[Nullable[BoundingInfo]],
      materialIndex: Nullable[Double]
    ) = this()
    
    /**
      * @hidden Particle BoundingInfo object (Internal use)
      */
    var _boundingInfo: BoundingInfo = js.native
    
    /**
      * @hidden Internal global position in the SPS.
      */
    var _globalPosition: Vector3 = js.native
    
    /**
      * @hidden Index of this particle in the global "indices" array (Internal use)
      */
    var _ind: Double = js.native
    
    /**
      * @hidden ModelShape of this particle (Internal use)
      */
    var _model: ModelShape = js.native
    
    /**
      * @hidden Reference to the shape model BoundingInfo object (Internal use)
      */
    var _modelBoundingInfo: BoundingInfo = js.native
    
    /**
      * Index of this particle in the global "positions" array (Internal use)
      * @hidden
      */
    var _pos: Double = js.native
    
    /**
      * @hidden Last computed particle rotation matrix
      */
    var _rotationMatrix: js.Array[Double] = js.native
    
    /**
      * @hidden Reference to the SPS what the particle belongs to (Internal use)
      */
    var _sps: SolidParticleSystem = js.native
    
    /**
      * @hidden Still set as invisible in order to skip useless computations (Internal use)
      */
    var _stillInvisible: Boolean = js.native
    
    /**
      * Is the particle active or not ?
      */
    var alive: Boolean = js.native
    
    /**
      * The color of the particle
      */
    var color: Nullable[Color4] = js.native
    
    /**
      * Copies the particle property values into the existing target : position, rotation, scaling, uvs, colors, pivot, parent, visibility, alive
      * @param target the particle target
      * @returns the current particle
      */
    def copyToRef(target: SolidParticle): SolidParticle = js.native
    
    /**
      * The culling strategy to use to check whether the solid particle must be culled or not when using isInFrustum().
      * The possible values are :
      * - AbstractMesh.CULLINGSTRATEGY_STANDARD
      * - AbstractMesh.CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY
      * - AbstractMesh.CULLINGSTRATEGY_OPTIMISTIC_INCLUSION
      * - AbstractMesh.CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY
      * The default value for solid particles is AbstractMesh.CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY
      * Please read each static variable documentation in the class AbstractMesh to get details about the culling process.
      * */
    var cullingStrategy: Double = js.native
    
    /**
      * get the rotation matrix of the particle
      * @hidden
      */
    def getRotationMatrix(m: Matrix): Unit = js.native
    
    /**
      * particle identifier
      */
    var id: Double = js.native
    
    /**
      * particle global index
      */
    var idx: Double = js.native
    
    /**
      * Index of the particle in its shape id
      */
    var idxInShape: Double = js.native
    
    /**
      * Returns a boolean. True if the particle intersects another particle or another mesh, else false.
      * The intersection is computed on the particle bounding sphere and Axis Aligned Bounding Box (AABB)
      * @param target is the object (solid particle or mesh) what the intersection is computed against.
      * @returns true if it intersects
      */
    def intersectsMesh(target: Mesh): Boolean = js.native
    def intersectsMesh(target: SolidParticle): Boolean = js.native
    
    /**
      * Returns `true` if the solid particle is within the frustum defined by the passed array of planes.
      * A particle is in the frustum if its bounding box intersects the frustum
      * @param frustumPlanes defines the frustum to test
      * @returns true if the particle is in the frustum planes
      */
    def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
    
    /**
      * Is the particle visible or not ?
      */
    var isVisible: Boolean = js.native
    
    /**
      * The particle material identifier (integer) when MultiMaterials are enabled in the SPS.
      */
    var materialIndex: Nullable[Double] = js.native
    
    /**
      * Parent particle Id, if any.
      * Default null.
      */
    var parentId: Nullable[Double] = js.native
    
    /**
      * The pivot point in the particle local space.
      */
    var pivot: Vector3 = js.native
    
    /**
      * The world space position of the particle.
      */
    var position: Vector3 = js.native
    
    /**
      * Custom object or properties.
      */
    var props: Nullable[_] = js.native
    
    /**
      * Legacy support, changed quaternion to rotationQuaternion
      */
    def quaternion: Nullable[Quaternion] = js.native
    /**
      * Legacy support, changed quaternion to rotationQuaternion
      */
    def quaternion_=(q: Nullable[Quaternion]): Unit = js.native
    
    /**
      * The world space rotation of the particle. (Not use if rotationQuaternion is set)
      */
    var rotation: Vector3 = js.native
    
    /**
      * The world space rotation quaternion of the particle.
      */
    var rotationQuaternion: Nullable[Quaternion] = js.native
    
    /**
      * Legacy support, changed scale to scaling
      */
    def scale: Vector3 = js.native
    /**
      * Legacy support, changed scale to scaling
      */
    def scale_=(scale: Vector3): Unit = js.native
    
    /**
      * The scaling of the particle.
      */
    var scaling: Vector3 = js.native
    
    /**
      * ModelShape id of this particle
      */
    var shapeId: Double = js.native
    
    /**
      * Must the particle be translated from its pivot point in its local space ?
      * In this case, the pivot point is set at the origin of the particle local space and the particle is translated.
      * Default : false
      */
    var translateFromPivot: Boolean = js.native
    
    /**
      * The uvs of the particle.
      */
    var uvs: Vector4 = js.native
    
    /**
      * The current speed of the particle.
      */
    var velocity: Vector3 = js.native
  }
  
  @js.native
  /**
    * Creates a new solid particle vertex
    */
  class SolidParticleVertex () extends js.Object {
    
    /**
      * Vertex color
      */
    var color: Color4 = js.native
    
    /**
      * Vertex position
      */
    var position: Vector3 = js.native
    
    /**
      * Vertex UV
      */
    var uv: Vector2 = js.native
    
    /** Vertex x coordinate */
    def x: Double = js.native
    def x_=(`val`: Double): Unit = js.native
    
    /** Vertex y coordinate */
    def y: Double = js.native
    def y_=(`val`: Double): Unit = js.native
    
    /** Vertex z coordinate */
    def z: Double = js.native
    def z_=(`val`: Double): Unit = js.native
  }
}
