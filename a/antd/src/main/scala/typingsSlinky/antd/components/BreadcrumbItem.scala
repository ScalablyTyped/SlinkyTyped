package typingsSlinky.antd.components

import typingsSlinky.antd.breadcrumbItemMod.BreadcrumbItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BreadcrumbItem {
  
  @JSImport("antd/lib/breadcrumb/BreadcrumbItem", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: BreadcrumbItemProps): SharedBuilder_BreadcrumbItemProps_2017195058 = new SharedBuilder_BreadcrumbItemProps_2017195058(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: BreadcrumbItem.type): SharedBuilder_BreadcrumbItemProps_2017195058 = new SharedBuilder_BreadcrumbItemProps_2017195058(js.Array(this.component, js.Dictionary.empty))()
}
