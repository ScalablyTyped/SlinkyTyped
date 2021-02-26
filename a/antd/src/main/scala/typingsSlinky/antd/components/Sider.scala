package typingsSlinky.antd.components

import typingsSlinky.antd.siderMod.SiderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sider {
  
  @JSImport("antd/lib/layout/Sider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Sider.type): SharedBuilder_SiderProps_1708189148 = new SharedBuilder_SiderProps_1708189148(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SiderProps): SharedBuilder_SiderProps_1708189148 = new SharedBuilder_SiderProps_1708189148(js.Array(this.component, p.asInstanceOf[js.Any]))
}
