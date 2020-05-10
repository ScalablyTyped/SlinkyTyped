package typingsSlinky.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ELangBase
@js.native
trait IELangBaseDefaults extends js.Object {
  var contentCSS: String = js.native
  var contentInnerCSS: String = js.native
  var contentInnerHtml: String = js.native
  var fluidRowHtml: String = js.native
  var headLabel: String = js.native
  var headLabelHtml: String = js.native
  var radioButtonHtml: String = js.native
  var radioGroupHtml: String = js.native
  var resultCSS: String = js.native
  var resultHeadCSS: String = js.native
  var resultHeadLabel: String = js.native
  var resultHeadLabelHtml: String = js.native
  var resultHtml: String = js.native
  var submitButtonHtml: String = js.native
}

object IELangBaseDefaults {
  @scala.inline
  def apply(
    contentCSS: String,
    contentInnerCSS: String,
    contentInnerHtml: String,
    fluidRowHtml: String,
    headLabel: String,
    headLabelHtml: String,
    radioButtonHtml: String,
    radioGroupHtml: String,
    resultCSS: String,
    resultHeadCSS: String,
    resultHeadLabel: String,
    resultHeadLabelHtml: String,
    resultHtml: String,
    submitButtonHtml: String
  ): IELangBaseDefaults = {
    val __obj = js.Dynamic.literal(contentCSS = contentCSS.asInstanceOf[js.Any], contentInnerCSS = contentInnerCSS.asInstanceOf[js.Any], contentInnerHtml = contentInnerHtml.asInstanceOf[js.Any], fluidRowHtml = fluidRowHtml.asInstanceOf[js.Any], headLabel = headLabel.asInstanceOf[js.Any], headLabelHtml = headLabelHtml.asInstanceOf[js.Any], radioButtonHtml = radioButtonHtml.asInstanceOf[js.Any], radioGroupHtml = radioGroupHtml.asInstanceOf[js.Any], resultCSS = resultCSS.asInstanceOf[js.Any], resultHeadCSS = resultHeadCSS.asInstanceOf[js.Any], resultHeadLabel = resultHeadLabel.asInstanceOf[js.Any], resultHeadLabelHtml = resultHeadLabelHtml.asInstanceOf[js.Any], resultHtml = resultHtml.asInstanceOf[js.Any], submitButtonHtml = submitButtonHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangBaseDefaults]
  }
  @scala.inline
  implicit class IELangBaseDefaultsOps[Self <: IELangBaseDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentCSS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentInnerCSS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInnerCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentInnerHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInnerHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFluidRowHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fluidRowHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadLabelHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headLabelHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadioButtonHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioButtonHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadioGroupHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioGroupHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultCSS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultHeadCSS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultHeadCSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultHeadLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultHeadLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultHeadLabelHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultHeadLabelHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmitButtonHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitButtonHtml")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

