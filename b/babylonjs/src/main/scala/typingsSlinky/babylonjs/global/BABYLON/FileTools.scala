package typingsSlinky.babylonjs.global.BABYLON

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.babylonjs.BABYLON.IFileRequest
import typingsSlinky.babylonjs.BABYLON.IOfflineProvider
import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.ImageBitmap
import typingsSlinky.babylonjs.anon.CrossOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.FileTools")
@js.native
class FileTools ()
  extends typingsSlinky.babylonjs.BABYLON.FileTools
/* static members */
@JSGlobal("BABYLON.FileTools")
@js.native
object FileTools extends js.Object {
  
  /**
    * Gets or sets the base URL to use to load assets
    */
  var BaseUrl: String = js.native
  
  /**
    * Default behaviour for cors in the application.
    * It can be a string if the expected behavior is identical in the entire app.
    * Or a callback to be able to set it per url or on a group of them (in case of Video source for instance)
    */
  var CorsBehavior: String | (js.Function1[/* url */ String | js.Array[String], String]) = js.native
  
  /**
    * Gets or sets the retry strategy to apply when an error happens while loading an asset
    */
  def DefaultRetryStrategy(url: String, request: typingsSlinky.babylonjs.BABYLON.WebRequest, retryIndex: Double): Double = js.native
  
  /**
    * Checks if the loaded document was accessed via `file:`-Protocol.
    * @returns boolean
    */
  def IsFileURL(): Boolean = js.native
  
