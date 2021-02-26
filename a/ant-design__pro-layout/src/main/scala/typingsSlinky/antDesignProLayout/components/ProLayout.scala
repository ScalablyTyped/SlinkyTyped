package typingsSlinky.antDesignProLayout.components

import typingsSlinky.antDesignProLayout.basicLayoutMod.BasicLayoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProLayout {
  
  @JSImport("@ant-design/pro-layout", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ProLayout.type): SharedBuilder_BasicLayoutProps_97420028 = new SharedBuilder_BasicLayoutProps_97420028(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BasicLayoutProps): SharedBuilder_BasicLayoutProps_97420028 = new SharedBuilder_BasicLayoutProps_97420028(js.Array(this.component, p.asInstanceOf[js.Any]))
}
