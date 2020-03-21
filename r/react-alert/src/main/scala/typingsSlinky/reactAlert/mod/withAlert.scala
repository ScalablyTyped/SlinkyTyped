package typingsSlinky.reactAlert.mod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Context
import typingsSlinky.reactAlert.AnonAlert
import typingsSlinky.reactAlert.reactAlertStrings.alert
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-alert", "withAlert")
@js.native
object withAlert extends js.Object {
  def apply[P /* <: AnonAlert */](): js.Function1[
    /* c */ ReactComponentClass[P], 
    ReactComponentClass[Pick[P, Exclude[String, alert]]]
  ] = js.native
  def apply[P /* <: AnonAlert */](context: Context[js.UndefOr[AlertManager]]): js.Function1[
    /* c */ ReactComponentClass[P], 
    ReactComponentClass[Pick[P, Exclude[String, alert]]]
  ] = js.native
}

