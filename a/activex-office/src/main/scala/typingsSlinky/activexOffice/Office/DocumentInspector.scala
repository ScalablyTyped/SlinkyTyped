package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentInspector extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val Description: String = js.native
  val Name: String = js.native
  @JSName("Office.DocumentInspector_typekey")
  var OfficeDotDocumentInspector_typekey: DocumentInspector = js.native
  val Parent: js.Any = js.native
  def Fix(Status: MsoDocInspectorStatus, Results: String): Unit = js.native
  def Inspect(Status: MsoDocInspectorStatus, Results: String): Unit = js.native
}

object DocumentInspector {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Description: String,
    Fix: (MsoDocInspectorStatus, String) => Unit,
    Inspect: (MsoDocInspectorStatus, String) => Unit,
    Name: String,
    OfficeDotDocumentInspector_typekey: DocumentInspector,
    Parent: js.Any
  ): DocumentInspector = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Fix = js.Any.fromFunction2(Fix), Inspect = js.Any.fromFunction2(Inspect), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.DocumentInspector_typekey")(OfficeDotDocumentInspector_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentInspector]
  }
  @scala.inline
  implicit class DocumentInspectorOps[Self <: DocumentInspector] (val x: Self) extends AnyVal {
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
    def withFix(value: (MsoDocInspectorStatus, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fix")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInspect(value: (MsoDocInspectorStatus, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inspect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotDocumentInspector_typekey(value: DocumentInspector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.DocumentInspector_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

