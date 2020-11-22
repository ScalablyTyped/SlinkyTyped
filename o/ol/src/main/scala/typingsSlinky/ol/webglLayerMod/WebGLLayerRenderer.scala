package typingsSlinky.ol.webglLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLLayerRenderer[LayerType /* <: typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default] */]
  extends typingsSlinky.ol.rendererLayerMod.default[typingsSlinky.ol.layerLayerMod.default[typingsSlinky.ol.sourceSourceMod.default]] {
  
  /**
    * Will return the last shader compilation errors. If no error happened, will return null;
    */
  def getShaderCompileErrors(): String | Null = js.native
  
  var helper: typingsSlinky.ol.helperMod.default = js.native
}
