package typingsSlinky.reactDashNavigation.reactDashNavigationMod

import typingsSlinky.reactDashNavigation.reactDashNavigationStrings.`Navigation/BACK`
import typingsSlinky.reactDashNavigation.reactDashNavigationStrings.`Navigation/INIT`
import typingsSlinky.reactDashNavigation.reactDashNavigationStrings.`Navigation/NAVIGATE`
import typingsSlinky.reactDashNavigation.reactDashNavigationStrings.`Navigation/SET_PARAMS`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "NavigationActions")
@js.native
object NavigationActions extends js.Object {
  val BACK: `Navigation/BACK` = js.native
  val INIT: `Navigation/INIT` = js.native
  val NAVIGATE: `Navigation/NAVIGATE` = js.native
  val SET_PARAMS: `Navigation/SET_PARAMS` = js.native
  def back(): NavigationBackAction = js.native
  def back(options: NavigationBackActionPayload): NavigationBackAction = js.native
  def init(): NavigationInitAction = js.native
  def init(options: NavigationInitActionPayload): NavigationInitAction = js.native
  def navigate(options: NavigationNavigateActionPayload): NavigationNavigateAction = js.native
  def setParams(options: NavigationSetParamsActionPayload): NavigationSetParamsAction = js.native
}

