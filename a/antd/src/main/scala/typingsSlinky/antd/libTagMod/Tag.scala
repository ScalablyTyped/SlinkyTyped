package typingsSlinky.antd.libTagMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.Anon_Absolute
import typingsSlinky.antd.Anon_BackgroundColor
import typingsSlinky.antd.Anon_VisibleBoolean
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag
  extends Component[TagProps, TagState, js.Any] {
  @JSName("state")
  var state_Tag: Anon_VisibleBoolean = js.native
  def getTagClassName(hasGetPrefixCls: ConfigConsumerProps): String = js.native
  def getTagStyle(): Anon_BackgroundColor | Anon_Absolute = js.native
  def handleIconClick(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  def isPresetColor(): Boolean = js.native
  def renderCloseIcon(): ReactElement | Null = js.native
  def renderTag(configProps: ConfigConsumerProps): ReactElement = js.native
  def setVisible(visible: Boolean, e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
}

