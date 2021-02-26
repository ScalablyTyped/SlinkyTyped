package typingsSlinky.antDesignProLayout.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Breadcrumb extends StObject {
  
  var breadcrumb: StringDictionary[MenuDataItem] = js.native
  
  var breadcrumbMap: Map[String, typingsSlinky.umijsRouteUtils.typesMod.MenuDataItem] = js.native
  
  var menuData: js.Array[typingsSlinky.umijsRouteUtils.typesMod.MenuDataItem] = js.native
}
object Breadcrumb {
  
  @scala.inline
  def apply(
    breadcrumb: StringDictionary[MenuDataItem],
    breadcrumbMap: Map[String, typingsSlinky.umijsRouteUtils.typesMod.MenuDataItem],
    menuData: js.Array[typingsSlinky.umijsRouteUtils.typesMod.MenuDataItem]
  ): Breadcrumb = {
    val __obj = js.Dynamic.literal(breadcrumb = breadcrumb.asInstanceOf[js.Any], breadcrumbMap = breadcrumbMap.asInstanceOf[js.Any], menuData = menuData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Breadcrumb]
  }
  
  @scala.inline
  implicit class BreadcrumbMutableBuilder[Self <: Breadcrumb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreadcrumb(value: StringDictionary[MenuDataItem]): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreadcrumbMap(value: Map[String, typingsSlinky.umijsRouteUtils.typesMod.MenuDataItem]): Self = StObject.set(x, "breadcrumbMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuData(value: js.Array[typingsSlinky.umijsRouteUtils.typesMod.MenuDataItem]): Self = StObject.set(x, "menuData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuDataVarargs(value: typingsSlinky.umijsRouteUtils.typesMod.MenuDataItem*): Self = StObject.set(x, "menuData", js.Array(value :_*))
  }
}
