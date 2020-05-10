package typingsSlinky.antDesignProLayout.components

import typingsSlinky.antDesignProLayout.footerMod.FooterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Footer {
  @JSImport("@ant-design/pro-layout/lib/Footer", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: FooterProps): SharedBuilder_FooterProps_337457852 = new SharedBuilder_FooterProps_337457852(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Footer.type): SharedBuilder_FooterProps_337457852 = new SharedBuilder_FooterProps_337457852(js.Array(this.component, js.Dictionary.empty))()
}

