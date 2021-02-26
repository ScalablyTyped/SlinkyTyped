package typingsSlinky.babylonjs.indexMod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.babylonjs.HTMLCanvasElement
import typingsSlinky.babylonjs.ImageBitmap
import typingsSlinky.babylonjs.WebGLRenderingContext
import typingsSlinky.babylonjs.anon.Capture
import typingsSlinky.babylonjs.anon.CaptureConstraint
import typingsSlinky.babylonjs.fileRequestMod.IFileRequest
import typingsSlinky.babylonjs.internalTextureLoaderMod.IInternalTextureLoader
import typingsSlinky.babylonjs.iofflineproviderMod.IOfflineProvider
import typingsSlinky.babylonjs.thinEngineMod.EngineOptions
import typingsSlinky.babylonjs.typesMod.Nullable
import typingsSlinky.std.OffscreenCanvas
import typingsSlinky.std.WebGL2RenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "ThinEngine")
@js.native
class ThinEngine protected ()
  extends typingsSlinky.babylonjs.enginesIndexMod.ThinEngine {
  /**
    * Creates a new engine
    * @param canvasOrContext defines the canvas or WebGL context to use for rendering. If you provide a WebGL context, Babylon.js will not hook events on the canvas (like pointers, keyboards, etc...) so no event observables will be available. This is mostly used when Babylon.js is used as a plugin on a system which alreay used the WebGL context
    * @param antialias defines enable antialiasing (default: false)
    * @param options defines further options to be sent to the getContext() function
    * @param adaptToDeviceRatio defines whether to adapt to the device's viewport characteristics (default: false)
    */
  def this(canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ]) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Boolean
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: js.UndefOr[scala.Nothing],
    options: EngineOptions
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Boolean,
    options: EngineOptions
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    adaptToDeviceRatio: Boolean
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: js.UndefOr[scala.Nothing],
    options: EngineOptions,
    adaptToDeviceRatio: Boolean
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Boolean,
    options: js.UndefOr[scala.Nothing],
    adaptToDeviceRatio: Boolean
  ) = this()
  def this(
    canvasOrContext: Nullable[
        HTMLCanvasElement | OffscreenCanvas | WebGLRenderingContext | WebGL2RenderingContext
      ],
    antialias: Boolean,
    options: EngineOptions,
    adaptToDeviceRatio: Boolean
  ) = this()
}
/* static members */
object ThinEngine {
  
  @JSImport("babylonjs/index", "ThinEngine")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Find the next highest power of two.
    * @param x Number to start search from.
    * @return Next highest power of two.
    */
  @JSImport("babylonjs/index", "ThinEngine.CeilingPOT")
  @js.native
  def CeilingPOT(x: Double): Double = js.native
  
  /**
    * Gets or sets the epsilon value used by collision engine
    */
  @JSImport("babylonjs/index", "ThinEngine.CollisionsEpsilon")
  @js.native
  def CollisionsEpsilon: Double = js.native
  @scala.inline
  def CollisionsEpsilon_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CollisionsEpsilon")(x.asInstanceOf[js.Any])
  
