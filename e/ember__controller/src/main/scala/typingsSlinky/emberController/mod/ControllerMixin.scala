package typingsSlinky.emberController.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.emberObject.actionHandlerMod.ActionHandler
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControllerMixin extends ActionHandler {
  
  var model: js.Any = js.native
  
  var queryParams: js.Array[String | (Record[String, js.UndefOr[QueryParamConfig | String]])] = js.native
  
  def replaceRoute(name: String, args: js.Any*): Unit = js.native
  
  var target: js.Object = js.native
  
  def transitionToRoute(args: js.Any*): Unit = js.native
  def transitionToRoute(name: String, args: js.Any*): Unit = js.native
}
@JSImport("@ember/controller", "ControllerMixin")
@js.native
object ControllerMixin
  extends TopLevel[
      typingsSlinky.emberObject.mixinMod.default[ControllerMixin, typingsSlinky.emberObject.mod.default]
    ]
