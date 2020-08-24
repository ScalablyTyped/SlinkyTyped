package typingsSlinky.antDesignProLayout.components

import typingsSlinky.antDesignProLayout.basicLayoutMod.BasicLayoutProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BasicLayout {
  @JSImport("@ant-design/pro-layout", "BasicLayout")
  @js.native
  object component extends js.Object
  
  def withProps(p: BasicLayoutProps): SharedBuilder_BasicLayoutProps_97420028 = new SharedBuilder_BasicLayoutProps_97420028(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BasicLayout.type): SharedBuilder_BasicLayoutProps_97420028 = new SharedBuilder_BasicLayoutProps_97420028(js.Array(this.component, js.Dictionary.empty))()
}

