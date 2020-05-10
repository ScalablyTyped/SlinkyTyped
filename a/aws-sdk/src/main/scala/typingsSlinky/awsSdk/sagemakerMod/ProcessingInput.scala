package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessingInput extends js.Object {
  /**
    * The name of the inputs for the processing job.
    */
  var InputName: String = js.native
  /**
    * The S3 inputs for the processing job. 
    */
  var S3Input: ProcessingS3Input = js.native
}

object ProcessingInput {
  @scala.inline
  def apply(InputName: String, S3Input: ProcessingS3Input): ProcessingInput = {
    val __obj = js.Dynamic.literal(InputName = InputName.asInstanceOf[js.Any], S3Input = S3Input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingInput]
  }
  @scala.inline
  implicit class ProcessingInputOps[Self <: ProcessingInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS3Input(value: ProcessingS3Input): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Input")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

