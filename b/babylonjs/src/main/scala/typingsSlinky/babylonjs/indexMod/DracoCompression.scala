package typingsSlinky.babylonjs.indexMod

import typingsSlinky.babylonjs.dracoCompressionMod.IDracoCompressionConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "DracoCompression")
@js.native
/**
  * Constructor
  * @param numWorkers The number of workers for async operations. Specify `0` to disable web workers and run synchronously in the current context.
  */
class DracoCompression ()
  extends typingsSlinky.babylonjs.babylonjsIndexMod.DracoCompression {
  def this(numWorkers: Double) = this()
}
/* static members */
@JSImport("babylonjs/index", "DracoCompression")
@js.native
object DracoCompression extends js.Object {
  
  /**
    * The configuration. Defaults to the following urls:
    * - wasmUrl: "https://preview.babylonjs.com/draco_wasm_wrapper_gltf.js"
    * - wasmBinaryUrl: "https://preview.babylonjs.com/draco_decoder_gltf.wasm"
    * - fallbackUrl: "https://preview.babylonjs.com/draco_decoder_gltf.js"
    */
  var Configuration: IDracoCompressionConfiguration = js.native
  
  /**
    * Returns true if the decoder configuration is available.
    */
  def DecoderAvailable: Boolean = js.native
  
  /**
    * Default instance for the draco compression object.
    */
  def Default: typingsSlinky.babylonjs.dracoCompressionMod.DracoCompression = js.native
  
  /**
    * Default number of workers to create when creating the draco compression object.
    */
  var DefaultNumWorkers: Double = js.native
  
  var GetDefaultNumWorkers: js.Any = js.native
  
  var _Default: js.Any = js.native
}
