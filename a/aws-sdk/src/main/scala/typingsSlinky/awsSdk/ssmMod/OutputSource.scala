package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputSource extends js.Object {
  /**
    * The ID of the output source, for example the URL of an Amazon S3 bucket.
    */
  var OutputSourceId: js.UndefOr[typingsSlinky.awsSdk.ssmMod.OutputSourceId] = js.native
  /**
    * The type of source where the association execution details are stored, for example, Amazon S3.
    */
  var OutputSourceType: js.UndefOr[typingsSlinky.awsSdk.ssmMod.OutputSourceType] = js.native
}

object OutputSource {
  @scala.inline
  def apply(): OutputSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputSource]
  }
  @scala.inline
  implicit class OutputSourceOps[Self <: OutputSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputSourceId(value: OutputSourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputSourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputSourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputSourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputSourceType(value: OutputSourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputSourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputSourceType")(js.undefined)
        ret
    }
  }
  
}