  /** Use this array to turn off some WebGL2 features on known buggy browsers version */
  @JSImport("babylonjs/index", "ThinEngine.ExceptionList")
  @js.native
  def ExceptionList: js.Array[Capture | CaptureConstraint] = js.native
  @scala.inline
  def ExceptionList_=(x: js.Array[Capture | CaptureConstraint]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExceptionList")(x.asInstanceOf[js.Any])
  
  /**
    * Find the next lowest power of two.
    * @param x Number to start search from.
    * @return Next lowest power of two.
    */
  @JSImport("babylonjs/index", "ThinEngine.FloorPOT")
  @js.native
  def FloorPOT(x: Double): Double = js.native
  
  /**
    * Get the closest exponent of two
    * @param value defines the value to approximate
    * @param max defines the maximum value to return
    * @param mode defines how to define the closest value
    * @returns closest exponent of two of the given value
    */
  @JSImport("babylonjs/index", "ThinEngine.GetExponentOfTwo")
  @js.native
  def GetExponentOfTwo(value: Double, max: Double): Double = js.native
  @JSImport("babylonjs/index", "ThinEngine.GetExponentOfTwo")
  @js.native
  def GetExponentOfTwo(value: Double, max: Double, mode: Double): Double = js.native
  
  /**
    * Find the nearest power of two.
    * @param x Number to start search from.
    * @return Next nearest power of two.
    */
  @JSImport("babylonjs/index", "ThinEngine.NearestPOT")
  @js.native
  def NearestPOT(x: Double): Double = js.native
  
  /**
    * Queue a new function into the requested animation frame pool (ie. this function will be executed byt the browser for the next frame)
    * @param func - the function to be called
    * @param requester - the object that will request the next frame. Falls back to window.
    * @returns frame number
    */
  @JSImport("babylonjs/index", "ThinEngine.QueueNewFrame")
  @js.native
  def QueueNewFrame(func: js.Function0[Unit]): Double = js.native
  @JSImport("babylonjs/index", "ThinEngine.QueueNewFrame")
  @js.native
  def QueueNewFrame(func: js.Function0[Unit], requester: js.Any): Double = js.native
  
  @JSImport("babylonjs/index", "ThinEngine._ConcatenateShader")
  @js.native
  def _ConcatenateShader(source: String, defines: Nullable[String]): String = js.native
  @JSImport("babylonjs/index", "ThinEngine._ConcatenateShader")
  @js.native
  def _ConcatenateShader(source: String, defines: Nullable[String], shaderVersion: String): String = js.native
  
  /**
    * Loads a file from a url
    * @param url url to load
    * @param onSuccess callback called when the file successfully loads
    * @param onProgress callback called while file is loading (if the server supports this mode)
    * @param offlineProvider defines the offline provider for caching
    * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
    * @param onError callback called when the file fails to load
    * @returns a file request object
    * @hidden
    */
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function2[
      /* request */ js.UndefOr[typingsSlinky.babylonjs.webRequestMod.WebRequest], 
      /* exception */ js.UndefOr[typingsSlinky.babylonjs.fileToolsMod.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[typingsSlinky.babylonjs.webRequestMod.WebRequest], 
      /* exception */ js.UndefOr[typingsSlinky.babylonjs.fileToolsMod.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: IOfflineProvider
  ): IFileRequest = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function2[
      /* request */ js.UndefOr[typingsSlinky.babylonjs.webRequestMod.WebRequest], 
      /* exception */ js.UndefOr[typingsSlinky.babylonjs.fileToolsMod.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[typingsSlinky.babylonjs.webRequestMod.WebRequest], 
      /* exception */ js.UndefOr[typingsSlinky.babylonjs.fileToolsMod.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* ev */ ProgressEvent, Unit]
  ): IFileRequest = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function2[
      /* request */ js.UndefOr[typingsSlinky.babylonjs.webRequestMod.WebRequest], 
      /* exception */ js.UndefOr[typingsSlinky.babylonjs.fileToolsMod.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[typingsSlinky.babylonjs.webRequestMod.WebRequest], 
      /* exception */ js.UndefOr[typingsSlinky.babylonjs.fileToolsMod.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
    offlineProvider: IOfflineProvider
  ): IFileRequest = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function2[
      /* request */ js.UndefOr[typingsSlinky.babylonjs.webRequestMod.WebRequest], 
      /* exception */ js.UndefOr[typingsSlinky.babylonjs.fileToolsMod.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadFile")
  @js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[typingsSlinky.babylonjs.webRequestMod.WebRequest], 
      /* exception */ js.UndefOr[typingsSlinky.babylonjs.fileToolsMod.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
  
  /**
    * Loads an image as an HTMLImageElement.
    * @param input url string, ArrayBuffer, or Blob to load
    * @param onLoad callback called when the image successfully loads
    * @param onError callback called when the image fails to load
    * @param offlineProvider offline provider for caching
    * @param mimeType optional mime type
    * @returns the HTMLImageElement of the loaded image
    * @hidden
    */
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadImage")
  @js.native
  def _FileToolsLoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadImage")
  @js.native
  def _FileToolsLoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadImage")
  @js.native
  def _FileToolsLoadImage(
    input: js.typedarray.ArrayBufferView,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadImage")
  @js.native
  def _FileToolsLoadImage(
    input: js.typedarray.ArrayBufferView,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadImage")
  @js.native
  def _FileToolsLoadImage(
    input: js.typedarray.ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadImage")
  @js.native
  def _FileToolsLoadImage(
    input: js.typedarray.ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadImage")
  @js.native
  def _FileToolsLoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = js.native
  @JSImport("babylonjs/index", "ThinEngine._FileToolsLoadImage")
  @js.native
  def _FileToolsLoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = js.native
  
  @JSImport("babylonjs/index", "ThinEngine._HasMajorPerformanceCaveat")
  @js.native
  def _HasMajorPerformanceCaveat: js.Any = js.native
  @scala.inline
  def _HasMajorPerformanceCaveat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_HasMajorPerformanceCaveat")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "ThinEngine._IsSupported")
  @js.native
  def _IsSupported: js.Any = js.native
  @scala.inline
  def _IsSupported_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsSupported")(x.asInstanceOf[js.Any])
  
  /** @hidden */
  @JSImport("babylonjs/index", "ThinEngine._TextureLoaders")
  @js.native
  def _TextureLoaders: js.Array[IInternalTextureLoader] = js.native
  @scala.inline
  def _TextureLoaders_=(x: js.Array[IInternalTextureLoader]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TextureLoaders")(x.asInstanceOf[js.Any])
  
  /**
    * Gets a boolean indicating if the engine can be instanciated (ie. if a webGL context can be found)
    * @returns true if the engine can be created
    * @ignorenaming
    */
  @JSImport("babylonjs/index", "ThinEngine.isSupported")
  @js.native
  def isSupported(): Boolean = js.native
}
