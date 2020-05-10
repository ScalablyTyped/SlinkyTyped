package typingsSlinky.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Variable extends js.Object {
  /**
    * The value of the variable as a structure that specifies a data set content version.
    */
  var datasetContentVersionValue: js.UndefOr[DatasetContentVersionValue] = js.native
  /**
    * The value of the variable as a double (numeric).
    */
  var doubleValue: js.UndefOr[DoubleValue] = js.native
  /**
    * The name of the variable.
    */
  var name: VariableName = js.native
  /**
    * The value of the variable as a structure that specifies an output file URI.
    */
  var outputFileUriValue: js.UndefOr[OutputFileUriValue] = js.native
  /**
    * The value of the variable as a string.
    */
  var stringValue: js.UndefOr[StringValue] = js.native
}

object Variable {
  @scala.inline
  def apply(name: VariableName): Variable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
  @scala.inline
  implicit class VariableOps[Self <: Variable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: VariableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatasetContentVersionValue(value: DatasetContentVersionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetContentVersionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetContentVersionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetContentVersionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleValue(value: DoubleValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFileUriValue(value: OutputFileUriValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFileUriValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputFileUriValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFileUriValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValue(value: StringValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(js.undefined)
        ret
    }
  }
  
}

