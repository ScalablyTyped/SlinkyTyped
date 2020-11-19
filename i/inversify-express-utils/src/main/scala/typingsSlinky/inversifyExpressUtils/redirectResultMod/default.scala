package typingsSlinky.inversifyExpressUtils.redirectResultMod

import typingsSlinky.inversifyExpressUtils.baseHttpControllerMod.BaseHttpController
import typingsSlinky.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify-express-utils/dts/results/RedirectResult", JSImport.Default)
@js.native
class default protected () extends RedirectResult {
  def this(location: String, apiController: BaseHttpController) = this()
  def this(location: URL_, apiController: BaseHttpController) = this()
}
