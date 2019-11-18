package typingsSlinky.antd.esMentionsMod

import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.facade.ReactElement
import typingsSlinky.antd.Anon_Focused
import typingsSlinky.antd.esConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.antd.esConfigDashProviderRenderEmptyMod.RenderEmptyHandler
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.FocusEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mentions
  extends Component[MentionProps, MentionState, js.Any] {
  var onBlur: FocusEventHandler[HTMLTextAreaElement] = js.native
  var onFocus: FocusEventHandler[HTMLTextAreaElement] = js.native
  var rcMentions: js.Any = js.native
  @JSName("state")
  var state_Mentions: Anon_Focused = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def getFilterOption(): js.Any = js.native
  def getNotFoundContent(renderEmpty: RenderEmptyHandler): js.UndefOr[js.Object | Null] = js.native
  def getOptions(): js.UndefOr[js.Object | Null] = js.native
  def renderMentions(hasGetPrefixClsRenderEmpty: ConfigConsumerProps): ReactElement = js.native
  def saveMentions(node: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RcMentions */ js.Any): Unit = js.native
}

