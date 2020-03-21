package typingsSlinky.emberController.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.emberController.AnonAs
import typingsSlinky.emberObject.actionHandlerMod.ActionHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControllerMixin extends ActionHandler {
  var model: js.Any
  var queryParams: String | (js.Array[String | StringDictionary[AnonAs]])
  var target: js.Object
  def replaceRoute(name: String, args: js.Any*): Unit
  def transitionToRoute(name: String, args: js.Any*): Unit
}

@JSImport("@ember/controller", "ControllerMixin")
@js.native
object ControllerMixin
  extends TopLevel[
      typingsSlinky.emberObject.mixinMod.default[ControllerMixin, typingsSlinky.emberObject.mod.default]
    ]

