package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<babylonjs.BABYLON.IShaderMaterialOptions> */
@js.native
trait PartialIShaderMaterialOpt extends js.Object {
  var attributes: js.UndefOr[js.Array[String]] = js.native
  var defines: js.UndefOr[js.Array[String]] = js.native
  var needAlphaBlending: js.UndefOr[Boolean] = js.native
  var needAlphaTesting: js.UndefOr[Boolean] = js.native
  var samplers: js.UndefOr[js.Array[String]] = js.native
  var uniformBuffers: js.UndefOr[js.Array[String]] = js.native
  var uniforms: js.UndefOr[js.Array[String]] = js.native
}

object PartialIShaderMaterialOpt {
  @scala.inline
  def apply(): PartialIShaderMaterialOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIShaderMaterialOpt]
  }
  @scala.inline
  implicit class PartialIShaderMaterialOptOps[Self <: PartialIShaderMaterialOpt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDefines(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defines")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedAlphaBlending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needAlphaBlending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedAlphaBlending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needAlphaBlending")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedAlphaTesting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needAlphaTesting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedAlphaTesting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needAlphaTesting")(js.undefined)
        ret
    }
    @scala.inline
    def withSamplers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamplers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samplers")(js.undefined)
        ret
    }
    @scala.inline
    def withUniformBuffers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformBuffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniformBuffers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniformBuffers")(js.undefined)
        ret
    }
    @scala.inline
    def withUniforms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(js.undefined)
        ret
    }
  }
  
}

