package typingsSlinky.meteorAstronomy.MeteorAstronomy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelFullField[Field, Doc] extends ModelField[Field, Doc] {
  var default: js.UndefOr[js.Function0[Field]] = js.native
  var immutable: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[String | Double] = js.native
  var optional: js.UndefOr[Boolean] = js.native
  var resolve: js.UndefOr[js.Function1[/* doc */ Doc, Field]] = js.native
  var transient: js.UndefOr[Boolean] = js.native
  var `type`: TypeOptions = js.native
  var validators: js.UndefOr[js.Array[Validator]] = js.native
}

object ModelFullField {
  @scala.inline
  def apply[Field, Doc](`type`: TypeOptions): ModelFullField[Field, Doc] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelFullField[Field, Doc]]
  }
  @scala.inline
  implicit class ModelFullFieldOps[Self[field, doc] <: ModelFullField[field, doc], Field, Doc] (val x: Self[Field, Doc]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Field, Doc] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Field, Doc]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Field, Doc]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Field, Doc]) with Other]
    @scala.inline
    def withType(value: TypeOptions): Self[Field, Doc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: () => Field): Self[Field, Doc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDefault: Self[Field, Doc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withImmutable(value: Boolean): Self[Field, Doc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmutable: Self[Field, Doc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutable")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: String | Double): Self[Field, Doc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self[Field, Doc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withOptional(value: Boolean): Self[Field, Doc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptional: Self[Field, Doc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optional")(js.undefined)
        ret
    }
    @scala.inline
    def withResolve(value: /* doc */ Doc => Field): Self[Field, Doc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResolve: Self[Field, Doc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.undefined)
        ret
    }
    @scala.inline
    def withTransient(value: Boolean): Self[Field, Doc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransient: Self[Field, Doc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transient")(js.undefined)
        ret
    }
    @scala.inline
    def withValidators(value: js.Array[Validator]): Self[Field, Doc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidators: Self[Field, Doc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(js.undefined)
        ret
    }
  }
  
}

