package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.anon.Custom
import typingsSlinky.babylonjs.anon.Flat
import typingsSlinky.babylonjs.anon.H
import typingsSlinky.babylonjs.anon.Max
import typingsSlinky.babylonjs.capsuleBuilderMod.ICreateCapsuleOptions
import typingsSlinky.babylonjs.physicsImpostorMod.IPhysicsEnabledObject
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Mesh")
@js.native
class Mesh protected ()
  extends typingsSlinky.babylonjs.babylonjsIndexMod.Mesh {
  /**
    * @constructor
    * @param name The value used by scene.getMeshByName() to do a lookup.
    * @param scene The scene to add this mesh to.
    * @param parent The parent of this mesh, if it has one
    * @param source An optional Mesh from which geometry is shared, cloned.
    * @param doNotCloneChildren When cloning, skip cloning child meshes of source, default False.
    *                  When false, achieved by calling a clone(), also passing False.
    *                  This will make creation of children, recursive.
    * @param clonePhysicsImpostor When cloning, include cloning mesh physics impostor, default True.
    */
  def this(name: String) = this()
  def this(name: String, scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]) = this()
  def this(
    name: String,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    parent: Nullable[typingsSlinky.babylonjs.nodeMod.Node]
  ) = this()
  def this(
    name: String,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    parent: js.UndefOr[Nullable[typingsSlinky.babylonjs.nodeMod.Node]],
    source: Nullable[typingsSlinky.babylonjs.meshMod.Mesh]
  ) = this()
  def this(
    name: String,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    parent: js.UndefOr[Nullable[typingsSlinky.babylonjs.nodeMod.Node]],
    source: js.UndefOr[Nullable[typingsSlinky.babylonjs.meshMod.Mesh]],
    doNotCloneChildren: Boolean
  ) = this()
  def this(
    name: String,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    parent: js.UndefOr[Nullable[typingsSlinky.babylonjs.nodeMod.Node]],
    source: js.UndefOr[Nullable[typingsSlinky.babylonjs.meshMod.Mesh]],
    doNotCloneChildren: js.UndefOr[scala.Nothing],
    clonePhysicsImpostor: Boolean
  ) = this()
  def this(
    name: String,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    parent: js.UndefOr[Nullable[typingsSlinky.babylonjs.nodeMod.Node]],
    source: js.UndefOr[Nullable[typingsSlinky.babylonjs.meshMod.Mesh]],
    doNotCloneChildren: Boolean,
    clonePhysicsImpostor: Boolean
  ) = this()
}
/* static members */
object Mesh {
  
  /**
    * Mesh side orientation : usually the internal or back surface
    */
  @JSImport("babylonjs/index", "Mesh.BACKSIDE")
  @js.native
  val BACKSIDE: Double = js.native
  
  /**
    * Mesh tile positioning : part tiles on bottom
    */
  @JSImport("babylonjs/index", "Mesh.BOTTOM")
  @js.native
  val BOTTOM: Double = js.native
  
  /**
    * Mesh cap setting : two caps, one at the beginning  and one at the end of the mesh
    */
  @JSImport("babylonjs/index", "Mesh.CAP_ALL")
  @js.native
  val CAP_ALL: Double = js.native
  
  /**
    * Mesh cap setting : one cap at the end of the mesh
    */
  @JSImport("babylonjs/index", "Mesh.CAP_END")
  @js.native
  val CAP_END: Double = js.native
  
  /**
    * Mesh cap setting : one cap at the beginning of the mesh
    */
  @JSImport("babylonjs/index", "Mesh.CAP_START")
  @js.native
  val CAP_START: Double = js.native
  
  /**
    * Mesh tile positioning : part tiles same on left/right or top/bottom
    */
  @JSImport("babylonjs/index", "Mesh.CENTER")
  @js.native
  val CENTER: Double = js.native
  
  @JSImport("babylonjs/index", "Mesh.Center")
  @js.native
  def Center(meshesOrMinMaxVector: js.Array[typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh]): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  /**
    * Returns the center of the `{min:` Vector3`, max:` Vector3`}` or the center of MinMax vector3 computed from a mesh array
    * @param meshesOrMinMaxVector could be an array of meshes or a `{min:` Vector3`, max:` Vector3`}` object
    * @returns a vector3
    */
  @JSImport("babylonjs/index", "Mesh.Center")
  @js.native
  def Center(meshesOrMinMaxVector: Max): typingsSlinky.babylonjs.mathVectorMod.Vector3 = js.native
  
