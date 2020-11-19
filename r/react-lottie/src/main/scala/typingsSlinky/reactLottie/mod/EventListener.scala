package typingsSlinky.reactLottie.mod

import typingsSlinky.reactLottie.reactLottieStrings.DOMLoaded
import typingsSlinky.reactLottie.reactLottieStrings.complete
import typingsSlinky.reactLottie.reactLottieStrings.config_ready
import typingsSlinky.reactLottie.reactLottieStrings.data_ready
import typingsSlinky.reactLottie.reactLottieStrings.destroy
import typingsSlinky.reactLottie.reactLottieStrings.enterFrame
import typingsSlinky.reactLottie.reactLottieStrings.loaded_images
import typingsSlinky.reactLottie.reactLottieStrings.loopComplete
import typingsSlinky.reactLottie.reactLottieStrings.segmentStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventListener extends js.Object {
  
  /**
    * A callback that will be executed when the given eventName is received
    */
  def callback(): Unit = js.native
  
  /**
    * The event sent by Lottie
    */
  var eventName: complete | loopComplete | enterFrame | segmentStart | config_ready | data_ready | loaded_images | DOMLoaded | destroy = js.native
}
object EventListener {
  
  @scala.inline
  def apply(
    callback: () => Unit,
    eventName: complete | loopComplete | enterFrame | segmentStart | config_ready | data_ready | loaded_images | DOMLoaded | destroy
  ): EventListener = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), eventName = eventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventListener]
  }
  
  @scala.inline
  implicit class EventListenerOps[Self <: EventListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallback(value: () => Unit): Self = this.set("callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEventName(
      value: complete | loopComplete | enterFrame | segmentStart | config_ready | data_ready | loaded_images | DOMLoaded | destroy
    ): Self = this.set("eventName", value.asInstanceOf[js.Any])
  }
}
