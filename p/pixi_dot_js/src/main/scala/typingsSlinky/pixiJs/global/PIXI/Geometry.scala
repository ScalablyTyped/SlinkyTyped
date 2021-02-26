package typingsSlinky.pixiJs.global.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Geometry represents a model. It consists of two components:
  * - GeometryStyle - The structure of the model such as the attributes layout
  * - GeometryData - the data of the model - this consists of buffers.
  * This can include anything from positions, uvs, normals, colors etc.
  *
  * Geometry can be defined without passing in a style or data if required (thats how I prefer!)
  *
  * ```js
  * let geometry = new PIXI.Geometry();
  *
  * geometry.addAttribute('positions', [0, 0, 100, 0, 100, 100, 0, 100], 2);
  * geometry.addAttribute('uvs', [0,0,1,0,1,1,0,1],2)
  * geometry.addIndex([0,1,2,1,3,2])
  *
  * ```
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.Geometry")
@js.native
class Geometry ()
  extends typingsSlinky.pixiJs.PIXI.Geometry {
  def this(buffers: js.Array[typingsSlinky.pixiJs.PIXI.Buffer]) = this()
  def this(buffers: js.UndefOr[scala.Nothing], attributes: js.Any) = this()
  def this(buffers: js.Array[typingsSlinky.pixiJs.PIXI.Buffer], attributes: js.Any) = this()
}
object Geometry {
  
  /**
    * merges an array of geometries into a new single one
    * geometry attribute styles must match for this operation to work
    *
    * @param {PIXI.Geometry[]} geometries - array of geometries to merge
    * @returns {PIXI.Geometry} shiny new geometry!
    */
  /* static member */
  @JSGlobal("PIXI.Geometry.merge")
  @js.native
  def merge(geometries: js.Array[typingsSlinky.pixiJs.PIXI.Geometry]): typingsSlinky.pixiJs.PIXI.Geometry = js.native
}
