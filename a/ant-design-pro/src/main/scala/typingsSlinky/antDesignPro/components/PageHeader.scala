package typingsSlinky.antDesignPro.components

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignPro.pageHeaderMod.PageHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PageHeader {
  
  @JSImport("ant-design-pro", "PageHeader")
  @js.native
  object component extends js.Object
  
  def withProps(p: PageHeaderProps): SharedBuilder_PageHeaderProps65645423[typingsSlinky.antDesignPro.mod.PageHeader] = new SharedBuilder_PageHeaderProps65645423[typingsSlinky.antDesignPro.mod.PageHeader](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(itemRender: js.Any => ReactElement): SharedBuilder_PageHeaderProps65645423[typingsSlinky.antDesignPro.mod.PageHeader] = {
    val __props = js.Dynamic.literal(itemRender = js.Any.fromFunction1(itemRender))
    new SharedBuilder_PageHeaderProps65645423[typingsSlinky.antDesignPro.mod.PageHeader](js.Array(this.component, __props.asInstanceOf[PageHeaderProps]))
  }
}
