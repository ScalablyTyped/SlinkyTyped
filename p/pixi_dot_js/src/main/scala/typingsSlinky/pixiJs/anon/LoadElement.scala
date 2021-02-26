package typingsSlinky.pixiJs.anon

import org.scalajs.dom.raw.HTMLAudioElement
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadElement extends StObject {
  
  var loadElement: js.UndefOr[HTMLImageElement | HTMLAudioElement | HTMLVideoElement] = js.native
  
  var mimeType: js.UndefOr[String | js.Array[String]] = js.native
  
  var skipSource: js.UndefOr[Boolean] = js.native
}
object LoadElement {
  
  @scala.inline
  def apply(): LoadElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadElement]
  }
  
  @scala.inline
  implicit class LoadElementMutableBuilder[Self <: LoadElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadElement(value: HTMLImageElement | HTMLAudioElement | HTMLVideoElement): Self = StObject.set(x, "loadElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadElementHTMLAudioElement(value: HTMLAudioElement): Self = StObject.set(x, "loadElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadElementHTMLImageElement(value: HTMLImageElement): Self = StObject.set(x, "loadElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadElementHTMLVideoElement(value: HTMLVideoElement): Self = StObject.set(x, "loadElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadElementUndefined: Self = StObject.set(x, "loadElement", js.undefined)
    
    @scala.inline
    def setMimeType(value: String | js.Array[String]): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setMimeTypeVarargs(value: String*): Self = StObject.set(x, "mimeType", js.Array(value :_*))
    
    @scala.inline
    def setSkipSource(value: Boolean): Self = StObject.set(x, "skipSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipSourceUndefined: Self = StObject.set(x, "skipSource", js.undefined)
  }
}
