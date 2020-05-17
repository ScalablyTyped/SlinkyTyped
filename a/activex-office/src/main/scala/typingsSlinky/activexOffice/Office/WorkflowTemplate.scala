package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowTemplate extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val Description: String = js.native
  val DocumentLibraryName: String = js.native
  val DocumentLibraryURL: String = js.native
  val Id: String = js.native
  val Name: String = js.native
  @JSName("Office.WorkflowTemplate_typekey")
  var OfficeDotWorkflowTemplate_typekey: WorkflowTemplate = js.native
  def Show(): Double = js.native
}

object WorkflowTemplate {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Description: String,
    DocumentLibraryName: String,
    DocumentLibraryURL: String,
    Id: String,
    Name: String,
    OfficeDotWorkflowTemplate_typekey: WorkflowTemplate,
    Show: () => Double
  ): WorkflowTemplate = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DocumentLibraryName = DocumentLibraryName.asInstanceOf[js.Any], DocumentLibraryURL = DocumentLibraryURL.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Show = js.Any.fromFunction0(Show))
    __obj.updateDynamic("Office.WorkflowTemplate_typekey")(OfficeDotWorkflowTemplate_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowTemplate]
  }
  @scala.inline
  implicit class WorkflowTemplateOps[Self <: WorkflowTemplate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentLibraryName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentLibraryName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentLibraryURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentLibraryURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotWorkflowTemplate_typekey(value: WorkflowTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.WorkflowTemplate_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShow(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Show")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

