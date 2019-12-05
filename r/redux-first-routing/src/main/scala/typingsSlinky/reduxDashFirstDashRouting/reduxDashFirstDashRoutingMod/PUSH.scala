package typingsSlinky.reduxDashFirstDashRouting.reduxDashFirstDashRoutingMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.history.historyMod.LocationDescriptorObject
import typingsSlinky.history.historyMod.LocationState
import typingsSlinky.reduxDashFirstDashRouting.reduxDashFirstDashRoutingStrings.`ROUTER/PUSH`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-first-routing", "PUSH")
@js.native
object PUSH extends TopLevel[`ROUTER/PUSH`]

@JSImport("redux-first-routing", "push")
@js.native
object push extends js.Object {
  def apply(href: String): pushAction[String] = js.native
  def apply(href: LocationDescriptorObject[LocationState]): pushAction[LocationDescriptorObject[LocationState]] = js.native
}

