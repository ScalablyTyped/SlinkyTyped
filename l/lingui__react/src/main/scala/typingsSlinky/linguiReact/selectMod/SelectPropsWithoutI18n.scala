package typingsSlinky.linguiReact.selectMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.linguiReact.renderMod.RenderProps
import typingsSlinky.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectPropsWithoutI18n
  extends RenderProps
     with /* exact */ StringDictionary[ReactNode] {
  var id: js.UndefOr[String] = js.undefined
  var other: TagMod[Any]
  var value: String
}

object SelectPropsWithoutI18n {
  @scala.inline
  def apply(
    other: TagMod[Any],
    value: String,
    StringDictionary: /* exact */ StringDictionary[TagMod[Any]] = null,
    className: String = null,
    id: String = null,
    render: TagMod[Any] = null
  ): SelectPropsWithoutI18n = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectPropsWithoutI18n]
  }
}

