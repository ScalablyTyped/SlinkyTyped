package typingsSlinky.reactDashNativeDashNavigation

import typingsSlinky.reactDashNativeDashNavigation.libDistCommandsLayoutTypeMod.LayoutType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/commands/LayoutType", JSImport.Namespace)
@js.native
object libDistCommandsLayoutTypeMod extends js.Object {
  @js.native
  sealed trait LayoutType extends js.Object
  
  @js.native
  object LayoutType extends js.Object {
    @js.native
    sealed trait BottomTabs extends LayoutType
    
    @js.native
    sealed trait Component extends LayoutType
    
    @js.native
    sealed trait ExternalComponent extends LayoutType
    
    @js.native
    sealed trait SideMenuCenter extends LayoutType
    
    @js.native
    sealed trait SideMenuLeft extends LayoutType
    
    @js.native
    sealed trait SideMenuRight extends LayoutType
    
    @js.native
    sealed trait SideMenuRoot extends LayoutType
    
    @js.native
    sealed trait SplitView extends LayoutType
    
    @js.native
    sealed trait Stack extends LayoutType
    
    @js.native
    sealed trait TopTabs extends LayoutType
    
    /* "BottomTabs" */ val BottomTabs: typingsSlinky.reactDashNativeDashNavigation.libDistCommandsLayoutTypeMod.LayoutType.BottomTabs with String = js.native
    /* "Component" */ val Component: typingsSlinky.reactDashNativeDashNavigation.libDistCommandsLayoutTypeMod.LayoutType.Component with String = js.native
    /* "ExternalComponent" */ val ExternalComponent: typingsSlinky.reactDashNativeDashNavigation.libDistCommandsLayoutTypeMod.LayoutType.ExternalComponent with String = js.native
    /* "SideMenuCenter" */ val SideMenuCenter: typingsSlinky.reactDashNativeDashNavigation.libDistCommandsLayoutTypeMod.LayoutType.SideMenuCenter with String = js.native
    /* "SideMenuLeft" */ val SideMenuLeft: typingsSlinky.reactDashNativeDashNavigation.libDistCommandsLayoutTypeMod.LayoutType.SideMenuLeft with String = js.native
    /* "SideMenuRight" */ val SideMenuRight: typingsSlinky.reactDashNativeDashNavigation.libDistCommandsLayoutTypeMod.LayoutType.SideMenuRight with String = js.native
    /* "SideMenuRoot" */ val SideMenuRoot: typingsSlinky.reactDashNativeDashNavigation.libDistCommandsLayoutTypeMod.LayoutType.SideMenuRoot with String = js.native
    /* "SplitView" */ val SplitView: typingsSlinky.reactDashNativeDashNavigation.libDistCommandsLayoutTypeMod.LayoutType.SplitView with String = js.native
    /* "Stack" */ val Stack: typingsSlinky.reactDashNativeDashNavigation.libDistCommandsLayoutTypeMod.LayoutType.Stack with String = js.native
    /* "TopTabs" */ val TopTabs: typingsSlinky.reactDashNativeDashNavigation.libDistCommandsLayoutTypeMod.LayoutType.TopTabs with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LayoutType with String] = js.native
  }
  
}

