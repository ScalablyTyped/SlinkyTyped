package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Font
  * @classdesc Represents the resource of a font asset.
  * @param {pc.Texture[]} textures - The font textures.
  * @param {object} data - The font data.
  * @property {number} intensity The font intensity.
  * @property {pc.Texture[]} textures The font textures.
  */
@js.native
trait Font extends js.Object {
  /**
    * The font intensity.
    */
  var intensity: Double = js.native
  /**
    * The font textures.
    */
  var textures: js.Array[Texture] = js.native
}

object Font {
  @scala.inline
  def apply(intensity: Double, textures: js.Array[Texture]): Font = {
    val __obj = js.Dynamic.literal(intensity = intensity.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  @scala.inline
  implicit class FontOps[Self <: Font] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextures(value: js.Array[Texture]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textures")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

