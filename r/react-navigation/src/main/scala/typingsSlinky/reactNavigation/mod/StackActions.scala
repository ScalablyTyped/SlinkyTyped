package typingsSlinky.reactNavigation.mod

import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashCOMPLETE_TRANSITION
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashPOP
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashPOP_TO_TOP
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashPUSH
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashREPLACE
import typingsSlinky.reactNavigation.reactNavigationStrings.NavigationSlashRESET
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StackActions {
  
  @JSImport("react-navigation", "StackActions.COMPLETE_TRANSITION")
  @js.native
  val COMPLETE_TRANSITION: NavigationSlashCOMPLETE_TRANSITION = js.native
  
  @JSImport("react-navigation", "StackActions.POP")
  @js.native
  val POP_ : NavigationSlashPOP = js.native
  
  @JSImport("react-navigation", "StackActions.POP_TO_TOP")
  @js.native
  val POP_TO_TOP: NavigationSlashPOP_TO_TOP = js.native
  
  @JSImport("react-navigation", "StackActions.PUSH")
  @js.native
  val PUSH_ : NavigationSlashPUSH = js.native
  
  @JSImport("react-navigation", "StackActions.REPLACE")
  @js.native
  val REPLACE_ : NavigationSlashREPLACE = js.native
  
  @JSImport("react-navigation", "StackActions.RESET")
  @js.native
  val RESET_ : NavigationSlashRESET = js.native
  
  @JSImport("react-navigation", "StackActions.completeTransition")
  @js.native
  def completeTransition(): NavigationCompleteTransitionAction = js.native
  @JSImport("react-navigation", "StackActions.completeTransition")
  @js.native
  def completeTransition(payload: NavigationCompleteTransitionActionPayload): NavigationCompleteTransitionAction = js.native
  
  @JSImport("react-navigation", "StackActions.pop")
  @js.native
  def pop(): NavigationPopAction = js.native
  @JSImport("react-navigation", "StackActions.pop")
  @js.native
  def pop(options: NavigationPopActionPayload): NavigationPopAction = js.native
  
  @JSImport("react-navigation", "StackActions.popToTop")
  @js.native
  def popToTop(): NavigationPopToTopAction = js.native
  @JSImport("react-navigation", "StackActions.popToTop")
  @js.native
  def popToTop(options: NavigationPopToTopActionPayload): NavigationPopToTopAction = js.native
  
  @JSImport("react-navigation", "StackActions.push")
  @js.native
  def push(options: NavigationPushActionPayload): NavigationPushAction = js.native
  
  @JSImport("react-navigation", "StackActions.replace")
  @js.native
  def replace(options: NavigationReplaceActionPayload): NavigationReplaceAction = js.native
  
  @JSImport("react-navigation", "StackActions.reset")
  @js.native
  def reset(options: NavigationResetActionPayload): NavigationResetAction = js.native
}
