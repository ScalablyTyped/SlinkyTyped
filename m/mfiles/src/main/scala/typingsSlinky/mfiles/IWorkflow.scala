package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInDocumentClass
import typingsSlinky.mfiles.MFiles.MFBuiltInObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWorkflow extends js.Object {
  var ID: Double = js.native
  var Name: String = js.native
  var ObjectClass: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double = js.native
  def Clone(): IWorkflow = js.native
  def GetAsLookup(): ILookup = js.native
  def GetAsTypedValue(): ITypedValue = js.native
}

object IWorkflow {
  @scala.inline
  def apply(
    Clone: () => IWorkflow,
    GetAsLookup: () => ILookup,
    GetAsTypedValue: () => ITypedValue,
    ID: Double,
    Name: String,
    ObjectClass: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double
  ): IWorkflow = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), GetAsLookup = js.Any.fromFunction0(GetAsLookup), GetAsTypedValue = js.Any.fromFunction0(GetAsTypedValue), ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ObjectClass = ObjectClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkflow]
  }
  @scala.inline
  implicit class IWorkflowOps[Self <: IWorkflow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IWorkflow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAsLookup(value: () => ILookup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAsLookup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAsTypedValue(value: () => ITypedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAsTypedValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectClass(value: MFBuiltInDocumentClass | MFBuiltInObjectClass | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectClass")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

