package typingsSlinky.antd.scrollNumberMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.CElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollNumber
  extends Component[ScrollNumberProps, ScrollNumberState, js.Any] {
  var lastCount: js.UndefOr[String | Double | Null] = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MScrollNumber(_underscore: js.Any, prevState: ScrollNumberState): Unit = js.native
  def getPositionByNum(num: Double, i: Double): Double = js.native
  def onAnimated(): Unit = js.native
  def renderCurrentNumber(prefixCls: String, num: String, i: Double): ReactElement = js.native
  def renderCurrentNumber(prefixCls: String, num: Double, i: Double): ReactElement = js.native
  def renderNumberElement(prefixCls: String): js.UndefOr[String | Double | js.Array[ReactElement] | Null] = js.native
  def renderScrollNumber(hasGetPrefixCls: ConfigConsumerProps): (CElement[_, ReactComponentClass[_]]) | ReactElement = js.native
}

