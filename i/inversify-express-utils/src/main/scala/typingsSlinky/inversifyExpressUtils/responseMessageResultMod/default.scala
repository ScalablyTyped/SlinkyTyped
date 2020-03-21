package typingsSlinky.inversifyExpressUtils.responseMessageResultMod

import typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typingsSlinky.inversifyExpressUtils.httpResponseMessageMod.HttpResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results/ResponseMessageResult", JSImport.Default)
@js.native
class default protected () extends ResponseMessageResult {
  def this(message: HttpResponseMessage, apiController: BaseHttpController) = this()
  /* CompleteClass */
  override var apiController: js.Any = js.native
  /* CompleteClass */
  override var message: js.Any = js.native
  /* CompleteClass */
  override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
}

