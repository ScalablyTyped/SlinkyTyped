package typingsSlinky.antDesignProLayout.components

import typingsSlinky.antDesignProLayout.pageContainerMod.PageContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PageHeaderWrapper {
  
  @JSImport("@ant-design/pro-layout", "PageHeaderWrapper")
  @js.native
  object component extends js.Object
  
  def withProps(p: PageContainerProps): SharedBuilder_PageContainerProps470028446 = new SharedBuilder_PageContainerProps470028446(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PageHeaderWrapper.type): SharedBuilder_PageContainerProps470028446 = new SharedBuilder_PageContainerProps470028446(js.Array(this.component, js.Dictionary.empty))()
}
