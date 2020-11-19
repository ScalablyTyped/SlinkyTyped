package typingsSlinky.babylonjs.inavigationengineMod

import typingsSlinky.babylonjs.mathMod.Vector3
import typingsSlinky.babylonjs.meshMod.Mesh
import typingsSlinky.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INavigationEnginePlugin extends js.Object {
  
  /**
    * Compute a navigation path from start to end. Returns an empty array if no path can be computed
    * @param start world position
    * @param end world position
    * @returns array containing world position composing the path
    */
  def computePath(start: Vector3, end: Vector3): js.Array[Vector3] = js.native
  
  /**
    * Create a new Crowd so you can add agents
    * @param maxAgents the maximum agent count in the crowd
    * @param maxAgentRadius the maximum radius an agent can have
    * @param scene to attach the crowd to
    * @returns the crowd you can add agents to
    */
  def createCrowd(maxAgents: Double, maxAgentRadius: Double, scene: Scene): ICrowd = js.native
  
  /**
    * Create a navigation mesh debug mesh
    * @param scene is where the mesh will be added
    * @returns debug display mesh
    */
  def createDebugNavMesh(scene: Scene): Mesh = js.native
  
  /**
    * Creates a navigation mesh
    * @param meshes array of all the geometry used to compute the navigatio mesh
    * @param parameters bunch of parameters used to filter geometry
    */
  def createNavMesh(meshes: js.Array[Mesh], parameters: INavMeshParameters): Unit = js.native
  
  /**
    * Release all resources
    */
  def dispose(): Unit = js.native
  
  /**
    * Get a navigation mesh constrained position, closest to the parameter position
    * @param position world position
    * @returns the closest point to position constrained by the navigation mesh
    */
  def getClosestPoint(position: Vector3): Vector3 = js.native
  
  /**
    * Get the Bounding box extent specified by setDefaultQueryExtent
    * @returns the box extent values
    */
  def getDefaultQueryExtent(): Vector3 = js.native
  
  /**
    * Get a navigation mesh constrained position, within a particular radius
    * @param position world position
    * @param maxRadius the maximum distance to the constrained world position
    * @returns the closest point to position constrained by the navigation mesh
    */
  def getRandomPointAround(position: Vector3, maxRadius: Double): Vector3 = js.native
  
  /**
    * If this plugin is supported
    * @returns true if plugin is supported
    */
  def isSupported(): Boolean = js.native
  
  /**
    * Compute the final position from a segment made of destination-position
    * @param position world position
    * @param destination world position
    * @returns the resulting point along the navmesh
    */
  def moveAlong(position: Vector3, destination: Vector3): Vector3 = js.native
  
  /**
    * plugin name
    */
  var name: String = js.native
  
  /**
    * Set the Bounding box extent for doing spatial queries (getClosestPoint, getRandomPointAround, ...)
    * The queries will try to find a solution within those bounds
    * default is (1,1,1)
    * @param extent x,y,z value that define the extent around the queries point of reference
    */
  def setDefaultQueryExtent(extent: Vector3): Unit = js.native
}
object INavigationEnginePlugin {
  
  @scala.inline
  def apply(
    computePath: (Vector3, Vector3) => js.Array[Vector3],
    createCrowd: (Double, Double, Scene) => ICrowd,
    createDebugNavMesh: Scene => Mesh,
    createNavMesh: (js.Array[Mesh], INavMeshParameters) => Unit,
    dispose: () => Unit,
    getClosestPoint: Vector3 => Vector3,
    getDefaultQueryExtent: () => Vector3,
    getRandomPointAround: (Vector3, Double) => Vector3,
    isSupported: () => Boolean,
    moveAlong: (Vector3, Vector3) => Vector3,
    name: String,
    setDefaultQueryExtent: Vector3 => Unit
  ): INavigationEnginePlugin = {
    val __obj = js.Dynamic.literal(computePath = js.Any.fromFunction2(computePath), createCrowd = js.Any.fromFunction3(createCrowd), createDebugNavMesh = js.Any.fromFunction1(createDebugNavMesh), createNavMesh = js.Any.fromFunction2(createNavMesh), dispose = js.Any.fromFunction0(dispose), getClosestPoint = js.Any.fromFunction1(getClosestPoint), getDefaultQueryExtent = js.Any.fromFunction0(getDefaultQueryExtent), getRandomPointAround = js.Any.fromFunction2(getRandomPointAround), isSupported = js.Any.fromFunction0(isSupported), moveAlong = js.Any.fromFunction2(moveAlong), name = name.asInstanceOf[js.Any], setDefaultQueryExtent = js.Any.fromFunction1(setDefaultQueryExtent))
    __obj.asInstanceOf[INavigationEnginePlugin]
  }
  
  @scala.inline
  implicit class INavigationEnginePluginOps[Self <: INavigationEnginePlugin] (val x: Self) extends AnyVal {
    
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
    def setComputePath(value: (Vector3, Vector3) => js.Array[Vector3]): Self = this.set("computePath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateCrowd(value: (Double, Double, Scene) => ICrowd): Self = this.set("createCrowd", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreateDebugNavMesh(value: Scene => Mesh): Self = this.set("createDebugNavMesh", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateNavMesh(value: (js.Array[Mesh], INavMeshParameters) => Unit): Self = this.set("createNavMesh", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClosestPoint(value: Vector3 => Vector3): Self = this.set("getClosestPoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDefaultQueryExtent(value: () => Vector3): Self = this.set("getDefaultQueryExtent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRandomPointAround(value: (Vector3, Double) => Vector3): Self = this.set("getRandomPointAround", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsSupported(value: () => Boolean): Self = this.set("isSupported", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveAlong(value: (Vector3, Vector3) => Vector3): Self = this.set("moveAlong", js.Any.fromFunction2(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDefaultQueryExtent(value: Vector3 => Unit): Self = this.set("setDefaultQueryExtent", js.Any.fromFunction1(value))
  }
}
