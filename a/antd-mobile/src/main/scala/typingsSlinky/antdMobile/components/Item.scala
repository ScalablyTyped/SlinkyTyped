package typingsSlinky.antdMobile.components

import typingsSlinky.antdMobile.tabBarPropsTypeMod.TabBarItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Item {
  
  @scala.inline
  def apply(title: String): SharedBuilder_TabBarItemProps_2089191354[typingsSlinky.antdMobile.tabBarMod.Item] = {
    val __props = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    new SharedBuilder_TabBarItemProps_2089191354[typingsSlinky.antdMobile.tabBarMod.Item](js.Array(this.component, __props.asInstanceOf[TabBarItemProps]))
  }
  
  @JSImport("antd-mobile/lib/tab-bar", "Item")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TabBarItemProps): SharedBuilder_TabBarItemProps_2089191354[typingsSlinky.antdMobile.tabBarMod.Item] = new SharedBuilder_TabBarItemProps_2089191354[typingsSlinky.antdMobile.tabBarMod.Item](js.Array(this.component, p.asInstanceOf[js.Any]))
}
