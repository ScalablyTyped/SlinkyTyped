package typingsSlinky.devextreme

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.ui.AsyncRule
import typingsSlinky.devextreme.mod.DevExpress.ui.CompareRule
import typingsSlinky.devextreme.mod.DevExpress.ui.CustomRule
import typingsSlinky.devextreme.mod.DevExpress.ui.EmailRule
import typingsSlinky.devextreme.mod.DevExpress.ui.NumericRule
import typingsSlinky.devextreme.mod.DevExpress.ui.PatternRule
import typingsSlinky.devextreme.mod.DevExpress.ui.RangeRule
import typingsSlinky.devextreme.mod.DevExpress.ui.RequiredRule
import typingsSlinky.devextreme.mod.DevExpress.ui.StringLengthRule
import typingsSlinky.devextreme.mod._Global_.JQueryPromise
import typingsSlinky.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBrokenRules[T] extends js.Object {
  var brokenRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.native
  var component: js.UndefOr[T] = js.native
  var element: js.UndefOr[dxElement] = js.native
  var errorText: js.UndefOr[String] = js.native
  var isValid: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[js.Any] = js.native
  var model: js.UndefOr[js.Any] = js.native
  var newData: js.UndefOr[js.Any] = js.native
  var oldData: js.UndefOr[js.Any] = js.native
  var promise: js.UndefOr[Promise[Unit] | JQueryPromise[Unit]] = js.native
}

object AnonBrokenRules {
  @scala.inline
  def apply[T](): AnonBrokenRules[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBrokenRules[T]]
  }
  @scala.inline
  implicit class AnonBrokenRulesOps[Self[t] <: AnonBrokenRules[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withBrokenRules(
      value: js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrokenRules: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brokenRules")(js.undefined)
        ret
    }
    @scala.inline
    def withComponent(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: dxElement): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorText")(js.undefined)
        ret
    }
    @scala.inline
    def withIsValid(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsValid: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withNewData(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newData")(js.undefined)
        ret
    }
    @scala.inline
    def withOldData(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldData: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldData")(js.undefined)
        ret
    }
    @scala.inline
    def withPromise(value: Promise[Unit] | JQueryPromise[Unit]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromise: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(js.undefined)
        ret
    }
  }
  
}

