package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGL2ShaderProcessor extends IShaderProcessor {
  @JSName("attributeProcessor")
  def attributeProcessor_MWebGL2ShaderProcessor(attribute: String): String = js.native
  @JSName("postProcessor")
  def postProcessor_MWebGL2ShaderProcessor(code: String, defines: js.Array[String], isFragment: Boolean): String = js.native
  @JSName("varyingProcessor")
  def varyingProcessor_MWebGL2ShaderProcessor(varying: String, isFragment: Boolean): String = js.native
}

object WebGL2ShaderProcessor {
  @scala.inline
  def apply(
    attributeProcessor: String => String,
    postProcessor: (String, js.Array[String], Boolean) => String,
    varyingProcessor: (String, Boolean) => String
  ): WebGL2ShaderProcessor = {
    val __obj = js.Dynamic.literal(attributeProcessor = js.Any.fromFunction1(attributeProcessor), postProcessor = js.Any.fromFunction3(postProcessor), varyingProcessor = js.Any.fromFunction2(varyingProcessor))
    __obj.asInstanceOf[WebGL2ShaderProcessor]
  }
  @scala.inline
  implicit class WebGL2ShaderProcessorOps[Self <: WebGL2ShaderProcessor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeProcessor(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeProcessor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPostProcessor(value: (String, js.Array[String], Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postProcessor")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withVaryingProcessor(value: (String, Boolean) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("varyingProcessor")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

