package typingsSlinky.atlaskitFeedbackCollector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormFields extends js.Object {
  var canBeContacted: Boolean = js.native
  var description: String = js.native
  var enrollInResearchGroup: Boolean = js.native
  var `type`: SelectValue = js.native
}

object FormFields {
  @scala.inline
  def apply(canBeContacted: Boolean, description: String, enrollInResearchGroup: Boolean, `type`: SelectValue): FormFields = {
    val __obj = js.Dynamic.literal(canBeContacted = canBeContacted.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enrollInResearchGroup = enrollInResearchGroup.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormFields]
  }
  @scala.inline
  implicit class FormFieldsOps[Self <: FormFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanBeContacted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canBeContacted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnrollInResearchGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollInResearchGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: SelectValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

