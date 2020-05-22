package typingsSlinky.antd.commentMod

import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentProps extends js.Object {
  /** List of action items rendered below the comment content */
  var actions: js.UndefOr[js.Array[TagMod[Any]]] = js.undefined
  /** The element to display as the comment author. */
  var author: js.UndefOr[TagMod[Any]] = js.undefined
  /** The element to display as the comment avatar - generally an antd Avatar */
  var avatar: js.UndefOr[TagMod[Any]] = js.undefined
  /** Nested comments should be provided as children of the Comment */
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  /** className of comment */
  var className: js.UndefOr[String] = js.undefined
  /** The main content of the comment */
  var content: TagMod[Any]
  /** A datetime element containing the time to be displayed */
  var datetime: js.UndefOr[TagMod[Any]] = js.undefined
  /** Comment prefix defaults to '.ant-comment' */
  var prefixCls: js.UndefOr[String] = js.undefined
  /** Additional style for the comment */
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CommentProps {
  @scala.inline
  def apply(
    actions: js.Array[TagMod[Any]] = null,
    author: TagMod[Any] = null,
    avatar: TagMod[Any] = null,
    children: TagMod[Any] = null,
    className: String = null,
    content: TagMod[Any] = null,
    datetime: TagMod[Any] = null,
    prefixCls: String = null,
    style: CSSProperties = null
  ): CommentProps = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (datetime != null) __obj.updateDynamic("datetime")(datetime.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentProps]
  }
}

