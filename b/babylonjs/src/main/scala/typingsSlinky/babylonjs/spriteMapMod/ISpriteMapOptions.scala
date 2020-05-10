package typingsSlinky.babylonjs.spriteMapMod

import typingsSlinky.babylonjs.mathVectorMod.Vector2
import typingsSlinky.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpriteMapOptions extends js.Object {
  /**
    * number cell index of the base tile when the system compiles.
    */
  var baseTile: js.UndefOr[Double] = js.native
  /**
    * Vector3 scalar of the global RGB values of the SpriteMap.
    */
  var colorMultiply: js.UndefOr[Vector3] = js.native
  /**
    * boolean flip the sprite after its been repositioned by the framing data.
    */
  var flipU: js.UndefOr[Boolean] = js.native
  /**
    * number of layers that the system will reserve in resources.
    */
  var layerCount: js.UndefOr[Double] = js.native
  /**
    * number of max animation frames a single cell will reserve in resources.
    */
  var maxAnimationFrames: js.UndefOr[Double] = js.native
  /**
    * Vector3 of the position of the output plane in World Units.
    */
  var outputPosition: js.UndefOr[Vector3] = js.native
  /**
    * Vector3 of the rotation of the output plane.
    */
  var outputRotation: js.UndefOr[Vector3] = js.native
  /**
    * Vector2 of the size of the output plane in World Units.
    */
  var outputSize: js.UndefOr[Vector2] = js.native
  /**
    * Vector2 of the number of cells in the grid.
    */
  var stageSize: js.UndefOr[Vector2] = js.native
}

object ISpriteMapOptions {
  @scala.inline
  def apply(): ISpriteMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpriteMapOptions]
  }
  @scala.inline
  implicit class ISpriteMapOptionsOps[Self <: ISpriteMapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseTile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseTile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTile")(js.undefined)
        ret
    }
    @scala.inline
    def withColorMultiply(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMultiply")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorMultiply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorMultiply")(js.undefined)
        ret
    }
    @scala.inline
    def withFlipU(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipU")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipU: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipU")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAnimationFrames(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAnimationFrames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAnimationFrames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAnimationFrames")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputPosition(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputRotation(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputRotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputRotation")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputSize(value: Vector2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputSize")(js.undefined)
        ret
    }
    @scala.inline
    def withStageSize(value: Vector2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageSize")(js.undefined)
        ret
    }
  }
  
}