  /**
    * Loads a file from a url
    * @param url url to load
    * @param onSuccess callback called when the file successfully loads
    * @param onProgress callback called while file is loading (if the server supports this mode)
    * @param offlineProvider defines the offline provider for caching
    * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
    * @param onError callback called when the file fails to load
    * @returns a file request object
    */
  def LoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ]
  ): IFileRequest = js.native
  def LoadFile(
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
  def LoadFile(
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
  def LoadFile(
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
  def LoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: IOfflineProvider
  ): IFileRequest = js.native
  def LoadFile(
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
  def LoadFile(
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
  def LoadFile(
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
  def LoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* ev */ ProgressEvent, Unit]
  ): IFileRequest = js.native
  def LoadFile(
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
  def LoadFile(
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
  def LoadFile(
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
  def LoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* ev */ ProgressEvent, Unit],
    offlineProvider: IOfflineProvider
  ): IFileRequest = js.native
  def LoadFile(
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
  def LoadFile(
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
  def LoadFile(
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
  
  /**
    * Loads an image as an HTMLImageElement.
    * @param input url string, ArrayBuffer, or Blob to load
    * @param onLoad callback called when the image successfully loads
    * @param onError callback called when the image fails to load
    * @param offlineProvider offline provider for caching
    * @param mimeType optional mime type
    * @returns the HTMLImageElement of the loaded image
    */
  def LoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = js.native
  def LoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = js.native
  def LoadImage(
    input: js.typedarray.ArrayBufferView,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = js.native
  def LoadImage(
    input: js.typedarray.ArrayBufferView,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = js.native
  def LoadImage(
    input: js.typedarray.ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = js.native
  def LoadImage(
    input: js.typedarray.ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = js.native
  def LoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = js.native
  def LoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = js.native
  
  /**
    * Gets or sets a function used to pre-process url before using them to load assets
    */
  def PreprocessUrl(url: String): String = js.native
  
  /**
    * Reads a file from a File object
    * @param file defines the file to load
    * @param onSuccess defines the callback to call when data is loaded
    * @param onProgress defines the callback to call during loading process
    * @param useArrayBuffer defines a boolean indicating that data must be returned as an ArrayBuffer
    * @param onError defines the callback to call when an error occurs
    * @returns a file request object
    */
  def ReadFile(file: File, onSuccess: js.Function1[/* data */ js.Any, Unit]): IFileRequest = js.native
  def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.UndefOr[scala.Nothing],
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.ReadFileError, Unit]
  ): IFileRequest = js.native
  def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.ReadFileError, Unit]
  ): IFileRequest = js.native
  def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent, _]
  ): IFileRequest = js.native
  def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent, _],
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.ReadFileError, Unit]
  ): IFileRequest = js.native
  def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent, _],
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent, _],
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.ReadFileError, Unit]
  ): IFileRequest = js.native
  
  /**
    * Loads a file
    * @param url url to load
    * @param onSuccess callback called when the file successfully loads
    * @param onProgress callback called while file is loading (if the server supports this mode)
    * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
    * @param onError callback called when the file fails to load
    * @param onOpened callback called when the web request is opened
    * @returns a file request object
    */
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    onOpened: js.Function1[/* request */ typingsSlinky.babylonjs.BABYLON.WebRequest, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.RequestFileError, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.RequestFileError, Unit],
    onOpened: js.Function1[/* request */ typingsSlinky.babylonjs.BABYLON.WebRequest, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean,
    onError: js.UndefOr[scala.Nothing],
    onOpened: js.Function1[/* request */ typingsSlinky.babylonjs.BABYLON.WebRequest, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.RequestFileError, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.RequestFileError, Unit],
    onOpened: js.Function1[/* request */ typingsSlinky.babylonjs.BABYLON.WebRequest, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: IOfflineProvider
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    onOpened: js.Function1[/* request */ typingsSlinky.babylonjs.BABYLON.WebRequest, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.RequestFileError, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.RequestFileError, Unit],
    onOpened: js.Function1[/* request */ typingsSlinky.babylonjs.BABYLON.WebRequest, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.UndefOr[scala.Nothing],
    onOpened: js.Function1[/* request */ typingsSlinky.babylonjs.BABYLON.WebRequest, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.RequestFileError, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.UndefOr[scala.Nothing],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.RequestFileError, Unit],
    onOpened: js.Function1[/* request */ typingsSlinky.babylonjs.BABYLON.WebRequest, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    onOpened: js.Function1[/* request */ typingsSlinky.babylonjs.BABYLON.WebRequest, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.RequestFileError, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.RequestFileError, Unit],
    onOpened: js.Function1[/* request */ typingsSlinky.babylonjs.BABYLON.WebRequest, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean,
    onError: js.UndefOr[scala.Nothing],
    onOpened: js.Function1[/* request */ typingsSlinky.babylonjs.BABYLON.WebRequest, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.RequestFileError, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.RequestFileError, Unit],
    onOpened: js.Function1[/* request */ typingsSlinky.babylonjs.BABYLON.WebRequest, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    offlineProvider: IOfflineProvider
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.UndefOr[scala.Nothing],
    onOpened: js.Function1[/* request */ typingsSlinky.babylonjs.BABYLON.WebRequest, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.RequestFileError, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.RequestFileError, Unit],
    onOpened: js.Function1[/* request */ typingsSlinky.babylonjs.BABYLON.WebRequest, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.UndefOr[scala.Nothing],
    onOpened: js.Function1[/* request */ typingsSlinky.babylonjs.BABYLON.WebRequest, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.RequestFileError, Unit]
  ): IFileRequest = js.native
  def RequestFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      Unit
    ],
    onProgress: js.Function1[/* event */ ProgressEvent, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.RequestFileError, Unit],
    onOpened: js.Function1[/* request */ typingsSlinky.babylonjs.BABYLON.WebRequest, Unit]
  ): IFileRequest = js.native
  
  /**
    * Sets the cors behavior on a dom element. This will add the required Tools.CorsBehavior to the element.
    * @param url define the url we are trying
    * @param element define the dom element where to configure the cors policy
    */
  def SetCorsBehavior(url: String, element: CrossOrigin): Unit = js.native
  def SetCorsBehavior(url: js.Array[String], element: CrossOrigin): Unit = js.native
  
  /**
    * Removes unwanted characters from an url
    * @param url defines the url to clean
    * @returns the cleaned url
    */
  var _CleanUrl: js.Any = js.native
}
