package typingsSlinky.antdMobile.modalModalMod

import slinky.core.facade.ReactElement
import typingsSlinky.antdMobile.modalPropsTypeMod.Action
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modal
  extends ModalComponent[ModalProps, js.Any] {
  def renderFooterButton(button: Action[CSSProperties], prefixCls: js.UndefOr[scala.Nothing], i: Double): ReactElement = js.native
  def renderFooterButton(button: Action[CSSProperties], prefixCls: String, i: Double): ReactElement = js.native
}

