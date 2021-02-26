package typingsSlinky.inboxsdk.mod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.inboxsdk.inboxsdkStrings.destroy
import typingsSlinky.inboxsdk.inboxsdkStrings.escape
import typingsSlinky.inboxsdk.inboxsdkStrings.outsideInteraction
import typingsSlinky.inboxsdk.inboxsdkStrings.preautoclose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Common {
  
  @js.native
  trait Contact extends StObject {
    
    var emailAddress: String = js.native
    
    var name: String = js.native
  }
  object Contact {
    
    @scala.inline
    def apply(emailAddress: String, name: String): Contact = {
      val __obj = js.Dynamic.literal(emailAddress = emailAddress.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contact]
    }
    
    @scala.inline
    implicit class ContactMutableBuilder[Self <: Contact] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DropdownView extends StObject {
    
    def close(): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    var el: HTMLElement = js.native
    
    @JSName("on")
    def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_preautoclose(name: preautoclose, cb: js.Function1[/* event */ PreAutoCloseEvent, Unit]): Unit = js.native
    
    def reposition(): Unit = js.native
    
    def setPlacementOptions(options: PositionOptions): Unit = js.native
  }
  
  @js.native
  trait PositionOptions extends StObject {
    
    var bottomBuffer: js.UndefOr[Double] = js.native
    
    var buffer: js.UndefOr[Double] = js.native
    
    var forceHAlign: js.UndefOr[Boolean] = js.native
    
    var forcePosition: js.UndefOr[Boolean] = js.native
    
    var forceVAlign: js.UndefOr[Boolean] = js.native
    
    var hAlign: js.UndefOr[String] = js.native
    
    var leftBuffer: js.UndefOr[Double] = js.native
    
    var position: js.UndefOr[String] = js.native
    
    var rightBuffer: js.UndefOr[Double] = js.native
    
    var topBuffer: js.UndefOr[Double] = js.native
    
    var vAlign: js.UndefOr[String] = js.native
  }
  object PositionOptions {
    
    @scala.inline
    def apply(): PositionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PositionOptions]
    }
    
    @scala.inline
    implicit class PositionOptionsMutableBuilder[Self <: PositionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottomBuffer(value: Double): Self = StObject.set(x, "bottomBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomBufferUndefined: Self = StObject.set(x, "bottomBuffer", js.undefined)
      
      @scala.inline
      def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setForceHAlign(value: Boolean): Self = StObject.set(x, "forceHAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceHAlignUndefined: Self = StObject.set(x, "forceHAlign", js.undefined)
      
      @scala.inline
      def setForcePosition(value: Boolean): Self = StObject.set(x, "forcePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForcePositionUndefined: Self = StObject.set(x, "forcePosition", js.undefined)
      
      @scala.inline
      def setForceVAlign(value: Boolean): Self = StObject.set(x, "forceVAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceVAlignUndefined: Self = StObject.set(x, "forceVAlign", js.undefined)
      
      @scala.inline
      def setHAlign(value: String): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHAlignUndefined: Self = StObject.set(x, "hAlign", js.undefined)
      
      @scala.inline
      def setLeftBuffer(value: Double): Self = StObject.set(x, "leftBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftBufferUndefined: Self = StObject.set(x, "leftBuffer", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setRightBuffer(value: Double): Self = StObject.set(x, "rightBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightBufferUndefined: Self = StObject.set(x, "rightBuffer", js.undefined)
      
      @scala.inline
      def setTopBuffer(value: Double): Self = StObject.set(x, "topBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopBufferUndefined: Self = StObject.set(x, "topBuffer", js.undefined)
      
      @scala.inline
      def setVAlign(value: String): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
    }
  }
  
  @js.native
  trait PreAutoCloseEvent extends StObject {
    
    def cancel(): Unit = js.native
    
    var cause: Event = js.native
    
    var `type`: outsideInteraction | escape = js.native
  }
  object PreAutoCloseEvent {
    
    @scala.inline
    def apply(cancel: () => Unit, cause: Event, `type`: outsideInteraction | escape): PreAutoCloseEvent = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), cause = cause.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreAutoCloseEvent]
    }
    
    @scala.inline
    implicit class PreAutoCloseEventMutableBuilder[Self <: PreAutoCloseEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCause(value: Event): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: outsideInteraction | escape): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SimpleElementView extends StObject {
    
    def destroy(): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    var el: HTMLElement = js.native
    
    @JSName("on")
    def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
  }
  object SimpleElementView {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      destroyed: Boolean,
      el: HTMLElement,
      on: (destroy, js.Function0[Unit]) => Unit
    ): SimpleElementView = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], on = js.Any.fromFunction2(on))
      __obj.asInstanceOf[SimpleElementView]
    }
    
    @scala.inline
    implicit class SimpleElementViewMutableBuilder[Self <: SimpleElementView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroyed(value: Boolean): Self = StObject.set(x, "destroyed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn(value: (destroy, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    }
  }
}
