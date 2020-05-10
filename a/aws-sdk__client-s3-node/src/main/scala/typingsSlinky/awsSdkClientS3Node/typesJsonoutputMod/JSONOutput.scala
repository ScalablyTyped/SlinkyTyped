package typingsSlinky.awsSdkClientS3Node.typesJsonoutputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONOutput extends js.Object {
  /**
    * <p>The value used to separate individual records in the output.</p>
    */
  var RecordDelimiter: js.UndefOr[String] = js.native
}

object JSONOutput {
  @scala.inline
  def apply(): JSONOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONOutput]
  }
  @scala.inline
  implicit class JSONOutputOps[Self <: JSONOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecordDelimiter")(js.undefined)
        ret
    }
  }
  
}

