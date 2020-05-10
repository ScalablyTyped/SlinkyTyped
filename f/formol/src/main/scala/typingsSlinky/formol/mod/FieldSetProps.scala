package typingsSlinky.formol.mod

import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldSetProps[V] extends js.Object {
  var choices: js.UndefOr[js.Array[_]] = js.native
  var dangerousRawHTMLLabels: js.UndefOr[Boolean] = js.native
  var elementRef: js.UndefOr[Ref[_]] = js.native
  var isChecked: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function0[Unit]] = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[V] = js.native
}

object FieldSetProps {
  @scala.inline
  def apply[V](): FieldSetProps[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldSetProps[V]]
  }
  @scala.inline
  implicit class FieldSetPropsOps[Self[v] <: FieldSetProps[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withChoices(value: js.Array[_]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChoices: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(js.undefined)
        ret
    }
    @scala.inline
    def withDangerousRawHTMLLabels(value: Boolean): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerousRawHTMLLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDangerousRawHTMLLabels: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dangerousRawHTMLLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withElementRefRefObject(value: ReactRef[_]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElementRefFunction1(value: /* instance */ _ | Null => Unit): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withElementRef(value: Ref[_]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementRef: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementRef")(js.undefined)
        ret
    }
    @scala.inline
    def withElementRefNull: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementRef")(null)
        ret
    }
    @scala.inline
    def withIsChecked(value: Boolean): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsChecked: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: () => Unit): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: V): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

