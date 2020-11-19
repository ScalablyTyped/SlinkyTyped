package typingsSlinky.babylonjs.dracoCompressionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.babylonjs.meshVertexDataMod.VertexData
import typingsSlinky.babylonjs.sceneMod.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Meshes/Compression/dracoCompression", "DracoCompression")
@js.native
/**
  * Constructor
  * @param numWorkers The number of workers for async operations. Specify `0` to disable web workers and run synchronously in the current context.
  */
class DracoCompression () extends IDisposable {
  def this(numWorkers: Double) = this()
  
  var _decoderModulePromise: js.Any = js.native
  
  var _workerPoolPromise: js.Any = js.native
  
  /**
    * Decode Draco compressed mesh data to vertex data.
    * @param data The ArrayBuffer or ArrayBufferView for the Draco compression data
    * @param attributes A map of attributes from vertex buffer kinds to Draco unique ids
    * @returns A promise that resolves with the decoded vertex data
    */
  def decodeMeshAsync(data: js.typedarray.ArrayBuffer): js.Promise[VertexData] = js.native
  def decodeMeshAsync(data: js.typedarray.ArrayBufferView): js.Promise[VertexData] = js.native
  def decodeMeshAsync(data: js.typedarray.ArrayBufferView, attributes: StringDictionary[Double]): js.Promise[VertexData] = js.native
  def decodeMeshAsync(data: js.typedarray.ArrayBuffer, attributes: StringDictionary[Double]): js.Promise[VertexData] = js.native
  
  /**
    * Returns a promise that resolves when ready. Call this manually to ensure draco compression is ready before use.
    * @returns a promise that resolves when ready
    */
  def whenReadyAsync(): js.Promise[Unit] = js.native
}
/* static members */
@JSImport("babylonjs/Meshes/Compression/dracoCompression", "DracoCompression")
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
  def Default: DracoCompression = js.native
  
  /**
    * Default number of workers to create when creating the draco compression object.
    */
  var DefaultNumWorkers: Double = js.native
  
  var GetDefaultNumWorkers: js.Any = js.native
  
  var _Default: js.Any = js.native
}
