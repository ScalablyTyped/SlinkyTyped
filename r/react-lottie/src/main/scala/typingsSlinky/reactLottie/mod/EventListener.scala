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
import scala.scalajs.js.annotation._

trait EventListener extends js.Object {
  /**
    * The event sent by Lottie
    */
  var eventName: complete | loopComplete | enterFrame | segmentStart | config_ready | data_ready | loaded_images | DOMLoaded | destroy
  /**
    * A callback that will be executed when the given eventName is received
    */
  def callback(): Unit
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
}

