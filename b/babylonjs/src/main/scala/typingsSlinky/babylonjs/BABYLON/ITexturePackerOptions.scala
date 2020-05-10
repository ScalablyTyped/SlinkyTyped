package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITexturePackerOptions extends js.Object {
  /**
    * number of columns if using custom column count layout(2).  This defaults to 4.
    */
  var colnum: js.UndefOr[Double] = js.native
  /**
    * string value representing the context fill style color.  Defaults to 'black'.
    */
  var customFillColor: js.UndefOr[String] = js.native
  /**
    * boolean flag to dispose all the source textures.  Defaults to true.
    */
  var disposeSources: js.UndefOr[Boolean] = js.native
  /**
    * Fills the blank cells in a set to the customFillColor.  Defaults to true.
    */
  var fillBlanks: js.UndefOr[Boolean] = js.native
  /**
    * Width and Height Value of each Frame in the TexturePacker Sets
    */
  var frameSize: js.UndefOr[Double] = js.native
  /**
    * number representing the layout style. Defaults to LAYOUT_STRIP
    */
  var layout: js.UndefOr[Double] = js.native
  /**
    * Custom targets for the channels of a texture packer.  Default is all the channels of the Standard Material
    */
  var map: js.UndefOr[js.Array[String]] = js.native
  /**
    * If in SUBUV_COLOR padding mode what color to use.
    */
  var paddingColor: js.UndefOr[Color3 | Color4] = js.native
  /**
    * Number that declares the fill method for the padding gutter.
    */
  var paddingMode: js.UndefOr[Double] = js.native
  /**
    * Ratio of the value to add padding wise to each cell.  Defaults to 0.0115
    */
  var paddingRatio: js.UndefOr[Double] = js.native
  /**
    * flag to update the input meshes to the new packed texture after compilation. Defaults to true.
    */
  var updateInputMeshes: js.UndefOr[Boolean] = js.native
  /**
    * the UV input targets, as a single value for all meshes. Defaults to VertexBuffer.UVKind
    */
  var uvsIn: js.UndefOr[String] = js.native
  /**
    * the UV output targets, as a single value for all meshes.  Defaults to VertexBuffer.UVKind
    */
  var uvsOut: js.UndefOr[String] = js.native
}

object ITexturePackerOptions {
  @scala.inline
  def apply(): ITexturePackerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITexturePackerOptions]
  }
  @scala.inline
  implicit class ITexturePackerOptionsOps[Self <: ITexturePackerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColnum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colnum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColnum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colnum")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDisposeSources(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposeSources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisposeSources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposeSources")(js.undefined)
        ret
    }
    @scala.inline
    def withFillBlanks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillBlanks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillBlanks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillBlanks")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingColor(value: Color3 | Color4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withPaddingRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateInputMeshes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInputMeshes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateInputMeshes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateInputMeshes")(js.undefined)
        ret
    }
    @scala.inline
    def withUvsIn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvsIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUvsIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvsIn")(js.undefined)
        ret
    }
    @scala.inline
    def withUvsOut(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvsOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUvsOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvsOut")(js.undefined)
        ret
    }
  }
  
}

