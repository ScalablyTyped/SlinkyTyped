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
  var inferredSmall: js.Any = js.native
  var token: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MPagination(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MPagination(): Unit = js.native
  def getIconsProps(prefixCls: String): JumpNextIcon = js.native
  @JSName("getIconsProps")
  def getIconsProps_ltr(prefixCls: String, direction: ltr): JumpNextIcon = js.native
  @JSName("getIconsProps")
  def getIconsProps_rtl(prefixCls: String, direction: rtl): JumpNextIcon = js.native
  def renderPagination(contextLocale: PaginationLocale): ReactElement = js.native
}

