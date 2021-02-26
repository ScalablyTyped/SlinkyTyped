package typingsSlinky.babylonjs.global.BABYLON

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.babylonjs.BABYLON.IColor4Like
import typingsSlinky.babylonjs.BABYLON.IFileRequest
import typingsSlinky.babylonjs.BABYLON.IOfflineProvider
import typingsSlinky.babylonjs.BABYLON.IScreenshotSize
import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.HTMLCanvasElement
import typingsSlinky.babylonjs.ImageBitmap
import typingsSlinky.babylonjs.Window
import typingsSlinky.babylonjs.anon.CrossOrigin
import typingsSlinky.babylonjs.anon.HandlerName
import typingsSlinky.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Tools")
@js.native
class Tools ()
  extends typingsSlinky.babylonjs.BABYLON.Tools
/* static members */
object Tools {
  
  @JSGlobal("BABYLON.Tools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * All logs
    */
  @JSGlobal("BABYLON.Tools.AllLogLevel")
  @js.native
  val AllLogLevel: Double = js.native
  
  /**
    * Will return the right value of the noPreventDefault variable
    * Needed to keep backwards compatibility to the old API.
    *
    * @param args arguments passed to the attachControl function
    * @returns the correct value for noPreventDefault
    */
  @JSGlobal("BABYLON.Tools.BackCompatCameraNoPreventDefault")
  @js.native
  def BackCompatCameraNoPreventDefault(args: IArguments): Boolean = js.native
  
  /**
    * Removes unwanted characters from an url
    * @param url defines the url to clean
    * @returns the cleaned url
    */
  @JSGlobal("BABYLON.Tools.CleanUrl")
  @js.native
  def CleanUrl(url: String): String = js.native
  
  /**
    * Clears the log cache
    */
  @JSGlobal("BABYLON.Tools.ClearLogCache")
  @js.native
  def ClearLogCache(): Unit = js.native
  
  @JSGlobal("BABYLON.Tools.CreateScreenshot")
  @js.native
  def CreateScreenshot(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double
  ): Unit = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshot")
  @js.native
  def CreateScreenshot(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double,
    successCallback: js.UndefOr[scala.Nothing],
    mimeType: String
  ): Unit = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshot")
  @js.native
  def CreateScreenshot(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double,
    successCallback: js.Function1[/* data */ String, Unit]
  ): Unit = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshot")
  @js.native
  def CreateScreenshot(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String
  ): Unit = js.native
  /**
    * Captures a screenshot of the current rendering
    * @see https://doc.babylonjs.com/how_to/render_scene_on_a_png
    * @param engine defines the rendering engine
    * @param camera defines the source camera
    * @param size This parameter can be set to a single number or to an object with the
    * following (optional) properties: precision, width, height. If a single number is passed,
    * it will be used for both width and height. If an object is passed, the screenshot size
    * will be derived from the parameters. The precision property is a multiplier allowing
    * rendering at a higher or lower resolution
    * @param successCallback defines the callback receives a single parameter which contains the
    * screenshot as a string of base64-encoded characters. This string can be assigned to the
    * src parameter of an <img> to display it
    * @param mimeType defines the MIME type of the screenshot image (default: image/png).
    * Check your browser for supported MIME types
    */
  @JSGlobal("BABYLON.Tools.CreateScreenshot")
  @js.native
  def CreateScreenshot(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize
  ): Unit = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshot")
  @js.native
  def CreateScreenshot(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    successCallback: js.UndefOr[scala.Nothing],
    mimeType: String
  ): Unit = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshot")
  @js.native
  def CreateScreenshot(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    successCallback: js.Function1[/* data */ String, Unit]
  ): Unit = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshot")
  @js.native
  def CreateScreenshot(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String
  ): Unit = js.native
  
  @JSGlobal("BABYLON.Tools.CreateScreenshotAsync")
  @js.native
  def CreateScreenshotAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotAsync")
  @js.native
  def CreateScreenshotAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: String
  ): js.Promise[String] = js.native
  /**
    * Captures a screenshot of the current rendering
    * @see https://doc.babylonjs.com/how_to/render_scene_on_a_png
    * @param engine defines the rendering engine
    * @param camera defines the source camera
    * @param size This parameter can be set to a single number or to an object with the
    * following (optional) properties: precision, width, height. If a single number is passed,
    * it will be used for both width and height. If an object is passed, the screenshot size
    * will be derived from the parameters. The precision property is a multiplier allowing
    * rendering at a higher or lower resolution
    * @param mimeType defines the MIME type of the screenshot image (default: image/png).
    * Check your browser for supported MIME types
    * @returns screenshot as a string of base64-encoded characters. This string can be assigned
    * to the src parameter of an <img> to display it
    */
  @JSGlobal("BABYLON.Tools.CreateScreenshotAsync")
  @js.native
  def CreateScreenshotAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotAsync")
  @js.native
  def CreateScreenshotAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: String
  ): js.Promise[String] = js.native
  
  /**
    * Generates an image screenshot from the specified camera.
    * @see https://doc.babylonjs.com/how_to/render_scene_on_a_png
    * @param engine The engine to use for rendering
    * @param camera The camera to use for rendering
    * @param size This parameter can be set to a single number or to an object with the
    * following (optional) properties: precision, width, height. If a single number is passed,
    * it will be used for both width and height. If an object is passed, the screenshot size
    * will be derived from the parameters. The precision property is a multiplier allowing
    * rendering at a higher or lower resolution
    * @param successCallback The callback receives a single parameter which contains the
    * screenshot as a string of base64-encoded characters. This string can be assigned to the
    * src parameter of an <img> to display it
    * @param mimeType The MIME type of the screenshot image (default: image/png).
    * Check your browser for supported MIME types
    * @param samples Texture samples (default: 1)
    * @param antialiasing Whether antialiasing should be turned on or not (default: false)
    * @param fileName A name for for the downloaded file.
    */
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTarget")
  @js.native
  def CreateScreenshotUsingRenderTarget(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize | Double,
    successCallback: js.UndefOr[js.Function1[/* data */ String, Unit]],
    mimeType: js.UndefOr[String],
    samples: js.UndefOr[Double],
    antialiasing: js.UndefOr[Boolean],
    fileName: js.UndefOr[String]
  ): Unit = js.native
  
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: js.UndefOr[scala.Nothing],
    samples: js.UndefOr[scala.Nothing],
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: String
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: js.UndefOr[scala.Nothing],
    samples: js.UndefOr[scala.Nothing],
    antialiasing: Boolean
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: js.UndefOr[scala.Nothing],
    samples: js.UndefOr[scala.Nothing],
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: js.UndefOr[scala.Nothing],
    samples: Double
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: js.UndefOr[scala.Nothing],
    samples: Double,
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: String
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: js.UndefOr[scala.Nothing],
    samples: Double,
    antialiasing: Boolean
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: js.UndefOr[scala.Nothing],
    samples: Double,
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: String
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: String,
    samples: js.UndefOr[scala.Nothing],
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: String
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: String,
    samples: js.UndefOr[scala.Nothing],
    antialiasing: Boolean
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: String,
    samples: js.UndefOr[scala.Nothing],
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: String,
    samples: Double
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: String,
    samples: Double,
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: String
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: String,
    samples: Double,
    antialiasing: Boolean
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: Double,
    mimeType: String,
    samples: Double,
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = js.native
  /**
    * Generates an image screenshot from the specified camera.
    * @see https://doc.babylonjs.com/how_to/render_scene_on_a_png
    * @param engine The engine to use for rendering
    * @param camera The camera to use for rendering
    * @param size This parameter can be set to a single number or to an object with the
    * following (optional) properties: precision, width, height. If a single number is passed,
    * it will be used for both width and height. If an object is passed, the screenshot size
    * will be derived from the parameters. The precision property is a multiplier allowing
    * rendering at a higher or lower resolution
    * @param mimeType The MIME type of the screenshot image (default: image/png).
    * Check your browser for supported MIME types
    * @param samples Texture samples (default: 1)
    * @param antialiasing Whether antialiasing should be turned on or not (default: false)
    * @param fileName A name for for the downloaded file.
    * @returns screenshot as a string of base64-encoded characters. This string can be assigned
    * to the src parameter of an <img> to display it
    */
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: js.UndefOr[scala.Nothing],
    samples: js.UndefOr[scala.Nothing],
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: String
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: js.UndefOr[scala.Nothing],
    samples: js.UndefOr[scala.Nothing],
    antialiasing: Boolean
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: js.UndefOr[scala.Nothing],
    samples: js.UndefOr[scala.Nothing],
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: js.UndefOr[scala.Nothing],
    samples: Double
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: js.UndefOr[scala.Nothing],
    samples: Double,
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: String
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: js.UndefOr[scala.Nothing],
    samples: Double,
    antialiasing: Boolean
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: js.UndefOr[scala.Nothing],
    samples: Double,
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: String
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: String,
    samples: js.UndefOr[scala.Nothing],
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: String
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: String,
    samples: js.UndefOr[scala.Nothing],
    antialiasing: Boolean
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: String,
    samples: js.UndefOr[scala.Nothing],
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: String,
    samples: Double
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: String,
    samples: Double,
    antialiasing: js.UndefOr[scala.Nothing],
    fileName: String
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: String,
    samples: Double,
    antialiasing: Boolean
  ): js.Promise[String] = js.native
  @JSGlobal("BABYLON.Tools.CreateScreenshotUsingRenderTargetAsync")
  @js.native
  def CreateScreenshotUsingRenderTargetAsync(
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    camera: typingsSlinky.babylonjs.BABYLON.Camera,
    size: IScreenshotSize,
    mimeType: String,
    samples: Double,
    antialiasing: Boolean,
    fileName: String
  ): js.Promise[String] = js.native
  
  /**
    * Custom HTTP Request Headers to be sent with XMLHttpRequests
    * i.e. when loading files, where the server/service expects an Authorization header
    */
  @JSGlobal("BABYLON.Tools.CustomRequestHeaders")
  @js.native
  def CustomRequestHeaders: org.scalablytyped.runtime.StringDictionary[String] = js.native
  @scala.inline
  def CustomRequestHeaders_=(x: org.scalablytyped.runtime.StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CustomRequestHeaders")(x.asInstanceOf[js.Any])
  
  /**
    * Decode the given base64 uri.
    * @param uri The uri to decode
    * @return The decoded base64 data.
    */
  @JSGlobal("BABYLON.Tools.DecodeBase64")
  @js.native
  def DecodeBase64(uri: String): js.typedarray.ArrayBuffer = js.native
  
  /**
    * Tries to copy an object by duplicating every property
    * @param source defines the source object
    * @param destination defines the target object
    * @param doNotCopyList defines a list of properties to avoid
    * @param mustCopyList defines a list of properties to copy (even if they start with _)
    */
  @JSGlobal("BABYLON.Tools.DeepCopy")
  @js.native
  def DeepCopy(source: js.Any, destination: js.Any): Unit = js.native
  @JSGlobal("BABYLON.Tools.DeepCopy")
  @js.native
  def DeepCopy(
    source: js.Any,
    destination: js.Any,
    doNotCopyList: js.UndefOr[scala.Nothing],
    mustCopyList: js.Array[String]
  ): Unit = js.native
  @JSGlobal("BABYLON.Tools.DeepCopy")
  @js.native
  def DeepCopy(source: js.Any, destination: js.Any, doNotCopyList: js.Array[String]): Unit = js.native
  @JSGlobal("BABYLON.Tools.DeepCopy")
  @js.native
  def DeepCopy(
    source: js.Any,
    destination: js.Any,
    doNotCopyList: js.Array[String],
    mustCopyList: js.Array[String]
  ): Unit = js.native
  
  /**
    * Returns a promise that resolves after the given amount of time.
    * @param delay Number of milliseconds to delay
    * @returns Promise that resolves after the given amount of time
    */
  @JSGlobal("BABYLON.Tools.DelayAsync")
  @js.native
  def DelayAsync(delay: Double): js.Promise[Unit] = js.native
  
  /**
    * Downloads a blob in the browser
    * @param blob defines the blob to download
    * @param fileName defines the name of the downloaded file
    */
  @JSGlobal("BABYLON.Tools.Download")
  @js.native
  def Download(blob: Blob, fileName: String): Unit = js.native
  
  /**
    * Dumps the current bound framebuffer
    * @param width defines the rendering width
    * @param height defines the rendering height
    * @param engine defines the hosting engine
    * @param successCallback defines the callback triggered once the data are available
    * @param mimeType defines the mime type of the result
    * @param fileName defines the filename to download. If present, the result will automatically be downloaded
    */
  @JSGlobal("BABYLON.Tools.DumpFramebuffer")
  @js.native
  def DumpFramebuffer(width: Double, height: Double, engine: typingsSlinky.babylonjs.BABYLON.Engine): Unit = js.native
  @JSGlobal("BABYLON.Tools.DumpFramebuffer")
  @js.native
  def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    successCallback: js.UndefOr[scala.Nothing],
    mimeType: js.UndefOr[scala.Nothing],
    fileName: String
  ): Unit = js.native
  @JSGlobal("BABYLON.Tools.DumpFramebuffer")
  @js.native
  def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    successCallback: js.UndefOr[scala.Nothing],
    mimeType: String
  ): Unit = js.native
  @JSGlobal("BABYLON.Tools.DumpFramebuffer")
  @js.native
  def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    successCallback: js.UndefOr[scala.Nothing],
    mimeType: String,
    fileName: String
  ): Unit = js.native
  @JSGlobal("BABYLON.Tools.DumpFramebuffer")
  @js.native
  def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    successCallback: js.Function1[/* data */ String, Unit]
  ): Unit = js.native
  @JSGlobal("BABYLON.Tools.DumpFramebuffer")
  @js.native
  def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: js.UndefOr[scala.Nothing],
    fileName: String
  ): Unit = js.native
  @JSGlobal("BABYLON.Tools.DumpFramebuffer")
  @js.native
  def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String
  ): Unit = js.native
  @JSGlobal("BABYLON.Tools.DumpFramebuffer")
  @js.native
  def DumpFramebuffer(
    width: Double,
    height: Double,
    engine: typingsSlinky.babylonjs.BABYLON.Engine,
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: String,
    fileName: String
  ): Unit = js.native
  
  /**
    * Encodes the canvas data to base 64 or automatically download the result if filename is defined
    * @param successCallback defines the callback triggered once the data are available
    * @param mimeType defines the mime type of the result
    * @param fileName defines he filename to download. If present, the result will automatically be downloaded
    */
  @JSGlobal("BABYLON.Tools.EncodeScreenshotCanvasData")
  @js.native
  def EncodeScreenshotCanvasData(): Unit = js.native
  @JSGlobal("BABYLON.Tools.EncodeScreenshotCanvasData")
  @js.native
  def EncodeScreenshotCanvasData(successCallback: js.UndefOr[scala.Nothing], mimeType: js.UndefOr[scala.Nothing], fileName: String): Unit = js.native
  @JSGlobal("BABYLON.Tools.EncodeScreenshotCanvasData")
  @js.native
  def EncodeScreenshotCanvasData(successCallback: js.UndefOr[scala.Nothing], mimeType: String): Unit = js.native
  @JSGlobal("BABYLON.Tools.EncodeScreenshotCanvasData")
  @js.native
  def EncodeScreenshotCanvasData(successCallback: js.UndefOr[scala.Nothing], mimeType: String, fileName: String): Unit = js.native
  @JSGlobal("BABYLON.Tools.EncodeScreenshotCanvasData")
  @js.native
  def EncodeScreenshotCanvasData(successCallback: js.Function1[/* data */ String, Unit]): Unit = js.native
  @JSGlobal("BABYLON.Tools.EncodeScreenshotCanvasData")
  @js.native
  def EncodeScreenshotCanvasData(
    successCallback: js.Function1[/* data */ String, Unit],
    mimeType: js.UndefOr[scala.Nothing],
    fileName: String
  ): Unit = js.native
  @JSGlobal("BABYLON.Tools.EncodeScreenshotCanvasData")
  @js.native
  def EncodeScreenshotCanvasData(successCallback: js.Function1[/* data */ String, Unit], mimeType: String): Unit = js.native
  @JSGlobal("BABYLON.Tools.EncodeScreenshotCanvasData")
  @js.native
  def EncodeScreenshotCanvasData(successCallback: js.Function1[/* data */ String, Unit], mimeType: String, fileName: String): Unit = js.native
  
  /**
    * Ends a specific performance coutner
    */
  @JSGlobal("BABYLON.Tools.EndPerformanceCounter")
  @js.native
  def EndPerformanceCounter(counterName: String): Unit = js.native
  @JSGlobal("BABYLON.Tools.EndPerformanceCounter")
  @js.native
  def EndPerformanceCounter(counterName: String, condition: Boolean): Unit = js.native
  
  /**
    * Write an error message to the console
    * @param message defines the message to log
    */
  @JSGlobal("BABYLON.Tools.Error")
  @js.native
  def Error(message: String): Unit = js.native
  
  /**
    * Only error logs
    */
  @JSGlobal("BABYLON.Tools.ErrorLogLevel")
  @js.native
  val ErrorLogLevel: Double = js.native
  
  /**
    * Read the content of a byte array at a specified coordinates (taking in account wrapping)
    * @param u defines the coordinate on X axis
    * @param v defines the coordinate on Y axis
    * @param width defines the width of the source data
    * @param height defines the height of the source data
    * @param pixels defines the source byte array
    * @param color defines the output color
    */
  @JSGlobal("BABYLON.Tools.FetchToRef")
  @js.native
  def FetchToRef(
    u: Double,
    v: Double,
    width: Double,
    height: Double,
    pixels: js.typedarray.Uint8Array,
    color: IColor4Like
  ): Unit = js.native
  
  /**
    * Creates a data url from a given string content
    * @param content defines the content to convert
    * @returns the new data url link
    */
  @JSGlobal("BABYLON.Tools.FileAsURL")
  @js.native
  def FileAsURL(content: String): String = js.native
  
  /**
    * Gets the first element of an array satisfying a given predicate
    * @param array defines the array to browse
    * @param predicate defines the predicate to use
    * @returns null if not found or the element
    */
  @JSGlobal("BABYLON.Tools.First")
  @js.native
  def First[T](array: js.Array[T], predicate: js.Function1[/* item */ T, Boolean]): Nullable[T] = js.native
  
  /**
    * Returns the nearest 32-bit single precision float representation of a Number
    * @param value A Number.  If the parameter is of a different type, it will get converted
    * to a number or to NaN if it cannot be converted
    * @returns number
    */
  @JSGlobal("BABYLON.Tools.FloatRound")
  @js.native
  def FloatRound(value: Double): Double = js.native
  
  /**
    * Format the given number to a specific decimal format
    * @param value defines the number to format
    * @param decimals defines the number of decimals to use
    * @returns the formatted string
    */
  @JSGlobal("BABYLON.Tools.Format")
  @js.native
  def Format(value: Double): String = js.native
  @JSGlobal("BABYLON.Tools.Format")
  @js.native
  def Format(value: Double, decimals: Double): String = js.native
  
  /**
    * Gets the absolute url.
    * @param url the input url
    * @return the absolute url
    */
  @JSGlobal("BABYLON.Tools.GetAbsoluteUrl")
  @js.native
  def GetAbsoluteUrl(url: String): String = js.native
  
  /**
    * This method will return the name of the class used to create the instance of the given object.
    * It will works only on Javascript basic data types (number, string, ...) and instance of class declared with the @className decorator.
    * @param object the object to get the class name from
    * @param isType defines if the object is actually a type
    * @returns the name of the class, will be "object" for a custom data type not using the @className decorator
    */
  @JSGlobal("BABYLON.Tools.GetClassName")
  @js.native
  def GetClassName(`object`: js.Any): String = js.native
  @JSGlobal("BABYLON.Tools.GetClassName")
  @js.native
  def GetClassName(`object`: js.Any, isType: Boolean): String = js.native
  
  /**
    * Extracts text content from a DOM element hierarchy
    * Back Compat only, please use DomManagement.GetDOMTextContent instead.
    */
  @JSGlobal("BABYLON.Tools.GetDOMTextContent")
  @js.native
  def GetDOMTextContent: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DomManagement.GetDOMTextContent */ js.Any = js.native
  @scala.inline
  def GetDOMTextContent_=(
    x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DomManagement.GetDOMTextContent */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GetDOMTextContent")(x.asInstanceOf[js.Any])
  
  /**
    * Extracts the filename from a path
    * @param path defines the path to use
    * @returns the filename
    */
  @JSGlobal("BABYLON.Tools.GetFilename")
  @js.native
  def GetFilename(path: String): String = js.native
  
  /**
    * Extracts the "folder" part of a path (everything before the filename).
    * @param uri The URI to extract the info from
    * @param returnUnchangedIfNoSlash Do not touch the URI if no slashes are present
    * @returns The "folder" part of the path
    */
  @JSGlobal("BABYLON.Tools.GetFolderPath")
  @js.native
  def GetFolderPath(uri: String): String = js.native
  @JSGlobal("BABYLON.Tools.GetFolderPath")
  @js.native
  def GetFolderPath(uri: String, returnUnchangedIfNoSlash: Boolean): String = js.native
  
  /**
    * Gets the pointer prefix to use
    * @param engine defines the engine we are finding the prefix for
    * @returns "pointer" if touch is enabled. Else returns "mouse"
    */
  @JSGlobal("BABYLON.Tools.GetPointerPrefix")
  @js.native
  def GetPointerPrefix(engine: typingsSlinky.babylonjs.BABYLON.Engine): String = js.native
  
  /**
    * Tries to instantiate a new object from a given class name
    * @param className defines the class name to instantiate
    * @returns the new object or null if the system was not able to do the instantiation
    */
  @JSGlobal("BABYLON.Tools.Instantiate")
  @js.native
  def Instantiate(className: String): js.Any = js.native
  
  /**
    * Test if the given uri is a base64 string
    * @param uri The uri to test
    * @return True if the uri is a base64 string or false otherwise
    */
  @JSGlobal("BABYLON.Tools.IsBase64")
  @js.native
  def IsBase64(uri: String): Boolean = js.native
  
  /**
    * Gets a boolean indicating if the given object has no own property
    * @param obj defines the object to test
    * @returns true if object has no own property
    */
  @JSGlobal("BABYLON.Tools.IsEmpty")
  @js.native
  def IsEmpty(obj: js.Any): Boolean = js.native
  
  /**
    * Function indicating if a number is an exponent of 2
    * @param value defines the value to test
    * @returns true if the value is an exponent of 2
    */
  @JSGlobal("BABYLON.Tools.IsExponentOfTwo")
  @js.native
  def IsExponentOfTwo(value: Double): Boolean = js.native
  
  /**
    * Utility function to detect if the current user agent is Safari
    * @returns whether or not the current user agent is safari
    */
  @JSGlobal("BABYLON.Tools.IsSafari")
  @js.native
  def IsSafari(): Boolean = js.native
  
  /**
    * Checks if the window object exists
    * Back Compat only, please use DomManagement.IsWindowObjectExist instead.
    */
  @JSGlobal("BABYLON.Tools.IsWindowObjectExist")
  @js.native
  def IsWindowObjectExist: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DomManagement.IsWindowObjectExist */ js.Any = js.native
  @scala.inline
  def IsWindowObjectExist_=(
    x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DomManagement.IsWindowObjectExist */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsWindowObjectExist")(x.asInstanceOf[js.Any])
  
  /**
    * Loads a file from a url
    * @param url url string, ArrayBuffer, or Blob to load
    * @param onSuccess callback called when the file successfully loads
    * @param onProgress callback called while file is loading (if the server supports this mode)
    * @param offlineProvider defines the offline provider for caching
    * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
    * @param onError callback called when the file fails to load
    * @returns a file request object
    */
  @JSGlobal("BABYLON.Tools.LoadFile")
  @js.native
  def LoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.Tools.LoadFile")
  @js.native
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
      /* exception */ js.UndefOr[js.Any], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.Tools.LoadFile")
  @js.native
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
  @JSGlobal("BABYLON.Tools.LoadFile")
  @js.native
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
      /* exception */ js.UndefOr[js.Any], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.Tools.LoadFile")
  @js.native
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
  @JSGlobal("BABYLON.Tools.LoadFile")
  @js.native
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
      /* exception */ js.UndefOr[js.Any], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.Tools.LoadFile")
  @js.native
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
  @JSGlobal("BABYLON.Tools.LoadFile")
  @js.native
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
      /* exception */ js.UndefOr[js.Any], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.Tools.LoadFile")
  @js.native
  def LoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, Unit]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.Tools.LoadFile")
  @js.native
  def LoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function2[
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[js.Any], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.Tools.LoadFile")
  @js.native
  def LoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.Tools.LoadFile")
  @js.native
  def LoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[js.Any], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.Tools.LoadFile")
  @js.native
  def LoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: IOfflineProvider
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.Tools.LoadFile")
  @js.native
  def LoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function2[
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[js.Any], 
      Unit
    ]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.Tools.LoadFile")
  @js.native
  def LoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.Tools.LoadFile")
  @js.native
  def LoadFile(
    url: String,
    onSuccess: js.Function2[
      /* data */ String | js.typedarray.ArrayBuffer, 
      /* responseURL */ js.UndefOr[String], 
      Unit
    ],
    onProgress: js.Function1[/* data */ js.Any, Unit],
    offlineProvider: IOfflineProvider,
    useArrayBuffer: Boolean,
    onError: js.Function2[
      /* request */ js.UndefOr[typingsSlinky.babylonjs.BABYLON.WebRequest], 
      /* exception */ js.UndefOr[js.Any], 
      Unit
    ]
  ): IFileRequest = js.native
  
  /**
    * Loads a file from a url
    * @param url the file url to load
    * @param useArrayBuffer defines a boolean indicating that date must be returned as ArrayBuffer
    * @returns a promise containing an ArrayBuffer corresponding to the loaded file
    */
  @JSGlobal("BABYLON.Tools.LoadFileAsync")
  @js.native
  def LoadFileAsync(url: String): js.Promise[js.typedarray.ArrayBuffer | String] = js.native
  @JSGlobal("BABYLON.Tools.LoadFileAsync")
  @js.native
  def LoadFileAsync(url: String, useArrayBuffer: Boolean): js.Promise[js.typedarray.ArrayBuffer | String] = js.native
  
  /**
    * Loads an image as an HTMLImageElement.
    * @param input url string, ArrayBuffer, or Blob to load
    * @param onLoad callback called when the image successfully loads
    * @param onError callback called when the image fails to load
    * @param offlineProvider offline provider for caching
    * @param mimeType optional mime type
    * @returns the HTMLImageElement of the loaded image
    */
  @JSGlobal("BABYLON.Tools.LoadImage")
  @js.native
  def LoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = js.native
  @JSGlobal("BABYLON.Tools.LoadImage")
  @js.native
  def LoadImage(
    input: String,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = js.native
  @JSGlobal("BABYLON.Tools.LoadImage")
  @js.native
  def LoadImage(
    input: js.typedarray.ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = js.native
  @JSGlobal("BABYLON.Tools.LoadImage")
  @js.native
  def LoadImage(
    input: js.typedarray.ArrayBuffer,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = js.native
  @JSGlobal("BABYLON.Tools.LoadImage")
  @js.native
  def LoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider]
  ): Nullable[HTMLImageElement] = js.native
  @JSGlobal("BABYLON.Tools.LoadImage")
  @js.native
  def LoadImage(
    input: Blob,
    onLoad: js.Function1[/* img */ HTMLImageElement | ImageBitmap, Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    offlineProvider: Nullable[IOfflineProvider],
    mimeType: String
  ): Nullable[HTMLImageElement] = js.native
  
  /**
    * Load a script (identified by an url). When the url returns, the
    * content of this file is added into a new script element, attached to the DOM (body element)
    * @param scriptUrl defines the url of the script to laod
    * @param onSuccess defines the callback called when the script is loaded
    * @param onError defines the callback to call if an error occurs
    * @param scriptId defines the id of the script element
    */
  @JSGlobal("BABYLON.Tools.LoadScript")
  @js.native
  def LoadScript(scriptUrl: String, onSuccess: js.Function0[Unit]): Unit = js.native
  @JSGlobal("BABYLON.Tools.LoadScript")
  @js.native
  def LoadScript(
    scriptUrl: String,
    onSuccess: js.Function0[Unit],
    onError: js.UndefOr[scala.Nothing],
    scriptId: String
  ): Unit = js.native
  @JSGlobal("BABYLON.Tools.LoadScript")
  @js.native
  def LoadScript(
    scriptUrl: String,
    onSuccess: js.Function0[Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  @JSGlobal("BABYLON.Tools.LoadScript")
  @js.native
  def LoadScript(
    scriptUrl: String,
    onSuccess: js.Function0[Unit],
    onError: js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[js.Any], Unit],
    scriptId: String
  ): Unit = js.native
  
  /**
    * Load an asynchronous script (identified by an url). When the url returns, the
    * content of this file is added into a new script element, attached to the DOM (body element)
    * @param scriptUrl defines the url of the script to laod
    * @param scriptId defines the id of the script element
    * @returns a promise request object
    */
  @JSGlobal("BABYLON.Tools.LoadScriptAsync")
  @js.native
  def LoadScriptAsync(scriptUrl: String): js.Promise[Unit] = js.native
  @JSGlobal("BABYLON.Tools.LoadScriptAsync")
  @js.native
  def LoadScriptAsync(scriptUrl: String, scriptId: String): js.Promise[Unit] = js.native
  
  /**
    * Log a message to the console
    * @param message defines the message to log
    */
  @JSGlobal("BABYLON.Tools.Log")
  @js.native
  def Log(message: String): Unit = js.native
  
  /**
    * Returns an array if obj is not an array
    * @param obj defines the object to evaluate as an array
    * @param allowsNullUndefined defines a boolean indicating if obj is allowed to be null or undefined
    * @returns either obj directly if obj is an array or a new array containing obj
    */
  @JSGlobal("BABYLON.Tools.MakeArray")
  @js.native
  def MakeArray(obj: js.Any): Nullable[js.Array[_]] = js.native
  @JSGlobal("BABYLON.Tools.MakeArray")
  @js.native
  def MakeArray(obj: js.Any, allowsNullUndefined: Boolean): Nullable[js.Array[_]] = js.native
  
  /**
    * Only message logs
    */
  @JSGlobal("BABYLON.Tools.MessageLogLevel")
  @js.native
  val MessageLogLevel: Double = js.native
  
  /**
    * Interpolates between a and b via alpha
    * @param a The lower value (returned when alpha = 0)
    * @param b The upper value (returned when alpha = 1)
    * @param alpha The interpolation-factor
    * @return The mixed value
    */
  @JSGlobal("BABYLON.Tools.Mix")
  @js.native
  def Mix(a: Double, b: Double, alpha: Double): Double = js.native
  
  /**
    * No log
    */
  @JSGlobal("BABYLON.Tools.NoneLogLevel")
  @js.native
  val NoneLogLevel: Double = js.native
  
  /**
    * Callback called when a new log is added
    */
  @JSGlobal("BABYLON.Tools.OnNewCacheEntry")
  @js.native
  def OnNewCacheEntry(entry: String): Unit = js.native
  
  /**
    * Log performance to the console
    */
  @JSGlobal("BABYLON.Tools.PerformanceConsoleLogLevel")
  @js.native
  val PerformanceConsoleLogLevel: Double = js.native
  
  /**
    * No performance log
    */
  @JSGlobal("BABYLON.Tools.PerformanceNoneLogLevel")
  @js.native
  val PerformanceNoneLogLevel: Double = js.native
  
  /**
    * Use user marks to log performance
    */
  @JSGlobal("BABYLON.Tools.PerformanceUserMarkLogLevel")
  @js.native
  val PerformanceUserMarkLogLevel: Double = js.native
  
  /**
    * Implementation from http://stackoverflow.com/questions/105034/how-to-create-a-guid-uuid-in-javascript/2117523#answer-2117523
    * Be aware Math.random() could cause collisions, but:
    * "All but 6 of the 128 bits of the ID are randomly generated, which means that for any two ids, there's a 1 in 2^^122 (or 5.3x10^^36) chance they'll collide"
    * @returns a pseudo random id
    */
  @JSGlobal("BABYLON.Tools.RandomId")
  @js.native
  def RandomId(): String = js.native
  
  /**
    * Reads a file from a File object
    * @param file defines the file to load
    * @param onSuccess defines the callback to call when data is loaded
    * @param onProgress defines the callback to call during loading process
    * @param useArrayBuffer defines a boolean indicating that data must be returned as an ArrayBuffer
    * @param onError defines the callback to call when an error occurs
    * @returns a file request object
    */
  @JSGlobal("BABYLON.Tools.ReadFile")
  @js.native
  def ReadFile(file: File, onSuccess: js.Function1[/* data */ js.Any, Unit]): IFileRequest = js.native
  @JSGlobal("BABYLON.Tools.ReadFile")
  @js.native
  def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.UndefOr[scala.Nothing],
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.ReadFileError, Unit]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.Tools.ReadFile")
  @js.native
  def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.Tools.ReadFile")
  @js.native
  def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.UndefOr[scala.Nothing],
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.ReadFileError, Unit]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.Tools.ReadFile")
  @js.native
  def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent, _]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.Tools.ReadFile")
  @js.native
  def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent, _],
    useArrayBuffer: js.UndefOr[scala.Nothing],
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.ReadFileError, Unit]
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.Tools.ReadFile")
  @js.native
  def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent, _],
    useArrayBuffer: Boolean
  ): IFileRequest = js.native
  @JSGlobal("BABYLON.Tools.ReadFile")
  @js.native
  def ReadFile(
    file: File,
    onSuccess: js.Function1[/* data */ js.Any, Unit],
    onProgress: js.Function1[/* ev */ ProgressEvent, _],
    useArrayBuffer: Boolean,
    onError: js.Function1[/* error */ typingsSlinky.babylonjs.BABYLON.ReadFileError, Unit]
  ): IFileRequest = js.native
  
  /**
    * Loads a file from a blob
    * @param fileToLoad defines the blob to use
    * @param callback defines the callback to call when data is loaded
    * @param progressCallback defines the callback to call during loading process
    * @returns a file request object
    */
  @JSGlobal("BABYLON.Tools.ReadFileAsDataURL")
  @js.native
  def ReadFileAsDataURL(
    fileToLoad: Blob,
    callback: js.Function1[/* data */ js.Any, Unit],
    progressCallback: js.Function1[/* ev */ ProgressEvent, _]
  ): IFileRequest = js.native
  
  /**
    * Function used to register events at window level
    * @param windowElement defines the Window object to use
    * @param events defines the events to register
    */
  @JSGlobal("BABYLON.Tools.RegisterTopRootEvents")
  @js.native
  def RegisterTopRootEvents(windowElement: Window, events: js.Array[HandlerName]): Unit = js.native
  
  /**
    * Sets the cors behavior on a dom element. This will add the required Tools.CorsBehavior to the element.
    * @param url define the url we are trying
    * @param element define the dom element where to configure the cors policy
    */
  @JSGlobal("BABYLON.Tools.SetCorsBehavior")
  @js.native
  def SetCorsBehavior(url: String, element: CrossOrigin): Unit = js.native
  @JSGlobal("BABYLON.Tools.SetCorsBehavior")
  @js.native
  def SetCorsBehavior(url: js.Array[String], element: CrossOrigin): Unit = js.native
  
  /**
    * Polyfill for setImmediate
    * @param action defines the action to execute after the current execution block
    */
  @JSGlobal("BABYLON.Tools.SetImmediate")
  @js.native
  def SetImmediate(action: js.Function0[Unit]): Unit = js.native
  
  /**
    * Provides a slice function that will work even on IE
    * @param data defines the array to slice
    * @param start defines the start of the data (optional)
    * @param end defines the end of the data (optional)
    * @returns the new sliced array
    */
  @JSGlobal("BABYLON.Tools.Slice")
  @js.native
  def Slice[T](data: T): T = js.native
  @JSGlobal("BABYLON.Tools.Slice")
  @js.native
  def Slice[T](data: T, start: js.UndefOr[scala.Nothing], end: Double): T = js.native
  @JSGlobal("BABYLON.Tools.Slice")
  @js.native
  def Slice[T](data: T, start: Double): T = js.native
  @JSGlobal("BABYLON.Tools.Slice")
  @js.native
  def Slice[T](data: T, start: Double, end: Double): T = js.native
  
  /**
    * Provides a slice function that will work even on IE
    * The difference between this and Slice is that this will force-convert to array
    * @param data defines the array to slice
    * @param start defines the start of the data (optional)
    * @param end defines the end of the data (optional)
    * @returns the new sliced array
    */
  @JSGlobal("BABYLON.Tools.SliceToArray")
  @js.native
  def SliceToArray[T, P](data: T): js.Array[P] = js.native
  @JSGlobal("BABYLON.Tools.SliceToArray")
  @js.native
  def SliceToArray[T, P](data: T, start: js.UndefOr[scala.Nothing], end: Double): js.Array[P] = js.native
  @JSGlobal("BABYLON.Tools.SliceToArray")
  @js.native
  def SliceToArray[T, P](data: T, start: Double): js.Array[P] = js.native
  @JSGlobal("BABYLON.Tools.SliceToArray")
  @js.native
  def SliceToArray[T, P](data: T, start: Double, end: Double): js.Array[P] = js.native
  
  /**
    * Starts a performance counter
    */
  @JSGlobal("BABYLON.Tools.StartPerformanceCounter")
  @js.native
  def StartPerformanceCounter(counterName: String): Unit = js.native
  @JSGlobal("BABYLON.Tools.StartPerformanceCounter")
  @js.native
  def StartPerformanceCounter(counterName: String, condition: Boolean): Unit = js.native
  
  /**
    * Converts the canvas data to blob.
    * This acts as a polyfill for browsers not supporting the to blob function.
    * @param canvas Defines the canvas to extract the data from
    * @param successCallback Defines the callback triggered once the data are available
    * @param mimeType Defines the mime type of the result
    */
  @JSGlobal("BABYLON.Tools.ToBlob")
  @js.native
  def ToBlob(canvas: HTMLCanvasElement, successCallback: js.Function1[/* blob */ Nullable[Blob], Unit]): Unit = js.native
  @JSGlobal("BABYLON.Tools.ToBlob")
  @js.native
  def ToBlob(
    canvas: HTMLCanvasElement,
    successCallback: js.Function1[/* blob */ Nullable[Blob], Unit],
    mimeType: String
  ): Unit = js.native
  
  /**
    * Convert an angle in radians to degrees
    * @param angle defines the angle to convert
    * @returns the angle in degrees
    */
  @JSGlobal("BABYLON.Tools.ToDegrees")
  @js.native
  def ToDegrees(angle: Double): Double = js.native
  
  /**
    * Convert an angle in degrees to radians
    * @param angle defines the angle to convert
    * @returns the angle in radians
    */
  @JSGlobal("BABYLON.Tools.ToRadians")
  @js.native
  def ToRadians(angle: Double): Double = js.native
  
  /**
    * Function used to unregister events from window level
    * @param windowElement defines the Window object to use
    * @param events defines the events to unregister
    */
  @JSGlobal("BABYLON.Tools.UnregisterTopRootEvents")
  @js.native
  def UnregisterTopRootEvents(windowElement: Window, events: js.Array[HandlerName]): Unit = js.native
  
  /**
    * Enable/Disable Custom HTTP Request Headers globally.
    * default = false
    * @see CustomRequestHeaders
    */
  @JSGlobal("BABYLON.Tools.UseCustomRequestHeaders")
  @js.native
  def UseCustomRequestHeaders: Boolean = js.native
  @scala.inline
  def UseCustomRequestHeaders_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UseCustomRequestHeaders")(x.asInstanceOf[js.Any])
  
  /**
    * Write a warning message to the console
    * @param message defines the message to log
    */
  @JSGlobal("BABYLON.Tools.Warn")
  @js.native
  def Warn(message: String): Unit = js.native
  
  /**
    * Only warning logs
    */
  @JSGlobal("BABYLON.Tools.WarningLogLevel")
  @js.native
  val WarningLogLevel: Double = js.native
  
  @JSGlobal("BABYLON.Tools._EndPerformanceConsole")
  @js.native
  def _EndPerformanceConsole: js.Any = js.native
  @scala.inline
  def _EndPerformanceConsole_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EndPerformanceConsole")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Tools._EndPerformanceCounterDisabled")
  @js.native
  def _EndPerformanceCounterDisabled: js.Any = js.native
  @scala.inline
  def _EndPerformanceCounterDisabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EndPerformanceCounterDisabled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Tools._EndUserMark")
  @js.native
  def _EndUserMark: js.Any = js.native
  @scala.inline
  def _EndUserMark_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_EndUserMark")(x.asInstanceOf[js.Any])
  
  /**
    * @ignore
    */
  @JSGlobal("BABYLON.Tools._ScreenshotCanvas")
  @js.native
  def _ScreenshotCanvas: HTMLCanvasElement = js.native
  @scala.inline
  def _ScreenshotCanvas_=(x: HTMLCanvasElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ScreenshotCanvas")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Tools._StartPerformanceConsole")
  @js.native
  def _StartPerformanceConsole: js.Any = js.native
  @scala.inline
  def _StartPerformanceConsole_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_StartPerformanceConsole")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Tools._StartPerformanceCounterDisabled")
  @js.native
  def _StartPerformanceCounterDisabled: js.Any = js.native
  @scala.inline
  def _StartPerformanceCounterDisabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_StartPerformanceCounterDisabled")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Tools._StartUserMark")
  @js.native
  def _StartUserMark: js.Any = js.native
  @scala.inline
  def _StartUserMark_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_StartUserMark")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Tools._performance")
  @js.native
  def _performance: js.Any = js.native
  @scala.inline
  def _performance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_performance")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Tools._tmpFloatArray")
  @js.native
  def _tmpFloatArray: js.Any = js.native
  @scala.inline
  def _tmpFloatArray_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_tmpFloatArray")(x.asInstanceOf[js.Any])
  
  /**
    * This method will return the name of the full name of the class, including its owning module (if any).
    * It will works only on Javascript basic data types (number, string, ...) and instance of class declared with the @className decorator or implementing a method getClassName():string (in which case the module won't be specified).
    * @param object the object to get the class name from
    * @param isType defines if the object is actually a type
    * @return a string that can have two forms: "moduleName.className" if module was specified when the class' Name was registered or "className" if there was not module specified.
    * @ignorenaming
    */
  @JSGlobal("BABYLON.Tools.getFullClassName")
  @js.native
  def getFullClassName(`object`: js.Any): Nullable[String] = js.native
  @JSGlobal("BABYLON.Tools.getFullClassName")
  @js.native
  def getFullClassName(`object`: js.Any, isType: Boolean): Nullable[String] = js.native
}
