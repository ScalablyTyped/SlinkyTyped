package typingsSlinky.jpushReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  code  :number} & jpush-react-native.jpush-react-native.Sequence */
@js.native
trait codenumberSequence extends js.Object {
  var code: Double = js.native
  /**
    * 请求时传入的序列号,会在回调时原样返回
    */
  var sequence: Double = js.native
}

object codenumberSequence {
  @scala.inline
  def apply(code: Double, sequence: Double): codenumberSequence = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[codenumberSequence]
  }
  @scala.inline
  implicit class codenumberSequenceOps[Self <: codenumberSequence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
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

