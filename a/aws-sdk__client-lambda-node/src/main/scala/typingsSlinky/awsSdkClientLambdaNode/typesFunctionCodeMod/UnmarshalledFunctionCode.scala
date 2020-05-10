package typingsSlinky.awsSdkClientLambdaNode.typesFunctionCodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledFunctionCode extends FunctionCode {
  /**
    * <p>The base64-encoded contents of your zip file containing your deployment package. AWS SDK and AWS CLI clients handle the encoding for you.</p>
    */
  @JSName("ZipFile")
  var ZipFile_UnmarshalledFunctionCode: js.UndefOr[js.typedarray.Uint8Array] = js.native
}

object UnmarshalledFunctionCode {
  @scala.inline
  def apply(): UnmarshalledFunctionCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledFunctionCode]
  }
  @scala.inline
  implicit class UnmarshalledFunctionCodeOps[Self <: UnmarshalledFunctionCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withZipFile(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZipFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZipFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ZipFile")(js.undefined)
        ret
    }
  }
  
}

