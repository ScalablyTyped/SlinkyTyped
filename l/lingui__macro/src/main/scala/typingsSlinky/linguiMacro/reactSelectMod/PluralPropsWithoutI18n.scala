package typingsSlinky.linguiMacro.reactSelectMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.linguiMacro.renderMod.RenderProps
import typingsSlinky.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluralPropsWithoutI18n
  extends RenderProps
     with /* exact */ StringDictionary[ReactNode] {
  var few: js.UndefOr[TagMod[Any]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var many: js.UndefOr[TagMod[Any]] = js.undefined
  var offset: js.UndefOr[Double | String] = js.undefined
  var one: js.UndefOr[TagMod[Any]] = js.undefined
  var other: TagMod[Any]
  var two: js.UndefOr[TagMod[Any]] = js.undefined
  var value: Double | String
  var zero: js.UndefOr[TagMod[Any]] = js.undefined
}

object PluralPropsWithoutI18n {
  @scala.inline
  def apply(
    other: TagMod[Any],
    value: Double | String,
    StringDictionary: /* exact */ StringDictionary[TagMod[Any]] = null,
    className: String = null,
    description: String = null,
    few: TagMod[Any] = null,
    id: String = null,
    many: TagMod[Any] = null,
    offset: Double | String = null,
    one: TagMod[Any] = null,
    render: TagMod[Any] = null,
    two: TagMod[Any] = null,
    zero: TagMod[Any] = null
  ): PluralPropsWithoutI18n = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (few != null) __obj.updateDynamic("few")(few.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (many != null) __obj.updateDynamic("many")(many.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralPropsWithoutI18n]
  }
}

