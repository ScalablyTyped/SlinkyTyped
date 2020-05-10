package typingsSlinky.camo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTypeOptions[Type] extends js.Object {
  /**
  		 * Posible options
  		 */
  var choices: js.UndefOr[js.Array[Type]] = js.native
  /**
  		 * Default value
  		 */
  var default: js.UndefOr[Type] = js.native
  /**
  		 * RegEx to match value
  		 */
  var `match`: js.UndefOr[js.RegExp] = js.native
  /**
  		 * Max value (only with Number)
  		 */
  var max: js.UndefOr[Double] = js.native
  /**
  		 * Min value (only with Number)
  		 */
  var min: js.UndefOr[Double] = js.native
  /**
  		 * Required field
  		 */
  var required: js.UndefOr[Boolean] = js.native
  /**
  		 * Type of data
  		 */
  var `type`: SchemaTypeConstructor = js.native
  /**
  		 * Unique value (like ids)
  		 */
  var unique: js.UndefOr[Boolean] = js.native
  /**
  		 * Validation function.
  		 *
  		 * @param {Type} value Value taken.
  		 * @returns {boolean} true (validation ok) or false (validation wrong).
  		 */
  var validate: js.UndefOr[js.Function1[/* value */ Type, Boolean]] = js.native
}

object SchemaTypeOptions {
  @scala.inline
  def apply[Type](`type`: SchemaTypeConstructor): SchemaTypeOptions[Type] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTypeOptions[Type]]
  }
  @scala.inline
  implicit class SchemaTypeOptionsOps[Self[`type`] <: SchemaTypeOptions[`type`], Type] (val x: Self[Type]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Type] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Type]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Type] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Type] with Other]
    @scala.inline
    def withType(value: SchemaTypeConstructor): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChoices(value: js.Array[Type]): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChoices: Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: Type): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withMatch(value: js.RegExp): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatch: Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: Double): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withUnique(value: Boolean): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnique: Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unique")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: /* value */ Type => Boolean): Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self[Type] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

