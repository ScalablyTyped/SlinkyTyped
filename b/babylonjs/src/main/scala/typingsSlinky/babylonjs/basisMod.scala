package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.anon.Etc1
import typingsSlinky.babylonjs.anon.Levels
import typingsSlinky.babylonjs.internalTextureMod.InternalTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basisMod {
  
  @JSImport("babylonjs/Misc/basis", "BasisTools")
  @js.native
  class BasisTools () extends StObject
  /* static members */
  object BasisTools {
    
    @JSImport("babylonjs/Misc/basis", "BasisTools")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the internal format to be passed to texImage2D corresponding to the .basis format value
      * @param basisFormat format chosen from GetSupportedTranscodeFormat
      * @returns internal format corresponding to the Basis format
      */
    @JSImport("babylonjs/Misc/basis", "BasisTools.GetInternalFormatFromBasisFormat")
    @js.native
    def GetInternalFormatFromBasisFormat(basisFormat: Double): Double = js.native
    
    /**
      * URL to use when loading the basis transcoder
      */
    @JSImport("babylonjs/Misc/basis", "BasisTools.JSModuleURL")
    @js.native
    def JSModuleURL: String = js.native
    @scala.inline
    def JSModuleURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSModuleURL")(x.asInstanceOf[js.Any])
    
    /**
      * Loads a texture from the transcode result
      * @param texture texture load to
      * @param transcodeResult the result of transcoding the basis file to load from
      */
    @JSImport("babylonjs/Misc/basis", "BasisTools.LoadTextureFromTranscodeResult")
    @js.native
    def LoadTextureFromTranscodeResult(texture: InternalTexture, transcodeResult: TranscodeResult): Unit = js.native
    
    @JSImport("babylonjs/Misc/basis", "BasisTools.TranscodeAsync")
    @js.native
    def TranscodeAsync(data: js.typedarray.ArrayBufferView, config: BasisTranscodeConfiguration): js.Promise[TranscodeResult] = js.native
    /**
      * Transcodes a loaded image file to compressed pixel data
      * @param data image data to transcode
      * @param config configuration options for the transcoding
      * @returns a promise resulting in the transcoded image
      */
    @JSImport("babylonjs/Misc/basis", "BasisTools.TranscodeAsync")
    @js.native
    def TranscodeAsync(data: js.typedarray.ArrayBuffer, config: BasisTranscodeConfiguration): js.Promise[TranscodeResult] = js.native
    
    /**
      * URL to use when loading the wasm module for the transcoder
      */
    @JSImport("babylonjs/Misc/basis", "BasisTools.WasmModuleURL")
    @js.native
    def WasmModuleURL: String = js.native
    @scala.inline
    def WasmModuleURL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WasmModuleURL")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/basis", "BasisTools._CreateWorkerAsync")
    @js.native
    def _CreateWorkerAsync: js.Any = js.native
    @scala.inline
    def _CreateWorkerAsync_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CreateWorkerAsync")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/basis", "BasisTools._IgnoreSupportedFormats")
    @js.native
    def _IgnoreSupportedFormats: js.Any = js.native
    @scala.inline
    def _IgnoreSupportedFormats_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IgnoreSupportedFormats")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/basis", "BasisTools._Worker")
    @js.native
    def _Worker: js.Any = js.native
    
    @JSImport("babylonjs/Misc/basis", "BasisTools._WorkerPromise")
    @js.native
    def _WorkerPromise: js.Any = js.native
    @scala.inline
    def _WorkerPromise_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_WorkerPromise")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def _Worker_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Worker")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Misc/basis", "BasisTools._actionId")
    @js.native
    def _actionId: js.Any = js.native
    @scala.inline
    def _actionId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_actionId")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Misc/basis", "BasisTranscodeConfiguration")
  @js.native
  class BasisTranscodeConfiguration () extends StObject {
    
    /**
      * If mipmap levels should be loaded for transcoded images (Default: true)
      */
    var loadMipmapLevels: js.UndefOr[Boolean] = js.native
    
    /**
      * Index of a single image to load (Default: all images)
      */
    var loadSingleImage: js.UndefOr[Double] = js.native
    
    /**
      * Supported compression formats used to determine the supported output format of the transcoder
      */
    var supportedCompressionFormats: js.UndefOr[Etc1] = js.native
  }
  
  /**
    * Info about the .basis files
    */
  @js.native
  trait BasisFileInfo extends StObject {
    
    /**
      * If the file has alpha
      */
    var hasAlpha: Boolean = js.native
    
    /**
      * Info about each image of the basis file
      */
    var images: js.Array[Levels] = js.native
  }
  object BasisFileInfo {
    
    @scala.inline
    def apply(hasAlpha: Boolean, images: js.Array[Levels]): BasisFileInfo = {
      val __obj = js.Dynamic.literal(hasAlpha = hasAlpha.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasisFileInfo]
    }
    
    @scala.inline
    implicit class BasisFileInfoMutableBuilder[Self <: BasisFileInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasAlpha(value: Boolean): Self = StObject.set(x, "hasAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImages(value: js.Array[Levels]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesVarargs(value: Levels*): Self = StObject.set(x, "images", js.Array(value :_*))
    }
  }
  
  /**
    * Result of transcoding a basis file
    */
  @js.native
  trait TranscodeResult extends StObject {
    
    /**
      * Info about the .basis file
      */
    var fileInfo: BasisFileInfo = js.native
    
    /**
      * Format to use when loading the file
      */
    var format: Double = js.native
  }
  object TranscodeResult {
    
    @scala.inline
    def apply(fileInfo: BasisFileInfo, format: Double): TranscodeResult = {
      val __obj = js.Dynamic.literal(fileInfo = fileInfo.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[TranscodeResult]
    }
    
    @scala.inline
    implicit class TranscodeResultMutableBuilder[Self <: TranscodeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileInfo(value: BasisFileInfo): Self = StObject.set(x, "fileInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
}
