package typingsSlinky.ol.helperMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostProcessesOptions extends js.Object {
  var fragmentShader: js.UndefOr[String] = js.native
  var scaleRatio: js.UndefOr[Double] = js.native
  var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.native
  var vertexShader: js.UndefOr[String] = js.native
}

object PostProcessesOptions {
  @scala.inline
  def apply(): PostProcessesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostProcessesOptions]
  }
  @scala.inline
  implicit class PostProcessesOptionsOps[Self <: PostProcessesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFragmentShader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragmentShader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragmentShader")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withUniforms(value: StringDictionary[UniformValue]): Self = {
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
    @scala.inline
    def withVertexShader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexShader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexShader")(js.undefined)
        ret
    }
  }
  
}

