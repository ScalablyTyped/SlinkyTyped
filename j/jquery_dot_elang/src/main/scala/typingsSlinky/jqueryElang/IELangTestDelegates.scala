package typingsSlinky.jqueryElang

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IELangTestDelegates extends js.Object {
  var rdoModeClickHandler: js.Function = js.native
  var rdoModeHandler: js.Function = js.native
  var rdoQuestionClickHandler: js.Function = js.native
  var rdoQuestionHandler: js.Function = js.native
  var rdoVariantClickHandler: js.Function = js.native
  var rdoVariantHandler: js.Function = js.native
  var startStopHandler: js.Function = js.native
}

object IELangTestDelegates {
  @scala.inline
  def apply(
    rdoModeClickHandler: js.Function,
    rdoModeHandler: js.Function,
    rdoQuestionClickHandler: js.Function,
    rdoQuestionHandler: js.Function,
    rdoVariantClickHandler: js.Function,
    rdoVariantHandler: js.Function,
    startStopHandler: js.Function
  ): IELangTestDelegates = {
    val __obj = js.Dynamic.literal(rdoModeClickHandler = rdoModeClickHandler.asInstanceOf[js.Any], rdoModeHandler = rdoModeHandler.asInstanceOf[js.Any], rdoQuestionClickHandler = rdoQuestionClickHandler.asInstanceOf[js.Any], rdoQuestionHandler = rdoQuestionHandler.asInstanceOf[js.Any], rdoVariantClickHandler = rdoVariantClickHandler.asInstanceOf[js.Any], rdoVariantHandler = rdoVariantHandler.asInstanceOf[js.Any], startStopHandler = startStopHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangTestDelegates]
  }
  @scala.inline
  implicit class IELangTestDelegatesOps[Self <: IELangTestDelegates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRdoModeClickHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdoModeClickHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdoModeHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdoModeHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdoQuestionClickHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdoQuestionClickHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdoQuestionHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdoQuestionHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdoVariantClickHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdoVariantClickHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdoVariantHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdoVariantHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartStopHandler(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startStopHandler")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

