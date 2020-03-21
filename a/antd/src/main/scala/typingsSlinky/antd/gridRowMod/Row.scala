package typingsSlinky.antd.gridRowMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Row
  extends Component[RowProps, RowState, js.Any] {
  var token: String = js.native
  @JSName("componentDidMount")
  def componentDidMount_MRow(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MRow(): Unit = js.native
  def getGutter(): js.Tuple2[Double, Double] = js.native
  def renderRow(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
}

