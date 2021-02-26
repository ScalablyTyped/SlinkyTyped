package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.Options
import typingsSlinky.officeUiFabricReact.dropdownTypesMod.IDropdownProps
import typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDropdownMod {
  
  @JSImport("office-ui-fabric-react/lib/Dropdown", "Dropdown")
  @js.native
  val Dropdown: ReactComponentClass[IDropdownProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Dropdown", "DropdownBase")
  @js.native
  class DropdownBase protected ()
    extends typingsSlinky.officeUiFabricReact.dropdownMod.DropdownBase {
    def this(props: IDropdownProps) = this()
  }
  /* static members */
  object DropdownBase {
    
    @JSImport("office-ui-fabric-react/lib/Dropdown", "DropdownBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Dropdown", "DropdownBase.defaultProps")
    @js.native
    def defaultProps: Options = js.native
    @scala.inline
    def defaultProps_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Dropdown", "DropdownMenuItemType")
  @js.native
  object DropdownMenuItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SelectableOptionMenuItemType with Double] = js.native
    
    /* 1 */ val Divider: typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Divider with Double = js.native
    
    /* 2 */ val Header: typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Header with Double = js.native
    
    /* 0 */ val Normal: typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Normal with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Dropdown", "ResponsiveMode")
  @js.native
  object ResponsiveMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode with Double
      ] = js.native
    
    /* 2 */ val large: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.large with Double = js.native
    
    /* 1 */ val medium: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.medium with Double = js.native
    
    /* 0 */ val small: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.small with Double = js.native
    
    /* 999 */ val unknown: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.unknown with Double = js.native
    
    /* 3 */ val xLarge: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xLarge with Double = js.native
    
    /* 4 */ val xxLarge: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxLarge with Double = js.native
    
    /* 5 */ val xxxLarge: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxxLarge with Double = js.native
  }
}
