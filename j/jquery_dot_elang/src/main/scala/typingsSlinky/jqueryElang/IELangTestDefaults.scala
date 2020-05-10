package typingsSlinky.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ELangTest
@js.native
trait IELangTestDefaults extends IELangBaseDefaults {
  var formHtml: String = js.native
  var rdoOrderedLabel: String = js.native
  var rdoOrderedTooltip: String = js.native
  var rdoRandomlyLabel: String = js.native
  var rdoRandomlyTooltip: String = js.native
  var rdoSelectedLabel: String = js.native
  var rdoSelectedTooltip: String = js.native
  var rdoTypedLabel: String = js.native
  var rdoTypedTooltip: String = js.native
  var rdoVoicedLabel: String = js.native
  var rdoVoicedTooltip: String = js.native
  var rdoWrittedLabel: String = js.native
  var rdoWrittedTooltip: String = js.native
  var startButtonLabel: String = js.native
  var stopButtonLabel: String = js.native
}

object IELangTestDefaults {
  @scala.inline
  def apply(
    contentCSS: String,
    contentInnerCSS: String,
    contentInnerHtml: String,
    fluidRowHtml: String,
    formHtml: String,
    headLabel: String,
    headLabelHtml: String,
    radioButtonHtml: String,
    radioGroupHtml: String,
    rdoOrderedLabel: String,
    rdoOrderedTooltip: String,
    rdoRandomlyLabel: String,
    rdoRandomlyTooltip: String,
    rdoSelectedLabel: String,
    rdoSelectedTooltip: String,
    rdoTypedLabel: String,
    rdoTypedTooltip: String,
    rdoVoicedLabel: String,
    rdoVoicedTooltip: String,
    rdoWrittedLabel: String,
    rdoWrittedTooltip: String,
    resultCSS: String,
    resultHeadCSS: String,
    resultHeadLabel: String,
    resultHeadLabelHtml: String,
    resultHtml: String,
    startButtonLabel: String,
    stopButtonLabel: String,
    submitButtonHtml: String
  ): IELangTestDefaults = {
    val __obj = js.Dynamic.literal(contentCSS = contentCSS.asInstanceOf[js.Any], contentInnerCSS = contentInnerCSS.asInstanceOf[js.Any], contentInnerHtml = contentInnerHtml.asInstanceOf[js.Any], fluidRowHtml = fluidRowHtml.asInstanceOf[js.Any], formHtml = formHtml.asInstanceOf[js.Any], headLabel = headLabel.asInstanceOf[js.Any], headLabelHtml = headLabelHtml.asInstanceOf[js.Any], radioButtonHtml = radioButtonHtml.asInstanceOf[js.Any], radioGroupHtml = radioGroupHtml.asInstanceOf[js.Any], rdoOrderedLabel = rdoOrderedLabel.asInstanceOf[js.Any], rdoOrderedTooltip = rdoOrderedTooltip.asInstanceOf[js.Any], rdoRandomlyLabel = rdoRandomlyLabel.asInstanceOf[js.Any], rdoRandomlyTooltip = rdoRandomlyTooltip.asInstanceOf[js.Any], rdoSelectedLabel = rdoSelectedLabel.asInstanceOf[js.Any], rdoSelectedTooltip = rdoSelectedTooltip.asInstanceOf[js.Any], rdoTypedLabel = rdoTypedLabel.asInstanceOf[js.Any], rdoTypedTooltip = rdoTypedTooltip.asInstanceOf[js.Any], rdoVoicedLabel = rdoVoicedLabel.asInstanceOf[js.Any], rdoVoicedTooltip = rdoVoicedTooltip.asInstanceOf[js.Any], rdoWrittedLabel = rdoWrittedLabel.asInstanceOf[js.Any], rdoWrittedTooltip = rdoWrittedTooltip.asInstanceOf[js.Any], resultCSS = resultCSS.asInstanceOf[js.Any], resultHeadCSS = resultHeadCSS.asInstanceOf[js.Any], resultHeadLabel = resultHeadLabel.asInstanceOf[js.Any], resultHeadLabelHtml = resultHeadLabelHtml.asInstanceOf[js.Any], resultHtml = resultHtml.asInstanceOf[js.Any], startButtonLabel = startButtonLabel.asInstanceOf[js.Any], stopButtonLabel = stopButtonLabel.asInstanceOf[js.Any], submitButtonHtml = submitButtonHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangTestDefaults]
  }
  @scala.inline
  implicit class IELangTestDefaultsOps[Self <: IELangTestDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdoOrderedLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdoOrderedLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdoOrderedTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdoOrderedTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdoRandomlyLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdoRandomlyLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdoRandomlyTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdoRandomlyTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdoSelectedLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdoSelectedLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdoSelectedTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdoSelectedTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdoTypedLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdoTypedLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdoTypedTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdoTypedTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdoVoicedLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdoVoicedLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdoVoicedTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdoVoicedTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdoWrittedLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdoWrittedLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdoWrittedTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdoWrittedTooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startButtonLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopButtonLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopButtonLabel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

