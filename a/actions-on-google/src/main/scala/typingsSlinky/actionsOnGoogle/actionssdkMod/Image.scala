package typingsSlinky.actionsOnGoogle.actionssdkMod

import typingsSlinky.actionsOnGoogle.imageMod.ImageOptions
import typingsSlinky.actionsOnGoogle.incomingMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk", "Image")
@js.native
class Image protected ()
  extends typingsSlinky.actionsOnGoogle.conversationMod.Image
     with IncomingMessage {
  /**
    * @param options Image options
    * @public
    */
  def this(option: ImageOptions) = this()
}

