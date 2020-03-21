package typingsSlinky.antd.cardMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Card
  extends Component[CardProps, js.Object, js.Any] {
  def isContainGrid(): js.UndefOr[scala.Nothing] = js.native
  def onTabChange(key: String): Unit = js.native
  def renderCard(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
}

