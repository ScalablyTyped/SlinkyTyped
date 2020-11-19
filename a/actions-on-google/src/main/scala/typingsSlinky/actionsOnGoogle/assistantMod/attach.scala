package typingsSlinky.actionsOnGoogle.assistantMod

import typingsSlinky.actionsOnGoogle.frameworkFrameworkMod.OmniHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/assistant", "attach")
@js.native
object attach extends js.Object {
  
  def apply[TService](service: TService): OmniHandler with BaseApp with TService = js.native
  def apply[TService](service: TService, options: AppOptions): OmniHandler with BaseApp with TService = js.native
}
