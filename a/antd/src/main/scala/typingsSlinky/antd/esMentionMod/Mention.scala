package typingsSlinky.antd.esMentionMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mention
  extends Component[MentionProps, MentionState, js.Any] {
  var mentionEle: js.Any = js.native
  def defaultSearchChange(value: String): Unit = js.native
  def focus(): Unit = js.native
  def mentionRef(ele: js.Any): Unit = js.native
  def onBlur(ev: SyntheticFocusEvent[HTMLElement]): Unit = js.native
  def onChange(editorState: js.Any): Unit = js.native
  def onFocus(ev: SyntheticFocusEvent[HTMLElement]): Unit = js.native
  def onSearchChange(value: String, prefix: String): js.Any = js.native
  def renderMention(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
}

