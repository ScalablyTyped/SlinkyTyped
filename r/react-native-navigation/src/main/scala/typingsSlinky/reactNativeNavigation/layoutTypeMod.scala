package typingsSlinky.reactNativeNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutTypeMod {
  
  @js.native
  sealed trait LayoutType extends StObject
  @JSImport("react-native-navigation/lib/dist/commands/LayoutType", "LayoutType")
  @js.native
  object LayoutType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LayoutType with String] = js.native
    
    @js.native
    sealed trait BottomTabs extends LayoutType
    /* "BottomTabs" */ val BottomTabs: typingsSlinky.reactNativeNavigation.layoutTypeMod.LayoutType.BottomTabs with String = js.native
    
    @js.native
    sealed trait Component extends LayoutType
    /* "Component" */ val Component: typingsSlinky.reactNativeNavigation.layoutTypeMod.LayoutType.Component with String = js.native
    
    @js.native
    sealed trait ExternalComponent extends LayoutType
    /* "ExternalComponent" */ val ExternalComponent: typingsSlinky.reactNativeNavigation.layoutTypeMod.LayoutType.ExternalComponent with String = js.native
    
    @js.native
    sealed trait SideMenuCenter extends LayoutType
    /* "SideMenuCenter" */ val SideMenuCenter: typingsSlinky.reactNativeNavigation.layoutTypeMod.LayoutType.SideMenuCenter with String = js.native
    
    @js.native
    sealed trait SideMenuLeft extends LayoutType
    /* "SideMenuLeft" */ val SideMenuLeft: typingsSlinky.reactNativeNavigation.layoutTypeMod.LayoutType.SideMenuLeft with String = js.native
    
    @js.native
    sealed trait SideMenuRight extends LayoutType
    /* "SideMenuRight" */ val SideMenuRight: typingsSlinky.reactNativeNavigation.layoutTypeMod.LayoutType.SideMenuRight with String = js.native
    
    @js.native
    sealed trait SideMenuRoot extends LayoutType
    /* "SideMenuRoot" */ val SideMenuRoot: typingsSlinky.reactNativeNavigation.layoutTypeMod.LayoutType.SideMenuRoot with String = js.native
    
    @js.native
    sealed trait SplitView extends LayoutType
    /* "SplitView" */ val SplitView: typingsSlinky.reactNativeNavigation.layoutTypeMod.LayoutType.SplitView with String = js.native
    
    @js.native
    sealed trait Stack extends LayoutType
    /* "Stack" */ val Stack: typingsSlinky.reactNativeNavigation.layoutTypeMod.LayoutType.Stack with String = js.native
    
    @js.native
    sealed trait TopTabs extends LayoutType
    /* "TopTabs" */ val TopTabs: typingsSlinky.reactNativeNavigation.layoutTypeMod.LayoutType.TopTabs with String = js.native
  }
}