  /**
    * Creates a box mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param size sets the size (float) of each box side (default 1)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.CreateBox")
  @js.native
  def CreateBox(name: String, size: Double): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateBox")
  @js.native
  def CreateBox(
    name: String,
    size: Double,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateBox")
  @js.native
  def CreateBox(
    name: String,
    size: Double,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateBox")
  @js.native
  def CreateBox(
    name: String,
    size: Double,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    updatable: Boolean,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateBox")
  @js.native
  def CreateBox(name: String, size: Double, scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /** Creates a Capsule Mesh
    * @param name defines the name of the mesh.
    * @param options the constructors options used to shape the mesh.
    * @param scene defines the scene the mesh is scoped to.
    * @returns the capsule mesh
    * @see https://doc.babylonjs.com/how_to/capsule_shape
    */
  @JSImport("babylonjs/index", "Mesh.CreateCapsule")
  @js.native
  def CreateCapsule(name: String, options: ICreateCapsuleOptions, scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Creates a cylinder or a cone mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param height sets the height size (float) of the cylinder/cone (float, default 2)
    * @param diameterTop set the top cap diameter (floats, default 1)
    * @param diameterBottom set the bottom cap diameter (floats, default 1). This value can't be zero
    * @param tessellation sets the number of cylinder sides (positive integer, default 24). Set it to 3 to get a prism for instance
    * @param subdivisions sets the number of rings along the cylinder height (positive integer, default 1)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.CreateCylinder")
  @js.native
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateCylinder")
  @js.native
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any,
    scene: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateCylinder")
  @js.native
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any,
    scene: js.UndefOr[scala.Nothing],
    updatable: js.Any
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateCylinder")
  @js.native
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any,
    scene: js.UndefOr[scala.Nothing],
    updatable: js.Any,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateCylinder")
  @js.native
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateCylinder")
  @js.native
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateCylinder")
  @js.native
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.Any
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateCylinder")
  @js.native
  def CreateCylinder(
    name: String,
    height: Double,
    diameterTop: Double,
    diameterBottom: Double,
    tessellation: Double,
    subdivisions: js.Any,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.Any,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Creates a dashed line mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param points is an array successive Vector3
    * @param dashSize is the size of the dashes relatively the dash number (positive float, default 3)
    * @param gapSize is the size of the gap between two successive dashes relatively the dash number (positive float, default 1)
    * @param dashNb is the intended total number of dashes (positive integer, default 200)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param instance is an instance of an existing LineMesh object to be updated with the passed `points` parameter (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#lines-and-dashedlines)
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.CreateDashedLines")
  @js.native
  def CreateDashedLines(
    name: String,
    points: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    dashSize: Double,
    gapSize: Double,
    dashNb: Double
  ): typingsSlinky.babylonjs.linesMeshMod.LinesMesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateDashedLines")
  @js.native
  def CreateDashedLines(
    name: String,
    points: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    dashSize: Double,
    gapSize: Double,
    dashNb: Double,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    updatable: js.UndefOr[scala.Nothing],
    instance: typingsSlinky.babylonjs.linesMeshMod.LinesMesh
  ): typingsSlinky.babylonjs.linesMeshMod.LinesMesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateDashedLines")
  @js.native
  def CreateDashedLines(
    name: String,
    points: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    dashSize: Double,
    gapSize: Double,
    dashNb: Double,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    updatable: Boolean
  ): typingsSlinky.babylonjs.linesMeshMod.LinesMesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateDashedLines")
  @js.native
  def CreateDashedLines(
    name: String,
    points: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    dashSize: Double,
    gapSize: Double,
    dashNb: Double,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    updatable: Boolean,
    instance: typingsSlinky.babylonjs.linesMeshMod.LinesMesh
  ): typingsSlinky.babylonjs.linesMeshMod.LinesMesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateDashedLines")
  @js.native
  def CreateDashedLines(
    name: String,
    points: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    dashSize: Double,
    gapSize: Double,
    dashNb: Double,
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]
  ): typingsSlinky.babylonjs.linesMeshMod.LinesMesh = js.native
  
  /**
    * Creates a decal mesh.
    * Please consider using the same method from the MeshBuilder class instead.
    * A decal is a mesh usually applied as a model onto the surface of another mesh
    * @param name  defines the name of the mesh
    * @param sourceMesh defines the mesh receiving the decal
    * @param position sets the position of the decal in world coordinates
    * @param normal sets the normal of the mesh where the decal is applied onto in world coordinates
    * @param size sets the decal scaling
    * @param angle sets the angle to rotate the decal
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.CreateDecal")
  @js.native
  def CreateDecal(
    name: String,
    sourceMesh: typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh,
    position: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    normal: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    size: typingsSlinky.babylonjs.mathVectorMod.Vector3,
    angle: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Creates a plane polygonal mesh.  By default, this is a disc. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param radius sets the radius size (float) of the polygon (default 0.5)
    * @param tessellation sets the number of polygon sides (positive integer, default 64). So a tessellation valued to 3 will build a triangle, to 4 a square, etc
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.CreateDisc")
  @js.native
  def CreateDisc(name: String, radius: Double, tessellation: Double): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateDisc")
  @js.native
  def CreateDisc(
    name: String,
    radius: Double,
    tessellation: Double,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateDisc")
  @js.native
  def CreateDisc(
    name: String,
    radius: Double,
    tessellation: Double,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateDisc")
  @js.native
  def CreateDisc(
    name: String,
    radius: Double,
    tessellation: Double,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    updatable: Boolean,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateDisc")
  @js.native
  def CreateDisc(
    name: String,
    radius: Double,
    tessellation: Double,
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Creates a ground mesh.
    * Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param width set the width of the ground
    * @param height set the height of the ground
    * @param subdivisions sets the number of subdivisions per side
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.CreateGround")
  @js.native
  def CreateGround(name: String, width: Double, height: Double, subdivisions: Double): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateGround")
  @js.native
  def CreateGround(
    name: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateGround")
  @js.native
  def CreateGround(
    name: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateGround")
  @js.native
  def CreateGround(
    name: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Creates a ground mesh from a height map.
    * Please consider using the same method from the MeshBuilder class instead
    * @see https://doc.babylonjs.com/babylon101/height_map
    * @param name defines the name of the mesh to create
    * @param url sets the URL of the height map image resource
    * @param width set the ground width size
    * @param height set the ground height size
    * @param subdivisions sets the number of subdivision per side
    * @param minHeight is the minimum altitude on the ground
    * @param maxHeight is the maximum altitude on the ground
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param onReady  is a callback function that will be called  once the mesh is built (the height map download can last some time)
    * @param alphaFilter will filter any data where the alpha channel is below this value, defaults 0 (all data visible)
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.CreateGroundFromHeightMap")
  @js.native
  def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ): typingsSlinky.babylonjs.groundMeshMod.GroundMesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateGroundFromHeightMap")
  @js.native
  def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.UndefOr[scala.Nothing],
    onReady: js.UndefOr[scala.Nothing],
    alphaFilter: Double
  ): typingsSlinky.babylonjs.groundMeshMod.GroundMesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateGroundFromHeightMap")
  @js.native
  def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.UndefOr[scala.Nothing],
    onReady: js.Function1[/* mesh */ typingsSlinky.babylonjs.groundMeshMod.GroundMesh, Unit]
  ): typingsSlinky.babylonjs.groundMeshMod.GroundMesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateGroundFromHeightMap")
  @js.native
  def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.UndefOr[scala.Nothing],
    onReady: js.Function1[/* mesh */ typingsSlinky.babylonjs.groundMeshMod.GroundMesh, Unit],
    alphaFilter: Double
  ): typingsSlinky.babylonjs.groundMeshMod.GroundMesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateGroundFromHeightMap")
  @js.native
  def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean
  ): typingsSlinky.babylonjs.groundMeshMod.GroundMesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateGroundFromHeightMap")
  @js.native
  def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean,
    onReady: js.UndefOr[scala.Nothing],
    alphaFilter: Double
  ): typingsSlinky.babylonjs.groundMeshMod.GroundMesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateGroundFromHeightMap")
  @js.native
  def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean,
    onReady: js.Function1[/* mesh */ typingsSlinky.babylonjs.groundMeshMod.GroundMesh, Unit]
  ): typingsSlinky.babylonjs.groundMeshMod.GroundMesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateGroundFromHeightMap")
  @js.native
  def CreateGroundFromHeightMap(
    name: String,
    url: String,
    width: Double,
    height: Double,
    subdivisions: Double,
    minHeight: Double,
    maxHeight: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean,
    onReady: js.Function1[/* mesh */ typingsSlinky.babylonjs.groundMeshMod.GroundMesh, Unit],
    alphaFilter: Double
  ): typingsSlinky.babylonjs.groundMeshMod.GroundMesh = js.native
  
  /**
    * Creates a hemisphere mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param segments sets the sphere number of horizontal stripes (positive integer, default 32)
    * @param diameter sets the diameter size (float) of the sphere (default 1)
    * @param scene defines the hosting scene
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.CreateHemisphere")
  @js.native
  def CreateHemisphere(name: String, segments: Double, diameter: Double): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateHemisphere")
  @js.native
  def CreateHemisphere(name: String, segments: Double, diameter: Double, scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Creates a sphere based upon an icosahedron with 20 triangular faces which can be subdivided
    * * The parameter `radius` sets the radius size (float) of the icosphere (default 1)
    * * You can set some different icosphere dimensions, for instance to build an ellipsoid, by using the parameters `radiusX`, `radiusY` and `radiusZ` (all by default have the same value than `radius`)
    * * The parameter `subdivisions` sets the number of subdivisions (postive integer, default 4). The more subdivisions, the more faces on the icosphere whatever its size
    * * The parameter `flat` (boolean, default true) gives each side its own normals. Set it to false to get a smooth continuous light reflection on the surface
    * * You can also set the mesh side orientation with the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns a new Mesh
    * @see https://doc.babylonjs.com/how_to/polyhedra_shapes#icosphere
    */
  @JSImport("babylonjs/index", "Mesh.CreateIcoSphere")
  @js.native
  def CreateIcoSphere(name: String, options: Flat, scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Creates lathe mesh.
    * The lathe is a shape with a symetry axis : a 2D model shape is rotated around this axis to design the lathe.
    * Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3. This array depicts the shape to be rotated in its local space : the shape must be designed in the xOy plane and will be rotated around the Y axis. It's usually a 2D shape, so the Vector3 z coordinates are often set to zero
    * @param radius is the radius value of the lathe
    * @param tessellation is the side number of the lathe.
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.CreateLathe")
  @js.native
  def CreateLathe(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    radius: Double,
    tessellation: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateLathe")
  @js.native
  def CreateLathe(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    radius: Double,
    tessellation: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateLathe")
  @js.native
  def CreateLathe(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    radius: Double,
    tessellation: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateLathe")
  @js.native
  def CreateLathe(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    radius: Double,
    tessellation: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Creates a line mesh. Please consider using the same method from the MeshBuilder class instead.
    * @param name defines the name of the mesh to create
    * @param points is an array successive Vector3
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param instance is an instance of an existing LineMesh object to be updated with the passed `points` parameter (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#lines-and-dashedlines).
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.CreateLines")
  @js.native
  def CreateLines(name: String, points: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]): typingsSlinky.babylonjs.linesMeshMod.LinesMesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateLines")
  @js.native
  def CreateLines(
    name: String,
    points: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    updatable: js.UndefOr[scala.Nothing],
    instance: Nullable[typingsSlinky.babylonjs.linesMeshMod.LinesMesh]
  ): typingsSlinky.babylonjs.linesMeshMod.LinesMesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateLines")
  @js.native
  def CreateLines(
    name: String,
    points: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    updatable: Boolean
  ): typingsSlinky.babylonjs.linesMeshMod.LinesMesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateLines")
  @js.native
  def CreateLines(
    name: String,
    points: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    updatable: Boolean,
    instance: Nullable[typingsSlinky.babylonjs.linesMeshMod.LinesMesh]
  ): typingsSlinky.babylonjs.linesMeshMod.LinesMesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateLines")
  @js.native
  def CreateLines(
    name: String,
    points: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]
  ): typingsSlinky.babylonjs.linesMeshMod.LinesMesh = js.native
  
  /**
    * Creates a plane mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param size sets the size (float) of both sides of the plane at once (default 1)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.CreatePlane")
  @js.native
  def CreatePlane(name: String, size: Double, scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreatePlane")
  @js.native
  def CreatePlane(
    name: String,
    size: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreatePlane")
  @js.native
  def CreatePlane(name: String, size: Double, scene: typingsSlinky.babylonjs.sceneMod.Scene, updatable: Boolean): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreatePlane")
  @js.native
  def CreatePlane(
    name: String,
    size: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Creates a polygon mesh.Please consider using the same method from the MeshBuilder class instead
    * The polygon's shape will depend on the input parameters and is constructed parallel to a ground mesh.
    * The parameter `shape` is a required array of successive Vector3 representing the corners of the polygon in th XoZ plane, that is y = 0 for all vectors.
    * You can set the mesh side orientation with the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created.
    * Remember you can only change the shape positions, not their number when updating a polygon.
    * @see https://doc.babylonjs.com/how_to/parametric_shapes#non-regular-polygon
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3 representing the corners of the polygon in th XoZ plane, that is y = 0 for all vectors
    * @param scene defines the hosting scene
    * @param holes is a required array of arrays of successive Vector3 used to defines holes in the polygon
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param earcutInjection can be used to inject your own earcut reference
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.CreatePolygon")
  @js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreatePolygon")
  @js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreatePolygon")
  @js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreatePolygon")
  @js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double,
    earcutInjection: js.Any
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreatePolygon")
  @js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreatePolygon")
  @js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreatePolygon")
  @js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreatePolygon")
  @js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: Double,
    earcutInjection: js.Any
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreatePolygon")
  @js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]]
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreatePolygon")
  @js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreatePolygon")
  @js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreatePolygon")
  @js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double,
    earcutInjection: js.Any
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreatePolygon")
  @js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreatePolygon")
  @js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    updatable: Boolean,
    sideOrientation: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreatePolygon")
  @js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    updatable: Boolean,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreatePolygon")
  @js.native
  def CreatePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    updatable: Boolean,
    sideOrientation: Double,
    earcutInjection: js.Any
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Creates a polyhedron mesh.
    * Please consider using the same method from the MeshBuilder class instead.
    * * The parameter `type` (positive integer, max 14, default 0) sets the polyhedron type to build among the 15 embbeded types. Please refer to the type sheet in the tutorial to choose the wanted type
    * * The parameter `size` (positive float, default 1) sets the polygon size
    * * You can overwrite the `size` on each dimension bu using the parameters `sizeX`, `sizeY` or `sizeZ` (positive floats, default to `size` value)
    * * You can build other polyhedron types than the 15 embbeded ones by setting the parameter `custom` (`polyhedronObject`, default null). If you set the parameter `custom`, this overwrittes the parameter `type`
    * * A `polyhedronObject` is a formatted javascript object. You'll find a full file with pre-set polyhedra here : https://github.com/BabylonJS/Extensions/tree/master/Polyhedron
    * * You can set the color and the UV of each side of the polyhedron with the parameters `faceColors` (Color4, default `(1, 1, 1, 1)`) and faceUV (Vector4, default `(0, 0, 1, 1)`)
    * * To understand how to set `faceUV` or `faceColors`, please read this by considering the right number of faces of your polyhedron, instead of only 6 for the box : https://doc.babylonjs.com/how_to/createbox_per_face_textures_and_colors
    * * The parameter `flat` (boolean, default true). If set to false, it gives the polyhedron a single global face, so less vertices and shared normals. In this case, `faceColors` and `faceUV` are ignored
    * * You can also set the mesh side orientation with the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @param name defines the name of the mesh to create
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.CreatePolyhedron")
  @js.native
  def CreatePolyhedron(name: String, options: Custom, scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Creates a ribbon mesh. Please consider using the same method from the MeshBuilder class instead
    * @see https://doc.babylonjs.com/how_to/parametric_shapes
    * @param name defines the name of the mesh to create
    * @param pathArray is a required array of paths, what are each an array of successive Vector3. The pathArray parameter depicts the ribbon geometry.
    * @param closeArray creates a seam between the first and the last paths of the path array (default is false)
    * @param closePath creates a seam between the first and the last points of each path of the path array
    * @param offset is taken in account only if the `pathArray` is containing a single path
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param instance defines an instance of an existing Ribbon object to be updated with the passed `pathArray` parameter (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#ribbon)
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.CreateRibbon")
  @js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateRibbon")
  @js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateRibbon")
  @js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateRibbon")
  @js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double,
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateRibbon")
  @js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateRibbon")
  @js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateRibbon")
  @js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateRibbon")
  @js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: Double,
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateRibbon")
  @js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateRibbon")
  @js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateRibbon")
  @js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateRibbon")
  @js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double,
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateRibbon")
  @js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateRibbon")
  @js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean,
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateRibbon")
  @js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateRibbon")
  @js.native
  def CreateRibbon(
    name: String,
    pathArray: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    closeArray: Boolean,
    closePath: Boolean,
    offset: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean,
    sideOrientation: Double,
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Creates a sphere mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param segments sets the sphere number of horizontal stripes (positive integer, default 32)
    * @param diameter sets the diameter size (float) of the sphere (default 1)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.CreateSphere")
  @js.native
  def CreateSphere(name: String, segments: Double, diameter: Double): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateSphere")
  @js.native
  def CreateSphere(
    name: String,
    segments: Double,
    diameter: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateSphere")
  @js.native
  def CreateSphere(
    name: String,
    segments: Double,
    diameter: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateSphere")
  @js.native
  def CreateSphere(
    name: String,
    segments: Double,
    diameter: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateSphere")
  @js.native
  def CreateSphere(name: String, segments: Double, diameter: Double, scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateSphere")
  @js.native
  def CreateSphere(
    name: String,
    segments: Double,
    diameter: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateSphere")
  @js.native
  def CreateSphere(
    name: String,
    segments: Double,
    diameter: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateSphere")
  @js.native
  def CreateSphere(
    name: String,
    segments: Double,
    diameter: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Creates a tiled ground mesh.
    * Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param xmin set the ground minimum X coordinate
    * @param zmin set the ground minimum Y coordinate
    * @param xmax set the ground maximum X coordinate
    * @param zmax set the ground maximum Z coordinate
    * @param subdivisions is an object `{w: positive integer, h: positive integer}` (default `{w: 6, h: 6}`). `w` and `h` are the numbers of subdivisions on the ground width and height. Each subdivision is called a tile
    * @param precision is an object `{w: positive integer, h: positive integer}` (default `{w: 2, h: 2}`). `w` and `h` are the numbers of subdivisions on the ground width and height of each tile
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.CreateTiledGround")
  @js.native
  def CreateTiledGround(
    name: String,
    xmin: Double,
    zmin: Double,
    xmax: Double,
    zmax: Double,
    subdivisions: H,
    precision: H,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTiledGround")
  @js.native
  def CreateTiledGround(
    name: String,
    xmin: Double,
    zmin: Double,
    xmax: Double,
    zmax: Double,
    subdivisions: H,
    precision: H,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Creates a torus mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param diameter sets the diameter size (float) of the torus (default 1)
    * @param thickness sets the diameter size of the tube of the torus (float, default 0.5)
    * @param tessellation sets the number of torus sides (postive integer, default 16)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.CreateTorus")
  @js.native
  def CreateTorus(name: String, diameter: Double, thickness: Double, tessellation: Double): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTorus")
  @js.native
  def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTorus")
  @js.native
  def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTorus")
  @js.native
  def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTorus")
  @js.native
  def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTorus")
  @js.native
  def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTorus")
  @js.native
  def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTorus")
  @js.native
  def CreateTorus(
    name: String,
    diameter: Double,
    thickness: Double,
    tessellation: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Creates a torus knot mesh. Please consider using the same method from the MeshBuilder class instead
    * @param name defines the name of the mesh to create
    * @param radius sets the global radius size (float) of the torus knot (default 2)
    * @param tube sets the diameter size of the tube of the torus (float, default 0.5)
    * @param radialSegments sets the number of sides on each tube segments (positive integer, default 32)
    * @param tubularSegments sets the number of tubes to decompose the knot into (positive integer, default 32)
    * @param p the number of windings on X axis (positive integers, default 2)
    * @param q the number of windings on Y axis (positive integers, default 3)
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.CreateTorusKnot")
  @js.native
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTorusKnot")
  @js.native
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTorusKnot")
  @js.native
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTorusKnot")
  @js.native
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTorusKnot")
  @js.native
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTorusKnot")
  @js.native
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTorusKnot")
  @js.native
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTorusKnot")
  @js.native
  def CreateTorusKnot(
    name: String,
    radius: Double,
    tube: Double,
    radialSegments: Double,
    tubularSegments: Double,
    p: Double,
    q: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Creates a tube mesh.
    * The tube is a parametric shape.
    * It has no predefined shape. Its final shape will depend on the input parameters.
    * Please consider using the same method from the MeshBuilder class instead
    * @see https://doc.babylonjs.com/how_to/parametric_shapes
    * @param name defines the name of the mesh to create
    * @param path is a required array of successive Vector3. It is the curve used as the axis of the tube
    * @param radius sets the tube radius size
    * @param tessellation is the number of sides on the tubular surface
    * @param radiusFunction is a custom function. If it is not null, it overwrittes the parameter `radius`. This function is called on each point of the tube path and is passed the index `i` of the i-th point and the distance of this point from the first point of the path
    * @param cap sets the way the extruded shape is capped. Possible values : Mesh.NO_CAP (default), Mesh.CAP_START, Mesh.CAP_END, Mesh.CAP_ALL
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param instance is an instance of an existing Tube object to be updated with the passed `pathArray` parameter (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#tube)
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.CreateTube")
  @js.native
  def CreateTube(
    name: String,
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTube")
  @js.native
  def CreateTube(
    name: String,
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTube")
  @js.native
  def CreateTube(
    name: String,
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTube")
  @js.native
  def CreateTube(
    name: String,
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double,
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTube")
  @js.native
  def CreateTube(
    name: String,
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTube")
  @js.native
  def CreateTube(
    name: String,
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean,
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTube")
  @js.native
  def CreateTube(
    name: String,
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.CreateTube")
  @js.native
  def CreateTube(
    name: String,
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    radius: Double,
    tessellation: Double,
    radiusFunction: js.Function2[/* i */ Double, /* distance */ Double, Double],
    cap: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean,
    sideOrientation: Double,
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Mesh side orientation : by default, `FRONTSIDE`
    */
  @JSImport("babylonjs/index", "Mesh.DEFAULTSIDE")
  @js.native
  val DEFAULTSIDE: Double = js.native
  
  /**
    * Mesh side orientation : both internal and external or front and back surfaces
    */
  @JSImport("babylonjs/index", "Mesh.DOUBLESIDE")
  @js.native
  val DOUBLESIDE: Double = js.native
  
  /**
    * Creates an extruded polygon mesh, with depth in the Y direction. Please consider using the same method from the MeshBuilder class instead.
    * @see https://doc.babylonjs.com/how_to/parametric_shapes#extruded-non-regular-polygon
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3 representing the corners of the polygon in th XoZ plane, that is y = 0 for all vectors
    * @param depth defines the height of extrusion
    * @param scene defines the hosting scene
    * @param holes is a required array of arrays of successive Vector3 used to defines holes in the polygon
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param earcutInjection can be used to inject your own earcut reference
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.ExtrudePolygon")
  @js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    depth: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudePolygon")
  @js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    depth: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudePolygon")
  @js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    depth: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudePolygon")
  @js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    depth: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double,
    earcutInjection: js.Any
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudePolygon")
  @js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    depth: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudePolygon")
  @js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    depth: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudePolygon")
  @js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    depth: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudePolygon")
  @js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    depth: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.UndefOr[scala.Nothing],
    updatable: Boolean,
    sideOrientation: Double,
    earcutInjection: js.Any
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudePolygon")
  @js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    depth: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]]
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudePolygon")
  @js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    depth: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudePolygon")
  @js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    depth: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudePolygon")
  @js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    depth: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double,
    earcutInjection: js.Any
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudePolygon")
  @js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    depth: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudePolygon")
  @js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    depth: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    updatable: Boolean,
    sideOrientation: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudePolygon")
  @js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    depth: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    updatable: Boolean,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudePolygon")
  @js.native
  def ExtrudePolygon(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    depth: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    holes: js.Array[js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3]],
    updatable: Boolean,
    sideOrientation: Double,
    earcutInjection: js.Any
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Creates an extruded shape mesh.
    * The extrusion is a parametric shape. It has no predefined shape. Its final shape will depend on the input parameters. Please consider using the same method from the MeshBuilder class instead
    * @see https://doc.babylonjs.com/how_to/parametric_shapes
    * @see https://doc.babylonjs.com/how_to/parametric_shapes#extruded-shapes
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3. This array depicts the shape to be extruded in its local space : the shape must be designed in the xOy plane and will be extruded along the Z axis
    * @param path is a required array of successive Vector3. This is the axis curve the shape is extruded along
    * @param scale is the value to scale the shape
    * @param rotation is the angle value to rotate the shape each step (each path point), from the former step (so rotation added each step) along the curve
    * @param cap sets the way the extruded shape is capped. Possible values : Mesh.NO_CAP (default), Mesh.CAP_START, Mesh.CAP_END, Mesh.CAP_ALL
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param instance is an instance of an existing ExtrudedShape object to be updated with the passed `shape`, `path`, `scale` or `rotation` parameters (https://doc.babylonjs.com/how_to/How_to_dynamically_morph_a_mesh#extruded-shape)
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.ExtrudeShape")
  @js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudeShape")
  @js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudeShape")
  @js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudeShape")
  @js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double,
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudeShape")
  @js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudeShape")
  @js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    updatable: Boolean,
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudeShape")
  @js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    updatable: Boolean,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudeShape")
  @js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: js.UndefOr[Nullable[typingsSlinky.babylonjs.sceneMod.Scene]],
    updatable: Boolean,
    sideOrientation: Double,
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudeShape")
  @js.native
  def ExtrudeShape(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scale: Double,
    rotation: Double,
    cap: Double,
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Creates an custom extruded shape mesh.
    * The custom extrusion is a parametric shape.
    * It has no predefined shape. Its final shape will depend on the input parameters.
    * Please consider using the same method from the MeshBuilder class instead
    * @see https://doc.babylonjs.com/how_to/parametric_shapes#extruded-shapes
    * @param name defines the name of the mesh to create
    * @param shape is a required array of successive Vector3. This array depicts the shape to be extruded in its local space : the shape must be designed in the xOy plane and will be extruded along the Z axis
    * @param path is a required array of successive Vector3. This is the axis curve the shape is extruded along
    * @param scaleFunction is a custom Javascript function called on each path point
    * @param rotationFunction is a custom Javascript function called on each path point
    * @param ribbonCloseArray forces the extrusion underlying ribbon to close all the paths in its `pathArray`
    * @param ribbonClosePath forces the extrusion underlying ribbon to close its `pathArray`
    * @param cap sets the way the extruded shape is capped. Possible values : Mesh.NO_CAP (default), Mesh.CAP_START, Mesh.CAP_END, Mesh.CAP_ALL
    * @param scene defines the hosting scene
    * @param updatable defines if the mesh must be flagged as updatable
    * @param sideOrientation defines the mesh side orientation (https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation)
    * @param instance is an instance of an existing ExtrudedShape object to be updated with the passed `shape`, `path`, `scale` or `rotation` parameters (https://doc.babylonjs.com/how_to/how_to_dynamically_morph_a_mesh#extruded-shape)
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.ExtrudeShapeCustom")
  @js.native
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudeShapeCustom")
  @js.native
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudeShapeCustom")
  @js.native
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudeShapeCustom")
  @js.native
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: js.UndefOr[scala.Nothing],
    sideOrientation: Double,
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudeShapeCustom")
  @js.native
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudeShapeCustom")
  @js.native
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean,
    sideOrientation: js.UndefOr[scala.Nothing],
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudeShapeCustom")
  @js.native
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean,
    sideOrientation: Double
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/index", "Mesh.ExtrudeShapeCustom")
  @js.native
  def ExtrudeShapeCustom(
    name: String,
    shape: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    path: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector3],
    scaleFunction: js.Function,
    rotationFunction: js.Function,
    ribbonCloseArray: Boolean,
    ribbonClosePath: Boolean,
    cap: Double,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    updatable: Boolean,
    sideOrientation: Double,
    instance: typingsSlinky.babylonjs.meshMod.Mesh
  ): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Mesh pattern setting : rotate pattern and rotate
    */
  @JSImport("babylonjs/index", "Mesh.FLIP_N_ROTATE_ROW")
  @js.native
  val FLIP_N_ROTATE_ROW: Double = js.native
  
  /**
    * Mesh pattern setting : flip and rotate alternate tiles on each row or column
    */
  @JSImport("babylonjs/index", "Mesh.FLIP_N_ROTATE_TILE")
  @js.native
  val FLIP_N_ROTATE_TILE: Double = js.native
  
  /**
    * Mesh pattern setting : flip (reflect in y axis) all tiles on alternate rows
    */
  @JSImport("babylonjs/index", "Mesh.FLIP_ROW")
  @js.native
  val FLIP_ROW: Double = js.native
  
  /**
    * Mesh pattern setting : flip (reflect in y axis) alternate tiles on each row or column
    */
  @JSImport("babylonjs/index", "Mesh.FLIP_TILE")
  @js.native
  val FLIP_TILE: Double = js.native
  
  /**
    * Mesh side orientation : usually the external or front surface
    */
  @JSImport("babylonjs/index", "Mesh.FRONTSIDE")
  @js.native
  val FRONTSIDE: Double = js.native
  
  /**
    * Mesh tile positioning : part tiles on left
    */
  @JSImport("babylonjs/index", "Mesh.LEFT")
  @js.native
  val LEFT: Double = js.native
  
  /**
    * Merge the array of meshes into a single mesh for performance reasons.
    * @param meshes defines he vertices source.  They should all be of the same material.  Entries can empty
    * @param disposeSource when true (default), dispose of the vertices from the source meshes
    * @param allow32BitsIndices when the sum of the vertices > 64k, this must be set to true
    * @param meshSubclass when set, vertices inserted into this Mesh.  Meshes can then be merged into a Mesh sub-class.
    * @param subdivideWithSubMeshes when true (false default), subdivide mesh to his subMesh array with meshes source.
    * @param multiMultiMaterials when true (false default), subdivide mesh and accept multiple multi materials, ignores subdivideWithSubMeshes.
    * @returns a new mesh
    */
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh]): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
    multiMultiMaterials: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: typingsSlinky.babylonjs.meshMod.Mesh
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: typingsSlinky.babylonjs.meshMod.Mesh,
    subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
    multiMultiMaterials: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: typingsSlinky.babylonjs.meshMod.Mesh,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: typingsSlinky.babylonjs.meshMod.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: Boolean,
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
    multiMultiMaterials: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: Boolean,
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: Boolean,
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: Boolean,
    meshSubclass: typingsSlinky.babylonjs.meshMod.Mesh
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: Boolean,
    meshSubclass: typingsSlinky.babylonjs.meshMod.Mesh,
    subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
    multiMultiMaterials: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: Boolean,
    meshSubclass: typingsSlinky.babylonjs.meshMod.Mesh,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: js.UndefOr[scala.Nothing],
    allow32BitsIndices: Boolean,
    meshSubclass: typingsSlinky.babylonjs.meshMod.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh], disposeSource: Boolean): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
    multiMultiMaterials: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: typingsSlinky.babylonjs.meshMod.Mesh
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: typingsSlinky.babylonjs.meshMod.Mesh,
    subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
    multiMultiMaterials: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: typingsSlinky.babylonjs.meshMod.Mesh,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: js.UndefOr[scala.Nothing],
    meshSubclass: typingsSlinky.babylonjs.meshMod.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
    multiMultiMaterials: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: js.UndefOr[scala.Nothing],
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typingsSlinky.babylonjs.meshMod.Mesh
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typingsSlinky.babylonjs.meshMod.Mesh,
    subdivideWithSubMeshes: js.UndefOr[scala.Nothing],
    multiMultiMaterials: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typingsSlinky.babylonjs.meshMod.Mesh,
    subdivideWithSubMeshes: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  @JSImport("babylonjs/index", "Mesh.MergeMeshes")
  @js.native
  def MergeMeshes(
    meshes: js.Array[typingsSlinky.babylonjs.meshMod.Mesh],
    disposeSource: Boolean,
    allow32BitsIndices: Boolean,
    meshSubclass: typingsSlinky.babylonjs.meshMod.Mesh,
    subdivideWithSubMeshes: Boolean,
    multiMultiMaterials: Boolean
  ): Nullable[typingsSlinky.babylonjs.meshMod.Mesh] = js.native
  
  /**
    * Returns an object containing a min and max Vector3 which are the minimum and maximum vectors of each mesh bounding box from the passed array, in the world coordinates
    * @param meshes defines the list of meshes to scan
    * @returns an object `{min:` Vector3`, max:` Vector3`}`
    */
  @JSImport("babylonjs/index", "Mesh.MinMax")
  @js.native
  def MinMax(meshes: js.Array[typingsSlinky.babylonjs.abstractMeshMod.AbstractMesh]): Max = js.native
  
  /**
    * Mesh cap setting : no cap
    */
  @JSImport("babylonjs/index", "Mesh.NO_CAP")
  @js.native
  val NO_CAP: Double = js.native
  
  /**
    * Mesh pattern setting : no flip or rotate
    */
  @JSImport("babylonjs/index", "Mesh.NO_FLIP")
  @js.native
  val NO_FLIP: Double = js.native
  
  /**
    * Returns a new Mesh object parsed from the source provided.
    * @param parsedMesh is the source
    * @param scene defines the hosting scene
    * @param rootUrl is the root URL to prefix the `delayLoadingFile` property with
    * @returns a new Mesh
    */
  @JSImport("babylonjs/index", "Mesh.Parse")
  @js.native
  def Parse(parsedMesh: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene, rootUrl: String): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /**
    * Mesh tile positioning : part tiles on right
    */
  @JSImport("babylonjs/index", "Mesh.RIGHT")
  @js.native
  val RIGHT: Double = js.native
  
  /**
    * Mesh pattern setting : rotate (180degs) all tiles on alternate rows
    */
  @JSImport("babylonjs/index", "Mesh.ROTATE_ROW")
  @js.native
  val ROTATE_ROW: Double = js.native
  
  /**
    * Mesh pattern setting : rotate (180degs) alternate tiles on each row or column
    */
  @JSImport("babylonjs/index", "Mesh.ROTATE_TILE")
  @js.native
  val ROTATE_TILE: Double = js.native
  
  /**
    * Mesh tile positioning : part tiles on top
    */
  @JSImport("babylonjs/index", "Mesh.TOP")
  @js.native
  val TOP: Double = js.native
  
  /**
    * Gets the default side orientation.
    * @param orientation the orientation to value to attempt to get
    * @returns the default orientation
    * @hidden
    */
  @JSImport("babylonjs/index", "Mesh._GetDefaultSideOrientation")
  @js.native
  def _GetDefaultSideOrientation(): Double = js.native
  @JSImport("babylonjs/index", "Mesh._GetDefaultSideOrientation")
  @js.native
  def _GetDefaultSideOrientation(orientation: Double): Double = js.native
  
  /** @hidden */
  @JSImport("babylonjs/index", "Mesh._GroundMeshParser")
  @js.native
  def _GroundMeshParser(parsedMesh: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  
  /** @hidden */
  @JSImport("babylonjs/index", "Mesh._PhysicsImpostorParser")
  @js.native
  def _PhysicsImpostorParser(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    physicObject: IPhysicsEnabledObject,
    jsonObject: js.Any
  ): typingsSlinky.babylonjs.physicsImpostorMod.PhysicsImpostor = js.native
  
  /** @hidden */
  @JSImport("babylonjs/index", "Mesh._instancedMeshFactory")
  @js.native
  def _instancedMeshFactory(name: String, mesh: typingsSlinky.babylonjs.meshMod.Mesh): typingsSlinky.babylonjs.instancedMeshMod.InstancedMesh = js.native
}
