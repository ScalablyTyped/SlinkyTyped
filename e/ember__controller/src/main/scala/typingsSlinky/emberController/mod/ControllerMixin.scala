package typingsSlinky.emberController.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.emberController.anon.As
import typingsSlinky.emberObject.actionHandlerMod.ActionHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControllerMixin extends ActionHandler {
  var model: js.Any = js.native
  var queryParams: String | (js.Array[String | StringDictionary[As]]) = js.native
  var target: js.Object = js.native
  def replaceRoute(name: String, args: js.Any*): Unit = js.native
  def transitionToRoute(args: js.Any*): Unit = js.native
  def transitionToRoute(name: String, args: js.Any*): Unit = js.native
}

@JSImport("@ember/controller", "ControllerMixin")
@js.native
object ControllerMixin
  extends TopLevel[
      typingsSlinky.emberObject.mixinMod.default[ControllerMixin, typingsSlinky.emberObject.mod.default]
    ]

