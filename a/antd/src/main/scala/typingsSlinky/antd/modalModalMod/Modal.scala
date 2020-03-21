package typingsSlinky.antd.modalModalMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modal
  extends Component[ModalProps, js.Object, js.Any] {
  def handleCancel(e: SyntheticMouseEvent[HTMLButtonElement]): Unit = js.native
  def handleOk(e: SyntheticMouseEvent[HTMLButtonElement]): Unit = js.native
  def renderFooter(locale: ModalLocale): ReactElement = js.native
  def renderModal(hasGetPopupContainerGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
}

