package typingsSlinky.rcFieldForm

import typingsSlinky.rcFieldForm.interfaceMod.InternalNamePath
import typingsSlinky.rcFieldForm.interfaceMod.NotifyInfo
import typingsSlinky.rcFieldForm.rcFieldFormStrings.dependenciesUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRelatedFields extends NotifyInfo {
  /**
    * Contains all the related `InternalNamePath[]`.
    * a <- b <- c : change `a`
    * relatedFields=[a, b, c]
    */
  var relatedFields: js.Array[InternalNamePath] = js.native
  var `type`: dependenciesUpdate = js.native
}

object AnonRelatedFields {
  @scala.inline
  def apply(relatedFields: js.Array[InternalNamePath], `type`: dependenciesUpdate): AnonRelatedFields = {
    val __obj = js.Dynamic.literal(relatedFields = relatedFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRelatedFields]
  }
  @scala.inline
  implicit class AnonRelatedFieldsOps[Self <: AnonRelatedFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRelatedFields(value: js.Array[InternalNamePath]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: dependenciesUpdate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

