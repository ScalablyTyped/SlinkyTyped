package typingsSlinky.reactDashLottie.reactDashLottieMod

import typingsSlinky.reactDashLottie.reactDashLottieStrings.DOMLoaded
import typingsSlinky.reactDashLottie.reactDashLottieStrings.complete
import typingsSlinky.reactDashLottie.reactDashLottieStrings.config_ready
import typingsSlinky.reactDashLottie.reactDashLottieStrings.data_ready
import typingsSlinky.reactDashLottie.reactDashLottieStrings.destroy
import typingsSlinky.reactDashLottie.reactDashLottieStrings.enterFrame
import typingsSlinky.reactDashLottie.reactDashLottieStrings.loaded_images
import typingsSlinky.reactDashLottie.reactDashLottieStrings.loopComplete
import typingsSlinky.reactDashLottie.reactDashLottieStrings.segmentStart
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

