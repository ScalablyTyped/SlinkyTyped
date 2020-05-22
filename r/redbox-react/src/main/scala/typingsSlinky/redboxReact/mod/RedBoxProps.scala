package typingsSlinky.redboxReact.mod

import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedBoxProps extends Props[RedBoxError] {
  var className: js.UndefOr[String] = js.undefined
  var editorScheme: js.UndefOr[String] = js.undefined
  var error: js.Error
  var filename: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var useColumns: js.UndefOr[Boolean] = js.undefined
  var useLines: js.UndefOr[Boolean] = js.undefined
}

object RedBoxProps {
  @scala.inline
  def apply(
    error: js.Error,
    children: TagMod[Any] = null,
    className: String = null,
    editorScheme: String = null,
    filename: String = null,
    key: Key = null,
    ref: js.UndefOr[Null | LegacyRef[RedBoxError]] = js.undefined,
    style: CSSProperties = null,
    useColumns: js.UndefOr[Boolean] = js.undefined,
    useLines: js.UndefOr[Boolean] = js.undefined
  ): RedBoxProps = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (editorScheme != null) __obj.updateDynamic("editorScheme")(editorScheme.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useColumns)) __obj.updateDynamic("useColumns")(useColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useLines)) __obj.updateDynamic("useLines")(useLines.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedBoxProps]
  }
}

