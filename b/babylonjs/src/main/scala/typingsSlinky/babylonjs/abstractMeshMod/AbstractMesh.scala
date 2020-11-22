package typingsSlinky.babylonjs.abstractMeshMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.babylonjs.abstractActionManagerMod.AbstractActionManager
import typingsSlinky.babylonjs.anon.Actions
import typingsSlinky.babylonjs.boundingInfoMod.BoundingInfo
import typingsSlinky.babylonjs.boundingInfoMod.ICullable
import typingsSlinky.babylonjs.cameraMod.Camera
import typingsSlinky.babylonjs.colliderMod.Collider
import typingsSlinky.babylonjs.edgesRendererMod.EdgesRenderer
import typingsSlinky.babylonjs.edgesRendererMod.IEdgesRenderer
import typingsSlinky.babylonjs.edgesRendererMod.IEdgesRendererOptions
import typingsSlinky.babylonjs.engineOcclusionQueryMod.OcclusionDataStorage
import typingsSlinky.babylonjs.iparticlesystemMod.IParticleSystem
import typingsSlinky.babylonjs.lightMod.Light
import typingsSlinky.babylonjs.materialMod.Material
import typingsSlinky.babylonjs.mathColorMod.Color3
import typingsSlinky.babylonjs.mathColorMod.Color4
import typingsSlinky.babylonjs.mathVectorMod.Matrix
import typingsSlinky.babylonjs.mathVectorMod.Vector2
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import typingsSlinky.babylonjs.meshMod.Mesh
import typingsSlinky.babylonjs.meshVertexDataMod.IGetSetVerticesData
import typingsSlinky.babylonjs.nodeMod.Node
import typingsSlinky.babylonjs.observableMod.Observable
import typingsSlinky.babylonjs.observableMod.Observer
import typingsSlinky.babylonjs.octreeMod.Octree
import typingsSlinky.babylonjs.physicsImpostorMod.PhysicsImpostor
import typingsSlinky.babylonjs.pickingInfoMod.PickingInfo
import typingsSlinky.babylonjs.rawTextureMod.RawTexture
import typingsSlinky.babylonjs.rayMod.Ray
import typingsSlinky.babylonjs.rayMod.TrianglePickingPredicate
import typingsSlinky.babylonjs.renderingGroupMod.RenderingGroup
import typingsSlinky.babylonjs.sceneMod.IDisposable
import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.skeletonMod.Skeleton
import typingsSlinky.babylonjs.solidParticleMod.SolidParticle
import typingsSlinky.babylonjs.subMeshMod.SubMesh
import typingsSlinky.babylonjs.transformNodeMod.TransformNode
import typingsSlinky.babylonjs.typesMod.DeepImmutable
import typingsSlinky.babylonjs.typesMod.FloatArray
import typingsSlinky.babylonjs.typesMod.IndicesArray
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.std.WebGLQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/abstractMesh", "AbstractMesh")
@js.native
class AbstractMesh protected ()
  extends TransformNode
     with IDisposable
     with ICullable
     with IGetSetVerticesData {
  /**
    * Creates a new AbstractMesh
    * @param name defines the name of the mesh
    * @param scene defines the hosting scene
    */
  def this(name: String) = this()
  def this(name: String, scene: Nullable[Scene]) = this()
  
  /**
    * Backing filed
    * @hidden
    */
  var __occlusionDataStorage: OcclusionDataStorage = js.native
  
  /** @hidden */
  def _activate(renderId: Double, intermediateRendering: Boolean): Boolean = js.native
  
  /** @hidden */
  var _bonesTransformMatrices: Nullable[js.typedarray.Float32Array] = js.native
  
  /** @hidden */
  var _boundingInfo: Nullable[BoundingInfo] = js.native
  
  /** @hidden */
  def _checkCollision(collider: Collider): AbstractMesh = js.native
  
  /** @hidden */
  def _checkOcclusionQuery(): Boolean = js.native
  
  /** @hidden */
  def _collideForSubMesh(subMesh: SubMesh, transformMatrix: Matrix, collider: Collider): AbstractMesh = js.native
  
  /** @hidden */
  var _disposePhysicsObserver: Nullable[Observer[Node]] = js.native
  
  /** @hidden */
  var _edgesRenderer: Nullable[IEdgesRenderer] = js.native
  
  /** @hidden */
  def _effectiveMesh: AbstractMesh = js.native
  
  /** @hidden */
  def _freeze(): Unit = js.native
  
  /** @hidden */
  def _generatePointsArray(): Boolean = js.native
  
  /** @hidden */
  def _getPositionData(applySkeleton: Boolean): Nullable[FloatArray] = js.native
  
  /** @hidden */
  var _initFacetData: js.Any = js.native
  
  /** @hidden */
  var _internalAbstractMeshDataInfo: InternalAbstractMeshDataInfo = js.native
  
  /** @hidden */
  var _intersectionsInProgress: js.Array[AbstractMesh] = js.native
  
  /** @hidden */
  var _lightSources: js.Array[Light] = js.native
  
  /** @hidden */
  def _markSubMeshesAsAttributesDirty(): Unit = js.native
  
  var _markSubMeshesAsDirty: js.Any = js.native
  
  /** @hidden */
  def _markSubMeshesAsLightDirty(): Unit = js.native
  def _markSubMeshesAsLightDirty(dispose: Boolean): Unit = js.native
  
  /** @hidden */
  def _markSubMeshesAsMiscDirty(): Unit = js.native
  
  /** @hidden */
  var _masterMesh: Nullable[AbstractMesh] = js.native
  
  var _material: js.Any = js.native
  
  var _meshCollisionData: js.Any = js.native
  
  /**
    * Access property
    * @hidden
    */
  var _occlusionDataStorage: OcclusionDataStorage = js.native
  
  /** @hidden */
  var _occlusionQuery: Nullable[WebGLQuery] = js.native
  
  var _onCollisionPositionChange: js.Any = js.native
  
  /** @hidden */
  var _physicsImpostor: Nullable[PhysicsImpostor] = js.native
  
  /** @hidden */
  def _positions: Nullable[js.Array[Vector3]] = js.native
  
  /** @hidden */
  def _postActivate(): Unit = js.native
  
  /** @hidden */
  def _preActivate(): Unit = js.native
  
  /** @hidden */
  def _preActivateForIntermediateRendering(renderId: Double): Unit = js.native
  
  /** @hidden */
  def _processCollisionsForSubMeshes(collider: Collider, transformMatrix: Matrix): AbstractMesh = js.native
  
  /** @hidden */
  def _rebuild(): Unit = js.native
  
  /** @hidden */
  def _refreshBoundingInfo(data: Nullable[FloatArray], bias: Nullable[Vector2]): Unit = js.native
  
  /** @hidden */
  def _removeLightSource(light: Light, dispose: Boolean): Unit = js.native
  
  /** @hidden */
  var _renderId: Double = js.native
  
  /** @hidden (Backing field) */
  var _renderOutline: Boolean = js.native
  
  /** @hidden (Backing field) */
  var _renderOverlay: Boolean = js.native
  
  /** @hidden */
  var _renderingGroup: Nullable[RenderingGroup] = js.native
  
  var _renderingGroupId: js.Any = js.native
  
  /** @hidden */
  def _resyncLightSource(light: Light): Unit = js.native
  
  /** @hidden */
  def _resyncLightSources(): Unit = js.native
  
  /** @hidden (Backing field) */
  var _showBoundingBox: Boolean = js.native
  
  /**
    * @hidden
    * Backing Field
    */
  var _submeshesOctree: Octree[SubMesh] = js.native
  
  /** @hidden */
  var _transformMatrixTexture: Nullable[RawTexture] = js.native
  
  /** @hidden */
  def _unBindEffect(): Unit = js.native
  
  /** @hidden */
  def _unFreeze(): Unit = js.native
  
  /** @hidden */
  var _unIndexed: Boolean = js.native
  
  /** @hidden */
  def _updateBoundingInfo(): AbstractMesh = js.native
  
  /** @hidden */
  def _updateSubMeshesBoundingInfo(matrix: DeepImmutable[Matrix]): AbstractMesh = js.native
  
  /** @hidden */
  var _waitingData: Actions = js.native
  
  /**
    * Gets or sets the current action manager
    * @see https://doc.babylonjs.com/how_to/how_to_use_actions
    */
  var actionManager: Nullable[AbstractActionManager] = js.native
  
  /**
    * Adds the passed mesh as a child to the current mesh
    * @param mesh defines the child mesh
    * @returns the current mesh
    */
  def addChild(mesh: AbstractMesh): AbstractMesh = js.native
  
  /**
    * Align the mesh with a normal
    * @param normal defines the normal to use
    * @param upDirection can be used to redefined the up vector to use (will use the (0, 1, 0) by default)
    * @returns the current mesh
    */
  def alignWithNormal(normal: Vector3): AbstractMesh = js.native
  def alignWithNormal(normal: Vector3, upDirection: Vector3): AbstractMesh = js.native
  
  /** Gets or sets the alpha index used to sort transparent meshes
    * @see https://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered#alpha-index
    */
  var alphaIndex: Double = js.native
  
  /**
    * True if the mesh must be rendered in any case (this will shortcut the frustum clipping phase)
    */
  var alwaysSelectAsActiveMesh: Boolean = js.native
  
  /** Gets or sets a boolean indicating that this mesh will allow fog to be rendered on it (true by default) */
  def applyFog: Boolean = js.native
  def applyFog_=(value: Boolean): Unit = js.native
  
  /** Apply a physic impulse to the mesh
    * @param force defines the force to apply
    * @param contactPoint defines where to apply the force
    * @returns the current mesh
    * @see https://doc.babylonjs.com/how_to/using_the_physics_engine
    */
  def applyImpulse(force: Vector3, contactPoint: Vector3): typingsSlinky.babylonjs.physicsEngineComponentMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = js.native
  
  /**
    * Calculate relative position change from the point of view of behind the front of the mesh.
    * This is performed taking into account the meshes current rotation, so you do not have to care.
    * Supports definition of mesh facing forward or backward
    * @param amountRight defines the distance on the right axis
    * @param amountUp defines the distance on the up axis
    * @param amountForward defines the distance on the forward axis
    * @returns the new displacement vector
    */
  def calcMovePOV(amountRight: Double, amountUp: Double, amountForward: Double): Vector3 = js.native
  
  /**
    * Calculate relative rotation change from the point of view of behind the front of the mesh.
    * Supports definition of mesh facing forward or backward.
    * @param flipBack defines the flip
    * @param twirlClockwise defines the twirl
    * @param tiltRight defines the tilt
    * @returns the new rotation vector
    */
  def calcRotatePOV(flipBack: Double, twirlClockwise: Double, tiltRight: Double): Vector3 = js.native
  
  /**
    * Gets or sets a boolean indicating that this mesh can be used in the collision engine
    * @see https://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
    */
  def checkCollisions: Boolean = js.native
  def checkCollisions_=(collisionEnabled: Boolean): Unit = js.native
  
  /**
    * Gets Collider object used to compute collisions (not physics)
    * @see https://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
    */
  def collider: Nullable[Collider] = js.native
  
  /**
    * Gets or sets the current collision group mask (-1 by default).
    * A collision between A and B will happen if A.collisionGroup & b.collisionMask !== 0
    */
  def collisionGroup: Double = js.native
  def collisionGroup_=(mask: Double): Unit = js.native
  
  /**
    * Gets or sets a collision mask used to mask collisions (default is -1).
    * A collision between A and B will happen if A.collisionGroup & b.collisionMask !== 0
    */
  def collisionMask: Double = js.native
  def collisionMask_=(mask: Double): Unit = js.native
  
  /**
    * Gets or sets a collision response flag (default is true).
    * when collisionResponse is false, events are still triggered but colliding entity has no response
    * This helps creating trigger volume when user wants collision feedback events but not position/velocity
    * to respond to the collision.
    */
  def collisionResponse: Boolean = js.native
  def collisionResponse_=(response: Boolean): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating that bone animations must be computed by the CPU (false by default)
    */
  def computeBonesUsingShaders: Boolean = js.native
  def computeBonesUsingShaders_=(value: Boolean): Unit = js.native
  
  /**
    * Creates new normals data for the mesh
    * @param updatable defines if the normal vertex buffer must be flagged as updatable
    * @returns the current mesh
    */
  def createNormals(updatable: Boolean): AbstractMesh = js.native
  
  /**
    * This function will create an octree to help to select the right submeshes for rendering, picking and collision computations.
    * Please note that you must have a decent number of submeshes to get performance improvements when using an octree
    * @param maxCapacity defines the maximum size of each block (64 by default)
    * @param maxDepth defines the maximum depth to use (no more than 2 levels by default)
    * @returns the new octree
    * @see https://www.babylonjs-playground.com/#NA4OQ#12
    * @see https://doc.babylonjs.com/how_to/optimizing_your_scene_with_octrees
    */
  def createOrUpdateSubmeshesOctree(): Octree[SubMesh] = js.native
  def createOrUpdateSubmeshesOctree(maxCapacity: js.UndefOr[scala.Nothing], maxDepth: Double): Octree[SubMesh] = js.native
  def createOrUpdateSubmeshesOctree(maxCapacity: Double): Octree[SubMesh] = js.native
  def createOrUpdateSubmeshesOctree(maxCapacity: Double, maxDepth: Double): Octree[SubMesh] = js.native
  
  /**
    * The culling strategy to use to check whether the mesh must be rendered or not.
    * This value can be changed at any time and will be used on the next render mesh selection.
    * The possible values are :
    * - AbstractMesh.CULLINGSTRATEGY_STANDARD
    * - AbstractMesh.CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY
    * - AbstractMesh.CULLINGSTRATEGY_OPTIMISTIC_INCLUSION
    * - AbstractMesh.CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY
    * Please read each static variable documentation to get details about the culling process.
    * */
  var cullingStrategy: Double = js.native
  
  /**
    * Gets or sets the orientation for POV movement & rotation
    */
  var definedFacingForward: Boolean = js.native
  
  /**
    * Disables the mesh edge rendering mode
    * @returns the currentAbstractMesh
    */
  def disableEdgesRendering(): AbstractMesh = js.native
  
  /**
    * Disables the feature FacetData and frees the related memory
    * @returns the current mesh
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def disableFacetData(): AbstractMesh = js.native
  
  /**
    * Releases resources associated with this node.
    * @param doNotRecurse Set to true to not recurse into each children (recurse into each children by default)
    * @param disposeMaterialAndTextures Set to true to also dispose referenced materials and textures (false by default)
    */
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  
  /**
    * Gets or sets a boolean indicating that the bounding info does not need to be kept in sync (for performance reason)
    */
  var doNotSyncBoundingInfo: Boolean = js.native
  
  /**
    * Defines edge color used when edgesRenderer is enabled
    * @see https://www.babylonjs-playground.com/#10OJSG#13
    */
  var edgesColor: Color4 = js.native
  
  /**
    * Gets the edgesRenderer associated with the mesh
    */
  var edgesRenderer: Nullable[EdgesRenderer] = js.native
  
  /**
    * Defines edge width used when edgesRenderer is enabled
    * @see https://www.babylonjs-playground.com/#10OJSG#13
    */
  var edgesWidth: Double = js.native
  
  /**
    * Gets or sets the ellipsoid used to impersonate this mesh when using collision engine (default is (0.5, 1, 0.5))
    * @see https://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
    */
  var ellipsoid: Vector3 = js.native
  
  /**
    * Gets or sets the ellipsoid offset used to impersonate this mesh when using collision engine (default is (0, 0, 0))
    * @see https://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
    */
  var ellipsoidOffset: Vector3 = js.native
  
  /**
    * Enables the edge rendering mode on the mesh.
    * This mode makes the mesh edges visible
    * @param epsilon defines the maximal distance between two angles to detect a face
    * @param checkVerticesInsteadOfIndices indicates that we should check vertex list directly instead of faces
    * @param options options to the edge renderer
    * @returns the currentAbstractMesh
    * @see https://www.babylonjs-playground.com/#19O9TU#0
    */
  def enableEdgesRendering(): AbstractMesh = js.native
  def enableEdgesRendering(
    epsilon: js.UndefOr[scala.Nothing],
    checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
    options: IEdgesRendererOptions
  ): AbstractMesh = js.native
  def enableEdgesRendering(epsilon: js.UndefOr[scala.Nothing], checkVerticesInsteadOfIndices: Boolean): AbstractMesh = js.native
  def enableEdgesRendering(
    epsilon: js.UndefOr[scala.Nothing],
    checkVerticesInsteadOfIndices: Boolean,
    options: IEdgesRendererOptions
  ): AbstractMesh = js.native
  def enableEdgesRendering(epsilon: Double): AbstractMesh = js.native
  def enableEdgesRendering(
    epsilon: Double,
    checkVerticesInsteadOfIndices: js.UndefOr[scala.Nothing],
    options: IEdgesRendererOptions
  ): AbstractMesh = js.native
  def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Boolean): AbstractMesh = js.native
  def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Boolean, options: IEdgesRendererOptions): AbstractMesh = js.native
  
  /**
    * Gets or sets a boolean indicating that pointer move events must be supported on this mesh (false by default)
    */
  var enablePointerMoveEvents: Boolean = js.native
  
  /**
    * The location (Vector3) where the facet depth sort must be computed from.
    * By default, the active camera position.
    * Used only when facet depth sort is enabled
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata#facet-depth-sort
    */
  def facetDepthSortFrom: Vector3 = js.native
  def facetDepthSortFrom_=(location: Vector3): Unit = js.native
  
  /**
    * Gets the number of facets in the mesh
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata#what-is-a-mesh-facet
    */
  def facetNb: Double = js.native
  
  /**
    * Returns the mesh BoundingInfo object or creates a new one and returns if it was undefined.
    * Note that it returns a shallow bounding of the mesh (i.e. it does not include children).
    * To get the full bounding of all children, call `getHierarchyBoundingVectors` instead.
    * @returns a BoundingInfo
    */
  def getBoundingInfo(): BoundingInfo = js.native
  
  /**
    * Returns the closest mesh facet index at (x,y,z) World coordinates, null if not found
    * @param projected sets as the (x,y,z) world projection on the facet
    * @param checkFace if true (default false), only the facet "facing" to (x,y,z) or only the ones "turning their backs", according to the parameter "facing" are returned
    * @param facing if facing and checkFace are true, only the facet "facing" to (x, y, z) are returned : positive dot (x, y, z) * facet position. If facing si false and checkFace is true, only the facet "turning their backs" to (x, y, z) are returned : negative dot (x, y, z) * facet position
    * @param x defines x coordinate
    * @param y defines y coordinate
    * @param z defines z coordinate
    * @returns the face index if found (or null instead)
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double): Nullable[Double] = js.native
  def getClosestFacetAtCoordinates(
    x: Double,
    y: Double,
    z: Double,
    projected: js.UndefOr[scala.Nothing],
    checkFace: js.UndefOr[scala.Nothing],
    facing: Boolean
  ): Nullable[Double] = js.native
  def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double, projected: js.UndefOr[scala.Nothing], checkFace: Boolean): Nullable[Double] = js.native
  def getClosestFacetAtCoordinates(
    x: Double,
    y: Double,
    z: Double,
    projected: js.UndefOr[scala.Nothing],
    checkFace: Boolean,
    facing: Boolean
  ): Nullable[Double] = js.native
  def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double, projected: Vector3): Nullable[Double] = js.native
  def getClosestFacetAtCoordinates(
    x: Double,
    y: Double,
    z: Double,
    projected: Vector3,
    checkFace: js.UndefOr[scala.Nothing],
    facing: Boolean
  ): Nullable[Double] = js.native
  def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double, projected: Vector3, checkFace: Boolean): Nullable[Double] = js.native
  def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double, projected: Vector3, checkFace: Boolean, facing: Boolean): Nullable[Double] = js.native
  
  /**
    * Returns the closest mesh facet index at (x,y,z) local coordinates, null if not found
    * @param projected sets as the (x,y,z) local projection on the facet
    * @param checkFace if true (default false), only the facet "facing" to (x,y,z) or only the ones "turning their backs", according to the parameter "facing" are returned
    * @param facing if facing and checkFace are true, only the facet "facing" to (x, y, z) are returned : positive dot (x, y, z) * facet position. If facing si false and checkFace is true, only the facet "turning their backs" to (x, y, z) are returned : negative dot (x, y, z) * facet position
    * @param x defines x coordinate
    * @param y defines y coordinate
    * @param z defines z coordinate
    * @returns the face index if found (or null instead)
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double): Nullable[Double] = js.native
  def getClosestFacetAtLocalCoordinates(
    x: Double,
    y: Double,
    z: Double,
    projected: js.UndefOr[scala.Nothing],
    checkFace: js.UndefOr[scala.Nothing],
    facing: Boolean
  ): Nullable[Double] = js.native
  def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double, projected: js.UndefOr[scala.Nothing], checkFace: Boolean): Nullable[Double] = js.native
  def getClosestFacetAtLocalCoordinates(
    x: Double,
    y: Double,
    z: Double,
    projected: js.UndefOr[scala.Nothing],
    checkFace: Boolean,
    facing: Boolean
  ): Nullable[Double] = js.native
  def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double, projected: Vector3): Nullable[Double] = js.native
  def getClosestFacetAtLocalCoordinates(
    x: Double,
    y: Double,
    z: Double,
    projected: Vector3,
    checkFace: js.UndefOr[scala.Nothing],
    facing: Boolean
  ): Nullable[Double] = js.native
  def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double, projected: Vector3, checkFace: Boolean): Nullable[Double] = js.native
  def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double, projected: Vector3, checkFace: Boolean, facing: Boolean): Nullable[Double] = js.native
  
  /**
    * This function returns all of the particle systems in the scene that use the mesh as an emitter.
    * @returns an array of particle systems in the scene that use the mesh as an emitter
    */
  def getConnectedParticleSystems(): js.Array[IParticleSystem] = js.native
  
  /**
    * Returns the object "parameter" set with all the expected parameters for facetData computation by ComputeNormals()
    * @returns the parameters
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetDataParameters(): js.Any = js.native
  
  /**
    * Returns the facetLocalNormals array.
    * The normals are expressed in the mesh local spac
    * @returns an array of Vector3
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetLocalNormals(): js.Array[Vector3] = js.native
  
  /**
    * Returns the facetLocalPartioning array
    * @returns an array of array of numbers
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetLocalPartitioning(): js.Array[js.Array[Double]] = js.native
  
  /**
    * Returns the facetLocalPositions array.
    * The facet positions are expressed in the mesh local space
    * @returns an array of Vector3
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetLocalPositions(): js.Array[Vector3] = js.native
  
  /**
    * Returns the i-th facet normal in the world system.
    * This method allocates a new Vector3 per call
    * @param i defines the facet index
    * @returns a new Vector3
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetNormal(i: Double): Vector3 = js.native
  
  /**
    * Sets the reference Vector3 with the i-th facet normal in the world system
    * @param i defines the facet index
    * @param ref defines the target vector
    * @returns the current mesh
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetNormalToRef(i: Double, ref: Vector3): this.type = js.native
  
  /**
    * Returns the i-th facet position in the world system.
    * This method allocates a new Vector3 per call
    * @param i defines the facet index
    * @returns a new Vector3
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetPosition(i: Double): Vector3 = js.native
  
  /**
    * Sets the reference Vector3 with the i-th facet position in the world system
    * @param i defines the facet index
    * @param ref defines the target vector
    * @returns the current mesh
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetPositionToRef(i: Double, ref: Vector3): AbstractMesh = js.native
  
  /**
    * Returns the facets (in an array) in the same partitioning block than the one the passed coordinates are located (expressed in the mesh local system)
    * @param x defines x coordinate
    * @param y defines y coordinate
    * @param z defines z coordinate
    * @returns the array of facet indexes
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def getFacetsAtLocalCoordinates(x: Double, y: Double, z: Double): Nullable[js.Array[Double]] = js.native
  
  /**
    * Returns the mesh itself by default. Implemented by child classes
    * @param camera defines the camera to use to pick the right LOD level
    * @returns the currentAbstractMesh
    */
  def getLOD(camera: Camera): Nullable[AbstractMesh] = js.native
  
  /**
    * Gets the current physics impostor
    * @see https://doc.babylonjs.com/features/physics_engine
    * @returns a physics impostor or null
    */
  def getPhysicsImpostor(): Nullable[PhysicsImpostor] = js.native
  
  /**
    * Returns a positive integer : the total number of indices in this mesh geometry.
    * @returns the numner of indices or zero if the mesh has no geometry.
    */
  def getTotalIndices(): Double = js.native
  
  /**
    * Returns 0 by default. Implemented by child classes
    * @returns an integer
    */
  def getTotalVertices(): Double = js.native
  
  /**
    * Gets a boolean indicating if this mesh has instances
    */
  def hasInstances: Boolean = js.native
  
  /**
    * Gets a boolean indicating if this mesh has thin instances
    */
  def hasThinInstances: Boolean = js.native
  
  /** Gets or sets a boolean indicating that this mesh contains vertex color data with alpha values */
  def hasVertexAlpha: Boolean = js.native
  def hasVertexAlpha_=(value: Boolean): Unit = js.native
  
  /**
    * Object used to store instanced buffers defined by user
    * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
    */
  var instancedBuffers: StringDictionary[js.Any] = js.native
  
  /**
    * Checks if the passed Ray intersects with the mesh
    * @param ray defines the ray to use
    * @param fastCheck defines if fast mode (but less precise) must be used (false by default)
    * @param trianglePredicate defines an optional predicate used to select faces when a mesh intersection is detected
    * @param onlyBoundingInfo defines a boolean indicating if picking should only happen using bounding info (false by default)
    * @param worldToUse defines the world matrix to use to get the world coordinate of the intersection point
    * @param skipBoundingInfo a boolean indicating if we should skip the bounding info check
    * @returns the picking info
    * @see https://doc.babylonjs.com/babylon101/intersect_collisions_-_mesh
    */
  def intersects(ray: Ray): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: js.UndefOr[scala.Nothing],
    trianglePredicate: js.UndefOr[scala.Nothing],
    onlyBoundingInfo: js.UndefOr[scala.Nothing],
    worldToUse: js.UndefOr[scala.Nothing],
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: js.UndefOr[scala.Nothing],
    trianglePredicate: js.UndefOr[scala.Nothing],
    onlyBoundingInfo: js.UndefOr[scala.Nothing],
    worldToUse: Matrix
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: js.UndefOr[scala.Nothing],
    trianglePredicate: js.UndefOr[scala.Nothing],
    onlyBoundingInfo: js.UndefOr[scala.Nothing],
    worldToUse: Matrix,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: js.UndefOr[scala.Nothing],
    trianglePredicate: js.UndefOr[scala.Nothing],
    onlyBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: js.UndefOr[scala.Nothing],
    trianglePredicate: js.UndefOr[scala.Nothing],
    onlyBoundingInfo: Boolean,
    worldToUse: js.UndefOr[scala.Nothing],
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: js.UndefOr[scala.Nothing],
    trianglePredicate: js.UndefOr[scala.Nothing],
    onlyBoundingInfo: Boolean,
    worldToUse: Matrix
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: js.UndefOr[scala.Nothing],
    trianglePredicate: js.UndefOr[scala.Nothing],
    onlyBoundingInfo: Boolean,
    worldToUse: Matrix,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(ray: Ray, fastCheck: js.UndefOr[scala.Nothing], trianglePredicate: TrianglePickingPredicate): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: js.UndefOr[scala.Nothing],
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: js.UndefOr[scala.Nothing],
    worldToUse: js.UndefOr[scala.Nothing],
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: js.UndefOr[scala.Nothing],
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: js.UndefOr[scala.Nothing],
    worldToUse: Matrix
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: js.UndefOr[scala.Nothing],
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: js.UndefOr[scala.Nothing],
    worldToUse: Matrix,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: js.UndefOr[scala.Nothing],
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: js.UndefOr[scala.Nothing],
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Boolean,
    worldToUse: js.UndefOr[scala.Nothing],
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: js.UndefOr[scala.Nothing],
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Boolean,
    worldToUse: Matrix
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: js.UndefOr[scala.Nothing],
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Boolean,
    worldToUse: Matrix,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(ray: Ray, fastCheck: Boolean): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: js.UndefOr[scala.Nothing],
    onlyBoundingInfo: js.UndefOr[scala.Nothing],
    worldToUse: js.UndefOr[scala.Nothing],
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: js.UndefOr[scala.Nothing],
    onlyBoundingInfo: js.UndefOr[scala.Nothing],
    worldToUse: Matrix
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: js.UndefOr[scala.Nothing],
    onlyBoundingInfo: js.UndefOr[scala.Nothing],
    worldToUse: Matrix,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: js.UndefOr[scala.Nothing],
    onlyBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: js.UndefOr[scala.Nothing],
    onlyBoundingInfo: Boolean,
    worldToUse: js.UndefOr[scala.Nothing],
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: js.UndefOr[scala.Nothing],
    onlyBoundingInfo: Boolean,
    worldToUse: Matrix
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: js.UndefOr[scala.Nothing],
    onlyBoundingInfo: Boolean,
    worldToUse: Matrix,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(ray: Ray, fastCheck: Boolean, trianglePredicate: TrianglePickingPredicate): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: js.UndefOr[scala.Nothing],
    worldToUse: js.UndefOr[scala.Nothing],
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: js.UndefOr[scala.Nothing],
    worldToUse: Matrix
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: js.UndefOr[scala.Nothing],
    worldToUse: Matrix,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Boolean,
    worldToUse: js.UndefOr[scala.Nothing],
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Boolean,
    worldToUse: Matrix
  ): PickingInfo = js.native
  def intersects(
    ray: Ray,
    fastCheck: Boolean,
    trianglePredicate: TrianglePickingPredicate,
    onlyBoundingInfo: Boolean,
    worldToUse: Matrix,
    skipBoundingInfo: Boolean
  ): PickingInfo = js.native
  
  /**
    * True if the mesh intersects another mesh or a SolidParticle object
    * @param mesh defines a target mesh or SolidParticle to test
    * @param precise Unless the parameter `precise` is set to `true` the intersection is computed according to Axis Aligned Bounding Boxes (AABB), else according to OBB (Oriented BBoxes)
    * @param includeDescendants Can be set to true to test if the mesh defined in parameters intersects with the current mesh or any child meshes
    * @returns true if there is an intersection
    */
  def intersectsMesh(mesh: AbstractMesh): Boolean = js.native
  def intersectsMesh(mesh: AbstractMesh, precise: js.UndefOr[scala.Nothing], includeDescendants: Boolean): Boolean = js.native
  def intersectsMesh(mesh: AbstractMesh, precise: Boolean): Boolean = js.native
  def intersectsMesh(mesh: AbstractMesh, precise: Boolean, includeDescendants: Boolean): Boolean = js.native
  def intersectsMesh(mesh: SolidParticle): Boolean = js.native
  def intersectsMesh(mesh: SolidParticle, precise: js.UndefOr[scala.Nothing], includeDescendants: Boolean): Boolean = js.native
  def intersectsMesh(mesh: SolidParticle, precise: Boolean): Boolean = js.native
  def intersectsMesh(mesh: SolidParticle, precise: Boolean, includeDescendants: Boolean): Boolean = js.native
  
  /**
    * Returns true if the passed point (Vector3) is inside the mesh bounding box
    * @param point defines the point to test
    * @returns true if there is an intersection
    */
  def intersectsPoint(point: Vector3): Boolean = js.native
  
  /**
    * Gets a boolean indicating if this mesh is an instance or a regular mesh
    */
  def isAnInstance: Boolean = js.native
  
  /**
    * Returns true if the mesh is blocked. Implemented by child classes
    */
  def isBlocked: Boolean = js.native
  
  /** Gets or sets a boolean indicating if the mesh must be considered as a ray blocker for lens flares (false by default)
    * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
    */
  var isBlocker: Boolean = js.native
  
  /**
    * gets a boolean indicating if facetData is enabled
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata#what-is-a-mesh-facet
    */
  def isFacetDataEnabled: Boolean = js.native
  
  /**
    * Gets or sets whether the mesh is occluded or not, it is used also to set the intial state of the mesh to be occluded or not
    * @see https://doc.babylonjs.com/features/occlusionquery
    */
  var isOccluded: Boolean = js.native
  
  /**
    * Flag to check the progress status of the query
    * @see https://doc.babylonjs.com/features/occlusionquery
    */
  var isOcclusionQueryInProgress: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating if the mesh can be picked (by scene.pick for instance or through actions). Default is true
    */
  var isPickable: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating if the mesh is visible (renderable). Default is true
    */
  var isVisible: Boolean = js.native
  
  /**
    * Gets or sets the current layer mask (default is 0x0FFFFFFF)
    * @see https://doc.babylonjs.com/how_to/layermasks_and_multi-cam_textures
    */
  def layerMask: Double = js.native
  def layerMask_=(value: Double): Unit = js.native
  
  /** Gets the list of lights affecting that mesh */
  def lightSources: js.Array[Light] = js.native
  
  /** Gets or sets current material */
  def material: Nullable[Material] = js.native
  def material_=(value: Nullable[Material]): Unit = js.native
  
  /**
    * Perform relative position change from the point of view of behind the front of the mesh.
    * This is performed taking into account the meshes current rotation, so you do not have to care.
    * Supports definition of mesh facing forward or backward
    * @param amountRight defines the distance on the right axis
    * @param amountUp defines the distance on the up axis
    * @param amountForward defines the distance on the forward axis
    * @returns the current mesh
    */
  def movePOV(amountRight: Double, amountUp: Double, amountForward: Double): AbstractMesh = js.native
  
  /**
    * Move the mesh using collision engine
    * @see https://doc.babylonjs.com/babylon101/cameras,_mesh_collisions_and_gravity
    * @param displacement defines the requested displacement vector
    * @returns the current mesh
    */
  def moveWithCollisions(displacement: Vector3): AbstractMesh = js.native
  
  /**
    * Gets or sets a boolean indicating that the facets must be depth sorted on next call to `updateFacetData()`.
    * Works only for updatable meshes.
    * Doesn't work with multi-materials
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata#facet-depth-sort
    */
  def mustDepthSortFacets: Boolean = js.native
  def mustDepthSortFacets_=(sort: Boolean): Unit = js.native
  
  /** Gets or sets the number of allowed bone influences per vertex (4 by default) */
  def numBoneInfluencers: Double = js.native
  def numBoneInfluencers_=(value: Double): Unit = js.native
  
  /**
    * This property determines the type of occlusion query algorithm to run in WebGl, you can use:
    * * AbstractMesh.OCCLUSION_ALGORITHM_TYPE_ACCURATE which is mapped to GL_ANY_SAMPLES_PASSED.
    * * AbstractMesh.OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE (Default Value) which is mapped to GL_ANY_SAMPLES_PASSED_CONSERVATIVE which is a false positive algorithm that is faster than GL_ANY_SAMPLES_PASSED but less accurate.
    * @see https://doc.babylonjs.com/features/occlusionquery
    */
  var occlusionQueryAlgorithmType: Double = js.native
  
  /**
    * This number indicates the number of allowed retries before stop the occlusion query, this is useful if the occlusion query is taking long time before to the query result is retireved, the query result indicates if the object is visible within the scene or not and based on that Babylon.Js engine decideds to show or hide the object.
    * The default value is -1 which means don't break the query and wait till the result
    * @see https://doc.babylonjs.com/features/occlusionquery
    */
  var occlusionRetryCount: Double = js.native
  
  /**
    * This property is responsible for starting the occlusion query within the Mesh or not, this property is also used to determine what should happen when the occlusionRetryCount is reached. It has supports 3 values:
    * * OCCLUSION_TYPE_NONE (Default Value): this option means no occlusion query whith the Mesh.
    * * OCCLUSION_TYPE_OPTIMISTIC: this option is means use occlusion query and if occlusionRetryCount is reached and the query is broken show the mesh.
    * * OCCLUSION_TYPE_STRICT: this option is means use occlusion query and if occlusionRetryCount is reached and the query is broken restore the last state of the mesh occlusion if the mesh was visible then show the mesh if was hidden then hide don't show.
    * @see https://doc.babylonjs.com/features/occlusionquery
    */
  var occlusionType: Double = js.native
  
  /**
    * An event triggered when this mesh collides with another one
    */
  var onCollideObservable: Observable[AbstractMesh] = js.native
  
  /** Set a function to call when this mesh collides with another one */
  def onCollide_=(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * An event triggered when the collision's position changes
    */
  var onCollisionPositionChangeObservable: Observable[Vector3] = js.native
  
  /** Set a function to call when the collision's position changes */
  def onCollisionPositionChange_=(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * An event triggered when material is changed
    */
  var onMaterialChangedObservable: Observable[AbstractMesh] = js.native
  
  /**
    * An event triggered when the mesh is rebuilt.
    */
  var onRebuildObservable: Observable[AbstractMesh] = js.native
  
  /** Defines color to use when rendering outline */
  var outlineColor: Color3 = js.native
  
  /** Define width to use when rendering outline */
  var outlineWidth: Double = js.native
  
  /** Defines alpha to use when rendering overlay */
  var overlayAlpha: Double = js.native
  
  /** Defines color to use when rendering overlay */
  var overlayColor: Color3 = js.native
  
  /**
    * The ratio (float) to apply to the bouding box size to set to the partioning space.
    * Ex : 1.01 (default) the partioning space is 1% bigger than the bounding box
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata#tweaking-the-partitioning
    */
  def partitioningBBoxRatio: Double = js.native
  def partitioningBBoxRatio_=(ratio: Double): Unit = js.native
  
  /**
    * Gets or set the number (integer) of subdivisions per axis in the partioning space
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata#tweaking-the-partitioning
    */
  def partitioningSubdivisions: Double = js.native
  def partitioningSubdivisions_=(nb: Double): Unit = js.native
  
  /**
    * Gets or sets impostor used for physic simulation
    * @see https://doc.babylonjs.com/features/physics_engine
    */
  var physicsImpostor: Nullable[PhysicsImpostor] = js.native
  
  /**
    * Gets or sets a boolean indicating that this mesh can receive realtime shadows
    * @see https://doc.babylonjs.com/babylon101/shadows
    */
  def receiveShadows: Boolean = js.native
  def receiveShadows_=(value: Boolean): Unit = js.native
  
  /**
    * This method recomputes and sets a new BoundingInfo to the mesh unless it is locked.
    * This means the mesh underlying bounding box and sphere are recomputed.
    * @param applySkeleton defines whether to apply the skeleton before computing the bounding info
    * @returns the current mesh
    */
  def refreshBoundingInfo(): AbstractMesh = js.native
  def refreshBoundingInfo(applySkeleton: Boolean): AbstractMesh = js.native
  
  /**
    * Disposes all the submeshes of the current meshnp
    * @returns the current mesh
    */
  def releaseSubMeshes(): AbstractMesh = js.native
  
  /**
    * Removes the passed mesh from the current mesh children list
    * @param mesh defines the child mesh
    * @returns the current mesh
    */
  def removeChild(mesh: AbstractMesh): AbstractMesh = js.native
  
  /**
    * Gets or sets a boolean indicating if the outline must be rendered as well
    * @see https://www.babylonjs-playground.com/#10WJ5S#3
    */
  var renderOutline: Boolean = js.native
  
  /**
    * Gets or sets a boolean indicating if the overlay must be rendered as well
    * @see https://www.babylonjs-playground.com/#10WJ5S#2
    */
  var renderOverlay: Boolean = js.native
  
  /**
    * Specifies the rendering group id for this mesh (0 by default)
    * @see https://doc.babylonjs.com/resources/transparency_and_how_meshes_are_rendered#rendering-groups
    */
  def renderingGroupId: Double = js.native
  def renderingGroupId_=(value: Double): Unit = js.native
  
  /**
    * Perform relative rotation change from the point of view of behind the front of the mesh.
    * Supports definition of mesh facing forward or backward
    * @param flipBack defines the flip
    * @param twirlClockwise defines the twirl
    * @param tiltRight defines the tilt
    * @returns the current mesh
    */
  def rotatePOV(flipBack: Double, twirlClockwise: Double, tiltRight: Double): AbstractMesh = js.native
  
  /**
    * Overwrite the current bounding info
    * @param boundingInfo defines the new bounding info
    * @returns the current mesh
    */
  def setBoundingInfo(boundingInfo: BoundingInfo): AbstractMesh = js.native
  
  /**
    * Creates a physic joint between two meshes
    * @param otherMesh defines the other mesh to use
    * @param pivot1 defines the pivot to use on this mesh
    * @param pivot2 defines the pivot to use on the other mesh
    * @param options defines additional options (can be plugin dependent)
    * @returns the current mesh
    * @see https://www.babylonjs-playground.com/#0BS5U0#0
    */
  def setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3): typingsSlinky.babylonjs.physicsEngineComponentMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = js.native
  def setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3, options: js.Any): typingsSlinky.babylonjs.physicsEngineComponentMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = js.native
  
  /**
    * Sets the vertex data of the mesh geometry for the requested `kind`.
    * If the mesh has no geometry, a new Geometry object is set to the mesh and then passed this vertex data.
    * Note that a new underlying VertexBuffer object is created each call.
    * If the `kind` is the `PositionKind`, the mesh BoundingInfo is renewed, so the bounding box and sphere, and the mesh World Matrix is recomputed.
    * @param kind defines vertex data kind:
    * * VertexBuffer.PositionKind
    * * VertexBuffer.UVKind
    * * VertexBuffer.UV2Kind
    * * VertexBuffer.UV3Kind
    * * VertexBuffer.UV4Kind
    * * VertexBuffer.UV5Kind
    * * VertexBuffer.UV6Kind
    * * VertexBuffer.ColorKind
    * * VertexBuffer.MatricesIndicesKind
    * * VertexBuffer.MatricesIndicesExtraKind
    * * VertexBuffer.MatricesWeightsKind
    * * VertexBuffer.MatricesWeightsExtraKind
    * @param data defines the data source
    * @param updatable defines if the data must be flagged as updatable (or static)
    * @param stride defines the vertex stride (size of an entire vertex). Can be null and in this case will be deduced from vertex data kind
    * @returns the current mesh
    */
  def setVerticesData(kind: String, data: FloatArray): AbstractMesh = js.native
  def setVerticesData(kind: String, data: FloatArray, updatable: js.UndefOr[scala.Nothing], stride: Double): AbstractMesh = js.native
  def setVerticesData(kind: String, data: FloatArray, updatable: Boolean, stride: Double): AbstractMesh = js.native
  
  /**
    * Gets or sets a boolean indicating if the bounding box must be rendered as well (false by default)
    */
  var showBoundingBox: Boolean = js.native
  
  /** Gets or sets a boolean indicating that bounding boxes of subMeshes must be rendered as well (false by default) */
  var showSubMeshesBoundingBox: Boolean = js.native
  
  def skeleton: Nullable[Skeleton] = js.native
  /**
    * Gets or sets a skeleton to apply skining transformations
    * @see https://doc.babylonjs.com/how_to/how_to_use_bones_and_skeletons
    */
  def skeleton_=(value: Nullable[Skeleton]): Unit = js.native
  
  /**
    * Gets or sets the list of subMeshes
    * @see https://doc.babylonjs.com/how_to/multi_materials
    */
  var subMeshes: js.Array[SubMesh] = js.native
  
  /**
    * Gets or sets current surrounding meshes (null by default).
    *
    * By default collision detection is tested against every mesh in the scene.
    * It is possible to set surroundingMeshes to a defined list of meshes and then only these specified
    * meshes will be tested for the collision.
    *
    * Note: if set to an empty array no collision will happen when this mesh is moved.
    */
  def surroundingMeshes: Nullable[js.Array[AbstractMesh]] = js.native
  def surroundingMeshes_=(meshes: Nullable[js.Array[AbstractMesh]]): Unit = js.native
  
  def toString(fullDetails: Boolean): String = js.native
  
  /**
    * Updates the mesh facetData arrays and the internal partitioning when the mesh is morphed or updated.
    * This method can be called within the render loop.
    * You don't need to call this method by yourself in the render loop when you update/morph a mesh with the methods CreateXXX() as they automatically manage this computation
    * @returns the current mesh
    * @see https://doc.babylonjs.com/how_to/how_to_use_facetdata
    */
  def updateFacetData(): AbstractMesh = js.native
  
  /**
    * Updates the AbstractMesh indices array
    * @param indices defines the data source
    * @param offset defines the offset in the index buffer where to store the new data (can be null)
    * @param gpuMemoryOnly defines a boolean indicating that only the GPU memory must be updated leaving the CPU version of the indices unchanged (false by default)
    * @returns the current mesh
    */
  def updateIndices(indices: IndicesArray): AbstractMesh = js.native
  def updateIndices(indices: IndicesArray, offset: js.UndefOr[scala.Nothing], gpuMemoryOnly: Boolean): AbstractMesh = js.native
  def updateIndices(indices: IndicesArray, offset: Double): AbstractMesh = js.native
  def updateIndices(indices: IndicesArray, offset: Double, gpuMemoryOnly: Boolean): AbstractMesh = js.native
  
  /** Gets a boolean indicating if this mesh has skinning data and an attached skeleton */
  def useBones: Boolean = js.native
  
  /** Gets or sets a boolean indicating that internal octree (if available) can be used to boost submeshes collision (true by default) */
  var useOctreeForCollisions: Boolean = js.native
  
  /** Gets or sets a boolean indicating that internal octree (if available) can be used to boost submeshes picking (true by default) */
  var useOctreeForPicking: Boolean = js.native
  
  /** Gets or sets a boolean indicating that internal octree (if available) can be used to boost submeshes selection (true by default) */
  var useOctreeForRenderingSelection: Boolean = js.native
  
  /** Gets or sets a boolean indicating that this mesh needs to use vertex color data to render (if this kind of vertex data is available in the geometry) */
  def useVertexColors: Boolean = js.native
  def useVertexColors_=(value: Boolean): Unit = js.native
  
  /**
    * Gets or sets mesh visibility between 0 and 1 (default is 1)
    */
  def visibility: Double = js.native
  /**
    * Gets or sets mesh visibility between 0 and 1 (default is 1)
    */
  def visibility_=(value: Double): Unit = js.native
}
/* static members */
@JSImport("babylonjs/Meshes/abstractMesh", "AbstractMesh")
@js.native
object AbstractMesh extends js.Object {
  
