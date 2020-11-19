package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.anon.TileHeight
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "TiledPlaneBuilder")
@js.native
class TiledPlaneBuilder ()
  extends typingsSlinky.babylonjs.babylonjsIndexMod.TiledPlaneBuilder
/* static members */
@JSImport("babylonjs/index", "TiledPlaneBuilder")
@js.native
object TiledPlaneBuilder extends js.Object {
  
  /**
    * Creates a tiled plane mesh
    * * The parameter `pattern` will, depending on value, do nothing or
    * * * flip (reflect about central vertical) alternate tiles across and up
    * * * flip every tile on alternate rows
    * * * rotate (180 degs) alternate tiles across and up
    * * * rotate every tile on alternate rows
    * * * flip and rotate alternate tiles across and up
    * * * flip and rotate every tile on alternate rows
    * * The parameter `tileSize` sets the size (float) of each tile side (default 1)
    * * You can set some different tile dimensions by using the parameters `tileWidth` and `tileHeight` (both by default have the same value of `tileSize`)
    * * If you create a double-sided mesh, you can choose what parts of the texture image to crop and stick respectively on the front and the back sides with the parameters `frontUVs` and `backUVs` (Vector4). Detail here : https://doc.babylonjs.com/babylon101/discover_basic_elements#side-orientation
    * * sideOrientation optional and takes the values : Mesh.FRONTSIDE (default), Mesh.BACKSIDE or Mesh.DOUBLESIDE
    * * frontUvs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the front side, optional, default vector4 (0, 0, 1, 1)
    * * backUVs only usable when you create a double-sided mesh, used to choose what parts of the texture image to crop and apply on the back side, optional, default vector4 (0, 0, 1, 1)
    * @see https://doc.babylonjs.com/how_to/set_shapes#box
    * @param name defines the name of the mesh
    * @param options defines the options used to create the mesh
    * @param scene defines the hosting scene
    * @returns the box mesh
    */
  def CreateTiledPlane(name: String, options: TileHeight): typingsSlinky.babylonjs.meshMod.Mesh = js.native
  def CreateTiledPlane(name: String, options: TileHeight, scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]): typingsSlinky.babylonjs.meshMod.Mesh = js.native
}
