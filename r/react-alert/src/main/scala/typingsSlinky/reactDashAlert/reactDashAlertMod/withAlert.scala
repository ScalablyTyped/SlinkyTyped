package typingsSlinky.reactDashAlert.reactDashAlertMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Context
import typingsSlinky.reactDashAlert.Anon_Alert
import typingsSlinky.reactDashAlert.reactDashAlertStrings.alert
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-alert", "withAlert")
@js.native
object withAlert extends js.Object {
  def apply[P /* <: Anon_Alert */](): js.Function1[
    /* c */ ReactComponentClass[P], 
    ReactComponentClass[Pick[P, Exclude[String, alert]]]
  ] = js.native
  def apply[P /* <: Anon_Alert */](context: Context[js.UndefOr[AlertManager]]): js.Function1[
    /* c */ ReactComponentClass[P], 
    ReactComponentClass[Pick[P, Exclude[String, alert]]]
  ] = js.native
}

