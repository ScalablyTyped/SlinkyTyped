package typingsSlinky.activexMsforms.MSForms.EventHelperTypes

import typingsSlinky.activexMsforms.MSForms.ReturnBoolean
import typingsSlinky.activexMsforms.MSForms.ReturnString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiPageErrorParameter extends js.Object {
  val CancelDisplay: ReturnBoolean = js.native
  val Description: ReturnString = js.native
  val HelpContext: Double = js.native
  val HelpFile: String = js.native
  val Index: Double = js.native
  val Number: Double = js.native
  val SCode: Double = js.native
  val Source: String = js.native
}

object MultiPageErrorParameter {
  @scala.inline
  def apply(
    CancelDisplay: ReturnBoolean,
    Description: ReturnString,
    HelpContext: Double,
    HelpFile: String,
    Index: Double,
    Number: Double,
    SCode: Double,
    Source: String
  ): MultiPageErrorParameter = {
    val __obj = js.Dynamic.literal(CancelDisplay = CancelDisplay.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], HelpContext = HelpContext.asInstanceOf[js.Any], HelpFile = HelpFile.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], SCode = SCode.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPageErrorParameter]
  }
  @scala.inline
  implicit class MultiPageErrorParameterOps[Self <: MultiPageErrorParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelDisplay(value: ReturnBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CancelDisplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: ReturnString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpContext(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HelpContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HelpFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

