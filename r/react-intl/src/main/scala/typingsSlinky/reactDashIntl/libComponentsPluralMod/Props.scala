package typingsSlinky.reactDashIntl.libComponentsPluralMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.reactDashIntl.libTypesMod.CustomFormatConfig
import typingsSlinky.reactDashIntl.libTypesMod.IntlShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped std.Intl.PluralRulesOptions extends 'localeMatcher' ? never : std.Intl.PluralRulesOptions */ trait Props extends CustomFormatConfig {
  var children: js.UndefOr[js.Function1[/* value */ TagMod[Any], ReactElement | Null]] = js.undefined
  var few: js.UndefOr[TagMod[Any]] = js.undefined
  var intl: IntlShape
  var many: js.UndefOr[TagMod[Any]] = js.undefined
  var one: js.UndefOr[TagMod[Any]] = js.undefined
  var other: TagMod[Any]
  var two: js.UndefOr[TagMod[Any]] = js.undefined
  var value: Double
  var zero: js.UndefOr[TagMod[Any]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    intl: IntlShape,
    other: TagMod[Any],
    value: Double,
    children: /* value */ TagMod[Any] => ReactElement | Null = null,
    few: TagMod[Any] = null,
    format: String = null,
    many: TagMod[Any] = null,
    one: TagMod[Any] = null,
    two: TagMod[Any] = null,
    zero: TagMod[Any] = null
  ): Props = {
    val __obj = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (few != null) __obj.updateDynamic("few")(few.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (many != null) __obj.updateDynamic("many")(many.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

