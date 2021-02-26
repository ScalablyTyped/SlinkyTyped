package typingsSlinky.antDesignPro.components

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignPro.breadcrumbMod.default
import typingsSlinky.antDesignPro.pageHeaderMod.PageHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breadcrumb {
  
  @scala.inline
  def apply(itemRender: js.Any => ReactElement): SharedBuilder_PageHeaderProps65645423[default] = {
    val __props = js.Dynamic.literal(itemRender = js.Any.fromFunction1(itemRender))
    new SharedBuilder_PageHeaderProps65645423[default](js.Array(this.component, __props.asInstanceOf[PageHeaderProps]))
  }
  
  @JSImport("ant-design-pro/lib/PageHeader/breadcrumb", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PageHeaderProps): SharedBuilder_PageHeaderProps65645423[default] = new SharedBuilder_PageHeaderProps65645423[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
