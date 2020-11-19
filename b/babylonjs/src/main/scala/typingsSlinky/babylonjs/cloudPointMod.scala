package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.boundingInfoMod.BoundingInfo
import typingsSlinky.babylonjs.mathMod.Color4
import typingsSlinky.babylonjs.mathMod.Matrix
import typingsSlinky.babylonjs.mathMod.Quaternion
import typingsSlinky.babylonjs.mathMod.Vector2
import typingsSlinky.babylonjs.mathMod.Vector3
import typingsSlinky.babylonjs.meshMod.Mesh
import typingsSlinky.babylonjs.pointsCloudSystemMod.PointsCloudSystem
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Particles/cloudPoint", JSImport.Namespace)
@js.native
object cloudPointMod extends js.Object {
  
  @js.native
  class CloudPoint protected () extends js.Object {
    /**
      * Creates a Point Cloud object.
      * Don't create particles manually, use instead the PCS internal tools like _addParticle()
      * @param particleIndex (integer) is the particle index in the PCS pool. It's also the particle identifier.
      * @param group (PointsGroup) is the group the particle belongs to
      * @param groupId (integer) is the group identifier in the PCS.
      * @param idxInGroup (integer) is the index of the particle in the current point group (ex: the 10th point of addPoints(30))
      * @param pcs defines the PCS it is associated to
      */
    def this(
      particleIndex: Double,
      group: PointsGroup,
      groupId: Double,
      idxInGroup: Double,
      pcs: PointsCloudSystem
    ) = this()
    
    /**
      * @hidden Particle BoundingInfo object (Internal use)
      */
    var _boundingInfo: BoundingInfo = js.native
    
    /**
      * @hidden Internal global position in the PCS.
      */
    var _globalPosition: Vector3 = js.native
    
    /**
      * Group this particle belongs to
      */
    var _group: PointsGroup = js.native
    
    /**
      * @hidden Index of this particle in the global "indices" array (Internal use)
      */
    var _ind: Double = js.native
    
    /**
      * @hidden Reference to the PCS that the particle belongs to (Internal use)
      */
    var _pcs: PointsCloudSystem = js.native
    
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
      * @hidden Still set as invisible in order to skip useless computations (Internal use)
      */
    var _stillInvisible: Boolean = js.native
    
    /**
      * The color of the particle
      */
    var color: Nullable[Color4] = js.native
    
    /**
      * get the rotation matrix of the particle
      * @hidden
      */
    def getRotationMatrix(m: Matrix): Unit = js.native
    
    /**
      * Group id of this particle
      */
    var groupId: Double = js.native
    
    /**
      * particle global index
      */
    var idx: Double = js.native
    
    /**
      * Index of the particle in its group id (Internal use)
      */
    var idxInGroup: Double = js.native
    
    /**
      * Returns a boolean. True if the particle intersects a mesh, else false
      * The intersection is computed on the particle position and Axis Aligned Bounding Box (AABB) or Sphere
      * @param target is the object (point or mesh) what the intersection is computed against
      * @param isSphere is boolean flag when false (default) bounding box of mesh is used, when true the bouding sphere is used
      * @returns true if it intersects
      */
    def intersectsMesh(target: Mesh, isSphere: Boolean): Boolean = js.native
    
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
      * get point size
      */
    def size: Vector3 = js.native
    /**
      * Set point size
      */
    def size_=(scale: Vector3): Unit = js.native
    
    /**
      * Must the particle be translated from its pivot point in its local space ?
      * In this case, the pivot point is set at the origin of the particle local space and the particle is translated.
      * Default : false
      */
    var translateFromPivot: Boolean = js.native
    
    /**
      * The uv of the particle.
      */
    var uv: Nullable[Vector2] = js.native
    
    /**
      * The current speed of the particle.
      */
    var velocity: Vector3 = js.native
  }
  
  @js.native
  class PointsGroup protected () extends js.Object {
    /**
      * Creates a points group object. This is an internal reference to produce particles for the PCS.
      * PCS internal tool, don't use it manually.
      * @hidden
      */
    def this(
      id: Double,
      posFunction: Nullable[
            js.Function3[
              /* particle */ CloudPoint, 
              /* i */ js.UndefOr[Double], 
              /* s */ js.UndefOr[Double], 
              Unit
            ]
          ]
    ) = this()
    
    /**
      * density per facet for surface points
      * @hidden
      */
    var _groupDensity: js.Array[Double] = js.native
    
    /**
      * image data for group (internal use)
      * @hidden
      */
    var _groupImageData: Nullable[js.typedarray.ArrayBufferView] = js.native
    
    /**
      * Image Height (internal use)
      * @hidden
      */
    var _groupImgHeight: Double = js.native
    
    /**
      * Image Width (internal use)
      * @hidden
      */
    var _groupImgWidth: Double = js.native
    
    /**
      * Custom position function (internal use)
      * @hidden
      */
    var _positionFunction: Nullable[
        js.Function3[
          /* particle */ CloudPoint, 
          /* i */ js.UndefOr[Double], 
          /* s */ js.UndefOr[Double], 
          Unit
        ]
      ] = js.native
    
    /**
      * Only when points are colored by texture carries pointer to texture list array
      * @hidden
      */
    var _textureNb: Double = js.native
    
    /**
      * The group id
      * @hidden
      */
    var groupID: Double = js.native
  }
}
