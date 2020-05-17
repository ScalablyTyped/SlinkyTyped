package typingsSlinky.antd.paginationPaginationMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.JumpNextIcon
import typingsSlinky.antd.antdStrings.ltr
import typingsSlinky.antd.antdStrings.rtl
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pagination
  extends Component[PaginationProps, js.Object, js.Any] {
  def getIconsProps(prefixCls: String): JumpNextIcon = js.native
  @JSName("getIconsProps")
  def getIconsProps_ltr(prefixCls: String, direction: ltr): JumpNextIcon = js.native
  @JSName("getIconsProps")
  def getIconsProps_rtl(prefixCls: String, direction: rtl): JumpNextIcon = js.native
  def renderPagination(contextLocale: js.Any): ReactElement = js.native
}

