package typingsSlinky.androiduix.global.androidui

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.androiduix.androidui.native.NativeApi.DrawHTMLBoundApi
import typingsSlinky.androiduix.androidui.native.NativeApi.ImageApi
import typingsSlinky.androiduix.androidui.native.NativeApi.WebViewApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.native")
@js.native
object native extends js.Object {
  @js.native
  class NativeApi ()
    extends typingsSlinky.androiduix.androidui.native.NativeApi
  
  @js.native
  class NativeCanvas ()
    extends typingsSlinky.androiduix.androidui.native.NativeCanvas
  
  @js.native
  class NativeEditText ()
    extends typingsSlinky.androiduix.androidui.native.NativeEditText
  
  @js.native
  class NativeHtmlView ()
    extends typingsSlinky.androiduix.androidui.native.NativeHtmlView
  
  @js.native
  class NativeImage ()
    extends typingsSlinky.androiduix.androidui.native.NativeImage
  
  @js.native
  class NativeSurface ()
    extends typingsSlinky.androiduix.androidui.native.NativeSurface
  
  @js.native
  class NativeWebView protected ()
    extends typingsSlinky.androiduix.androidui.native.NativeWebView {
    def this(context: Context, bindElement: HTMLElement, defStyle: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object NativeApi extends js.Object {
    @js.native
    class CanvasApi ()
      extends typingsSlinky.androiduix.androidui.native.NativeApi.CanvasApi
    
    @js.native
    class SurfaceApi ()
      extends typingsSlinky.androiduix.androidui.native.NativeApi.SurfaceApi
    
    var canvas: typingsSlinky.androiduix.androidui.native.NativeApi.CanvasApi = js.native
    var drawHTML: DrawHTMLBoundApi = js.native
    var image: ImageApi = js.native
    var surface: typingsSlinky.androiduix.androidui.native.NativeApi.SurfaceApi = js.native
    var webView: WebViewApi = js.native
  }
  
  /* static members */
  @js.native
  object NativeCanvas extends js.Object {
    /* private */ def applyTextMeasure(cacheMeasureTextSize: js.Any, defaultWidth: js.Any, widths: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object NativeImage extends js.Object {
    /* private */ def notifyGetPixels(imageId: js.Any, callBackIndex: js.Any, data: js.Any): js.Any = js.native
    /* private */ def notifyLoadError(imageId: js.Any): js.Any = js.native
    /* private */ def notifyLoadFinish(
      imageId: js.Any,
      width: js.Any,
      height: js.Any,
      leftBorder: js.Any,
      topBorder: js.Any,
      rightBorder: js.Any,
      bottomBorder: js.Any
    ): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object NativeSurface extends js.Object {
    /* private */ def notifySurfaceReady(surfaceId: js.Any): js.Any = js.native
    /* private */ def notifySurfaceSupportDirtyDraw(surfaceId: js.Any, dirtyDrawSupport: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object NativeWebView extends js.Object {
    /* private */ def notifyLoadFinish(viewHash: js.Any, url: js.Any, title: js.Any): js.Any = js.native
    /* private */ def notifyWebViewHistoryChange(viewHash: js.Any, currentHistoryIndex: js.Any, historySize: js.Any): js.Any = js.native
  }
  
}

