package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.Options
import typingsSlinky.officeUiFabricReact.dropdownTypesMod.IDropdownProps
import typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Dropdown", JSImport.Namespace)
@js.native
object dropdownMod extends js.Object {
  @js.native
  class DropdownBase protected ()
    extends typingsSlinky.officeUiFabricReact.dropdownBaseMod.DropdownBase {
    def this(props: IDropdownProps) = this()
  }
  
  val Dropdown: ReactComponentClass[IDropdownProps] = js.native
  /* static members */
  @js.native
  object DropdownBase extends js.Object {
    var defaultProps: Options = js.native
  }
  
  @js.native
  object DropdownMenuItemType extends js.Object {
    /* 1 */ val Divider: typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Divider with Double = js.native
    /* 2 */ val Header: typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Header with Double = js.native
    /* 0 */ val Normal: typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SelectableOptionMenuItemType with Double] = js.native
  }
  
  @js.native
  object ResponsiveMode extends js.Object {
    /* 2 */ val large: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.large with Double = js.native
    /* 1 */ val medium: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.medium with Double = js.native
    /* 0 */ val small: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.small with Double = js.native
    /* 999 */ val unknown: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.unknown with Double = js.native
    /* 3 */ val xLarge: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xLarge with Double = js.native
    /* 4 */ val xxLarge: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxLarge with Double = js.native
    /* 5 */ val xxxLarge: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxxLarge with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode with Double
      ] = js.native
  }
  
}

