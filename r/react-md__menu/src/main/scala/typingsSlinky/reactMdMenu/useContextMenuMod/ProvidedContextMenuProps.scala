package typingsSlinky.reactMdMenu.useContextMenuMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.reactMdMenu.menuMod.MenuPositionOptions
import typingsSlinky.reactMdUtils.typesMod.PositionAnchor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Required<std.Pick<@react-md/menu.@react-md/menu/types/Menu.MenuProps, @react-md/menu.@react-md/menu/types/useContextMenu.ProvidedPropNames>> */
@js.native
trait ProvidedContextMenuProps extends js.Object {
  
  var anchor: PositionAnchor = js.native
  
  var classNames: js.Any = js.native
  
  var disableControlClickOkay: Boolean = js.native
  
  var id: String = js.native
  
  var onRequestClose: js.Function0[Unit] = js.native
  
  var positionOptions: MenuPositionOptions = js.native
  
  /**
    * A ref that must be provided to the `Menu` component that is acting as a
    * context menu if you want to allow the native context menus within this
    * custom context menu.
    *
    * If this is never provided to the `Menu` component, right clicking (to
    * inspect an element for example) will close this context menu.
    */
  def ref(): Unit = js.native
  def ref(instance: HTMLDivElement): Unit = js.native
  
  var visible: Boolean = js.native
}
