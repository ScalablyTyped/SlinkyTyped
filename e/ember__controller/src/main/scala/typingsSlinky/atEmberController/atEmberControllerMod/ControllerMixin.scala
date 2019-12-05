package typingsSlinky.atEmberController.atEmberControllerMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atEmberController.Anon_As
import typingsSlinky.atEmberObject.dashPrivateActionDashHandlerMod.ActionHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControllerMixin extends ActionHandler {
  var model: js.Any
  var queryParams: String | (js.Array[String | StringDictionary[Anon_As]])
  var target: js.Object
  def replaceRoute(name: String, args: js.Any*): Unit
  def transitionToRoute(name: String, args: js.Any*): Unit
}

@JSImport("@ember/controller", "ControllerMixin")
@js.native
object ControllerMixin
  extends TopLevel[
      typingsSlinky.atEmberObject.mixinMod.default[ControllerMixin, typingsSlinky.atEmberObject.atEmberObjectMod.default]
    ]

