package typingsSlinky.fundamentalDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.fundamentalDashReact.fundamentalDashReactStrings.Breadcrumb
import typingsSlinky.fundamentalDashReact.libBreadcrumbBreadcrumbMod.BreadcrumbItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Breadcrumb extends js.Object {
  var Item: ReactComponentClass[BreadcrumbItemProps] with Anon_BreadcrumbItem
  var displayName: Breadcrumb
}

object Anon_Breadcrumb {
  @scala.inline
  def apply(Item: ReactComponentClass[BreadcrumbItemProps] with Anon_BreadcrumbItem, displayName: Breadcrumb): Anon_Breadcrumb = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Breadcrumb]
  }
}

