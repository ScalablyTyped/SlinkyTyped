package typingsSlinky.reactIntl

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactIntl.reactIntlStrings.`best fit`
import typingsSlinky.reactIntl.reactIntlStrings.cardinal
import typingsSlinky.reactIntl.reactIntlStrings.lookup
import typingsSlinky.reactIntl.reactIntlStrings.ordinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-intl.react-intl.Props_2, 'children' | 'other' | 'zero' | 'one' | 'two' | 'few' | 'many' | 'format' | 'localeMatcher' | 'type' | 'value'> & {  forwardedRef ? :(instance : any): void | react.react.RefObject<any> | null | undefined} & react.react.RefAttributes<any> */
trait PickProps2childrenotherze extends js.Object {
  var children: js.UndefOr[js.Function1[/* value */ TagMod[Any], ReactElement | Null]] = js.undefined
  var few: js.UndefOr[TagMod[Any]] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var forwardedRef: js.UndefOr[(js.Function1[/* instance */ js.Any, Unit]) | ReactRef[_] | Null] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
  var many: js.UndefOr[TagMod[Any]] = js.undefined
  var one: js.UndefOr[TagMod[Any]] = js.undefined
  var other: TagMod[Any]
  var ref: js.UndefOr[Ref[_]] = js.undefined
  var two: js.UndefOr[TagMod[Any]] = js.undefined
  var `type`: js.UndefOr[cardinal | ordinal] = js.undefined
  var value: Double
  var zero: js.UndefOr[TagMod[Any]] = js.undefined
}

object PickProps2childrenotherze {
  @scala.inline
  def apply(
    other: TagMod[Any],
    value: Double,
    children: /* value */ TagMod[Any] => ReactElement | Null = null,
    few: TagMod[Any] = null,
    format: String = null,
    forwardedRef: (js.Function1[/* instance */ js.Any, Unit]) | ReactRef[_] = null,
    key: Key = null,
    localeMatcher: lookup | (`best fit`) = null,
    many: TagMod[Any] = null,
    one: TagMod[Any] = null,
    ref: Ref[_] = null,
    two: TagMod[Any] = null,
    `type`: cardinal | ordinal = null,
    zero: TagMod[Any] = null
  ): PickProps2childrenotherze = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (few != null) __obj.updateDynamic("few")(few.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (forwardedRef != null) __obj.updateDynamic("forwardedRef")(forwardedRef.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (many != null) __obj.updateDynamic("many")(many.asInstanceOf[js.Any])
    if (one != null) __obj.updateDynamic("one")(one.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (two != null) __obj.updateDynamic("two")(two.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (zero != null) __obj.updateDynamic("zero")(zero.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickProps2childrenotherze]
  }
}

