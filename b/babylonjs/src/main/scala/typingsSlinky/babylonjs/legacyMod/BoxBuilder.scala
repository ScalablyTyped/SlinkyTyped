package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.anon.BottomBaseAt
import typingsSlinky.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "BoxBuilder")
@js.native
class BoxBuilder ()
  extends typingsSlinky.babylonjs.indexMod.BoxBuilder
/* static members */
object BoxBuilder {
  
  /**
    * Creates a box mesh
    * * The parameter `size` sets the size (float) of each box side (default 1)
    * * You can set some different box dimensions by using the parameters `width`, `height` and `depth` (all by default have the same value of `size`)
    * * You can set different colors and different images to each box side by using the parameters `faceColors` (an array of 6 Color3 elements) and `faceUV` (an array of 6 Vector4 elements)
    * * Please read this tutorial : https://doc.babylonjs.com/how_to/createbox_per_face_textures_and_colors
    * * You can also set the mesh side orientation with the values : BABYLON.Mesh.FRONTSIDE (default), BABYLON.Mesh.BACKSIDE or BABYLON.Mesh.DOUBLESIDE
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
    * * The mesh can be set to updatable with the boolean parameter `updatable` (default false) if its internal geometry is supposed to change once created
    * @see https://doc.babylonjs.com/how_to/set_shapes#box
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns the box mesh
    */
  @JSImport("babylonjs/Legacy/legacy", "BoxBuilder.CreateBox")
  @js.native
  def CreateBox(name: String, options: BottomBaseAt): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  @JSImport("babylonjs/Legacy/legacy", "BoxBuilder.CreateBox")
  @js.native
  def CreateBox(name: String, options: BottomBaseAt, scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]): typingsSlinky.babylonjs.meshMod.Mesh = js.native
}
