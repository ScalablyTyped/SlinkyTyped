package typingsSlinky.babylonjs.environmentTextureToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentTextureSpecularInfoV1 extends js.Object {
  /**
    * Defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness.
    */
  var lodGenerationScale: Double = js.native
  /**
    * This contains all the images data needed to reconstruct the cubemap.
    */
  var mipmaps: js.Array[BufferImageData] = js.native
  /**
    * Defines where the specular Payload is located. It is a runtime value only not stored in the file.
    */
  var specularDataPosition: js.UndefOr[Double] = js.native
}

object EnvironmentTextureSpecularInfoV1 {
  @scala.inline
  def apply(lodGenerationScale: Double, mipmaps: js.Array[BufferImageData]): EnvironmentTextureSpecularInfoV1 = {
    val __obj = js.Dynamic.literal(lodGenerationScale = lodGenerationScale.asInstanceOf[js.Any], mipmaps = mipmaps.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentTextureSpecularInfoV1]
  }
  @scala.inline
  implicit class EnvironmentTextureSpecularInfoV1Ops[Self <: EnvironmentTextureSpecularInfoV1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLodGenerationScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lodGenerationScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMipmaps(value: js.Array[BufferImageData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mipmaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecularDataPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specularDataPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecularDataPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specularDataPosition")(js.undefined)
        ret
    }
  }
  
}

