package typingsSlinky.inputmask.mod

import typingsSlinky.inputmask.anon.C
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Definition extends js.Object {
  var cardinality: js.UndefOr[Double] = js.native
  var casing: js.UndefOr[Casing] = js.native
  var definitionSymbol: js.UndefOr[String] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var validator: String | DefinitionValidator = js.native
}

object Definition {
  @scala.inline
  def apply(validator: String | DefinitionValidator): Definition = {
    val __obj = js.Dynamic.literal(validator = validator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  implicit class DefinitionOps[Self <: Definition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValidatorFunction5(
      value: (/* chrs */ String, /* buffer */ js.Array[String], /* pos */ Double, /* strict */ Boolean, /* opts */ Options) => Boolean | C
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withValidator(value: String | DefinitionValidator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCardinality(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardinality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardinality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardinality")(js.undefined)
        ret
    }
    @scala.inline
    def withCasing(value: Casing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("casing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("casing")(js.undefined)
        ret
    }
    @scala.inline
    def withDefinitionSymbol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefinitionSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("definitionSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
  }
  
}

