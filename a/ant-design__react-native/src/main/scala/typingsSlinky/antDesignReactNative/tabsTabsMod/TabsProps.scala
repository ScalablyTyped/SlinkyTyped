package typingsSlinky.antDesignReactNative.tabsTabsMod

import typingsSlinky.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsSlinky.antDesignReactNative.styleTabsMod.TabsStyle
import typingsSlinky.antDesignReactNative.tabsPropsTypeMod.PropsType
import typingsSlinky.antDesignReactNative.tabsPropsTypeMod.TabData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabsProps
  extends PropsType
     with WithThemeStyles[TabsStyle]
object TabsProps {
  
  @scala.inline
  def apply(tabs: js.Array[TabData]): TabsProps = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}
