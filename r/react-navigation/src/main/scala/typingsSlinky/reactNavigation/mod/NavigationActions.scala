package typingsSlinky.reactNavigation.mod

import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashBACK
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashINIT
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashNAVIGATE
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashSET_PARAMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-navigation", "NavigationActions")
@js.native
object NavigationActions extends js.Object {
  
  @JSName("BACK")
  val BACK_ : NavigationSlashBACK = js.native
  
  @JSName("INIT")
  val INIT_ : NavigationSlashINIT = js.native
  
  @JSName("NAVIGATE")
  val NAVIGATE_ : NavigationSlashNAVIGATE = js.native
  
  val SET_PARAMS: NavigationSlashSET_PARAMS = js.native
  
  def back(): NavigationBackAction = js.native
  def back(options: NavigationBackActionPayload): NavigationBackAction = js.native
  
  def init(): NavigationInitAction = js.native
  def init(options: NavigationInitActionPayload): NavigationInitAction = js.native
  
  def navigate(options: NavigationNavigateActionPayload): NavigationNavigateAction = js.native
  
  def setParams(options: NavigationSetParamsActionPayload): NavigationSetParamsAction = js.native
}
