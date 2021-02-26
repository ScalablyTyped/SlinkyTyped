package typingsSlinky.reactOverlays

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRootCloseMod {
  
  @JSImport("react-overlays/cjs/useRootClose", JSImport.Default)
  @js.native
  def default(ref: js.UndefOr[scala.Nothing], onRootClose: js.Function1[/* e */ Event, Unit]): Unit = js.native
  @JSImport("react-overlays/cjs/useRootClose", JSImport.Default)
  @js.native
  def default(
    ref: js.UndefOr[scala.Nothing],
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = js.native
  @JSImport("react-overlays/cjs/useRootClose", JSImport.Default)
  @js.native
  def default(ref: Element, onRootClose: js.Function1[/* e */ Event, Unit]): Unit = js.native
  @JSImport("react-overlays/cjs/useRootClose", JSImport.Default)
  @js.native
  def default(
    ref: Element,
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = js.native
  @JSImport("react-overlays/cjs/useRootClose", JSImport.Default)
  @js.native
  def default(ref: Null, onRootClose: js.Function1[/* e */ Event, Unit]): Unit = js.native
  @JSImport("react-overlays/cjs/useRootClose", JSImport.Default)
  @js.native
  def default(
    ref: Null,
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = js.native
  /**
    * The `useRootClose` hook registers your callback on the document
    * when rendered. Powers the `<Overlay/>` component. This is used achieve modal
    * style behavior where your callback is triggered when the user tries to
    * interact with the rest of the document or hits the `esc` key.
    *
    * @param {Ref<HTMLElement>| HTMLElement} ref  The element boundary
    * @param {function} onRootClose
    * @param {object=}  options
    * @param {boolean=} options.disabled
    * @param {string=}  options.clickTrigger The DOM event name (click, mousedown, etc) to attach listeners on
    */
  @JSImport("react-overlays/cjs/useRootClose", JSImport.Default)
  @js.native
  def default(ref: ReactRef[Element], onRootClose: js.Function1[/* e */ Event, Unit]): Unit = js.native
  @JSImport("react-overlays/cjs/useRootClose", JSImport.Default)
  @js.native
  def default(
    ref: ReactRef[Element],
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactOverlays.reactOverlaysStrings.transitionrun
    - typingsSlinky.reactOverlays.reactOverlaysStrings.toggle
    - typingsSlinky.reactOverlays.reactOverlaysStrings.click
    - typingsSlinky.reactOverlays.reactOverlaysStrings.reset
    - typingsSlinky.reactOverlays.reactOverlaysStrings.focusin
    - typingsSlinky.reactOverlays.reactOverlaysStrings.pointerup
    - typingsSlinky.reactOverlays.reactOverlaysStrings.focus
    - typingsSlinky.reactOverlays.reactOverlaysStrings.pointercancel
    - typingsSlinky.reactOverlays.reactOverlaysStrings.selectionchange
    - typingsSlinky.reactOverlays.reactOverlaysStrings.volumechange
    - typingsSlinky.reactOverlays.reactOverlaysStrings.dragexit
    - typingsSlinky.reactOverlays.reactOverlaysStrings.pointerenter
    - typingsSlinky.reactOverlays.reactOverlaysStrings.animationend
    - typingsSlinky.reactOverlays.reactOverlaysStrings.animationstart
    - typingsSlinky.reactOverlays.reactOverlaysStrings.canplaythrough
    - typingsSlinky.reactOverlays.reactOverlaysStrings.mouseenter
    - typingsSlinky.reactOverlays.reactOverlaysStrings.auxclick
    - typingsSlinky.reactOverlays.reactOverlaysStrings.pause
    - typingsSlinky.reactOverlays.reactOverlaysStrings.keyup
    - typingsSlinky.reactOverlays.reactOverlaysStrings.stalled
    - typingsSlinky.reactOverlays.reactOverlaysStrings.animationiteration
    - typingsSlinky.reactOverlays.reactOverlaysStrings.drag
    - typingsSlinky.reactOverlays.reactOverlaysStrings.mouseleave
    - typingsSlinky.reactOverlays.reactOverlaysStrings.dblclick
    - typingsSlinky.reactOverlays.reactOverlaysStrings.change
    - typingsSlinky.reactOverlays.reactOverlaysStrings.suspend
    - typingsSlinky.reactOverlays.reactOverlaysStrings.mouseover
    - typingsSlinky.reactOverlays.reactOverlaysStrings.wheel
    - typingsSlinky.reactOverlays.reactOverlaysStrings.canplay
    - typingsSlinky.reactOverlays.reactOverlaysStrings.dragstart
    - typingsSlinky.reactOverlays.reactOverlaysStrings.error
    - typingsSlinky.reactOverlays.reactOverlaysStrings.blur
    - typingsSlinky.reactOverlays.reactOverlaysStrings.abort
    - typingsSlinky.reactOverlays.reactOverlaysStrings.touchend
    - typingsSlinky.reactOverlays.reactOverlaysStrings.seeked
    - typingsSlinky.reactOverlays.reactOverlaysStrings.cuechange
    - typingsSlinky.reactOverlays.reactOverlaysStrings.animationcancel
    - typingsSlinky.reactOverlays.reactOverlaysStrings.mouseout
    - typingsSlinky.reactOverlays.reactOverlaysStrings.loadeddata
    - typingsSlinky.reactOverlays.reactOverlaysStrings.gotpointercapture
    - typingsSlinky.reactOverlays.reactOverlaysStrings.transitioncancel
    - typingsSlinky.reactOverlays.reactOverlaysStrings.touchcancel
    - typingsSlinky.reactOverlays.reactOverlaysStrings.keydown
    - typingsSlinky.reactOverlays.reactOverlaysStrings.touchstart
    - typingsSlinky.reactOverlays.reactOverlaysStrings.dragleave
    - typingsSlinky.reactOverlays.reactOverlaysStrings.mousedown
    - typingsSlinky.reactOverlays.reactOverlaysStrings.submit
    - typingsSlinky.reactOverlays.reactOverlaysStrings.input
    - typingsSlinky.reactOverlays.reactOverlaysStrings.loadstart
    - typingsSlinky.reactOverlays.reactOverlaysStrings.loadedmetadata
    - typingsSlinky.reactOverlays.reactOverlaysStrings.durationchange
    - typingsSlinky.reactOverlays.reactOverlaysStrings.timeupdate
    - typingsSlinky.reactOverlays.reactOverlaysStrings.dragend
    - typingsSlinky.reactOverlays.reactOverlaysStrings.lostpointercapture
    - typingsSlinky.reactOverlays.reactOverlaysStrings.playing
    - typingsSlinky.reactOverlays.reactOverlaysStrings.progress
    - typingsSlinky.reactOverlays.reactOverlaysStrings.invalid
    - typingsSlinky.reactOverlays.reactOverlaysStrings.mouseup
    - typingsSlinky.reactOverlays.reactOverlaysStrings.pointerover
    - typingsSlinky.reactOverlays.reactOverlaysStrings.dragenter
    - typingsSlinky.reactOverlays.reactOverlaysStrings.resize
    - typingsSlinky.reactOverlays.reactOverlaysStrings.pointerleave
    - typingsSlinky.reactOverlays.reactOverlaysStrings.cancel
    - typingsSlinky.reactOverlays.reactOverlaysStrings.play
    - typingsSlinky.reactOverlays.reactOverlaysStrings.securitypolicyviolation
    - typingsSlinky.reactOverlays.reactOverlaysStrings.drop
    - typingsSlinky.reactOverlays.reactOverlaysStrings.pointerdown
    - typingsSlinky.reactOverlays.reactOverlaysStrings.focusout
    - typingsSlinky.reactOverlays.reactOverlaysStrings.pointermove
    - typingsSlinky.reactOverlays.reactOverlaysStrings.waiting
    - typingsSlinky.reactOverlays.reactOverlaysStrings.emptied
    - typingsSlinky.reactOverlays.reactOverlaysStrings.scroll
    - typingsSlinky.reactOverlays.reactOverlaysStrings.keypress
    - typingsSlinky.reactOverlays.reactOverlaysStrings.pointerout
    - typingsSlinky.reactOverlays.reactOverlaysStrings.transitionend
    - typingsSlinky.reactOverlays.reactOverlaysStrings.ended
    - typingsSlinky.reactOverlays.reactOverlaysStrings.seeking
    - typingsSlinky.reactOverlays.reactOverlaysStrings.select
    - typingsSlinky.reactOverlays.reactOverlaysStrings.dragover
    - typingsSlinky.reactOverlays.reactOverlaysStrings.close
    - typingsSlinky.reactOverlays.reactOverlaysStrings.touchmove
    - typingsSlinky.reactOverlays.reactOverlaysStrings.load
    - typingsSlinky.reactOverlays.reactOverlaysStrings.contextmenu
    - typingsSlinky.reactOverlays.reactOverlaysStrings.selectstart
    - typingsSlinky.reactOverlays.reactOverlaysStrings.mousemove
    - typingsSlinky.reactOverlays.reactOverlaysStrings.transitionstart
    - typingsSlinky.reactOverlays.reactOverlaysStrings.ratechange
  */
  trait MouseEvents extends StObject
  
  @js.native
  trait RootCloseOptions extends StObject {
    
    var clickTrigger: js.UndefOr[MouseEvents] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
  }
  object RootCloseOptions {
    
    @scala.inline
    def apply(): RootCloseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootCloseOptions]
    }
    
    @scala.inline
    implicit class RootCloseOptionsMutableBuilder[Self <: RootCloseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClickTrigger(value: MouseEvents): Self = StObject.set(x, "clickTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickTriggerUndefined: Self = StObject.set(x, "clickTrigger", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
}
