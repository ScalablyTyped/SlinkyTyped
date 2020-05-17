package typingsSlinky.antDesignProLayout.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Breadcrumb extends js.Object {
  var breadcrumb: StringDictionary[MenuDataItem] = js.native
  var breadcrumbMap: Map[String, MenuDataItem] = js.native
  var menuData: js.Array[MenuDataItem] = js.native
}

object Breadcrumb {
  @scala.inline
  def apply(
    breadcrumb: StringDictionary[MenuDataItem],
    breadcrumbMap: Map[String, MenuDataItem],
    menuData: js.Array[MenuDataItem]
  ): Breadcrumb = {
    val __obj = js.Dynamic.literal(breadcrumb = breadcrumb.asInstanceOf[js.Any], breadcrumbMap = breadcrumbMap.asInstanceOf[js.Any], menuData = menuData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breadcrumb]
  }
  @scala.inline
  implicit class BreadcrumbOps[Self <: Breadcrumb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreadcrumb(value: StringDictionary[MenuDataItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreadcrumbMap(value: Map[String, MenuDataItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadcrumbMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuData(value: js.Array[MenuDataItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

