package typingsSlinky.forms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldParameters extends js.Object {
  /** A list of options, used for multiple choice fields. */
  var choices: js.UndefOr[FieldObjectChoice | FieldArrayChoice] = js.native
  /** A list of CSS classes for label and field wrapper. */
  var cssClasses: js.UndefOr[typingsSlinky.forms.anon.Field] = js.native
  /** If true, the error message will be displayed after the field, rather than before. */
  var errorAfterField: js.UndefOr[Boolean] = js.native
  /** For widgets with a fieldset (multipleRadio and multipleCheckbox), set classes for the fieldset. */
  var fieldsetClasses: js.UndefOr[js.Array[String]] = js.native
  /** If true, errors won't be rendered automatically. */
  var hideError: js.UndefOr[Boolean] = js.native
  /** An optional id to override the default. */
  var id: js.UndefOr[String] = js.native
  /** Optional label text which overrides the default. */
  var label: js.UndefOr[String] = js.native
  /** If true, the label text will be displayed after the field, rather than before. */
  var labelAfterField: js.UndefOr[Boolean] = js.native
  /** For widgets with a fieldset (multipleRadio and multipleCheckbox), set classes for the fieldset's legend. */
  var legendClasses: js.UndefOr[js.Array[String]] = js.native
  /** Boolean describing whether the field is mandatory. */
  var required: js.UndefOr[Boolean | ValidatorFunction] = js.native
  /** An array of functions which validate the field data. */
  var validators: js.UndefOr[js.Array[ValidatorFunction]] = js.native
  /** A widget object to use when rendering the field. */
  var widget: js.UndefOr[Widget] = js.native
}

object FieldParameters {
  @scala.inline
  def apply(): FieldParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldParameters]
  }
  @scala.inline
  implicit class FieldParametersOps[Self <: FieldParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChoices(value: FieldObjectChoice | FieldArrayChoice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChoices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClasses(value: typingsSlinky.forms.anon.Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorAfterField(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorAfterField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorAfterField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorAfterField")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldsetClasses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldsetClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldsetClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldsetClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withHideError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideError")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelAfterField(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAfterField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelAfterField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelAfterField")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendClasses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendClasses")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredFunction3(
      value: (/* form */ FormBound, /* field */ FieldBound, /* callback */ js.Function1[/* err */ js.UndefOr[String], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRequired(value: Boolean | ValidatorFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withValidators(value: js.Array[ValidatorFunction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(js.undefined)
        ret
    }
    @scala.inline
    def withWidget(value: Widget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(js.undefined)
        ret
    }
  }
  
}

