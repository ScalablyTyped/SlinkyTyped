package typingsSlinky.awsKcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KCLInput extends js.Object {
  var recordProcessor: RecordProcessor = js.native
  var version: js.Symbol = js.native
}

object KCLInput {
  @scala.inline
  def apply(recordProcessor: RecordProcessor, version: js.Symbol): KCLInput = {
    val __obj = js.Dynamic.literal(recordProcessor = recordProcessor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[KCLInput]
  }
  @scala.inline
  implicit class KCLInputOps[Self <: KCLInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordProcessor(value: RecordProcessor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordProcessor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

