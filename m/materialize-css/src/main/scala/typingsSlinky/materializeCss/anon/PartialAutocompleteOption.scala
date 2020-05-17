package typingsSlinky.materializeCss.anon

import typingsSlinky.materializeCss.M.AutocompleteData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.AutocompleteOptions> */
@js.native
trait PartialAutocompleteOption extends js.Object {
  var data: js.UndefOr[AutocompleteData] = js.native
  var limit: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var onAutocomplete: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* text */ String, Unit]] = js.native
  var sortFunction: js.UndefOr[js.Function3[/* a */ String, /* b */ String, /* inputText */ String, Double]] = js.native
}

object PartialAutocompleteOption {
  @scala.inline
  def apply(): PartialAutocompleteOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAutocompleteOption]
  }
  @scala.inline
  implicit class PartialAutocompleteOptionOps[Self <: PartialAutocompleteOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: AutocompleteData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAutocomplete(value: js.ThisFunction1[PartialAutocompleteOption, /* text */ String, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAutocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnAutocomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAutocomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withSortFunction(value: (/* a */ String, /* b */ String, /* inputText */ String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFunction")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSortFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFunction")(js.undefined)
        ret
    }
  }
  
}

