package typingsSlinky.postmark.templateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateInList extends js.Object {
  var Active: Boolean = js.native
  var Alias: String | Null = js.native
  var LayoutTemplate: String | Null = js.native
  var Name: String = js.native
  var TemplateId: Double = js.native
  var TemplateType: TemplateTypes = js.native
}

object TemplateInList {
  @scala.inline
  def apply(Active: Boolean, Name: String, TemplateId: Double, TemplateType: TemplateTypes): TemplateInList = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any], TemplateType = TemplateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateInList]
  }
  @scala.inline
  implicit class TemplateInListOps[Self <: TemplateInList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateType(value: TemplateTypes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAliasNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Alias")(null)
        ret
    }
    @scala.inline
    def withLayoutTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayoutTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutTemplateNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayoutTemplate")(null)
        ret
    }
  }
  
}

