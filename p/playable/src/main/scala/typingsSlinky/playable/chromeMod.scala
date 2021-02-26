package typingsSlinky.playable

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.playable.pictureInPictureTypesMod.IPictureInPictureHelper
import typingsSlinky.std.Document
import typingsSlinky.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromeMod {
  
  @JSImport("playable/dist/src/modules/picture-in-picture/chrome", JSImport.Default)
  @js.native
  class default protected () extends ChromePictureInPicture {
    def this(elem: HTMLVideoElement, callback: EventListener) = this()
  }
  
  @js.native
  trait ChromeDocument extends Document {
    
    def exitPictureInPicture(): js.Promise[Unit] = js.native
    
    var pictureInPictureElement: js.UndefOr[Element] = js.native
    
    var pictureInPictureEnabled: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait ChromePictureInPicture extends IPictureInPictureHelper {
    
    @JSName("_$elem")
    var _$elem: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callback: js.Any = js.native
    
    var _enterWhenHasMetaData: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    var catchException: js.Any = js.native
    
    def isAPIEnabled: Boolean = js.native
    
    def isAPIExist: Boolean = js.native
    
    @JSName("isEnabled")
    def isEnabled_MChromePictureInPicture: Boolean = js.native
    
    @JSName("isInPictureInPicture")
    def isInPictureInPicture_MChromePictureInPicture: Boolean = js.native
  }
  
  @js.native
  trait ChromeWebkitHTMLVideo
    extends typingsSlinky.std.HTMLVideoElement {
    
    def requestPictureInPicture(): js.Promise[Unit] = js.native
  }
}
