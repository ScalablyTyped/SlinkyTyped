package typingsSlinky.antDesignProLayout.components

import typingsSlinky.antDesignProLayout.footerMod.FooterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DefaultFooter {
  @JSImport("@ant-design/pro-layout", "DefaultFooter")
  @js.native
  object component extends js.Object
  
  def withProps(p: FooterProps): SharedBuilder_FooterProps_337457852 = new SharedBuilder_FooterProps_337457852(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DefaultFooter.type): SharedBuilder_FooterProps_337457852 = new SharedBuilder_FooterProps_337457852(js.Array(this.component, js.Dictionary.empty))()
}

