package typingsSlinky.antd.tagMod

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.anon.AlignContent
import typingsSlinky.antd.anon.BackgroundColor
import typingsSlinky.antd.anon.VisibleBoolean
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag
  extends Component[TagProps, TagState, js.Any] {
  @JSName("state")
  var state_Tag: VisibleBoolean = js.native
  def getTagClassName(hasGetPrefixClsDirection: ConfigConsumerProps): String = js.native
  def getTagStyle(): BackgroundColor | AlignContent = js.native
  def handleIconClick(e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  def isPresetColor(): Boolean = js.native
  def renderCloseIcon(): ReactElement | Null = js.native
  def renderTag(configProps: ConfigConsumerProps): ReactElement = js.native
  def setVisible(visible: Boolean, e: SyntheticMouseEvent[HTMLElement]): Unit = js.native
}

