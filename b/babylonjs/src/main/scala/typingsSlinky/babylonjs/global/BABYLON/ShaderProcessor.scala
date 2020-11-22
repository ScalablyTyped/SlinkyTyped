package typingsSlinky.babylonjs.global.BABYLON

import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.babylonjs.BABYLON.IFileRequest
import typingsSlinky.babylonjs.BABYLON.IOfflineProvider
import typingsSlinky.babylonjs.BABYLON.ProcessingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ShaderProcessor")
@js.native
class ShaderProcessor ()
  extends typingsSlinky.babylonjs.BABYLON.ShaderProcessor
/* static members */
@JSGlobal("BABYLON.ShaderProcessor")
@js.native
object ShaderProcessor extends js.Object {
  
  def Process(
    sourceCode: String,
    options: ProcessingOptions,
    callback: js.Function1[/* migratedCode */ String, Unit],
    engine: typingsSlinky.babylonjs.BABYLON.ThinEngine
  ): Unit = js.native
  
  var _BuildExpression: js.Any = js.native
  
  var _BuildSubExpression: js.Any = js.native
  
  var _EvaluatePreProcessors: js.Any = js.native
  
  var _ExtractOperation: js.Any = js.native
  
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
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ]
  ): IFileRequest = js.native
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
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
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
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
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
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
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
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
  def _FileToolsLoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* ev */ ProgressEvent, Unit]
  ): IFileRequest = js.native
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
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
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
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
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
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
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
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.LoadFileError], 
      Unit
    ]
  ): IFileRequest = js.native
  
  var _MoveCursor: js.Any = js.native
  
  var _MoveCursorWithinIf: js.Any = js.native
  
  var _PreparePreProcessors: js.Any = js.native
  
  var _ProcessIncludes: js.Any = js.native
  
  var _ProcessPrecision: js.Any = js.native
  
  var _ProcessShaderConversion: js.Any = js.native
}
