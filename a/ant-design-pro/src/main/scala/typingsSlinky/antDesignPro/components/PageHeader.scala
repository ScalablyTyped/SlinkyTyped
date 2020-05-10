package typingsSlinky.antDesignPro.components

import slinky.core.TagMod
import typingsSlinky.antDesignPro.pageHeaderMod.PageHeaderProps
import typingsSlinky.antDesignPro.pageHeaderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PageHeader {
  @JSImport("ant-design-pro/lib/PageHeader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PageHeaderProps): SharedBuilder_PageHeaderProps65645423[default] = new SharedBuilder_PageHeaderProps65645423[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(itemRender: js.Any => TagMod[Any]): SharedBuilder_PageHeaderProps65645423[default] = {
    val __props = js.Dynamic.literal(itemRender = js.Any.fromFunction1(itemRender))
    new SharedBuilder_PageHeaderProps65645423[default](js.Array(this.component, __props.asInstanceOf[PageHeaderProps]))
  }
}

