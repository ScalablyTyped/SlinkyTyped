package typingsSlinky.playable

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.playable.interactionIndicatorTypesMod.IInteractionIndicatorViewStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactionIndicatorViewMod {
  
  @JSImport("playable/dist/src/modules/ui/interaction-indicator/interaction-indicator.view", JSImport.Default)
  @js.native
  class default () extends InteractionIndicatorView
  
  @js.native
  trait InteractionIndicatorView
    extends typingsSlinky.playable.viewMod.default[IInteractionIndicatorViewStyles] {
    
    @JSName("_$rootElement")
    var _$rootElement: js.Any = js.native
    
    var _decreaseVolumeIcon: js.Any = js.native
    
    var _forwardIcon: js.Any = js.native
    
    var _increaseVolumeIcon: js.Any = js.native
    
    var _muteIcon: js.Any = js.native
    
    var _pauseIcon: js.Any = js.native
    
    var _playIcon: js.Any = js.native
    
    var _rewindIcon: js.Any = js.native
    
    def activateDecreaseVolumeIcon(): Unit = js.native
    
    def activateForwardIcon(): Unit = js.native
    
    def activateIncreaseVolumeIcon(): Unit = js.native
    
    def activateMuteVolumeIcon(): Unit = js.native
    
    def activatePauseIcon(): Unit = js.native
    
    def activatePlayIcon(): Unit = js.native
    
    def activateRewindIcon(): Unit = js.native
    
    def deactivateIcon(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getElement(): HTMLElement = js.native
    
    def hide(): Unit = js.native
    
    def show(): Unit = js.native
  }
}
