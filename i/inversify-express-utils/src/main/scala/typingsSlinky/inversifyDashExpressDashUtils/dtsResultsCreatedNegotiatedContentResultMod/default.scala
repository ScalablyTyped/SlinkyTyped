package typingsSlinky.inversifyDashExpressDashUtils.dtsResultsCreatedNegotiatedContentResultMod

import typingsSlinky.inversifyDashExpressDashUtils.dtsBaseUnderscoreHttpUnderscoreControllerMod.BaseHttpController
import typingsSlinky.inversifyDashExpressDashUtils.dtsHttpResponseMessageMod.HttpResponseMessage
import typingsSlinky.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-express-utils/dts/results/CreatedNegotiatedContentResult", JSImport.Default)
@js.native
class default[T] protected () extends CreatedNegotiatedContentResult[T] {
  def this(location: String, content: T, apiController: BaseHttpController) = this()
  def this(location: URL, content: T, apiController: BaseHttpController) = this()
  /* CompleteClass */
  override var apiController: js.Any = js.native
  /* CompleteClass */
  override var content: js.Any = js.native
  /* CompleteClass */
  override var location: js.Any = js.native
  /* CompleteClass */
  override def executeAsync(): js.Promise[HttpResponseMessage] = js.native
}

