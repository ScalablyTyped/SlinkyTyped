package typingsSlinky.antd.esBreadcrumbBreadcrumbMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Breadcrumb
  extends Component[BreadcrumbProps, js.Any, js.Any] {
  def addChildPath(paths: js.Array[String], childPath: js.UndefOr[scala.Nothing], params: js.Any): js.Array[String] = js.native
  def addChildPath(paths: js.Array[String], childPath: String, params: js.Any): js.Array[String] = js.native
  @JSName("componentDidMount")
  def componentDidMount_MBreadcrumb(): Unit = js.native
  def genForRoutes(hasRoutesParamsSeparatorItemRender: BreadcrumbProps): js.Array[ReactElement] = js.native
  def getPath(path: String, params: js.Any): String = js.native
  def renderBreadcrumb(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
}

