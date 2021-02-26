package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.controlsPictureInPictureTypesMod.IPictureInPictureViewConfig
import typingsSlinky.playable.controlsPictureInPictureTypesMod.IPictureInPictureViewStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pictureInPictureViewMod {
  
  @JSImport("playable/dist/src/modules/ui/controls/picture-in-picture/picture-in-picture.view", JSImport.Default)
  @js.native
  class default protected () extends PictureInPictureView {
    def this(config: IPictureInPictureViewConfig) = this()
  }
  
  @js.native
  trait PictureInPictureView
    extends typingsSlinky.playable.viewMod.default[IPictureInPictureViewStyles] {
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    @JSName("_$togglePictureInPictureControl")
    var _$togglePictureInPictureControl: js.Any = js.native
    
    var _bindEvents: js.Any = js.native
    
    var _callbacks: js.Any = js.native
    
    var _onButtonClick: js.Any = js.native
    
    var _textMap: js.Any = js.native
    
    var _tooltipReference: js.Any = js.native
    
    var _unbindEvents: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def setPictureInPictureState(isPictureInPicture: Boolean): Unit = js.native
    
    def show(): Unit = js.native
  }
}