  /** Billboard on all axes */
  def BILLBOARDMODE_ALL: Double = js.native
  
  /**
    * No billboard
    */
  def BILLBOARDMODE_NONE: Double = js.native
  
  /** Billboard on using position instead of orientation */
  def BILLBOARDMODE_USE_POSITION: Double = js.native
  
  /** Billboard on X axis */
  def BILLBOARDMODE_X: Double = js.native
  
  /** Billboard on Y axis */
  def BILLBOARDMODE_Y: Double = js.native
  
  /** Billboard on Z axis */
  def BILLBOARDMODE_Z: Double = js.native
  
  /** Culling strategy : Bounding Sphere Only.
    *  This is an exclusion test. It's faster than the standard strategy because the bounding box is not tested.
    *  It's also less accurate than the standard because some not visible objects can still be selected.
    *  Test : is the bounding sphere outside the frustum ?
    *  If not, then the cullable object is in the frustum.
    */
  val CULLINGSTRATEGY_BOUNDINGSPHERE_ONLY: Double = js.native
  
  /** Culling strategy : Optimistic Inclusion.
    *  This in an inclusion test first, then the standard exclusion test.
    *  This can be faster when a cullable object is expected to be almost always in the camera frustum.
    *  This could also be a little slower than the standard test when the tested object center is not the frustum but one of its bounding box vertex is still inside.
    *  Anyway, it's as accurate as the standard strategy.
    *  Test :
    *  Is the cullable object bounding sphere center in the frustum ?
    *  If not, apply the default culling strategy.
    */
  val CULLINGSTRATEGY_OPTIMISTIC_INCLUSION: Double = js.native
  
