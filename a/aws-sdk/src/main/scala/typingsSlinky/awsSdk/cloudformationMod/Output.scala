package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Output extends js.Object {
  /**
    * User defined description associated with the output.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.Description] = js.native
  /**
    * The name of the export associated with the output.
    */
  var ExportName: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.ExportName] = js.native
  /**
    * The key associated with the output.
    */
  var OutputKey: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.OutputKey] = js.native
  /**
    * The value associated with the output.
    */
  var OutputValue: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.OutputValue] = js.native
}

object Output {
  @scala.inline
  def apply(): Output = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Output]
  }
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withExportName(value: ExportName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportName")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputKey(value: OutputKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputKey")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputValue(value: OutputValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputValue")(js.undefined)
        ret
    }
  }
  
}

