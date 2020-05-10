package typingsSlinky.pulumiKubernetes.inputMod.meta.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ManagedFieldsEntry is a workflow-id, a FieldSet and the group version of the resource that
  * the fieldset applies to.
  */
@js.native
trait ManagedFieldsEntry extends js.Object {
  /**
    * APIVersion defines the version of this resource that this field set applies to. The format
    * is "group/version" just like the top-level APIVersion field. It is necessary to track the
    * version of a field set because it cannot be automatically converted.
    */
  var apiVersion: js.UndefOr[Input[String]] = js.native
  /**
    * FieldsType is the discriminator for the different fields format and version. There is
    * currently only one possible value: "FieldsV1"
    */
  var fieldsType: js.UndefOr[Input[String]] = js.native
  /**
    * FieldsV1 holds the first JSON version format as described in the "FieldsV1" type.
    */
  var fieldsV1: js.UndefOr[Input[js.Object]] = js.native
  /**
    * Manager is an identifier of the workflow managing these fields.
    */
  var manager: js.UndefOr[Input[String]] = js.native
  /**
    * Operation is the type of operation which lead to this ManagedFieldsEntry being created. The
    * only valid values for this field are 'Apply' and 'Update'.
    */
  var operation: js.UndefOr[Input[String]] = js.native
  /**
    * Time is timestamp of when these fields were set. It should always be empty if Operation is
    * 'Apply'
    */
  var time: js.UndefOr[Input[String]] = js.native
}

object ManagedFieldsEntry {
  @scala.inline
  def apply(): ManagedFieldsEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedFieldsEntry]
  }
  @scala.inline
  implicit class ManagedFieldsEntryOps[Self <: ManagedFieldsEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiVersion(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldsType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldsType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldsType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldsType")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldsV1(value: Input[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldsV1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldsV1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldsV1")(js.undefined)
        ret
    }
    @scala.inline
    def withManager(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
  }
  
}

