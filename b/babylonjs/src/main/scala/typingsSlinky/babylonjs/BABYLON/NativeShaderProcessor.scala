package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeShaderProcessor extends WebGL2ShaderProcessor {
  
  var _genericAttributeLocation: js.Any = js.native
  
  var _replacements: js.Any = js.native
  
  var _textureCount: js.Any = js.native
  
  var _uniforms: js.Any = js.native
  
  var _varyingLocationCount: js.Any = js.native
  
  var _varyingLocationMap: js.Any = js.native
  
  @JSName("attributeProcessor")
  def attributeProcessor_MNativeShaderProcessor(attribute: String): String = js.native
  
  @JSName("lineProcessor")
  def lineProcessor_MNativeShaderProcessor(line: String): String = js.native
  
  @JSName("postProcessor")
  def postProcessor_MNativeShaderProcessor(code: String, defines: js.Array[String], isFragment: Boolean): String = js.native
  
  @JSName("preProcessor")
  def preProcessor_MNativeShaderProcessor(code: String, defines: js.Array[String], isFragment: Boolean): String = js.native
  
  @JSName("uniformProcessor")
  def uniformProcessor_MNativeShaderProcessor(uniform: String): String = js.native
  
  @JSName("varyingProcessor")
  def varyingProcessor_MNativeShaderProcessor(varying: String, isFragment: Boolean): String = js.native
}
object NativeShaderProcessor {
  
  @scala.inline
  def apply(
    _genericAttributeLocation: js.Any,
    _replacements: js.Any,
    _textureCount: js.Any,
    _uniforms: js.Any,
    _varyingLocationCount: js.Any,
    _varyingLocationMap: js.Any,
    attributeProcessor: String => String,
    lineProcessor: String => String,
    postProcessor: (String, js.Array[String], Boolean) => String,
    preProcessor: (String, js.Array[String], Boolean) => String,
    uniformProcessor: String => String,
    varyingProcessor: (String, Boolean) => String
  ): NativeShaderProcessor = {
    val __obj = js.Dynamic.literal(_genericAttributeLocation = _genericAttributeLocation.asInstanceOf[js.Any], _replacements = _replacements.asInstanceOf[js.Any], _textureCount = _textureCount.asInstanceOf[js.Any], _uniforms = _uniforms.asInstanceOf[js.Any], _varyingLocationCount = _varyingLocationCount.asInstanceOf[js.Any], _varyingLocationMap = _varyingLocationMap.asInstanceOf[js.Any], attributeProcessor = js.Any.fromFunction1(attributeProcessor), lineProcessor = js.Any.fromFunction1(lineProcessor), postProcessor = js.Any.fromFunction3(postProcessor), preProcessor = js.Any.fromFunction3(preProcessor), uniformProcessor = js.Any.fromFunction1(uniformProcessor), varyingProcessor = js.Any.fromFunction2(varyingProcessor))
    __obj.asInstanceOf[NativeShaderProcessor]
  }
  
  @scala.inline
  implicit class NativeShaderProcessorOps[Self <: NativeShaderProcessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_genericAttributeLocation(value: js.Any): Self = this.set("_genericAttributeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_replacements(value: js.Any): Self = this.set("_replacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textureCount(value: js.Any): Self = this.set("_textureCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_uniforms(value: js.Any): Self = this.set("_uniforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_varyingLocationCount(value: js.Any): Self = this.set("_varyingLocationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_varyingLocationMap(value: js.Any): Self = this.set("_varyingLocationMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeProcessor(value: String => String): Self = this.set("attributeProcessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLineProcessor(value: String => String): Self = this.set("lineProcessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPostProcessor(value: (String, js.Array[String], Boolean) => String): Self = this.set("postProcessor", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPreProcessor(value: (String, js.Array[String], Boolean) => String): Self = this.set("preProcessor", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUniformProcessor(value: String => String): Self = this.set("uniformProcessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVaryingProcessor(value: (String, Boolean) => String): Self = this.set("varyingProcessor", js.Any.fromFunction2(value))
  }
}
