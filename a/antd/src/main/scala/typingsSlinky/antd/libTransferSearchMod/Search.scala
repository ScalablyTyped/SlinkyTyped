package typingsSlinky.antd.libTransferSearchMod

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.reactMod.ChangeEvent
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Search
  extends Component[TransferSearchProps, js.Any, js.Any] {
  def handleChange(e: ChangeEvent[HTMLInputElement]): Unit = js.native
  def handleClear(e: SyntheticMouseEvent[HTMLAnchorElement]): Unit = js.native
}

