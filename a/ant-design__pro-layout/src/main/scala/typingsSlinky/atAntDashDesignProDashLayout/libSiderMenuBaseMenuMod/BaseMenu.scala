package typingsSlinky.atAntDashDesignProDashLayout.libSiderMenuBaseMenuMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import typingsSlinky.atAntDashDesignProDashLayout.libTypingsMod.MenuDataItem
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseMenu
  extends Component[BaseMenuProps, js.Object, js.Any] {
  var warp: js.UndefOr[HTMLDivElement] = js.native
  def conversionPath(path: String): String = js.native
  def getIntlName(item: MenuDataItem): js.UndefOr[String] = js.native
  /**
    * 判断是否是http链接.返回 Link 或 a
    * Judge whether it is http link.return a or Link
    * @memberof SiderMenu
    */
  def getMenuItemPath(item: MenuDataItem): js.UndefOr[js.Object | Null] = js.native
  /**
    * 获得菜单子节点
    */
  def getNavMenuItems(): js.Array[TagMod[Any]] = js.native
  def getNavMenuItems(menusData: js.Array[MenuDataItem]): js.Array[TagMod[Any]] = js.native
  def getPopupContainer(fixedHeader: Boolean, layout: String): HTMLElement = js.native
  def getRef(ref: HTMLDivElement): Unit = js.native
  def getSelectedMenuKeys(): js.Array[String] = js.native
  def getSelectedMenuKeys(pathname: String): js.Array[String] = js.native
  /**
    * get SubMenu or Item
    */
  def getSubMenuOrItem(item: MenuDataItem): TagMod[Any] = js.native
}

