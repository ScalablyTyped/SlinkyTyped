package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordOutput extends js.Object {
  /**
    * The description of the output.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Description] = js.native
  /**
    * The output key.
    */
  var OutputKey: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.OutputKey] = js.native
  /**
    * The output value.
    */
  var OutputValue: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.OutputValue] = js.native
}

object RecordOutput {
  @scala.inline
  def apply(): RecordOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordOutput]
  }
  @scala.inline
  implicit class RecordOutputOps[Self <: RecordOutput] (val x: Self) extends AnyVal {
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

