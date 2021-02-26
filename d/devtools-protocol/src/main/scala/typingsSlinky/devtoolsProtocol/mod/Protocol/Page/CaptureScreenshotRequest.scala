package typingsSlinky.devtoolsProtocol.mod.Protocol.Page

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.jpeg
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.png
import typingsSlinky.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptureScreenshotRequest extends StObject {
  
  /**
    * Capture the screenshot of a given region only.
    */
  var clip: js.UndefOr[Viewport] = js.native
  
  /**
    * Image compression format (defaults to png). (CaptureScreenshotRequestFormat enum)
    */
  var format: js.UndefOr[jpeg | png] = js.native
  
  /**
    * Capture the screenshot from the surface, rather than the view. Defaults to true.
    */
  var fromSurface: js.UndefOr[Boolean] = js.native
  
  /**
    * Compression quality from range [0..100] (jpeg only).
    */
  var quality: js.UndefOr[integer] = js.native
}
object CaptureScreenshotRequest {
  
  @scala.inline
  def apply(): CaptureScreenshotRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptureScreenshotRequest]
  }
  
  @scala.inline
  implicit class CaptureScreenshotRequestMutableBuilder[Self <: CaptureScreenshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClip(value: Viewport): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    @scala.inline
    def setFormat(value: jpeg | png): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFromSurface(value: Boolean): Self = StObject.set(x, "fromSurface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromSurfaceUndefined: Self = StObject.set(x, "fromSurface", js.undefined)
    
    @scala.inline
    def setQuality(value: integer): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
