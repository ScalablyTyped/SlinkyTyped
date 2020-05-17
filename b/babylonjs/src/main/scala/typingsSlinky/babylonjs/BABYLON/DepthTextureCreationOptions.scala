package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DepthTextureCreationOptions extends js.Object {
  /** Specifies whether or not bilinear filtering is enable on the texture */
  var bilinearFiltering: js.UndefOr[Boolean] = js.native
  /** Specifies the comparison function to set on the texture. If 0 or undefined, the texture is not in comparison mode */
  var comparisonFunction: js.UndefOr[Double] = js.native
  /** Specifies whether or not a stencil should be allocated in the texture */
  var generateStencil: js.UndefOr[Boolean] = js.native
  /** Specifies if the created texture is a cube texture */
  var isCube: js.UndefOr[Boolean] = js.native
}

object DepthTextureCreationOptions {
  @scala.inline
  def apply(): DepthTextureCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DepthTextureCreationOptions]
  }
  @scala.inline
  implicit class DepthTextureCreationOptionsOps[Self <: DepthTextureCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBilinearFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bilinearFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilinearFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bilinearFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withComparisonFunction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComparisonFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comparisonFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateStencil(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateStencil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerateStencil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateStencil")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCube(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCube")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCube: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCube")(js.undefined)
        ret
    }
  }
  
}

