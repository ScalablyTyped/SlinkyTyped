package typingsSlinky.fundamentalDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.fundamentalDashReact.fundamentalDashReactStrings.ActionBar
import typingsSlinky.fundamentalDashReact.libActionBarActionBarMod.ActionBarActionsProps
import typingsSlinky.fundamentalDashReact.libActionBarActionBarMod.ActionBarBackProps
import typingsSlinky.fundamentalDashReact.libActionBarActionBarMod.ActionBarHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionBar extends js.Object {
  var Actions: ReactComponentClass[ActionBarActionsProps] with Anon_ActionBarActions
  var Back: ReactComponentClass[ActionBarBackProps] with Anon_ActionBarBack
  var Header: ReactComponentClass[ActionBarHeaderProps] with Anon_ActionBarHeader
  var displayName: ActionBar
}

object Anon_ActionBar {
  @scala.inline
  def apply(
    Actions: ReactComponentClass[ActionBarActionsProps] with Anon_ActionBarActions,
    Back: ReactComponentClass[ActionBarBackProps] with Anon_ActionBarBack,
    Header: ReactComponentClass[ActionBarHeaderProps] with Anon_ActionBarHeader,
    displayName: ActionBar
  ): Anon_ActionBar = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Back = Back.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActionBar]
  }
}