  /** Culling strategy : Optimistic Inclusion then Bounding Sphere Only.
    *  This in an inclusion test first, then the bounding sphere only exclusion test.
    *  This can be the fastest test when a cullable object is expected to be almost always in the camera frustum.
    *  This could also be a little slower than the BoundingSphereOnly strategy when the tested object center is not in the frustum but its bounding sphere still intersects it.
    *  It's less accurate than the standard strategy and as accurate as the BoundingSphereOnly strategy.
    *  Test :
    *  Is the cullable object bounding sphere center in the frustum ?
    *  If not, apply the Bounding Sphere Only strategy. No Bounding Box is tested here.
    */
  val CULLINGSTRATEGY_OPTIMISTIC_INCLUSION_THEN_BSPHERE_ONLY: Double = js.native
  
  /** Default culling strategy : this is an exclusion test and it's the more accurate.
    *  Test order :
    *  Is the bounding sphere outside the frustum ?
    *  If not, are the bounding box vertices outside the frustum ?
    *  It not, then the cullable object is in the frustum.
    */
  val CULLINGSTRATEGY_STANDARD: Double = js.native
  
  /** Use an accurante occlusion algorithm */
  var OCCLUSION_ALGORITHM_TYPE_ACCURATE: Double = js.native
  
  /** Use a conservative occlusion algorithm */
  var OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE: Double = js.native
  
  /** No occlusion */
  var OCCLUSION_TYPE_NONE: Double = js.native
  
  /** Occlusion set to optimisitic */
  var OCCLUSION_TYPE_OPTIMISTIC: Double = js.native
  
  /** Occlusion set to strict */
  var OCCLUSION_TYPE_STRICT: Double = js.native
}
