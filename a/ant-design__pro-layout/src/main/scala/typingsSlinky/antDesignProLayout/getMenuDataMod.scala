package typingsSlinky.antDesignProLayout

import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import typingsSlinky.antDesignProLayout.typingsMod.MessageDescriptor
import typingsSlinky.antDesignProLayout.typingsMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout/lib/utils/getMenuData", JSImport.Namespace)
@js.native
object getMenuDataMod extends js.Object {
  def default(routes: js.Array[Route]): AnonBreadcrumb = js.native
  def default(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): AnonBreadcrumb = js.native
  def default(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): AnonBreadcrumb = js.native
  def default(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): AnonBreadcrumb = js.native
  def default(routes: js.Array[Route], menu: AnonLocale): AnonBreadcrumb = js.native
  def default(
    routes: js.Array[Route],
    menu: AnonLocale,
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): AnonBreadcrumb = js.native
  def default(
    routes: js.Array[Route],
    menu: AnonLocale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): AnonBreadcrumb = js.native
  def default(
    routes: js.Array[Route],
    menu: AnonLocale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): AnonBreadcrumb = js.native
}

