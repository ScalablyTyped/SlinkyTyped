package typingsSlinky.chrome.chrome.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InjectDetails extends StObject {
  
  /**
    * Optional.
    * If allFrames is true, implies that the JavaScript or CSS should be injected into all frames of current page. By default, it's false and is only injected into the top frame.
    */
  var allFrames: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. JavaScript or CSS code to inject.
    * Warning: Be careful using the code parameter. Incorrect use of it may open your extension to cross site scripting attacks.
    */
  var code: js.UndefOr[String] = js.native
  
  /**
    * Optional. The origin of the CSS to inject. This may only be specified for CSS, not JavaScript. Defaults to "author".
    * One of: "author", or "user"
    * @since Chrome 66.
    */
  var cssOrigin: js.UndefOr[String] = js.native
  
  /** Optional. JavaScript or CSS file to inject. */
  var file: js.UndefOr[String] = js.native
  
  /**
    * Optional.
    * The frame where the script or CSS should be injected. Defaults to 0 (the top-level frame).
    * @since Chrome 39.
    */
  var frameId: js.UndefOr[Double] = js.native
  
  /**
    * Optional.
    * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default it is false.
    * @since Chrome 39.
    */
  var matchAboutBlank: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. The soonest that the JavaScript or CSS will be injected into the tab.
    * One of: "document_start", "document_end", or "document_idle"
    * @since Chrome 20.
    */
  var runAt: js.UndefOr[String] = js.native
}
object InjectDetails {
  
  @scala.inline
  def apply(): InjectDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectDetails]
  }
  
  @scala.inline
  implicit class InjectDetailsMutableBuilder[Self <: InjectDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllFrames(value: Boolean): Self = StObject.set(x, "allFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllFramesUndefined: Self = StObject.set(x, "allFrames", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setCssOrigin(value: String): Self = StObject.set(x, "cssOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssOriginUndefined: Self = StObject.set(x, "cssOrigin", js.undefined)
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    @scala.inline
    def setMatchAboutBlank(value: Boolean): Self = StObject.set(x, "matchAboutBlank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchAboutBlankUndefined: Self = StObject.set(x, "matchAboutBlank", js.undefined)
    
    @scala.inline
    def setRunAt(value: String): Self = StObject.set(x, "runAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunAtUndefined: Self = StObject.set(x, "runAt", js.undefined)
  }
}
