package typingsSlinky.reactNavigation.mod

import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashCOMPLETE_TRANSITION
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashPOP
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashPOP_TO_TOP
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashPUSH
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashREPLACE
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashRESET
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-navigation", "StackActions")
@js.native
object StackActions extends js.Object {
  
  val COMPLETE_TRANSITION: NavigationSlashCOMPLETE_TRANSITION = js.native
  
  @JSName("POP")
  val POP_ : NavigationSlashPOP = js.native
  
  val POP_TO_TOP: NavigationSlashPOP_TO_TOP = js.native
  
  @JSName("PUSH")
  val PUSH_ : NavigationSlashPUSH = js.native
  
  @JSName("REPLACE")
  val REPLACE_ : NavigationSlashREPLACE = js.native
  
  @JSName("RESET")
  val RESET_ : NavigationSlashRESET = js.native
  
  def completeTransition(): NavigationCompleteTransitionAction = js.native
  def completeTransition(payload: NavigationCompleteTransitionActionPayload): NavigationCompleteTransitionAction = js.native
  
  def pop(): NavigationPopAction = js.native
  def pop(options: NavigationPopActionPayload): NavigationPopAction = js.native
  
  def popToTop(): NavigationPopToTopAction = js.native
  def popToTop(options: NavigationPopToTopActionPayload): NavigationPopToTopAction = js.native
  
  def push(options: NavigationPushActionPayload): NavigationPushAction = js.native
  
  def replace(options: NavigationReplaceActionPayload): NavigationReplaceAction = js.native
  
  def reset(options: NavigationResetActionPayload): NavigationResetAction = js.native
}
