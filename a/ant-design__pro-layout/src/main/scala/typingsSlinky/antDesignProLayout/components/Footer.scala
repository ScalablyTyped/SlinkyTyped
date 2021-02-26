package typingsSlinky.antDesignProLayout.components

import typingsSlinky.antDesignProLayout.footerMod.FooterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Footer {
  
  @JSImport("@ant-design/pro-layout/lib/Footer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Footer.type): SharedBuilder_FooterProps_337457852 = new SharedBuilder_FooterProps_337457852(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FooterProps): SharedBuilder_FooterProps_337457852 = new SharedBuilder_FooterProps_337457852(js.Array(this.component, p.asInstanceOf[js.Any]))
}
