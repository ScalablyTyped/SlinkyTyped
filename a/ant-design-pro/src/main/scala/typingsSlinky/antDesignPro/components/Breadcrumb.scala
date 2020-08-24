package typingsSlinky.antDesignPro.components

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignPro.breadcrumbMod.default
import typingsSlinky.antDesignPro.pageHeaderMod.PageHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Breadcrumb {
  @JSImport("ant-design-pro/lib/PageHeader/breadcrumb", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PageHeaderProps): SharedBuilder_PageHeaderProps65645423[default] = new SharedBuilder_PageHeaderProps65645423[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(itemRender: js.Any => ReactElement): SharedBuilder_PageHeaderProps65645423[default] = {
    val __props = js.Dynamic.literal(itemRender = js.Any.fromFunction1(itemRender))
    new SharedBuilder_PageHeaderProps65645423[default](js.Array(this.component, __props.asInstanceOf[PageHeaderProps]))
  }
}

