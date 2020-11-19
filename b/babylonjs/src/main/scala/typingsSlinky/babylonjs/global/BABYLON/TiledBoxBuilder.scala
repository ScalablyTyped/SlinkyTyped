package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.anon.AlignVerticalDepth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.TiledBoxBuilder")
@js.native
class TiledBoxBuilder ()
  extends typingsSlinky.babylonjs.BABYLON.TiledBoxBuilder
/* static members */
@JSGlobal("BABYLON.TiledBoxBuilder")
@js.native
object TiledBoxBuilder extends js.Object {
  
  /**
    * Creates a box mesh
    * faceTiles sets the pattern, tile size and number of tiles for a face     * * You can set different colors and different images to each box side by using the parameters `faceColors` (an array of 6 Color3 elements) and `faceUV` (an array of 6 Vector4 elements)
    * * Please read this tutorial : https://doc.babylonjs.com/how_to/createbox_per_face_textures_and_colors
    * * You can also set the mesh side orientation with the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns the box mesh
    */
  def CreateTiledBox(name: String, options: AlignVerticalDepth): typingsSlinky.babylonjs.BABYLON.Mesh = js.native
  def CreateTiledBox(name: String, options: AlignVerticalDepth, scene: Nullable[typingsSlinky.babylonjs.BABYLON.Scene]): typingsSlinky.babylonjs.BABYLON.Mesh = js.native
}
