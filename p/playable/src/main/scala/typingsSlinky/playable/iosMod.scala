package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLVideoElement
import typingsSlinky.playable.fullScreenManagerTypesMod.IFullScreenHelper
import typingsSlinky.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iosMod {
  
  @JSImport("playable/dist/src/modules/full-screen-manager/ios", JSImport.Default)
  @js.native
  class default protected () extends IOSFullScreen {
    def this(elem: HTMLVideoElement, callback: EventListener) = this()
  }
  
  @js.native
  trait IOSFullScreen extends IFullScreenHelper {
    
    @JSName("_$elem")
    var _$elem: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callback: js.Any = js.native
    
    var _enterWhenHasMetaData: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    @JSName("isAPIExist")
    def isAPIExist_MIOSFullScreen: Boolean = js.native
    
    @JSName("isEnabled")
    def isEnabled_MIOSFullScreen: Boolean = js.native
    
    @JSName("isInFullScreen")
    def isInFullScreen_MIOSFullScreen: Boolean = js.native
  }
}
