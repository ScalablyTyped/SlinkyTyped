package typingsSlinky.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignProLayout.anon.ChangeSetting
import typingsSlinky.antDesignProLayout.libSettingDrawerMod.SettingItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutChangeMod extends Shortcut {
  
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer/LayoutChange", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ChangeSetting] = js.native
  
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer/LayoutChange", "renderLayoutSettingItem")
  @js.native
  def renderLayoutSettingItem(item: SettingItemProps): ReactElement = js.native
  
  type _To = ReactComponentClass[ChangeSetting]
  
  /* This means you don't have to write `default`, but can instead just say `layoutChangeMod.foo` */
  override def _to: ReactComponentClass[ChangeSetting] = default
}
