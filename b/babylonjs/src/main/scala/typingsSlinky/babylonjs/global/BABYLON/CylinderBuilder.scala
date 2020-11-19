package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.anon.DiameterTop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.CylinderBuilder")
@js.native
class CylinderBuilder ()
  extends typingsSlinky.babylonjs.BABYLON.CylinderBuilder
/* static members */
@JSGlobal("BABYLON.CylinderBuilder")
@js.native
object CylinderBuilder extends js.Object {
  
  /**
    * Creates a cylinder or a cone mesh
    * * The parameter `height` sets the height size (float) of the cylinder/cone (float, default 2).
    * * The parameter `diameter` sets the diameter of the top and bottom cap at once (float, default 1).
    * * The parameters `diameterTop` and `diameterBottom` overwrite the parameter `diameter` and set respectively the top cap and bottom cap diameter (floats, default 1). The parameter "diameterBottom" can't be zero.
    * * The parameter `tessellation` sets the number of cylinder sides (positive integer, default 24). Set it to 3 to get a prism for instance.
    * * The parameter `subdivisions` sets the number of rings along the cylinder height (positive integer, default 1).
    * * The parameter `hasRings` (boolean, default false) makes the subdivisions independent from each other, so they become different faces.
    * * The parameter `enclose`  (boolean, default false) adds two extra faces per subdivision to a sliced cylinder to close it around its height axis.
    * * The parameter `cap` sets the way the cylinder is capped. Possible values : BABYLON.Mesh.NO_CAP, BABYLON.Mesh.CAP_START, BABYLON.Mesh.CAP_END, BABYLON.Mesh.CAP_ALL (default).
    * * The parameter `arc` (float, default 1) is the ratio (max 1) to apply to the circumference to slice the cylinder.
    * * You can set different colors and different images to each box side by using the parameters `faceColors` (an array of n Color3 elements) and `faceUV` (an array of n Vector4 elements).
    * * The value of n is the number of cylinder faces. If the cylinder has only 1 subdivisions, n equals : top face + cylinder surface + bottom face = 3
    * * Now, if the cylinder has 5 independent subdivisions (hasRings = true), n equals : top face + 5 stripe surfaces + bottom face = 2 + 5 = 7
    * * Finally, if the cylinder has 5 independent subdivisions and is enclose, n equals : top face + 5 x (stripe surface + 2 closing faces) + bottom face = 2 + 5 * 3 = 17
    * * Each array (color or UVs) is always ordered the same way : the first element is the bottom cap, the last element is the top cap. The other elements are each a ring surface.
    * * If `enclose` is false, a ring surface is one element.
    * * If `enclose` is true, a ring surface is 3 successive elements in the array : the tubular surface, then the two closing faces.
    * * Example how to set colors and textures on a sliced cylinder : https://www.html5gamedevs.com/topic/17945-creating-a-closed-slice-of-a-cylinder/#comment-106379
    * * You can also set the mesh side orientation with the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created.
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns the cylinder mesh
    * @see https://doc.babylonjs.com/how_to/set_shapes#cylinder-or-cone
    */
  def CreateCylinder(name: String, options: DiameterTop, scene: js.Any): typingsSlinky.babylonjs.BABYLON.Mesh = js.native
}
