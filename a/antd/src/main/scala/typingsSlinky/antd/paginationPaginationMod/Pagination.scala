package typingsSlinky.antd.paginationPaginationMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.AnonJumpNextIcon
import typingsSlinky.antd.antdStrings.ltr
import typingsSlinky.antd.antdStrings.rtl
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pagination
  extends Component[PaginationProps, js.Object, js.Any] {
  def getIconsProps(prefixCls: String): AnonJumpNextIcon = js.native
  @JSName("getIconsProps")
  def getIconsProps_ltr(prefixCls: String, direction: ltr): AnonJumpNextIcon = js.native
  @JSName("getIconsProps")
  def getIconsProps_rtl(prefixCls: String, direction: rtl): AnonJumpNextIcon = js.native
  def renderPagination(contextLocale: js.Any): ReactElement = js.native
}

