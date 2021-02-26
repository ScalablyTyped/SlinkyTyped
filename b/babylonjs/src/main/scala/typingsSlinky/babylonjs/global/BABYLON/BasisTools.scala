package typingsSlinky.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BasisTools")
@js.native
class BasisTools ()
  extends typingsSlinky.babylonjs.BABYLON.BasisTools
/* static members */
object BasisTools {
  
  @JSGlobal("BABYLON.BasisTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the internal format to be passed to texImage2D corresponding to the .basis format value
    * @param basisFormat format chosen from GetSupportedTranscodeFormat
    * @returns internal format corresponding to the Basis format
    */
  @JSGlobal("BABYLON.BasisTools.GetInternalFormatFromBasisFormat")
  @js.native
  def GetInternalFormatFromBasisFormat(basisFormat: Double): Double = js.native
  
  /**
    * URL to use when loading the basis transcoder
    */
  @JSGlobal("BABYLON.BasisTools.JSModuleURL")
  @js.native
  def JSModuleURL: String = js.native
  @scala.inline
  def JSModuleURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSModuleURL")(x.asInstanceOf[js.Any])
  
  /**
    * Loads a texture from the transcode result
    * @param texture texture load to
    * @param transcodeResult the result of transcoding the basis file to load from
    */
  @JSGlobal("BABYLON.BasisTools.LoadTextureFromTranscodeResult")
  @js.native
  def LoadTextureFromTranscodeResult(
    texture: typingsSlinky.babylonjs.BABYLON.InternalTexture,
    transcodeResult: typingsSlinky.babylonjs.BABYLON.TranscodeResult
  ): Unit = js.native
  
  @JSGlobal("BABYLON.BasisTools.TranscodeAsync")
  @js.native
  def TranscodeAsync(
    data: js.typedarray.ArrayBufferView,
    config: typingsSlinky.babylonjs.BABYLON.BasisTranscodeConfiguration
  ): js.Promise[typingsSlinky.babylonjs.BABYLON.TranscodeResult] = js.native
  /**
    * Transcodes a loaded image file to compressed pixel data
    * @param data image data to transcode
    * @param config configuration options for the transcoding
    * @returns a promise resulting in the transcoded image
    */
  @JSGlobal("BABYLON.BasisTools.TranscodeAsync")
  @js.native
  def TranscodeAsync(
    data: js.typedarray.ArrayBuffer,
    config: typingsSlinky.babylonjs.BABYLON.BasisTranscodeConfiguration
  ): js.Promise[typingsSlinky.babylonjs.BABYLON.TranscodeResult] = js.native
  
  /**
    * URL to use when loading the wasm module for the transcoder
    */
  @JSGlobal("BABYLON.BasisTools.WasmModuleURL")
  @js.native
  def WasmModuleURL: String = js.native
  @scala.inline
  def WasmModuleURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WasmModuleURL")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.BasisTools._CreateWorkerAsync")
  @js.native
  def _CreateWorkerAsync: js.Any = js.native
  @scala.inline
  def _CreateWorkerAsync_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateWorkerAsync")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.BasisTools._IgnoreSupportedFormats")
  @js.native
  def _IgnoreSupportedFormats: js.Any = js.native
  @scala.inline
  def _IgnoreSupportedFormats_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IgnoreSupportedFormats")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.BasisTools._Worker")
  @js.native
  def _Worker: js.Any = js.native
  
  @JSGlobal("BABYLON.BasisTools._WorkerPromise")
  @js.native
  def _WorkerPromise: js.Any = js.native
  @scala.inline
  def _WorkerPromise_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_WorkerPromise")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def _Worker_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Worker")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.BasisTools._actionId")
  @js.native
  def _actionId: js.Any = js.native
  @scala.inline
  def _actionId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_actionId")(x.asInstanceOf[js.Any])
}
