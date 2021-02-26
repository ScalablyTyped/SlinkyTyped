package typingsSlinky.antDesignPro.components

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignPro.pageHeaderMod.PageHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PageHeader {
  
  @scala.inline
  def apply(itemRender: js.Any => ReactElement): SharedBuilder_PageHeaderProps65645423[typingsSlinky.antDesignPro.mod.PageHeader] = {
    val __props = js.Dynamic.literal(itemRender = js.Any.fromFunction1(itemRender))
    new SharedBuilder_PageHeaderProps65645423[typingsSlinky.antDesignPro.mod.PageHeader](js.Array(this.component, __props.asInstanceOf[PageHeaderProps]))
  }
  
  @JSImport("ant-design-pro", "PageHeader")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PageHeaderProps): SharedBuilder_PageHeaderProps65645423[typingsSlinky.antDesignPro.mod.PageHeader] = new SharedBuilder_PageHeaderProps65645423[typingsSlinky.antDesignPro.mod.PageHeader](js.Array(this.component, p.asInstanceOf[js.Any]))
}
