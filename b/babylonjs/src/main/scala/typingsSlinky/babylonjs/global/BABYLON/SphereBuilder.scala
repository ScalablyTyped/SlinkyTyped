package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.anon.DiameterZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SphereBuilder")
@js.native
class SphereBuilder ()
  extends typingsSlinky.babylonjs.BABYLON.SphereBuilder
/* static members */
object SphereBuilder {
  
  /**
    * Creates a sphere mesh
    * * The parameter `diameter` sets the diameter size (float) of the sphere (default 1)
    * * You can set some different sphere dimensions, for instance to build an ellipsoid, by using the parameters `diameterX`, `diameterY` and `diameterZ` (all by default have the same value of `diameter`)
    * * The parameter `segments` sets the sphere number of horizontal stripes (positive integer, default 32)
    * * You can create an unclosed sphere with the parameter `arc` (positive float, default 1), valued between 0 and 1, what is the ratio of the circumference (latitude) : 2 x PI x ratio
    * * You can create an unclosed sphere on its height with the parameter `slice` (positive float, default1), valued between 0 and 1, what is the height ratio (longitude)
    * * You can also set the mesh side orientation with the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns the sphere mesh
    * @see https://doc.babylonjs.com/how_to/set_shapes#sphere
    */
  @JSGlobal("BABYLON.SphereBuilder.CreateSphere")
  @js.native
  def CreateSphere(name: String, options: DiameterZ): typingsSlinky.babylonjs.BABYLON.Mesh = js.native
  @JSGlobal("BABYLON.SphereBuilder.CreateSphere")
  @js.native
  def CreateSphere(name: String, options: DiameterZ, scene: Nullable[typingsSlinky.babylonjs.BABYLON.Scene]): typingsSlinky.babylonjs.BABYLON.Mesh = js.native
}
