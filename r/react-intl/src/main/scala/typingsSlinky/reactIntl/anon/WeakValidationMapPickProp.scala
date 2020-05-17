package typingsSlinky.reactIntl.anon

import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<std.Pick<react-intl.react-intl.Props_2, 'children' | 'other' | 'zero' | 'one' | 'two' | 'few' | 'many' | 'localeMatcher' | 'format' | 'type' | 'value'> & {  forwardedRef ? :(instance : any): void | react.react.RefObject<any> | null | undefined} & react.react.RefAttributes<any>> */
@js.native
trait WeakValidationMapPickProp extends js.Object {
  var children: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var few: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var format: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var forwardedRef: js.UndefOr[
    Validator[js.UndefOr[(js.Function1[/* instance */ _, Unit]) | Null | ReactRef[_]]]
  ] = js.native
  var key: js.UndefOr[Validator[js.UndefOr[Key | Null]]] = js.native
  var localeMatcher: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var many: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var one: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var other: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var ref: js.UndefOr[Validator[js.UndefOr[Null | Ref[_]]]] = js.native
  var two: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var `type`: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var value: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
  var zero: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.native
}

object WeakValidationMapPickProp {
  @scala.inline
  def apply(): WeakValidationMapPickProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeakValidationMapPickProp]
  }
  @scala.inline
  implicit class WeakValidationMapPickPropOps[Self <: WeakValidationMapPickProp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withFew(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("few")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("few")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardedRef(value: Validator[js.UndefOr[(js.Function1[/* instance */ _, Unit]) | Null | ReactRef[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardedRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardedRef")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: Validator[js.UndefOr[Key | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLocaleMatcher(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeMatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocaleMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localeMatcher")(js.undefined)
        ret
    }
    @scala.inline
    def withMany(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("many")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMany: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("many")(js.undefined)
        ret
    }
    @scala.inline
    def withOne(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("one")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOne: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("one")(js.undefined)
        ret
    }
    @scala.inline
    def withOther(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOther: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("other")(js.undefined)
        ret
    }
    @scala.inline
    def withRef(value: Validator[js.UndefOr[Null | Ref[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withTwo(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("two")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTwo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("two")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withZero(value: Validator[js.UndefOr[_ | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZero: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zero")(js.undefined)
        ret
    }
  }
  
}

