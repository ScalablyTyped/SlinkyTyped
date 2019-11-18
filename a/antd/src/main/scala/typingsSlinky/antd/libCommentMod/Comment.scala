package typingsSlinky.antd.libCommentMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment
  extends Component[CommentProps, js.Object, js.Any] {
  def renderComment(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
  def renderNested(prefixCls: String, children: js.Any): ReactElement = js.native
}

