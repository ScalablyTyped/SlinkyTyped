package typingsSlinky.pixiJs.mod.resources

import typingsSlinky.pixiJs.anon.HeightWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Buffer resource with data of typed array.
  * @class
  * @extends PIXI.resources.Resource
  * @memberof PIXI.resources
  */
@JSImport("pixi.js", "resources.BufferResource")
@js.native
class BufferResource protected ()
  extends typingsSlinky.pixiJs.PIXI.resources.BufferResource {
  def this(source: js.typedarray.Float32Array, options: HeightWidth) = this()
  def this(source: js.typedarray.Uint32Array, options: HeightWidth) = this()
  def this(source: js.typedarray.Uint8Array, options: HeightWidth) = this()
}

/* static members */
@JSImport("pixi.js", "resources.BufferResource")
@js.native
object BufferResource extends js.Object {
  /**
    * Used to auto-detect the type of resource.
    *
    * @static
    * @param {*} source - The source object
    * @return {boolean} `true` if <canvas>
    */
  def test(source: js.Any): Boolean = js.native
}

