package typingsSlinky.inversifyExpressUtils.createdNegotiatedContentResultMod

import typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typingsSlinky.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify-express-utils/dts/results/CreatedNegotiatedContentResult", JSImport.Default)
@js.native
class default[T] protected () extends CreatedNegotiatedContentResult[T] {
  def this(location: String, content: T, apiController: BaseHttpController) = this()
  def this(location: URL_, content: T, apiController: BaseHttpController) = this()
}
