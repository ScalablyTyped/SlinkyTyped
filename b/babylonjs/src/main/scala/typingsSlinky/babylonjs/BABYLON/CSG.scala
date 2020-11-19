package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSG extends js.Object {
  
  /**
    * Build Raw mesh from CSG
    * Coordinates here are in world space
    * @param name The name of the mesh geometry
    * @param scene The Scene
    * @param keepSubMeshes Specifies if the submeshes should be kept
    * @returns A new Mesh
    */
  def buildMeshGeometry(name: String): Mesh = js.native
  def buildMeshGeometry(name: String, scene: js.UndefOr[scala.Nothing], keepSubMeshes: Boolean): Mesh = js.native
  def buildMeshGeometry(name: String, scene: Scene): Mesh = js.native
  def buildMeshGeometry(name: String, scene: Scene, keepSubMeshes: Boolean): Mesh = js.native
  
  /**
    * This is used to keep meshes transformations so they can be restored
    * when we build back a Babylon Mesh
    * NB : All CSG operations are performed in world coordinates
    * @param csg The CSG to copy the transform attributes from
    * @returns This CSG
    */
  def copyTransformAttributes(csg: CSG): CSG = js.native
  
  /**
    * Intersect this CSG with another CSG
    * @param csg The CSG to intersect against this CSG
    * @returns A new CSG
    */
  def intersect(csg: CSG): CSG = js.native
  
  /**
    * Intersects this CSG with another CSG in place
    * @param csg The CSG to intersect against this CSG
    */
  def intersectInPlace(csg: CSG): Unit = js.native
  
  /**
    * Return a new CSG solid with solid and empty space switched. This solid is
    * not modified.
    * @returns A new CSG solid with solid and empty space switched
    */
  def inverse(): CSG = js.native
  
  /**
    * Inverses the CSG in place
    */
  def inverseInPlace(): Unit = js.native
  
  /**
    * The world matrix
    */
  var matrix: Matrix = js.native
  
  var polygons: js.Any = js.native
  
  /**
    * Stores the position
    */
  var position: Vector3 = js.native
  
  /**
    * Stores the rotation
    */
  var rotation: Vector3 = js.native
  
  /**
    * Stores the rotation quaternion
    */
  var rotationQuaternion: Nullable[Quaternion] = js.native
  
  /**
    * Stores the scaling vector
    */
  var scaling: Vector3 = js.native
  
  /**
    * Subtracts this CSG with another CSG
    * @param csg The CSG to subtract against this CSG
    * @returns A new CSG
    */
  def subtract(csg: CSG): CSG = js.native
  
  /**
    * Subtracts this CSG with another CSG in place
    * @param csg The CSG to subtact against this CSG
    */
  def subtractInPlace(csg: CSG): Unit = js.native
  
  /**
    * Build Mesh from CSG taking material and transforms into account
    * @param name The name of the Mesh
    * @param material The material of the Mesh
    * @param scene The Scene
    * @param keepSubMeshes Specifies if submeshes should be kept
    * @returns The new Mesh
    */
  def toMesh(name: String): Mesh = js.native
  def toMesh(
    name: String,
    material: js.UndefOr[Nullable[Material]],
    scene: js.UndefOr[scala.Nothing],
    keepSubMeshes: Boolean
  ): Mesh = js.native
  def toMesh(name: String, material: js.UndefOr[Nullable[Material]], scene: Scene): Mesh = js.native
  def toMesh(name: String, material: js.UndefOr[Nullable[Material]], scene: Scene, keepSubMeshes: Boolean): Mesh = js.native
  def toMesh(name: String, material: Nullable[Material]): Mesh = js.native
  
  /**
    * Unions this CSG with another CSG
    * @param csg The CSG to union against this CSG
    * @returns The unioned CSG
    */
  def union(csg: CSG): CSG = js.native
  
  /**
    * Unions this CSG with another CSG in place
    * @param csg The CSG to union against this CSG
    */
  def unionInPlace(csg: CSG): Unit = js.native
}
