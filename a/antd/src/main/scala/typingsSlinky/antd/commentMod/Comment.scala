package typingsSlinky.antd.commentMod

import slinky.core.facade.ReactElement
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment
  extends Component[CommentProps, js.Object, js.Any] {
  def renderComment(hasGetPrefixClsDirection: ConfigConsumerProps): ReactElement = js.native
  def renderNested(prefixCls: String, children: js.Any): ReactElement = js.native
}

