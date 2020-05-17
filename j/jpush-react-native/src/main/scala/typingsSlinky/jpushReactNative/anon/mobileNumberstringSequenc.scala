package typingsSlinky.jpushReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  mobileNumber  :string} & jpush-react-native.jpush-react-native.Sequence */
@js.native
trait mobileNumberstringSequenc extends js.Object {
  var mobileNumber: String = js.native
  /**
    * 请求时传入的序列号,会在回调时原样返回
    */
  var sequence: Double = js.native
}

object mobileNumberstringSequenc {
  @scala.inline
  def apply(mobileNumber: String, sequence: Double): mobileNumberstringSequenc = {
    val __obj = js.Dynamic.literal(mobileNumber = mobileNumber.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[mobileNumberstringSequenc]
  }
  @scala.inline
  implicit class mobileNumberstringSequencOps[Self <: mobileNumberstringSequenc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMobileNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

