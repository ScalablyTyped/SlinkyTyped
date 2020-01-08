package typingsSlinky.fundamentalDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.fundamentalDashReact.fundamentalDashReactStrings.Panel
import typingsSlinky.fundamentalDashReact.libPanelPanelMod.PanelActionsProps
import typingsSlinky.fundamentalDashReact.libPanelPanelMod.PanelBodyProps
import typingsSlinky.fundamentalDashReact.libPanelPanelMod.PanelFiltersProps
import typingsSlinky.fundamentalDashReact.libPanelPanelMod.PanelFooterProps
import typingsSlinky.fundamentalDashReact.libPanelPanelMod.PanelHeadProps
import typingsSlinky.fundamentalDashReact.libPanelPanelMod.PanelHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actions extends js.Object {
  var Actions: ReactComponentClass[PanelActionsProps] with Anon_DisplayNamePanelActions
  var Body: ReactComponentClass[PanelBodyProps] with Anon_DisplayNamePanelBody
  var Filters: ReactComponentClass[PanelFiltersProps] with Anon_DisplayNamePanelFilters
  var Footer: ReactComponentClass[PanelFooterProps] with Anon_DisplayNamePanelFooter
  var Head: ReactComponentClass[PanelHeadProps] with Anon_DisplayNamePanelHead
  var Header: ReactComponentClass[PanelHeaderProps] with Anon_DisplayNamePanelHeader
  var displayName: Panel
}

object Anon_Actions {
  @scala.inline
  def apply(
    Actions: ReactComponentClass[PanelActionsProps] with Anon_DisplayNamePanelActions,
    Body: ReactComponentClass[PanelBodyProps] with Anon_DisplayNamePanelBody,
    Filters: ReactComponentClass[PanelFiltersProps] with Anon_DisplayNamePanelFilters,
    Footer: ReactComponentClass[PanelFooterProps] with Anon_DisplayNamePanelFooter,
    Head: ReactComponentClass[PanelHeadProps] with Anon_DisplayNamePanelHead,
    Header: ReactComponentClass[PanelHeaderProps] with Anon_DisplayNamePanelHeader,
    displayName: Panel
  ): Anon_Actions = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], Footer = Footer.asInstanceOf[js.Any], Head = Head.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Actions]
  }
}

