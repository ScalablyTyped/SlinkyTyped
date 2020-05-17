package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LensFlare extends js.Object {
  var _system: js.Any = js.native
  /**
    * Define the alpha mode to render this particular lens.
    */
  var alphaMode: Double = js.native
  /**
    * Define the lens color.
    */
  var color: Color3 = js.native
  /**
    * Define the position of the lens flare in the system. (a floating value between -1 and 1). A value of 0 is located on the emitter. A value greater than 0 is beyond the emitter and a value lesser than 0 is behind.
    */
  var position: Double = js.native
  /**
    * Define the size of the lens flare in the system (a floating value between 0 and 1)
    */
  var size: Double = js.native
  /**
    * Define the lens texture.
    */
  var texture: Nullable[Texture] = js.native
  /**
    * Dispose and release the lens flare with its associated resources.
    */
  def dispose(): Unit = js.native
}

object LensFlare {
  @scala.inline
  def apply(
    _system: js.Any,
    alphaMode: Double,
    color: Color3,
    dispose: () => Unit,
    position: Double,
    size: Double
  ): LensFlare = {
    val __obj = js.Dynamic.literal(_system = _system.asInstanceOf[js.Any], alphaMode = alphaMode.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[LensFlare]
  }
  @scala.inline
  implicit class LensFlareOps[Self <: LensFlare] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_system(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_system")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlphaMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: Color3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTexture(value: Nullable[Texture]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture")(null)
        ret
    }
  }
  
}

