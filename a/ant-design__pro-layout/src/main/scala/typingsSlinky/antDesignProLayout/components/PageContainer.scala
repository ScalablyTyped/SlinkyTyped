package typingsSlinky.antDesignProLayout.components

import typingsSlinky.antDesignProLayout.pageContainerMod.PageContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PageContainer {
  @JSImport("@ant-design/pro-layout", "PageContainer")
  @js.native
  object component extends js.Object
  
  def withProps(p: PageContainerProps): SharedBuilder_PageContainerProps470028446 = new SharedBuilder_PageContainerProps470028446(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PageContainer.type): SharedBuilder_PageContainerProps470028446 = new SharedBuilder_PageContainerProps470028446(js.Array(this.component, js.Dictionary.empty))()
}

